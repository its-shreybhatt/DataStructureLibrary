public class LinkedList {
    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList object = new MyLinkedList();
        object.addToFront(myFirstNode);
        object.appendToLast(mySecondNode);
        object.appendToLast(myThirdNode);

        object.searchNode(mySecondNode);

        object.printMyNodes();

    }
}