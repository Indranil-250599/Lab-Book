package Lab3;
import java.util.*;
public class Excercise_1_SumOfAllIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		int sum = 0;
		while (st.hasMoreTokens()) {
			int x = 0;
			x = Integer.parseInt(st.nextToken());
			System.out.print(x + " ");
			sum += x;
			
		}
		System.out.print("\n" + sum);
		sc.close();
	}
	

}
