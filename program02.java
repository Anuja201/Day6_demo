package demo3;
class Test {
//	final int num1 = 10;
	final int num1;
	{
//		num1 = 10;
	}

	public Test() {
		num1 = 10;
	}

}

public class program02 {

	public static void main(String[] args) {
	
		final int num1;
		num1 = 10;
//		num1 = 20; NOT OK
	}

}
