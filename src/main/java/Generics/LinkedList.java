package Generics;

public class LinkedList<T> {

    Node head;

    static class Node<T>{
    T data;
    Node nextNode;

    Node(T data){
        this.data = data;
        nextNode = null;
    }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", nextNode=" + nextNode +
                    '}';
        }
    }

    public LinkedList<T> add(LinkedList<T> linkedList, T data){
        Node<T> node = new Node<>(data);
        if (linkedList.head==null){
            linkedList.head = node;
        }
        else{
            Node headNode =  linkedList.head;
            while (headNode.nextNode!=null){
                headNode = headNode.nextNode;
            }
            headNode.nextNode = node;
        }
        return linkedList;
    }


    public void printLinkedListValues(LinkedList<T> linkedList){
        Node<String> currentNodePosition = linkedList.head;
        while (currentNodePosition!=null){
            System.out.println(currentNodePosition.data);
            currentNodePosition = currentNodePosition.nextNode;
        }
    }


}
