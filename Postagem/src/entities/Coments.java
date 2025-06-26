package entities;

public class Coments {
	String text;
	
	
	public Coments(){	
	}
	
	
	public Coments(String text) {
		this.text = text;
	}



	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}
}
