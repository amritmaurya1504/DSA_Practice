public class GFG_Delete_ALL_Occurances {
    public static Node deleteAllOccurances(Node head, int x)
    {
        // Your code here
        
        
        if(head == null || head.next == null) return null;
        Node temp = head;
        
        while(head != null && head.data == x){
            head = head.next;
        }
        
        while(temp.next != null){
            if(temp.next.data == x){
                temp.next = temp.next.next;
                
            }else{
            temp = temp.next;
            }
        }
        return head;
        
    }
}
