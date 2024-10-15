package _LinkedList;

public class linkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

           // methods in linked list
            // ADD Operation
    public void addFirst(int data){
        // create new Node
        Node newNode = new Node(data);
        size++;
        if (head == null){
           head = tail = newNode;
           return;
        }
        // newNode next -> head
        newNode.next = head;   // link

        // head = newNode
        head = newNode;
    }
    public void addLast(int data){
        // create a new Node
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    // print linked list
    public  void print(){  // TC->O(n)
        if (head == null){
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // ADD in Middle
    public void Add(int idx,int data){
        if (idx == 0) {
            addFirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        while (i<idx-1){
            temp = temp.next;
            i++;
        }
        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
            // Remove in Linked list
    // Remove first
    public int removeFirst(){
        if (size == 0){
            System.out.println("LL is  empty");
            return Integer.MIN_VALUE;
        }else if (size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    // Remove Last
    public int removeLast(){
        if (size == 0){
            System.out.println(" LL is empty");
            return Integer.MIN_VALUE;
        }else if (size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i = size-2;
        Node prev = head;
        for (int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;  // tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    // iterative search
    public int itrSearch(int key){
        Node temp = head;
        int i=0;

        while (temp!=null){
            if (temp.data == key){   // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }
    // Recursive Search
    public int helper(Node head,int key){
        if (head == null){
            return -1;
        }
        if (head.data == key){
            return 0;
        }
        int idx = helper(head.next,key);
        if (idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }
    // Reverse Linked list
    public void reverse(){
        Node prev = null;
        Node curr = tail= head;
        Node next;
        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    // remove nth node from end
    public void deleteNth_End(int n){
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp!=null){
            temp = temp.next;
            sz++;
        }
        if (n == sz){
            head = head.next;  // remove first
            return;
        }
        // sz - n
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while (i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next !=null){
             slow = slow.next;   // +1
             fast = fast.next.next;  // +2
        }
        return slow;   // slow is my mid Node
    }
    public boolean isPalindrome(){
        if (head == null || head.next==null){
            return true;
        }
        // find mid
        Node midNode = findMid(head);

        // reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;   // right half head
        Node left = head;    // left half

        // check left half & right half
        while (right!=null){
            if (left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    // Detect cycle
    public boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null){
            slow = slow.next;  // +1
            fast = fast.next.next;  // +2;
            if (slow == fast){
                return true;  // cycle exists
            }
        }
        return false;  // cycle does not exists
    }
    // Remove Cycle
    public static void removeCycle(){
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean Cycle = false;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow){
                Cycle = true;
                break;
            }
        }
        if (Cycle == false){
            return;
        }
        // find meeting point
        slow = head;
        Node prev = null;  // last node
        while (slow!=fast){
            prev = fast;
          slow =  slow.next;
          fast = fast.next;

        }
        // remove cycle ->  last.next = null
        prev.next = null;
    }
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;  // mid node

    }
    private Node merge(Node h1,Node h2){
        Node mergedLL  = new Node(-1);
        Node temp = mergedLL;
        while (h1!=null && h2!=null){
            if (h1.data <= h2.data){
                temp.next = h1;
                h1 = h1.next;
                temp = temp.next;
            }else {
                temp.next = h2;
                h2 = h2.next;
                temp = temp.next;
            }
        }
        while (h1!=null){
            temp.next = h1;
            h1 = h1.next;
            temp = temp.next;
        }
        while (h2!=null){
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);

        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }
    // Zig-Zag linked list
    public void ZigZag(){
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL , nextR;

        // alt merge -> zig-zag merge
        while (left !=null && right!=null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        System.out.println("Zig Zag ll..");
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.ZigZag();
        ll.print();

        System.out.println("Reversed LL.....");
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(4);
        ll.addLast(5);
        ll.Add(2, 3);
        ll.print();
        ll.reverse();
        ll.print();
        System.out.println(ll.itrSearch(3));
        System.out.println(ll.recSearch(4));
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println("Size of linked list -> " + ll.size);
    }

}
