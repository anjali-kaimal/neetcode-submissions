class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        if(strs.length==1){
            return strs[0];
        }
        else{
        for(int i=1;i<strs.length;i++){
            prefix=findPrefix(prefix,strs[i]);
        }
        }
        return prefix;
        
    }
    public String findPrefix(String a,String b){
        int i=0;
        while(i<a.length()&&i<b.length()&&a.charAt(i)==b.charAt(i)){
           i++;
        }
        return a.substring(0,i);
    }
    
}