
import java.util.ArrayList;
/*
 * Driver
 * Lab 
 * 
 * A simple driver to exercise the Employee hierarchy 
 */

public class EmployeeDriver {
	
	
	public static void main(String[] args) {
		Accountant emp1 = new Accountant( "Rick", 123456789);
		//this next employee makes a bit more than Rick
		Accountant emp2 = new Accountant( "Tim", 55555555,10000);
		//and lets make an hourly worker
		HourlyWorker emp3 = new HourlyWorker( "Jim", 11111111);
		//then a salaried worker
		SalariedWorker emp4 = new SalariedWorker( "Jane", 222222222, 5000);
		HourlyWorker emp5 = new HourlyWorker( "Joe", 11111111,20);
		
		//todo: Build some PermanentHire and Consultant objects here
		//and add them to the ArrayList below
		PermanentHire emp6 = new PermanentHire("Sarah", 333333333, 6000, 1000);
		PermanentHire emp7 = new PermanentHire("Mark", 444444444, 7000, 500);

		Consultant emp8 = new Consultant("Harry", 777777777);
		Consultant emp9 = new Consultant("Ron", 888888888);
		
		//and build a set of workers, all of which are employees
		ArrayList<Employee> myEmployees = new ArrayList<Employee>();
		
		myEmployees.add(emp1);
		myEmployees.add(emp2);
		myEmployees.add(emp3);
		myEmployees.add(emp4);
		myEmployees.add(emp5);
		myEmployees.add(emp6);
		myEmployees.add(emp7);
		myEmployees.add(emp8);
		myEmployees.add(emp9);
		//todo: add a sixth and seventh employee to this list that you create
		
		
		//this code doesn't need to change, even if you add 10 new employee classes and 
		//add 102 new employees - this is an example of generic code that can be written 
		//when inheritance hierarchies are in use
		for( int i = 0; i < myEmployees.size(); i++) {
			Employee current = myEmployees.get(i);
			System.out.println( current.getName() + " makes " + current.calculateWeeklyPay() + " per week.");
		}
		
		
	}
}
/**
 * What happens when you try to add ColorWithAlpha to ArrayList
 * You will get a compile time error because ColorWithAlpha
 * cannot be converted to type Employee.
 *
 * What happens when you try to add ColorException
 * You get a compile time error because ColorException does not extend
 * Employee
 *
 * If you want to store both
 * ArrayList<Object> myEmployees = new ArrayList</Object>();
 */

/**
 * Polymorphism Questions
 *
 * 1) calculateWeeklyPay() is polymorphic because it is defined in Employee
 * and overridden in SalariedWorker, HourlyWorker, Accountant, PermanentHire,
 * and Consultant
 *
 * 2) We can build a method called getRandomEmployee() that randomly creates and
 * returns different subclasses of Employee, but returns them as the type Employee.
 *
 * 3)
 * Employee e = getRandomEmployee();
 * System.out.println(e.getName() + " makes " + e.calculateWeeklyPay());
 *
 */
