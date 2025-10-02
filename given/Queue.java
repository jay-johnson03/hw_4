public class Queue<T extends Comparable<T>> extends Structure<T> {
    public T pop() {
        // T ret = head.x;
        // this.head = this.head.next;
        // this.head.before.next = null;
        // this.head.before = null;
        // return ret;

        if (this.isEmpty()) 
            return null;
        Node<T> ret = this.head.next;
        this.head = this.head.next;
        this.head.before = null;
        return ret.x;
    }
    
}
