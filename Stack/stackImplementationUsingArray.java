public class Solution{
    static class Stack {
        int arr[],top;
        Stack(int capacity) {
            // Write your code here.
            arr=new int[capacity];
            top=-1;

        }
        public void push(int num) {
            // Write your code here.
            if(top+1==arr.length)
            return;
            else{
                arr[++top]=num;
            }

        }
        public int pop() {
            // Write your code here.
            if(top==-1)
            return -1;
            else{
                
                int x=arr[top];
                top--;
                return x;
            }
        }
        public int top() {
            if(top==-1)
            return -1;
            return arr[top];
        }
        public int isEmpty() {
            // Write your code here.
            if(top==-1)
            return 1;
            return 0;

        }
        public int isFull() {
            // Write your code here.
            if(top+1==arr.length)
            return 1;
            return 0;
        }
    }
}
