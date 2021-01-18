package entities;

public class alunos {

	private int codAluno;
	private String nomeAluno;
	private double nota1;
	private double nota2;
	
	public alunos(int codAluno, String nomeAluno, double nota1, double nota2) {
		this.codAluno = codAluno;
		this.nomeAluno = nomeAluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public int getCodAluno() {
		return codAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void mediaAluno(double mediaAluno) {
		mediaAluno = (this.nota1 + this.nota2)/2;
	}
	
}
