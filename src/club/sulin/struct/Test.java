package club.sulin.struct;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test {
    @org.junit.jupiter.api.Test
    public void StackTest() {
        MyStack a = new MyStack();
        a.push(3);
        a.push(2);
        a.push(4);
        int b = a.pop();
        System.out.println(b);

    }

    @org.junit.jupiter.api.Test
    public void NodeTest() {
        Node<Integer> node1 = new Node<Integer>(1);
        Node<String> node2 = new Node<String>("nini");
        Node<Integer> node3 = new Node<Integer>(3);
        node1.append(node2).append(node3);
//        System.out.println(node1);
//        System.out.println(node1.next);
//        System.out.println(node1.next.next);
        node2.showAll();
    }

    @org.junit.jupiter.api.Test
    public void DoubleNodeTest() {
        DoubleNode n1 = new DoubleNode(1);
        DoubleNode n2 = new DoubleNode(2);
        DoubleNode n3 = new DoubleNode(3);


        n1.after(n2);
        n2.after(n3);
        System.out.println(n1.next.getData());
        System.out.println(n1.pre.getData());
        System.out.println(n2.next.getData());
        System.out.println(n2.pre.getData());
    }

    @org.junit.jupiter.api.Test
    public void LinkQueue(){
        Queue<Integer>queue=new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.poll());
    }
}
