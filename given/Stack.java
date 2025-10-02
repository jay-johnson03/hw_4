public class Stack<T extends Comparable<T>> extends Structure<T> {
    public T pop() {
        // keeping track of what we return
        T ret = tail.x;
        this.tail.before.next = null;
        this.tail = this.tail.before;
        return ret;
    }
}
