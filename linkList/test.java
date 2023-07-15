package linkList;

public class test {
    public static void main(String[] args) {
        MyLinkedList LinkList=new MyLinkedList();
        LinkList.addAtTail(111);
        LinkList.addAtTail(222);
        LinkList.addAtTail(333);
        LinkList.addAtTail(444);
        LinkList.showLinkNode();
        System.out.println();
        System.out.println(LinkList.get(1));
        LinkList.addAtIndex(3,999);
        LinkList.showLinkNode();
        System.out.println();
        LinkList.deleteAtIndex(0);
        LinkList.showLinkNode();
    }
}
