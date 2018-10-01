public class Euclid {

    // recursive implementation
    public static int gcd(int p, int q, int x) {
        if (q == 0)
        	{x++;
        	return gcd(p, 0, x);
        	}
        else 
        {
        x++;
        	return gcd(q, p % q, x);
        }
    }

    // non-recursive implementation
    public static int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

    public static void main(String[] args) {
    	int x = 0;
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        int d  = gcd(p, q,x);
        int d2 = gcd2(p, q);
        System.out.println("gcd(" + p + ", " + q + ") = " + d+x);
        System.out.println("gcd(" + p + ", " + q + ") = " + d2+x);
    }
}


