package com.geekband.flyweight;

import java.util.Hashtable;

public class ChessmanDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChessmanFactory factory = ChessmanFactory.getInstance();
		System.out.println(factory);
		
		Chessman chess1 = factory.getChessman('w');
		chess1.setPosition(1, 1);
		chess1.print();
		
		Chessman chess2 = factory.getChessman('w');
		chess2.setPosition(2, 1);
		chess2.print();
	}

}

abstract class Chessman {
	// intrinsicState 棋子颜色
	private String color;
	// extrinsicState 棋子位置
	private int x;
	private int y;
	
	public Chessman(String color) {
		this.color = color;
	}

	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}	
	public void print() {
		System.out.println(color + "("+x+","+y+")"+this);
	}
}

class BlackChessman extends Chessman {
	public BlackChessman() {
		super("黑色棋子");
		// TODO Auto-generated constructor stub
		System.out.println("创建黑色棋子");
	}
}

class WhiteChessman extends Chessman {
	public WhiteChessman() {
		super("白色棋子");
		// TODO Auto-generated constructor stub
		System.out.println("创建白色棋子");
	}	
}

class ChessmanFactory {
	private static ChessmanFactory chessmanFactory = new ChessmanFactory();
	private Hashtable<Character, Chessman> cache = new Hashtable<Character, Chessman>();
	
	public static ChessmanFactory getInstance() {
		return chessmanFactory;
	}
	
	public Chessman getChessman(char c) {
		Chessman chessman = this.cache.get(c);
		//System.out.println(chessman);
		if (chessman == null) {
			if (c == 'w') {
				chessman = new WhiteChessman();
			} else if (c == 'b') {
				chessman = new BlackChessman();
			}
			cache.put(c, chessman);
		}
		return chessman;
	}
}
