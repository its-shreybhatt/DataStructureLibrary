public class LinkedList {
    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        MyLinkedList object = new MyLinkedList();
        object.addToFront(myFirstNode);
        object.addToFront(mySecondNode);
        object.addToFront(myThirdNode);

        object.printMyNodes();

    }
}