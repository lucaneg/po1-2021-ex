import java.util.Scanner;

class BoundedMultiplication {
	public static int multiply(int a, int b, int bound) {
		int result = a * b;
        if (result > bound)
            throw new ArithmeticException("multiplication of " + a + " and " + b + " with bound " + bound + " not possible");
        return result;
	}
}

class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
	        int a = sc.nextInt(), b = sc.nextInt(), bound = sc.nextInt();
	        try {
	            System.out.println(BoundedMultiplication.multiply(a, b, bound));
	        } catch (ArithmeticException e) {
	        	System.out.println(e.getMessage());
	        }
		}
	    sc.close();
	}
}
