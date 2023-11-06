class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head) {
    boolean ret = true;
    while(head.next!=null){
      ret = (head.val.equals(head.next.val));
      head=head.next;
    }
    return ret;
  }

  public static void main(String[] args) {
        Node<String> z = new Node<String>("z");
        Node<String> y = new Node<String>("z");
        z.next=y;
        // z

        // Printing solution
        System.out.println((ECSource.isUnivalueList(z)));
    }
}
