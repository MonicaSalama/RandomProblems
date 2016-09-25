import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class FilyaAndHomework {
	
	/*
	 * http://codeforces.com/contest/714/problem/B
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		sc = new StringTokenizer("");
		out = new PrintWriter(System.out);
		HashSet<Integer> set = new HashSet<Integer>();
		int n = nxtInt();
		while(n > 0) {
			set.add(nxtInt());n--;
		}
		if(set.size() > 3)
			out.println("NO");
		else if(set.size() < 3)
			out.println("YES");
		else {
			Iterator<Integer> iter = set.iterator();
			int[]ar = new int[3];
			int i = 0;
			while (iter.hasNext()){
				ar[i] = (int) iter.next(); 
				i++;
			}
			Arrays.sort(ar);
			if ((ar[2] - ar[1]) == (ar[1] - ar[0]))
				out.println("YES");
			else
				out.println("NO");
		}
		out.close();

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
