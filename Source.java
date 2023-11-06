import java.util.Stack;
class Node<T> {
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
  }
  
  class Source {
    public static <T> Node<T> reverseList(Node<T> head) {
      var s = new Stack<Node<T>>();
      while(head!=null){
        s.push(head);
        head=head.next;
      }
      System.out.println(s.toString());
      if(s.isEmpty()){
        return null;
      }
      else{
        head = new Node<T>(s.pop().val);
        head.next=null;
        Node<T> curr = head;
      while(!s.isEmpty()){
        curr.next = new Node<T>(s.pop().val);
        //System.out.println(s.isEmpty());
        curr = curr.next;
      }
      return head;
      }
    }
    
    public static void main(String[] args) {
        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
    
        x.next = y; // x -> y
    
        reverseList(x); // y -> x

        // Printing solution
        Node<String> head = Source.reverseList(x);
        //System.out.println(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;            
        }
    }
  }