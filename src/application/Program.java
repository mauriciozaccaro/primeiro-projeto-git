package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.alunos;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("<<CADASTRO DE ALUNOS>>");
		System.out.println("<DIGITE QUANTOS ALUNOS DESEJA INFORMAR AS NOTAS>");
		int N = sc.nextInt();
		
		List<alunos> al = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
		
		System.out.print("Digite o Código: ");
		int cod = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o Nome: ");
		String nome = sc.nextLine();
		System.out.print("Digite a 1º Nota: ");
		double n1 = sc.nextDouble();
		System.out.print("Digite a 2° Nota: ");
		double n2 = sc.nextDouble();
		
		al.add(new alunos(cod, nome, n1, n2));
		System.out.println("Aluno cadastrado com sucesso!");
		System.out.println();
		}
		//double med = al.mediaAluno(n1, n2);
		
		for(int i = 0; i < N; i++) {

			System.out.println(al.get(i).toString());
				
		}
		sc.close();
	}

}
