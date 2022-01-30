public class GFG_Reverse_Sublist_LL {
    public static Node reverseBetween(Node head, int m, int n)
    {
        //code here
        if(head == null || m == n) return head;
        
        Node dummy = new Node(-1);
        dummy.next = head;
        Node prevA = dummy;
        
        Node nodeA = dummy;
        for(int i = 0; i < m ; i++){
            prevA = nodeA;
            nodeA = nodeA.next;
        }
            
        
        Node prev = prevA;
        Node nodeB = nodeA , nodeC = nodeA;
        
        for(int i = m ; i <= n ; i++){
            nodeC = nodeB.next;
            nodeB.next = prev;
            prev = nodeB;
            nodeB = nodeC;
        }
        
        nodeA.next = nodeB;
        prevA.next = prev;
        
        return dummy.next;
        
    }
}
