public class LinkedList {
    public static void main (){
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        myThirdNode.setNext(null);

        if (myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode)){
            System.out.println("Condition is " +true);
        }else System.out.println("Condition is " +false);
    }
}