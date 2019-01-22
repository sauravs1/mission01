package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.List;

public class SinglyLinkedList<E> implements List<E>{

    private static class Node<E>{
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n){
            element=e;
            next=n;
        }

        public Node(E element) {
        }

        public  E getElement(){return element;}
        public  Node<E> getNext(){return next;}
        public void setNext(Node<E> n){next=n;}

    }
    private  Node<E> head=null;
    private Node<E> tail=null;
    private int size =0;
    public SinglyLinkedList(){}

    @Override
    public E first() {
        return null;
    }

    @Override
    public E last() {
        return null;
    }

    @Override
    public void addLast(E element) {

    }

    @Override
    public void addFirst(E element) {
        if (element==null)
            return;

        Node<E> newNode = new Node<>(element);
        newNode.setNext(head);
        head = newNode;
    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public void insert(E element, int index) {

    }

    @Override
    public E remove(int index) {
        if (index<0 ||index>=size)
            return  null;

        Node<E> current=head;
        for (int i=0; i < index; i++)
            current=current.getNext();

        Node<E> toRemove=current.getNext();
        current.setNext(toRemove.getNext());
        toRemove.setNext(null);
        return toRemove.getElement();
    }

    @Override
    public E get(int index) {

        return null;
    }

    public int size(){return size;}
    public boolean isEmpty(){return size==0;}

    @Override
    public void printList() {

    }



    /*public E first(){
        if (isEmpty())return null;
        return head.getElement();
    }
    public E last(){
        if (isEmpty())return null;
        return tail.getElement();
    }
    public void addFirst(E e){
        head =new Node<>(e,head);
        if (size==0)
            tail=head;
        size++;
    }
    public void addLast(E e){
        Node<E> newest=new Node<>(e,null);
        if (isEmpty())
            head=newest;
        else
            tail.setNext(newest);
        tail=newest;
        size++;

    }

    public E removeFirst(){
        if(isEmpty())return null;
        E answer=head.getElement();
        head=head.getNext();
        size--;
        if (size==0)
            tail=null;
        return answer;
    }*/



}
