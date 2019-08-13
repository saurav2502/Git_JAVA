package JAVA_APP;

public class PrintLinkList {
    Node head = null;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    static PrintLinkList insertlinkList(PrintLinkList list, int data){
        Node node = new Node(data);
        node.next = null;
        if ( list.head == null ){
            list.head = node;
        }
        else {
            Node lastNode = list.head;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
        return list;
    }

    static void printlist(PrintLinkList list){
        while (list.head != null){
            System.out.println(list.head.data);
            list.head = list.head.next;
        }
    }

    public static void main(String[] args) {
        PrintLinkList plist = new PrintLinkList();
        plist= insertlinkList(plist,1);
        plist = insertlinkList(plist,2);
        printlist(plist);
    }
}
