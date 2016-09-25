import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class GeraldisintoArt {
    static int[]a;
    static int[]b;
   
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		sc = new StringTokenizer("");
		a= new int[3];
		b = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i]= nxtInt();
			b[i] = nxtInt();
		}
		if(sol())
			System.out.println("YES");
		else
			System.out.println("NO");
		

	}
	static boolean sol(){
		if(a[1]+a[2] <= a[0] && b[1] <= b[0] && b[2] <= b[0] )
			return true;
		if(a[1]+a[2] <= b[0] && b[1] <= a[0] && b[2] <= a[0])
			return true;
		if(a[1]+b[2] <= a[0] && b[1] <= b[0] && a[2] <= b[0])
			return true;
		if(a[1]+b[2] <= b[0] && b[1] <= a[0] && a[2] <= a[0])
			return true;
		if(b[1]+a[2] <= a[0] && a[1] <= b[0] && b[2] <= b[0])
			return true;
		if(b[1]+a[2] <= b[0] && a[1] <= a[0] && b[2] <= a[0])
			return true;
		if(b[1]+b[2] <= a[0] && a[1] <= b[0] && a[2] <= b[0])
			return true;
		if(b[1]+b[2] <= b[0] && a[1] <= a[0] && a[2] <= a[0])
			return true;
		
		return false;
		
	}
	static BufferedReader br;
	static StringTokenizer sc;
	static PrintWriter out;

	static String nxtTok() throws IOException {
		while (!sc.hasMoreTokens()) {
			String s = br.readLine();
			if (s == null)
				return null;
			sc = new StringTokenizer(s.trim());
		}
		return sc.nextToken();
	}

	static int nxtInt() throws IOException {
		return Integer.parseInt(nxtTok());
	}

	static long nxtLng() throws IOException {
		return Long.parseLong(nxtTok());
	}

	static double nxtDbl() throws IOException {
		return Double.parseDouble(nxtTok());
	}

	static int[] nxtIntArr(int n) throws IOException {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nxtInt();
		return a;
	}

	static long[] nxtLngArr(int n) throws IOException {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nxtLng();
		return a;
	}

	static char[] nxtCharArr() throws IOException {
		return nxtTok().toCharArray();
	}

}
