package com.javaex.draw;

public class Cliclelmpl implements Drawable {

    private int radius;

    public Cliclelmpl() {
    	
    }

    public Cliclelmpl(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "CircleImpl [radius=" + radius + "]";
    }
    @Override
    public void draw() {
    	System.out.println("--------------------------------------");
        System.out.println("원을 그렸습니다. "+"[ 반지름:  + radius]");
        System.out.println("--------------------------------------");
    }

   
}