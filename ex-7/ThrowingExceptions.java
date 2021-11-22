class BoundedMultiplication {
	public static int multiply(int a, int b, int bound) {
		int result = a * b;
        if (result > bound)
            throw new ArithmeticException("multiplication of " + a + " and " + b + " with bound " + bound + " not possible");
        return result;
	}
}
