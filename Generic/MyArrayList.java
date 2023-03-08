import java.util.Arrays;

public class MyArrayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(5);
		list.add(1);
		list.add(3);
		list.add(9);
		System.out.println(list);
		list.pushBack(1);
		  list.pushBack(2);
		  list.pushBack(3);
		  System.out.println(list.toString());
		  list.pushFront(1);
		  System.out.println(list.toString());
		        list.insert(1,9);
		  System.out.println(list.toString());
		  list.popFront();
		  System.out.println(list.toString());
		  list.popBack();
		  System.out.println(list.toString());
		  list.remove();
		  System.out.println(list.toString());}
		private int[] array;
		private int size;
		
/*public void pushFront(int element) {
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
		 */
		 public String toString(){
		 return Arrays.toString(Arrays.copyOf(array,size));
		 
			 
			  
			 
		 

	}

}
