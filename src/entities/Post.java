package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date date;
	private String title;
	private String contents; //comentários
	private Integer likes;
	
	private List<Comment> comment = new ArrayList<>();
	
	public Post() {
		
	}

	public Post(Date date, String title, String contents, Integer likes) {
		this.date = date;
		this.title = title;
		this.contents = contents;
		this.likes = likes;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public List<Comment> getComment() {
		return comment;
	}
	
	public void addComment(Comment comment) {
		this.comment.add(comment);
	}
	
	public void removeComment(Comment comment) {
		this.comment.remove(comment);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(date) + "\n");
		sb.append(contents + "\n");
		sb.append("Comments: \n");
		for(Comment c : comment) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
}
