package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private int likes;
	private String content;
	
	
	private List<Coments> coments = new ArrayList<>();
	
	
	public	Post() {
	}
	
	public Post(Date moment, String title, int likes, String content) {
		this.moment = moment;
		this.title = title;
		this.likes = likes;
		this.content = content;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void addComent(Coments coment) {
		coments.add(coment);
	}
	
	public void removeComent(Coments coment) {
		coments.remove(coment);
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" like - ");
		sb.append(sdf.format(getMoment()) + "\n");
		sb.append(content + "\n");
		sb.append("Coments: " + "\n");
		for(Coments c : coments) {
			sb.append(c.getText() + "\n");
		}
		
		return sb.toString();
	}
	
}
