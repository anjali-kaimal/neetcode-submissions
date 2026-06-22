class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> map=new HashSet<>();
        int left=0,max=0;
        for(int i=0;i<s.length();i++){
            while(map.contains(s.charAt(i))){
                    map.remove(s.charAt(left));
                    left++;
            }
            map.add(s.charAt(i));
            if(map.size()>max) max=map.size();
        }
        return max;
    }
}
