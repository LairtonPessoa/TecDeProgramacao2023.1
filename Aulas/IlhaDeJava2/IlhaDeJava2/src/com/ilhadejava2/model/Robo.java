package com.ilhadejava2.model;

public abstract class Robo {
	private int x;
	private int y;
	private int points;

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

	public int getPoints() {
		return points;
	}

	public void setpoints(int points) {
		this.points = points;
	}

	public void winPoints() {
		points += 10;
	}

	public void losePoints() {
		points -= 15;
	}
}
