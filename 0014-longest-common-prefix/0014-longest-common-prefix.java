class Solution {
    public String longestCommonPrefix(String[] strs) {
       int i=0;
       if( strs.length==0 || strs[i].isEmpty())
        return "";
       char first=strs[i].charAt(0);
       StringBuilder l = new StringBuilder(""); 
       while(i<strs[0].length()){
         for(String s : strs)
         { first=strs[0].charAt(i);
           if(  i>=s.length() || s.charAt(i)!=first )
           {
              first=0;
              break;
           }
         }
         if(first==0) break;
         l.append(first);
         i++;
         
       } 
       return l.toString();
    }
}