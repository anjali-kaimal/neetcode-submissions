class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list=new ArrayList<>();
        for(String s:operations){
            int n=list.size();
            switch(s){
                case "+":
                        list.add(list.get(n-1)+list.get(n-2));
                        break;
                case "C":
                        list.remove(n-1);
                        break;
                case "D":
                        list.add(list.get(n-1)*2);
                        break;
                default:
                        list.add(Integer.parseInt(s));
                        break;
            }
        }
        int sum=0;
        for(int num:list){
            sum+=num;
        }
        return sum;
    }
}