class GFG_Reorder_List {
    public Node midNode(Node head) {
        Node fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public Node reverse(Node head) {
        Node curr = head, prev = null, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    Node reorderlist(Node head) {
        // Your code here
        Node midNode = midNode(head);
        Node nextToMid = midNode.next;
        midNode.next = null;
        Node p2 = reverse(nextToMid);

        Node p1 = head, p1Next;
        while (p1 != null && p2 != null) {
            p1Next = p1.next;
            p1.next = p2;

            p1 = p2;
            p2 = p1Next;
        }
        return head;
    }
}