package com.javaex.draw;

public class DrawApp {
	
	public static void main(String[] args) {
		
		Drawable[] ArrayList = new Drawable[3];
		
		Drawable dt = new Trianglelmpl(3,3);		
		Drawable ct = new Cliclelmpl(10);
		Drawable pt = new Pointlpml(3,7);
		
		ArrayList[0]=dt;
		ArrayList[1]=ct;
		ArrayList[2]=pt;
		
		for(int i=0; i<ArrayList.length;i++) {
			ArrayList[i].draw();
		}
		
		
		
	}

}
