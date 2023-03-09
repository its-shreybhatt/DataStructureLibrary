public class MyLinkedList {
// class to impliment logic

    private INode head;
    private INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToFront(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        }
        else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void appendToLast(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }
    public  void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My LinkedList Nodes : ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("-> ");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}