package series;

import java.util.ArrayList;

public class Fibonacci{
	public static ArrayList<Integer> fibSeries(int limit){
		ArrayList<Integer> list = new ArrayList<Integer>(); // Create an Integer ArrayList and add the 1st 2 elements required.
		list.add(0);
		list.add(1);
		
		for(int x = 1; x < limit; x++){ // User defined upper limit determines when to stop.
			int add = list.get(x) + list.get(x - 1);
			list.add(add);
		}
		return list;
	}

	public static void main(String[] args){
		// This is purely to test the method with a limit.
		ArrayList<Integer> newList = Fibonacci.fibSeries(30);
		
		for(int x = 0; x < newList.size(); x++){
			System.out.println(newList.get(x));
		}
	}
}