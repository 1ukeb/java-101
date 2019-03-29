import java.util.*;

/**
 *  Description of the Class
 */

public class Sorts{
  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public Sorts(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Comparable> list){
  	steps = 0;
    for (int outer = 0; outer < list.size() - 1; outer++){
	    for (int inner = 0; inner < list.size()-outer-1; inner++){
	   	  steps += 3;//count one compare and 2 gets
	      if (list.get(inner).compareTo(list.get(inner + 1)) > 0){
	        steps += 4;//count 2 gets and 2 sets
	        //swap list[inner] & list[inner+1]
	        Comparable temp = list.get(inner);
	        list.set(inner,list.get(inner + 1));
	        list.set(inner + 1,temp);
	      }
	    }
  	}
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(ArrayList <Comparable> list){
      Comparable temp;
      int min;
      steps = 0;
  
	  for (int outer = 0; outer < list.size() - 1; outer++){
	    min = outer;
	    for (int inner = outer + 1; inner < list.size(); inner++){
	      steps += 3; //count one compare and 2 gets
	      if (list.get(inner).compareTo(list.get(min)) < 0){
	        min = inner;  // a new smallest item is found
	      }
	    }
	    steps += 4;//count 2 gets and 2 sets
	    //swap list[outer] & list[min]
	    temp = list.get(outer);
	    list.set(outer,list.get(min));
	    list.set(min,temp);
	  }

  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Comparable> list){
  	  steps = 0;
      for (int outer = 1; outer < list.size(); outer++){
    	int position = outer;
    	steps++; //count one get
    	Comparable key = list.get(position);
    
    	// Shift larger values to the right
    	steps += 2;//the get and compare in the loop conditional
    	           //are executed one more time than the loop body
    	while (position > 0 && list.get(position - 1).compareTo(key) > 0){
    		steps += 4; //count one compare, 2 gets, and 1 set
      		list.set(position,list.get(position - 1));
      		position--;
    	}
    	steps++; //count one set
    	list.set(position,key);
  	  }
  }


 /**
   *  Takes in entire vector, but will merge the following sections
   *  together:  Left sublist from a[first]..a[mid], right sublist from
   *  a[mid+1]..a[last].  Precondition:  each sublist is already in
   *  ascending order
   *
   * @param  a      reference to an array of integers to be sorted
   * @param  first  starting index of range of values to be sorted
   * @param  mid    midpoint index of range of values to be sorted
   * @param  last   last index of range of values to be sorted
   */
  private void merge(ArrayList <Comparable> a, int first, int mid, int last){
    int aPtr = first;
    int bPtr = mid + 1;
    int cPtr = first;
    int total = last - first + 1;
    int loop;
    boolean doneA = false;
    boolean doneB = false;
    ArrayList <Comparable> c = new ArrayList <Comparable>(a);

    for (loop = 1; loop <= total; loop++){
      if (doneA){
        steps += 2;                  // 1 set, 1 get
        c.set(cPtr, a.get(bPtr));
        bPtr++;
      } else if (doneB){
        steps += 2;                  // 1 set, 1 get
        c.set(cPtr, a.get(aPtr));
        aPtr++;
      } else if (a.get(aPtr).compareTo(a.get(bPtr)) < 0){
        // ok to compare, valid data in each sublist
        steps += 2;                  // 1 get, 1 set
        c.set(cPtr, a.get(aPtr));
        aPtr++;
      } else {
        steps += 2;                  // 1 get, 1 set
        c.set(cPtr, a.get(bPtr));
        bPtr++;
      }
      steps += 3; 	// line 131, 2 gets, 1 compare
      cPtr++;
      if (aPtr > mid){
        doneA = true;
      }
      if (bPtr > last){
        doneB = true;
      }
    }
                                     
    for (loop = first; loop <= last; loop++){
      a.set(loop,c.get(loop));
      steps += 2;                    // 1 set, 1 get
    }
  }

  /**
   *  Recursive mergesort of an array of integers
   *
   * @param  a      reference to an array of integers to be sorted
   * @param  first  starting index of range of values to be sorted
   * @param  last   ending index of range of values to be sorted
   */
  public void mergeSort(ArrayList <Comparable> a, int first, int last){
    // Replace these lines with your code
    int mid;
    int temp;
    steps = 0;

    if (first == last){		// empty case, only 1 value, do nothing
    
    }else{
      if (first + 1 == last){
        // list of 2 values, swap if necessary
        steps+=3;                     // 2 gets 1 compare
        if (a.get(first).compareTo(a.get(last)) < 0){
          swap(a, first, last);
        }
      } else {
        // general case
        mid = (first + last) / 2;
        mergeSort(a, first, mid);
        mergeSort(a, mid + 1, last);
        merge(a, first, mid, last);

        // the function calls also require steps, but we won't count them
      }
    }
  }

 
  /**
   *  Accessor method to return the current value of steps
   *
   */
  public long getStepCount(){
    return steps;
  }

  /**
   *  Modifier method to set or reset the step count. Usually called
   *  prior to invocation of a sort method.
   *
   * @param  stepCount   value assigned to steps
   */
  public void setStepCount(long stepCount){
    steps = stepCount;
  }
  
   /**
   *  Interchanges two elements in an ArrayList
   *
   * @param  list  reference to an array of integers
   * @param  a     index of integer to be swapped
   * @param  b     index of integer to be swapped
   */
  public void swap(ArrayList <Comparable> list, int a, int b){
    Comparable c = list.get(a);
    list.set(a, list.get(b));
    list.set(b, c);
    steps += 4;// 2 gets 2 sets
  }
}
