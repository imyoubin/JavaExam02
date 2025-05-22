package com.javaex.draw;

public class Pointlpml implements Drawable {

    private int x;
    private int y;

    public Pointlpml() {
    	
    }

    public Pointlpml(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "PointImpl [x=" + x + ", y=" + y + "]";
    }
    @Override
    public void draw() {
    	System.out.println("--------------------------------------");
        System.out.println("점을 그렸습니다. "+"[ X좌표: + x + , Y좌표 + y + ]");
        System.out.println("--------------------------------------");
    }
}