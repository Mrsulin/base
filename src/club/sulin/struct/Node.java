package club.sulin.struct;

public class Node<T> {

    Node next;

    T data;

    public Node(T data) {
        this.data = data;
    }

    public Node append(Node node) {
        Node currentNode = this;
        while (true) {
            Node nextNode = currentNode.next;
            if (nextNode == null) {
                break;
            }
            currentNode = nextNode;
        }
        currentNode.next = node;

        return node;
    }

    public Node next() {
        return this.next;
    }

    public void removeNext() {
        Node newNext = this.next.next;
        this.next = newNext;
    }

    public void showAll() {
        Node currentNode = this;
        while (true) {
            System.out.print(currentNode.data);
            currentNode = currentNode.next;
            if (currentNode == null) break;
        }
    }
    //插入一个节点作为当前节点你的下一个节点
    public void after(Node node){
        //取出下一个节点，作为下下一个节点
        Node nextNext=next;
        this.next=node;
        node.next=nextNext;
    }
    @Override
    public String toString() {
        return "节点信息：" + this.data;
    }

    public boolean isLast() {
        return this.next == null;
    }
}
