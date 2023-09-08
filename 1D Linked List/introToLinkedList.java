/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class Solution {
    public static Node constructLL(int []arr) {
        // Write your code here
        Node n=new Node(arr[arr.length-1],null);
        for(int i=arr.length-2;i>=0;i--){
            n=new Node(arr[i],n);
        }
        Node head=n;
        return head;
    }
}
