import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkList = new LinkedList<Integer>();
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkList);
		
	}
	
	public static void doTimings(String type, List<Integer> list){
		
		for(int i=0; i<1E5; i++){
			list.add(i);
		}
		
		long start= System.currentTimeMillis();
		
		/*// Add items at end of list
		for(int i = 0; i<1E5; i++ ){
			list.add(0, i);
		}*/
		
		 // Add items elsewhere in list
        for(int i=0; i<1E5; i++) {
        	list.add(0, i);
           // list.add(list.size()-100, i);
        }
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end - start)+ " ms for " + type);
		
		
	}

}
