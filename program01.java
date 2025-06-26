package demo1;

import java.util.Scanner;

public class program01 {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
//			Employee e = new Employee();
//			Manager m = new Manager();
//			Salesman s = new Salesman();

			Employee e;
//			e = new Employee();
//			e = new Manager(); // upcasting
			e = new Salesman(); // upcasting
			// process of storing the object of subclass in the super class reference
			e.accept(sc);
			e.display();
		
	}

}
