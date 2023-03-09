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
        } else {
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

    public void insertMethodFirst(INode newNode) {
        INode tempNode = this.head.getNext();
        this.head.setNext(newNode);
        newNode.setNext(tail);
    }

    public void insertMethodSecond(INode firstNode, INode nextNode) {
        INode tempNode = firstNode.getNext();
        firstNode.setNext(nextNode);
        nextNode.setNext(tempNode);
    }

    public INode popFirstNode() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public INode popLastNode() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        INode removedNode = tempNode.getNext();
        tempNode.setNext(null);
        return removedNode;
    }

    public void searchNode(INode searchNode) {
        INode tempNode = head;
        while (!tempNode.getNext().equals(null)) {
            if (tempNode.getKey().equals(searchNode.getKey())) {
                System.out.println("Searched key = " +tempNode.getKey());
                break;
            }
            tempNode=tempNode.getNext();
        }
    }

    public void insertAfterParticular(INode previousNode, INode newNode) {
        INode tempNode = previousNode.getNext();
        previousNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    public void printMyNodes() {
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