package com.github.andydrew.myNode;

public class MyNodeList<E> {//该对象永远只记录首结点和末结点地址，通过这两个地址可以搜寻到其它的数据
    private MyNode<E> first;//用来记录首结点的地址值
    private MyNode<E> last;//用来记录末结点的地址值
    private int size = 0;

    public MyNodeList() {
    }

    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    public void linkLast(E e) {
        MyNode<E> l = last;//此时last默认值位null，同时l也是代表上一个结点的地址
        MyNode<E> newMyNode = new MyNode<>(l, e, null);//创建一个新结点
        last = newMyNode;//末结点赋值
        if (l == null) {//第一次添加对象，l为null，为对象添加首结点地址
            first = newMyNode;
        } else {
            l.next = newMyNode;//将上一个结点的next对象指向新结点的地址
        }
        size++;//添加完成，结点大小自增1
    }

    public int getSize() {
        return size;
    }

    private class MyNode<E> {//双向链表
        MyNode<E> previous;//记录上一个结点的地址
        E item;//添加进链表的对象
        MyNode<E> next;//记录下一个结点的地址

        public MyNode(MyNode<E> previous, E item, MyNode<E> next) {
            this.previous = previous;
            this.item = item;
            this.next = next;
        }
    }

    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (MyNode<E> x = last; x != null; x = x.previous)//循环遍历链表中的数据
            result[i++] = x.item;
        return result;
    }
}
