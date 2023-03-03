package dataStructure.list.linkList;

/**
 * @projectName: JavaLearnIdea
 * @package: dataStructure.list.linkList
 * @className: CycleLinkedList
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/17 15:59
 * @version: 1.0
 */
public class CycleLinkedList {

    //头
    private Node head;
    //尾
    private Node last;



    //大小
    private int size;

    public CycleLinkedList() {
        this.head = new Node();
        this.head.setNext(last);
        last.setNext(head);
        size = 0;

    }

    public void add(int e) {
        if (size == 0) {
            head.setDate(e);
            size++;
        } else {
            Node node = new Node(e);
            node.setNext(head);
            last.setNext(node);
            last=node;
            size++;
        }
    }
    public int getSize(){
        return size;
    }
    public void remove(int index){
        if(index==0){
           Node node= head.getNext();
           last.setNext(node);
           head=head.getNext();






        }




    }



}

class Node {
    private int date;
    private Node next;

    public Node() {
        this.next = this;
    }

    public Node(int date) {
        this.date = date;
        this.next = this;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}