class Solution {
    public boolean isValid(String s) {
        int i=0;
        if(s.length()%2==1)
            return false;

        Stack<Character> list=new Stack<>();
        for(i=0;i<s.length();i++){
            char c=s.charAt(i);
           switch(c){
            case '(':
                list.push(')');
                break;
            case '{':
                list.push('}');
                break;
            case '[':
                list.push(']');
                break;
            default:
                if(list.isEmpty()||list.pop()!=c) return false;
                break;
           }

        }
        if(!list.isEmpty()) return false;
    return true;
        }

    }
