package dataStructure.list.linkList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 这是个单链表
 * 1.单链表的head结点指向第一个数据节点，存数据,没有tail结点
 * 2.单链表的每个节点都有next指针指向下一个节点，但是没有指针指向前驱节点
 */
public class MyLinkedList<E> extends LinkedList<E> {
    private int size;
    private Node<E> head;

    public MyLinkedList() {
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(E e) {
        if (head == null) {
            head = new Node<>(e, null);
            size++;
            return true;
        }
        Node<E> cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new Node<>(e, null);
        size++;
        return true;
    }

    @Override
    public boolean remove(Object e) {
        Node<E> cur = head;
        Node<E> curPrev = head;
        while (!cur.item.equals(e) && cur.next != null) {
            curPrev = cur;
            cur = cur.next;
        }
        if (cur.next == null) {
            return false;
        }
        curPrev.next = cur.next;
        size--;
        return true;
    }

    @Override
    public E get(int index) {
        Node<E> curNode = getNode(index);
        return curNode.item;
    }

    private Node<E> getNode(int index) {
        checkIndex(index);
        Node<E> curNode = head;
        int curIdx = 0;
        while (curNode.next != null && curIdx != index) {
            curIdx++;
            curNode = curNode.next;
        }
        return curNode;
    }

    private Node<E> getPrevNode(int index) {
        checkIndex(index);
        Node<E> curNode = head;
        int curIdx = 0;
        while (curIdx != index - 1) {
            curIdx++;
            curNode = curNode.next;
        }
        return curNode;
    }

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        Node<E> node = getNode(index);
        E oldElement = node.item;
        node.item = element;
        return oldElement;
    }

    @Override
    public void add(int index, E element) {
        if (!isPositionIndex(index)) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> prevNode = getPrevNode(index);
        Node<E> curNode = prevNode.next;
        prevNode.next = new Node<>(element, curNode);
        size++;
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    @Override
    public E remove(int index) {
        if (index == 0) {
            E item = head.item;
            head = head.next;
            size--;
            return item;
        }
        Node<E> prevNode = getPrevNode(index);
        Node<E> curNode = prevNode.next;
        prevNode.next = curNode.next;
        size--;
        return curNode.item;
    }

    @Override
    public int indexOf(Object o) {
        int curIndex = 0;
        for (Node<E> curNode = head; curIndex < size; curNode = curNode.next) {
            if (curNode.item.equals(o)) {
                return curIndex;
            }
            curIndex++;
        }
        return -1;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            int nextIndex = 0;

            @Override
            public boolean hasNext() {
                return nextIndex < size;
            }

            @Override
            public E next() {
                return get(nextIndex++);
            }
        };
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }
}