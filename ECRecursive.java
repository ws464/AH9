class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECRecursive {
  public static <T> boolean isUnivalueList(Node<T> head) {
    if(head==null){
        return true;
    }
    else if(head.next==null){
        return true;
    }
    else{
        return(head.val.equals(head.next.val)&&isUnivalueList(head.next));
    }
  }

  public static void main(String[] args) {
        Node<String> z = new Node<String>("z");
        Node<String> y = new Node<String>("z");
        Node<String> x = new Node<String>("z");

        z.next=x;
        x.next=y;
        // z

        // Printing solution
        System.out.println((ECRecursive.isUnivalueList(z)));
    }
}
