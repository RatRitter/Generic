import java.util.Random;

public class List03 {

	public static void main(String[] args) {
		
	    Random rand = new Random(13);
		IntList list = new IntList(10);
		for(int i = 0;i < list.getSize();i++) {
          list.setElement(i,rand.nextInt(0,10));
	}
for(int i = 0; i < list.getSize();i++) {
	System.out.println(list.getElement(i)+" ");
}
System.out.println();
System.out.println("index = -1, " + list.getElement(-1));
int size = list.getSize();
System.out.println("index = " + size + ", " + list.getElement(size));
}
}