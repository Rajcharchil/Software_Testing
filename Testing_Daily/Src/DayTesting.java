package charchiltesing;

public class DayTesting {

	public int add(int a, int b) {
		return a+b;

	}
	public int square(int n) {
		return n*n;

	}
    public String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return new StringBuilder(input).reverse().toString();
    }
}

