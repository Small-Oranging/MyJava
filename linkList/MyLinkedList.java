package linkList;

public class MyLinkedList {
    private final linkNode head=new linkNode();
    //获得头节点
    public linkNode getHead(){
        return head;
    }
    public int get(int index){
        linkNode temp=new linkNode();
        temp=head.next;
        if(head.next==null){
            System.out.println("链表为空");
            return -1;
        }
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    public void addAtHead(int val){
        linkNode newNode=new linkNode();
        newNode.val=val;
        newNode.next=head.next;
        head.next=newNode;
    }
    public void addAtTail(int val){
        linkNode newNode=new linkNode();
        newNode.val=val;
        if(head.next==null){
            head.next=newNode;
            return;
        }
        linkNode temp=new linkNode();
        temp=head.next;
        while(temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void addAtIndex(int index, int val){

        linkNode newNode=new linkNode();
        newNode.val=val;
        int length;
        if(head.next==null){
            System.out.println("链表为空");
            return;
        }
        linkNode temp=new linkNode();
        temp=head.next;
        for(length=1;temp.next!=null;length++) {
            temp=temp.next;
        }
        if (length==1){
            head.next=newNode;
        }else {
            if (index < length) {
                temp = head.next;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }else if(index==length){
                temp=head.next;
                for(length=1;temp.next!=null;length++) {
                    temp=temp.next;
                }
                temp.next=newNode;
            }else{
                return;
            }
        }
    }
    public void deleteAtIndex(int index){
        if(head.next==null){
            System.out.println("链表为空");
            return;
        }
        int length;
        linkNode temp=new linkNode();
        temp=head.next;
        for(length=1;temp.next!=null;length++) {
            temp=temp.next;
        }
        if (index<length){
            if(length==1){
                head.next=null;
            }else {
                temp = head;
                for (int i = 0; i < index; i++) {
                    temp = temp.next;
                }
                temp.next=temp.next.next;
            }
        }
    }
    public void showLinkNode(){
        if(head.next==null){
            System.out.println("链表为空");
            return;
        }
        linkNode temp=new linkNode();
        temp=head.next;
        System.out.print(temp.val);
        while(temp.next!=null){
            System.out.print("->");
            temp=temp.next;
            System.out.print(temp.val);
        }
    }
}