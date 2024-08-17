class Solution {
    public int findContentChildren(int[] g, int[] s) {
       int count=0;
       Arrays.sort(g);
       Arrays.sort(s);
       /*for(int i=0; i<g.length; i++){
          for(int j=0; j<s.length-1; j++){
            if(g[i]==s[j]){
                count++;
            }
          }
       } */
       boolean[] used = new boolean[s.length];

       for(int i=0; i<g.length; i++){
          for(int j=0; j<s.length; j++){
            if(s[j]>= g[i]&& !used[j]){
                count++;
                
                used[j]=true;
                break;
            }
          }  
       }
       return count;
    }
}