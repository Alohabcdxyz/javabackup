package don;
import java.util.LinkedList;

public class main {
	public static void main(String[] args) {
	    LinkedList<Integer> linkedList = new LinkedList<>();
	    linkedList.add(1);
	    linkedList.add(0);
	    linkedList.add(3);
	    linkedList.add(9);
	     
	    System.out.println("Các phần tử có trong linkedList là: ");
	    for (int i = 0; i < linkedList.size(); i++) {
	        System.out.print(linkedList.get(i) + "\t");
	    }
	}
}
