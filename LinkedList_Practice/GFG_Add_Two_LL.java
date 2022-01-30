public class GFG_Add_Two_LL {
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        first = reverse(first);
        second = reverse(second);
        int carry = 0;
        int sum = 0;
        Node res = null;
        Node curr = null;
        while(first != null || second != null){
            sum = carry + (first != null ?first.data : 0) + (second != null ?second.data:0);
            carry = (sum>=10?1:0);
            sum = sum%10;
            Node temp = new Node(sum);
            if(res == null) res = temp;
            else curr.next = temp;
            curr = temp;
            if(first != null) first = first.next; 
            if(second != null) second = second.next; 
        }
        
        if(carry>0){
            Node temp = new Node(carry);
            curr.next = temp;
            curr = temp;
        }
        
        res = reverse(res);
        return res;
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
