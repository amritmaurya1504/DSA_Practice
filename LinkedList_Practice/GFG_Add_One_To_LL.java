public class GFG_Add_One_To_LL {
    public static Node reverse(Node head)
    {
        Node cur=head;
        Node prev=null;
        while(cur!=null)
        {
            Node temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
    
    public static Node addOne(Node head) 
    { 
        //code here.
        head = reverse(head);
        boolean f = true;
        Node curr = head;
        
        while(curr != null){
            if(curr.next == null && curr.data == 9){
                curr.data = 1;
                Node temp = new Node(0);
                temp.next = head;
                head = temp;
                curr = curr.next;
            }else if(curr.data == 9){
                curr.data = 0;
                curr = curr.next;
            }else{
                curr.data = curr.data + 1;
                curr = curr.next;
                break;
            }
        }
        
        head = reverse(head);
        return head;
        
    }
}
