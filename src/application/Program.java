package application;

import java.util.Scanner;

import entities.alunos;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("<<CADASTRO DE ALUNOS>>");
		System.out.print("Digite o Código: ");
		int cod = sc.nextInt();
		System.out.print("Digite o Nome: ");
		String nome = sc.nextLine();
		System.out.print("Digite a 1º Nota: ");
		double n1 = sc.nextDouble();
		System.out.print("Digite a 2° Nota: ");
		double n2 = sc.nextDouble();
		
		alunos al = new alunos(cod, nome, n1, n2);
		
		System.out.println(al.getCodAluno());
		System.out.println(al.getNomeAluno());
		
		sc.close();
	}

}
