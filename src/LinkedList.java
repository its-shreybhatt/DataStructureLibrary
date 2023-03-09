public class LinkedList {
    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList object = new MyLinkedList();
        object.addToFront(myFirstNode);
        object.appendToLast(mySecondNode);
        object.appendToLast(myThirdNode);

        MyNode<Integer> mynewNode = new MyNode<>(40);
        object.insertAfterParticular(mySecondNode,mynewNode);
        //   56-> 30-> 40-> 70
        object.deleteAfterParticular(mySecondNode,mynewNode);
        //   56-> 30-> 70

        object.printMyNodes();

    }
}