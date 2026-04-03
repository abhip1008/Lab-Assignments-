/**
 * FIFO uses offer and poll
 * offer adds elements to the back of the queue
 * poll removes elements from the front
 * Because of this, the first element added is also the first to
 * be removed
 */

/**
 * This class implements a queue with linked list
 *
 * @author Meng Yang
 * @author Abhi Purohit
 */

public class LinkedQueue {
    // This is an inner class specifically utilized for LinkedStack class,
    // thus no setter or getters are needed
    private static class Node {
        private Object data;
        private Node next;

        // Constructor with no parameters for inner class
        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }

        // TODO Define a constructor with parameters for the data and the reference to the next node
    } // end of inner class

    private Node front;
    private Node back;

    public LinkedQueue() {}

    // Adds the object at the back of the queue
    public void offer(Object data) {
        // TODO Complete the method.
        Node newNode = new Node(data, null);

        if(isEmpty()) {
            front = newNode;
            back = newNode;
        } else {
            back.next = newNode;
            back = newNode;
        }
    }

    /**
     * Removes the head of the queue and returns it,
     * or returns null if the queue is empty.
     *
     * @return the head of the queue
     */
    public Object poll() {
        // TODO Complete the method.
        if(isEmpty()) {
            return null;
        }
        Object temp = front.data;
        front = front.next;

        if(front == null) {
            back = null;
        }
        return temp;
    }

    // Returns the size of linked list by traversing the list
    public int size() {
        // TODO Complete the method.
        int count = 0;
        Node current = front;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Retrieves, but does not remove, the head of this queue,
    // or returns null if this queue is empty.
    public Object peek() {
        // TODO Complete the method.
        if(isEmpty()) {
            return null;
        }
        return front.data;
    }

    /**
     * Returns true if this queue is empty.
     *
     * @return true is this queue is empty
     */
    public boolean isEmpty() {
        return front == null;
    }

    /**
     * Returns a string representation of this queue.
     *
     * @return a string representation of this queue
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = front;

        if (current != null) {
            if (current.data != null) {
                result.append(current.data);
            }
            current = current.next;
        }
        while (current != null) {
            if (current.data != null) {
                result.append(", ").append(current.data);
            }
            current = current.next;
        }
        return result.toString();
    }

    /**
     * Indicates whether some object is equal to this queue.
     * For two lists to be equal, they must contain the same
     * data items in the same order.
     *
     * @param other the object to compare with
     * @return true if the argument is the same as this queue
     */
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkedQueue that)) {
            return false;
        }
        if (this.size() != that.size()) {
            return false;
        }

        Node thisNode = this.front;
        Node thatNode = that.front;
        while (thisNode != null) {
            if (!thisNode.data.equals(thatNode.data)) {
                return false;
            }
            thisNode = thisNode.next;
            thatNode = thatNode.next;
        }
        return true;
    }
}