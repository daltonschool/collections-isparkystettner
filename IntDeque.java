public class IntDeque {

  public static void main(String[] args) {
    IntDeque sam = new IntDeque(10);
    System.out.println(sam.peekLast());

        //kate's testing area:
        IntDeque kate = new IntDeque(100);
        kate.putFirst(2);
        System.out.println(kate.getFirst()); //hoping for 2
    }



  int[] q;
  int head, tail;
  boolean isEmpty() { return head==0 || tail == 0;}


  public IntDeque(int defaultsize) {
    q = new int[defaultsize];
    head=0;
    tail=0;
  }

  /*
  put the first item
  */
  public void putFirst(int item) {

  }

  /*
  put the last item
  */
  public void putLast(int item) {
    q[tail++] = item;
  }

  /*
  return the first item
  */
  public int peekFirst() {
    return 0;
  }

  /*
  return the last item
  */
  public int peekLast() {
    return q[tail+1];
  }

  /*
  get the first item
  */
  public int getFirst() {
    if(!isEmpty()) {
      int x = q[head - 1];
      return x;
    }
    return 0;
  }

  /*
  get the last item
  */
  public int getLast() {
    return 0;
  }

  /*
  move num items from first to last
  */
  public void circ(int num) {

  }

  /*
  return a Stack from this deque
  */
  public IntStack toStack() {
    return null;
  }

  /*
  multiply every two items in the queue together,
  such that the array is half the size
  */
  public void multQueue() {

  }

  /*
  return a Deque which includes only every odd item in this queue
  */
  public IntDeque oddQueue() {
    return null;
  }

  /*
  print the Deque to the screen
  */
  public void print() {

  }

    /*
    add an item to the middle
    */
    public void middle(int i) {

    }

    /* 
    put an item on both sides
    */
    public void putBoth(int i) {
        
    }

    /*
    get an item from both sides
    */
    public int[] getBoth() {
        return null;
    }




}
