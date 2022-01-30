public class GFG_Reverse_Alternate_Node_of_LL {
    public static void rearrange(Node odd)
    {
        // add your code here
        Node od=odd,evenHead=odd.next,even=evenHead;
        
        while(even!=null && even.next!=null){
           od.next=even.next;
           od=od.next;
           even.next=od.next;
           even=even.next;
       }
        
        evenHead=reverse(evenHead);
       od.next=evenHead;
        
        
    }
    public static Node reverse(Node head){
        Node curr =  head, prev=  null, next = null;
        while(curr!=null){
            next  =  curr.next;
            curr.next =  prev ;
            prev =  curr;
            curr  =  next;
        }
        return prev;
    } 
}
