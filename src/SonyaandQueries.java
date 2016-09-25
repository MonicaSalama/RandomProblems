import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SonyaandQueries {
	/*
	 * http://codeforces.com/contest/714/problem/C
	 */

	static int[] tree;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		init();
		br = new BufferedReader(new InputStreamReader(System.in));
		sc = new StringTokenizer("");
		out = new PrintWriter(System.out);
		int n = nxtInt();
		while (n > 0) {
			String op = nxtTok();
			switch (op) {

			case ("+"):
				insert(nxtLng());
				break;
			case ("-"):
				delete(nxtLng());
				break;
			case ("?"):
				out.println(count(nxtTok()));
			}
			n--;
		}
		out.close();

	}

	static void init() {
		tree = new int[(int) Math.pow(2, 20)];
		Arrays.fill(tree, 0);
	}

	static void insert(long num) {
		int index = 1;
		while (num != 0) {
			index *= 2;
			long digit = num % 10;
			if (digit % 2 != 0L)
				index++;
			tree[index]++;
			num /= 10;
		}
		index *= 2;
		while (index < tree.length) {
			tree[index]++;
			index *= 2;
		}
	}

	static void delete(long num) {
		int index = 1;
		while (num != 0) {
			index *= 2;
			long digit = num % 10;
			if (digit % 2 != 0L)
				index++;
			tree[index]--;
			num /= 10;
		}
		index *= 2;
		while (index < tree.length) {
			tree[index]--;
			index *= 2;
		}
	}

	static int count(String query) {
		int index = 1;
		for (int i = query.length() - 1; i >= 0; i--) {
			index *= 2;
			if (query.charAt(i) == '1')
				index++;
		}
		while (index < tree.length) {
			index *= 2;
		}
		index /= 2;
		return tree[index];
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
