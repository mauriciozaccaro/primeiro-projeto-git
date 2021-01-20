package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Exercicio_Fixacao_Aula_121 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		
		Date dataAtual = new Date(System.currentTimeMillis());
		
		
		Scanner sc = new Scanner(System.in);

			System.out.println("<<ENTRE COM OS DADOS DO CLIENTE>>");
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Data Nascimento: ");
			Date aniversario = sdf1.parse(sc.next());
			
			/*-----------------------------------------------*/
			Client client = new Client(nome, email, aniversario);
			Product product = new Product();
			OrderItem orderItem = new OrderItem();
			/*-----------------------------------------------*/
			System.out.println("");
			sc.nextLine();
			System.out.print("Status do Pedido: ");
			String stat  = sc.nextLine();
			System.out.print("Digite a quantidade de Itens do Pedido: ");
			int N = sc.nextInt();
			
			Order order = new Order(dataAtual, OrderStatus.valueOf(stat));
			System.out.println();
			
			for(int i = 0; i < N; i ++) {
			
			System.out.println("Digite os dados do item Nr° " + (i+1));
			System.out.print("Produto: ");
			sc.nextLine();
			String nameProduct = sc.nextLine();
			
			System.out.print("Preço: ");
			Double priceProduct = sc.nextDouble();
			
			System.out.print("Quantidade: ");
			Integer quantdadeProduct = sc.nextInt();
			
			product = new Product(nameProduct, priceProduct);			
			orderItem = new OrderItem(quantdadeProduct, priceProduct);
						
			order.addItem(orderItem);
			
			}
			
			System.out.println("");
			System.out.println("-----ORDER SUMARY-----");
			
			
		
		sc.close();
	}

}
