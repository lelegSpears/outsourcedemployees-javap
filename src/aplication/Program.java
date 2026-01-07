package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employeesList = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int employeeNum = sc.nextInt();
		
		for(int i=0; i<employeeNum; i++) {
			System.out.printf("\n Employee#%d data: \n", i+1);
			
			System.out.print("Outsourced (y/n)? ");
			char outSource = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("\n Name: ");
			String name = sc.nextLine();
			
			System.out.print("\n Hours: ");
			int hours = sc.nextInt();
			sc.nextLine();
			
			System.out.print("\n Value Per Hour: ");
			double valuePerHour = sc.nextDouble();
			sc.nextLine();
			
			if(outSource == 'y') {
				System.out.print("\n Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				sc.nextLine();
				employeesList.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				employeesList.add(new Employee(name, hours, valuePerHour));
			}
		}
		System.out.print("PAYMENTS: \n");
		for(Employee emp : employeesList) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}
		sc.close();
	}

}
