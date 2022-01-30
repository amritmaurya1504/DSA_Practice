public class GFG_Remove_Duplicate_From_unSorted_LL {
    public Node removeDuplicates(Node head) 
    {
         // Your code here
        Set<Integer> set = new HashSet<>();
        Node currNode = head;
        set.add(currNode.data);
        Node prevNode = currNode;
        currNode = currNode.next;
        
        while(currNode != null){
            if(set.contains(currNode.data)){
                prevNode.next = currNode.next;
            }
            else {
                set.add(currNode.data);
                prevNode = currNode;
            }
            currNode = currNode.next;   
        }
        
        return head;
    }
}
