import java.util.ArrayList;


public class Multiples {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> multiples = new ArrayList<Integer>();
		
		for(int i = 0; i < 1000; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				multiples.add(i);
			}
		}
		int result = 0;
		for(int i = 0; i < multiples.size(); i++) {
			result += multiples.get(i);
		}
		
		System.out.println(result);
	}

}
