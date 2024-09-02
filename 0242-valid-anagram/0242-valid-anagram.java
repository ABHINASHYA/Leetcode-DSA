class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch = s.toCharArray();
        char[] cha = t.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(cha);

        return Arrays.equals(ch, cha);

    }
}