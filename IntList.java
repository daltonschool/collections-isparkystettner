import com.sun.xml.internal.bind.v2.runtime.unmarshaller.IntArrayData;

public class IntList {
    public static void main(String[] args) {
        IntList x = new IntList(5);
        IntList kate = new IntList(50);
        kate.add(6);
        kate.add(8);
        kate.add(12);
        kate.add(1);
        kate.add(3);
       kate.rotate(kate);
       // System.out.println(kate.size);
    }
    private int[] arr;
    int size = 0;

    public IntList(int default_size) {
      arr = new int[default_size];
    }

    int get(int index) {
      return arr[index];
    }

    void set(int index, int element) {
      arr[index] = element;
    }

    void add(int element) {
      arr[size++] = element;
      if(size==arr.length) resize();
    }

    void add(int index, int element) {
      for(int i = size; i>index; i--) {
        arr[i] = arr[i-1];
      }

      arr[index] = element;

      size++;
      if(size==arr.length) resize();

    }

    void remove(int index) {
      for(int i = index; i<size; i++) {
        arr[i] = arr[i+1];
      }

      size--;
    }

    void resize() {

    }

    /*
    sort — sorts a List using a merge sort algorithm, which provides a fast, stable sort. (A stable sort is one that does not reorder equal elements.)
    */
    static void sort(IntList l) {

    }

    /*
    shuffle — randomly permutes the elements in a List.
    */
    static void shuffle(IntList l) {

    }

    /*
    reverse — reverses the order of the elements in a List.
    */
    static void reverse(IntList l) {

    }

    /*
    rotate — rotates all the elements in a List by a specified distance.
    */
    static void rotate(IntList l) {
        for(int i = 0; i < l.size; i++){
            if(l.arr[i+1] == 0){
                System.out.println(l.arr[i-(l.size-1)]);
            }
            else System.out.println(l.arr[i+1]);
        }
    }

    /*
    swap — swaps the elements at specified positions in a List.
    */
    static void swap(IntList l, int i, int j) {

    }

    /*
    replaceAll — replaces all occurrences of one specified value with another.
    */
    static void replaceAll(IntList l, int rep) {

    }

    /*
    fill — overwrites every element in a List with the specified value.
    */
    static void fill(IntList l, int rep) {

    }

    /*
    copy — copies the source List into the destination List.
    */
    static void copy(IntList l1, IntList l2) {

    }

    /*
    search — searches for an element in an List.
    */
    static boolean search(IntList l, int i) {
        return false;
    }

    /*
    indexOfSubList — returns the index of the first sublist of one List that is equal to another.
    */
    static int indexOfSubList(IntList l, IntList sublist) {
        return 0;
    }

    /*
    lastIndexOfSubList — returns the index of the last sublist of one List that is equal to another.
    */
    static int lastIndexOfSubList(IntList l, IntList sublist) {
        return 0;
    }

    /*
    difference returns a list of all items that are in only one of the two lists (XOR)
    */
    static IntList difference(IntList l1, IntList l2) {
        return null;
    }

		/*
		return a new list with only the odd items
		*/
		static IntList oddList(IntList l) {
			return null;
		}

		/* 
		returns true if all items in i are in list l
		*/
		static boolean search(IntList l, int[] i) {
			return false;
		}

}
