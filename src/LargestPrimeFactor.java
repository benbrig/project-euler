import java.util.ArrayList;


public class LargestPrimeFactor {
	
	public static boolean isPrime(double n) {
		for(int i = 2; i < n / 2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Double> factors = new ArrayList<Double>();
		ArrayList<Double> pfacs = new ArrayList<Double>();
		double num = 600851475143L;
		
		System.out.println("Number: " + num);
		
		for(double i = 1; i <= Math.sqrt(num); i++){
			if(num % i == 0) {
				factors.add(i);
				factors.add(num / i);
			}
		}
		System.out.println("Factors: " + factors);
		
		for(int i = 0; i < factors.size(); i++) {
			if(isPrime(factors.get(i)) == true) {
				pfacs.add(factors.get(i));
			}
		}
		System.out.println("Prime Factors: " + pfacs);
		double lpf = pfacs.get(pfacs.size() - 1);
		System.out.println("Largest Prime Factor: " + lpf);
	}

}
