// `T extends Comparable<T>` will accept anything `Comparable<T>`
// class node that has a generic type that's comparable to itself
public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
  //comparing and passing two integers
  public T x;

  public Node<T> next = null;
  public Node<T> before = null;
  //pointer to parent, left or right child
  public Node<T> parent = null;
  public Node<T> left = null;
  public Node<T> right = null;

  //constructor for x
  public Node(T x) {
    this.x = x;
  }

  public int compareTo(Node<T> other) {
    return x.compareTo(other.x);
  }
  //toString method
  public String toString() {
    return x.toString();
  }
  // swap our values (our nodes)
  public void swap(Node<T> other) {
    T escrow = x;
    x = other.x;
    other.x = escrow;
  }
}