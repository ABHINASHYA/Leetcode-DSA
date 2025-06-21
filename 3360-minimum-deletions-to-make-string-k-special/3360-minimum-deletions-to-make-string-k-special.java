class Solution {
    public int minimumDeletions(String word, int k) {
       int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        List<Integer> list = new ArrayList<>();
        for (int f : freq) {
            if (f > 0) {
                list.add(f);
            }
        }

        Collections.sort(list);
        int res = word.length();

        for (int i = 0; i < list.size(); i++) {
            int curr = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) < list.get(i)) {
                    curr += list.get(j);
                } else if (list.get(j) > list.get(i) + k) {
                    curr += list.get(j) - list.get(i) - k;
                }
            }
            res = Math.min(res, curr);
        }

        return res;
 
    }
}