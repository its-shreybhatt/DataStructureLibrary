public class LinkedList {
    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        MyLinkedList object = new MyLinkedList();
        object.addToFront(myFirstNode);
        object.appendSort(myFirstNode,mySecondNode);
        object.appendSort(mySecondNode,myThirdNode);

        MyNode<Integer> mynewNode = new MyNode<>(40);
        object.insertAfterParticular(mySecondNode,mynewNode);


        object.printMyNodes();

    }
}