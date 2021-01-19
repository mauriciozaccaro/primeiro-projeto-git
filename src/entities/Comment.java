package entities;

public class Comment {
	
	private String text;
	
	public Comment() {
		
	}
	
	public Comment(String texto) {
		text = texto;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String texto) {
		this.text = texto;
	}

}
