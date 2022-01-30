class GFG_Delete_Node_Having_Greater_Value_on_Right{
    Node reverse(Node head)
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
    Node compute(Node head)
    {
        // your code here
       head=reverse(head);
        Node cur=head;
        Node curNext=head.next;
        while(curNext!=null)
        {
            if(cur.data>curNext.data)
                {
                    cur.next= curNext.next;
                    curNext=cur.next;
                }
           else
               {
                    cur=curNext;
                    curNext=curNext.next;
               }
           
        }
        return  reverse(head);
        
    }
}