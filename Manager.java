package demo1;

import java.util.Scanner;

public class Manager extends Employee {
	double bonus;
	
	public Manager() {
		
	}

	public Manager(int empid, double salary, int bonus) {
		super(empid, salary);
		this.bonus = bonus;
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter the bonus:");
		bonus=sc.nextDouble();
		
	}
	
	public void display() {
		super.display();
		System.out.println("Bonus :"+bonus);
	}
	
}
