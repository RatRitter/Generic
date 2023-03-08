import java.util.Arrays;

public class ArrayList {
	 private int capacity = 10;
	    private Integer[] array = new Integer[capacity];
	    private int currentIndex = 0;
	    private int size = 0;

	    public void add(Integer element) {
	        if (currentIndex >= array.length) {
	            makeArrayGreatAgain();
	        }
	        array[currentIndex++] = element;
	        size++;
	    }

	    public int size() {
	        return size();
	    }

	    private void makeArrayGreatAgain() {
	        int newCapacity = capacity * 3 / 2 + 1;
	        Integer[] newExpandedArray = new Integer[newCapacity];

	        System.arraycopy(array, 0, newExpandedArray, 0, capacity);
	        array = newExpandedArray;
	        capacity = newCapacity;
	    }

	    @Override
	    public String toString() {
	        String elements = "";
	        for (int i = 0; i < size; i++) {
	            elements = elements + array[i] + ", ";
	        }
	        return "ArrayList{" +
	                elements.substring(0, elements.length() - 2) +
	                '}';
	        
	    }

		
		

public void pushFront(int element) {
	for(int i = size-1;i >=0;i--) {
		array[i+1] = array[i];
		array[0] = element;
		size++;}
	}public void pushBack(int index,int element) {
		array[size++] = element;
		}
	public void insert(int index,int element) {
		for(int i = size-1;i >= index;i--) {
			array[i+1] = array[i];
		}
		array[index] = element;
		size++;
	}
	public void popFront() {
		for(int i = 0;i < size-1;i++) {
			array[i] = array[i+1];
		}
		size--;
	}
	
	public void popBack() {
		array[--size] = 0;
	}
	 public int indexOf(int element) {
		  for (int i = 0; i < size; i++) {
		   if (array[i] == element) {
		    return i;
		   }
		  } 
		  return -1;
		 }

	public void pushBack(int i) {
		// TODO Auto-generated method stub
		
	}

	public void remove() {
		
		
	}
		 
		
		}
	    

