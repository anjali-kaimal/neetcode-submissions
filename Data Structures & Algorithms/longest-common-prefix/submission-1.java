class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix="",val=strs[0];
        if(strs.length==1){
            return strs[0];
        }
        else{
        prefix=findPrefix(strs[0],strs[1]);
        for(int i=2;i<strs.length;i++){
            prefix=findPrefix(prefix,strs[i]);
        }
        }
        return prefix;
        
    }
    public String findPrefix(String a,String b){
        String prefix="";
        for(int i=0;i<a.length()&&i<b.length();i++){
            if(a.charAt(i)==b.charAt(i)){
                prefix+=a.charAt(i);
            }
            else{
                break;
            }
        }
        return prefix;
    }
}