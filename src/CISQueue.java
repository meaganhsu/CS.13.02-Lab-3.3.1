import java.util.LinkedList;

public class CISQueue {

    // Linked list property.
    LinkedList<Object> queue;

    // Size property.
    int size;

    // Constructor.
    CISQueue() {
        queue = new LinkedList<Object>();
        this.size = 0;
    }

    // Enqueue. This method adds a node to the end of the linked list.
    public void enqueue(Object node) {
        queue.add(node);
        size++;
    }

    // Dequeue. This method removes a node from the beginning of the linked list.
    public Object dequeue() {
        if (isEmpty()) return null;

        Object dequeued = queue.getFirst();
        queue.remove(0);
        size--;

        return dequeued;
    }

    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // size. Returns the size of the queue.
    public int size() {
        return size;
    }

    // toString. Returns a description of the queue in, for example, the following format:
    // CISQueue{queue=[7, 11], size=2}
    public String toString() {
        String str = "";

        for (int i = 0; i < size; i++) {
            str += queue.get(i);
            if (i != size-1)  str +=  ", ";
        }

        return "CISQueue{queue=[" + str + "], " + "size=" + size + "}";
    }
}