import java.util.ArrayList;


public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> fibnums = new ArrayList<Integer>();
		ArrayList<Integer> evens = new ArrayList<Integer>();
		
		fibnums.add(0);
		fibnums.add(1);
		
		for(int i = 0; fibnums.get(i) + fibnums.get(i + 1) < 4000000; i++) {
			int sum = fibnums.get(i) + fibnums.get(i + 1);
			fibnums.add(i + 2, sum);
		}
		//System.out.println(fibnums);
		
		for(int i = 0; i < fibnums.size(); i++) {
			if(fibnums.get(i) % 2 == 0) {
				evens.add(fibnums.get(i));
			}
		}
		//System.out.println(evens);
		
		int sum = 0;
		for(int i = 0; i < evens.size(); i++) {
			sum += evens.get(i);
		}
		System.out.println(sum);
	}

}
