

import java.util.*;

public class check {
	public static void main(String args[]){
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		
		for(int i=1 ; i<=queue.size() ; i++){
			int k=queue.poll();
			System.out.println(k);
			queue.add(k);
		}
		queue.poll();
		System.out.println(queue.size());
		int k = queue.peek();
		System.out.println(queue.size());
		k = queue.remove();
		System.out.println(queue.size());
	}
}
