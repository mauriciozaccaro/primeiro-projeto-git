package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HoursContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Exercicio_Resolvido_Aula_118 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, 
						new Department(departmentName)); // continuação da linha de cima
		
		System.out.println("How many contracts to this worker?");
		Integer N = sc.nextInt();
		
		for(int i = 0; i < N; i++ ) {
			
			System.out.println("Enter contract number #" + i+1 + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf1.parse(sc.next()); // transformando a String capturada em Date
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duraction (hours): ");
			int hours = sc.nextInt();
			
			HoursContract contract = new HoursContract(contractDate, valuePerHour, hours);
			worker.addContract(contract); // passando contract como argumento para adicionar no worker
		}
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " 
							+ String.format("%.2f", worker.income(year, month)));
		
		sc.close();

	}

}
