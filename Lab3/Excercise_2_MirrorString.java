package Lab3;
import java.util.*;
public class Excercise_2_MirrorString {

	
		static String getImage(String str) {
			StringBuffer sbf = new StringBuffer(str);
			return sbf.reverse().toString();
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String st = sc.next();
			String rev = getImage(st);
			System.out.println(st + "|" + rev);
			sc.close();
		}

	}


