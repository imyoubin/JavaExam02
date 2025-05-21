package com.javaex.draw;

public class Trianglelmpl implements Drawable {

    private int width;
    private int height;

    public Trianglelmpl() {
    	
    }

    public Trianglelmpl(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("삼각형을 그렸습니다. "+"[가로: + width +  세로: height]");
    }

    @Override
    public String toString() {
        return "TriangleImpl [width=" + width + ", height=" + height + "]";
    }
}