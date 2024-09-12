class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       int ans = 0;
       boolean[] set = new boolean[26];
       for(int i=0; i<allowed.length(); i++){
           set[allowed.charAt(i)-'a']=true;
       } 

       for(String s:words){
            boolean found = true;
            for(int i=0; i<s.length(); i++){
                if(!set[s.charAt(i)-'a']){
                    found = false;
                    break;
                }
            }
            if(found) ans++;
       }
       return ans;
    }
}