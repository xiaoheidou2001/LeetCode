public class Main{
    public static void main(String args[]){
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
    }
}

class MinStack {

    int[] mainStack;int mainPtr;
    int[] minStack;int minPtr;

    public MinStack() {
        mainStack = new int[30001];mainPtr = 0;
        minStack = new int[30001];minStack[0] = Integer.MAX_VALUE;minPtr = 1;
    }
    
    public void push(int val) {
        mainStack[mainPtr++] = val;
        if(val <= minStack[minPtr-1]){
            minStack[minPtr++] = val;
        }
    }
    
    public void pop() {
        if(mainStack[mainPtr-1] == minStack[minPtr-1]){
            minPtr--;
        }
        mainPtr--;
    }
    
    public int top() {
        return mainStack[mainPtr-1];
    }
    
    public int getMin() {
        return minStack[minPtr-1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */