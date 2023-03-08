import java.lang.reflect.Array;

public class List02 {

	public List02(int n) {
		if(n < 0) {
			System.err.println("Error: out of range");
			
		}else {
			array = new int[n];
		}
		}
	
public int getSize() {
	return array.length;
}
public int getElement(int index) {
	if(index >= array.length) {
		System.err.println("Error: out of range");
		return 0;
	}else {
		return array[index];
	}
}

public void setElement(int index,int value) {
	if(index >= array.length) {
		System.err.println("Error: out of range");
	}else {
		array[index] = value;
	}
}

private int[] array;}