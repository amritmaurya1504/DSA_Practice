public class GFG_Clone_LL_with_next_And_random {
    Node copyList(Node head) {
        // your code here
        Node curr = head;
        Node temp;
        while(curr != null){
            temp = curr.next;
            curr.next = new Node(curr.data);
            curr.next.next = temp;
            curr = temp;
        }
        curr = head;
        while(curr != null){
            curr.next.arb = curr.arb != null ? curr.arb.next : curr.arb;
            curr = curr.next.next;
        }
        Node original = head;
        Node copy = head.next;
        temp = copy;
        while(original != null && copy != null){
            original.next = original.next.next;
            copy.next = copy.next != null? copy.next.next : copy.next;
            original = original.next;
            copy = copy.next;
        }
        return temp;
    }
}
