package JAVA_APP;

public class LinkList {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int resdata){
            data = resdata;
            next = null;
        }
    }

    static LinkList insertList(LinkList list, int data){
        Node node = new Node(data);
        node.next = null;
        if ( list.head == null ){
            list.head = node;
        }else {
            Node lastNode = list.head;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
        return list;
    }

    static void printLinklist(LinkList list){
        Node curNode = list.head;
        System.out.println("current Link List Node ");
        while (curNode != null){
            System.out.println(curNode.data);
            curNode = curNode.next;
        }
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list = insertList(list,1);
        list = insertList(list,2);
        list = insertList(list,3);
        list = insertList(list,4);
        list = insertList(list,5);
        list = insertList(list,6);
        list = insertList(list,7);
        list = insertList(list,8);
        list = insertList(list,9);
        printLinklist(list);
    }
}
