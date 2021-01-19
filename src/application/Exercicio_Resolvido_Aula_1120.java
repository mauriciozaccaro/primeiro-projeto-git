package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Exercicio_Resolvido_Aula_1120 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("How that's awesome");
		
		Post p1 = new Post(sdf.parse("21/08/2018 13:05:44"), 
				"Traveling to New Zealand",
				"I'm going to visit wonderfull country!", 
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		System.out.println("------------------------");

		Comment c3 = new Comment("Segundo Post de Teste");
		Comment c4 = new Comment("Estou adorando esse post");
		
		Post p2 = new Post(sdf.parse("19/01/2021 13:05:44"), 
				"Que comentário bacana",
				"Java é legalzinho...", 
				12);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p2);
		
	}

}
