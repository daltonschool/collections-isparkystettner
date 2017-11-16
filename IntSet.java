public class IntSet {
	public static void main(String[] args) {
		IntSet devin = new IntSet(7);
        IntSet devin2 = new IntSet(7);
		IntSet s = new IntSet(20);


		devin.add(3);
        devin2.add(3);
        devin2.add(2);
        devin.add(2);
        devin.add(5);
        devin.add(6);
        devin.incrementAll(devin2);
        System.out.println(devin.contains(4));
        System.out.println(devin.contains(3));
        System.out.println(devin.contains(2));

        //tests for increment all:
        IntSet emilio = new IntSet(100);
		System.out.println(emilio.contains(30));
		emilio.add(30);
        System.out.println(emilio.contains(30));
		emilio.removeAll(s);
        System.out.println (emilio.contains(3));


    }

	
	boolean[] arr;
	
	public IntSet(int size) {
		arr = new boolean[size];
	}

	void add(int i) {
		arr[i] = true;
	}

	void remove(int i) {
		arr[i] = false;
	}

	boolean contains(int i) {
		return arr[i];
	}

	//BULK FUNCTIONS:

    /*
    returns true if s is a subset of set
    */
    boolean containsAll(IntSet s) {
      return false;
    }

    /*
    add all items in set s to this set.
    */
    void addAll(IntSet s) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == false && s.contains(i) == true) {
                arr[i] = true;
            }
        }
    }

    /*
    remove all items from this set that are not in set s (intersection)
    */
    void retainAll(IntSet s) {

    }

    /*
    remove all items in s from this set
    */
    void removeAll(IntSet s) {
        for (int i = arr.length; i>0; i--) {
            if (arr[i] == false && s.contains(i) == true){
                s.remove(i);
            }
        }

    }

    /*
    increment every number in the set by 1
    */
    void incrementAll(IntSet s) {
     boolean a = false;
     boolean b = false;

     for(int i = 0; i<this.arr.length; i++){
         b = a;
         a = this.arr[i];
         if(s.contains(i)) {
             this.arr[i] = b;
         }
         if(i>0 && s.contains(i-1)) {
             this.arr[i] = b;
         }
     }
    }

    /*
      for any number in set s that is in this set, multiply this set by multiplier
    */
    void multiplyAll(IntSet s, int multiplier) {

    }

    /*
    does the set contain all of the prime factors of number
    */
    boolean containsPrimeFactors(int number) {
    	return false;
    }

    /*
    all the subsets that can be generated of subSetSize size
    */
    IntSet[] subSets(int subSetSize) {
    	return null;
    }

    /*
    the subSetSize largest items
    */
    IntSet maxSubSet(int subSetSize) {
    	return null;
    }

    /*
    return an array of two sets,
    the set of numbers above divide, and those below
    */
    IntSet[] discrete(int divide) {
    	return null;
    }

    /*
    finds this intersection of this and all sets in the array
    */
    boolean containsAll(IntSet[] s) {
    	return false;
    }

    /*
    print the set pretty like.
    */
    void print() {

    }

		/*
		finds the gcd of the set
		*/
		int gcd() {
			return 0;
		}

		/*
		finds the mean of the set
		*/
		int mean() {
			return 0;
		}

		/*
		returns a set with only the bottom n items in the set
		*/
		IntSet bottom(int n) {
            return null;
		}

}

