package series;

import java.util.ArrayList;

public class Fibonacci{
	public static ArrayList<Integer> fibSeries(int limit){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		
		for(int x = 1; x < limit; x++){
			int add = list.get(x) + list.get(x - 1);
			list.add(add);
		}
		return list;
	}

	public static void main(String[] args){
		ArrayList<Integer> newList = Fibonacci.fibSeries(30);
		
		for(int x = 0; x < newList.size(); x++){
			System.out.println(newList.get(x));
		}
	}
}