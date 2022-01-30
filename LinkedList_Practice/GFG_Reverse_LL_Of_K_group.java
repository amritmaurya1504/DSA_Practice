class GFG_Reverse_LL_Of_K_group{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        Node currNode = node;
        Node prevNode = null;
        Node nextNode = node;
        int c = 0;
        
        while(currNode != null && c < k){
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
            c++;
        }
        
        if(nextNode != null)
        node.next = reverse(nextNode , k);
        
        return prevNode;
        
    }
}