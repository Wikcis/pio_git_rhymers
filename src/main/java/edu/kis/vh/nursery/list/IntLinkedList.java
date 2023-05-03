package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int LIST_EMPTY = -1;
    private Node lastNode;
    private int index;

    public void push(int i) {
        if (lastNode == null)
            lastNode = new Node(i);
        else {
            lastNode.setNextNode(new Node(i));
            lastNode.getNextNode().setPrevNode(lastNode);
            lastNode = lastNode.getNextNode();
        }
    }

    public boolean isEmpty() {
        return lastNode == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return LIST_EMPTY;
        return lastNode.getValue();
    }

    public int pop() {
        if (isEmpty())
            return LIST_EMPTY;
        int ret = lastNode.getValue();
        lastNode = lastNode.getPrevNode();
        return ret;
    }

}
