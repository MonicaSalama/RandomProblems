import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EquivalentStrings {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String a = rd.readLine();
		String b = rd.readLine();
		if (equ(a, b)) {
			out.println("YES");
		} else {
			out.println("NO");
		}
		out.close();

	}

	public static boolean equ(String a, String b) {
		if (a.equals(b))
			return true;
		if (a.length() % 2 == 0) {
//			String a1 = a.substring(0, a.length() / 2);
//			String a2 = a.substring(a.length() / 2);
//			String b1 = b.substring(0, b.length() / 2);
//			String b2 = b.substring(b.length() / 2);
//			if (!(equ(a1, b1) && equ(a2, b2))) {
//				return (equ(a1, b2) && equ(a2, b1));
//			}
			return (equ(a.substring(0, a.length()/2),b.substring(a.length()/2)) && equ(b.substring(0, a.length()/2),a.substring(a.length()/2))) || (equ(a.substring(0,a.length()/2),b.substring(0,b.length()/2))&&equ(a.substring(a.length()/2),b.substring(b.length()/2)));
			
		}
		return false;

	}

}
