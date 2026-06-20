class MinStack {
    Stack<Integer> list;
    Stack<Integer> minList;
    public MinStack() {
        list=new Stack<>();
        minList=new Stack<>();
    }
    
    public void push(int val) {
        if(list.isEmpty()||val<=minList.peek()){
            minList.push(val);
        }
        list.push(val);

    }
    
    public void pop() {
        if(!minList.isEmpty()&&list.pop().equals(minList.peek()))
            minList.pop();
    }
    
    public int top() {
        return list.peek();
    }
    
    public int getMin() {
        return minList.peek();
    }
}
