class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long left = 0, right = (long) 1e18;
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (canComplete(mid, mountainHeight, workerTimes)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canComplete(long time, int mountainHeight, int[] workerTimes) {
        long totalReducedHeight = 0;
        for (int i = 0; i < workerTimes.length; i++) {
            long maxReductionForWorker = getMaxReduction(time, workerTimes[i]);
            totalReducedHeight += maxReductionForWorker;
            if (totalReducedHeight >= mountainHeight) {
                return true;
            }
        }
        return totalReducedHeight >= mountainHeight;
    }

    private long getMaxReduction(long time, int workerTime) {
        long left = 0, right = (long) Math.sqrt(2 * time / workerTime) + 1;
        while (left < right) {
            long mid = left + (right - left + 1) / 2;
            if (workerTime * mid * (mid + 1) / 2 <= time) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
