public class GFG_Remove_Loop_from_LL {
    public static void removeLoop(Node head){
        // code here
        Node fastNode = head, slowNode = head;
        
        while(fastNode != null && fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            
            if(fastNode == slowNode){
                break;
            }
        }
        if(slowNode == head){
            while(fastNode.next != slowNode){
                fastNode = fastNode.next;
            }
            fastNode.next = null;
        }else if(slowNode == fastNode){
            slowNode = head;
            while(slowNode.next != fastNode.next){
                slowNode = slowNode.next;
                fastNode = fastNode.next;
            }
            fastNode.next = null;
        }
        // remove the loop without losing any nodes
    }
}
