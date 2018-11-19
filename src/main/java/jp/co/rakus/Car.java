package jp.co.rakus;

public class Car {
<<<<<<< HEAD

	public int speed;
	public String color;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

=======
	
	private int speed;
	private String color;
	private String name;
	
	//getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
>>>>>>> feature/login
	public void setColor(String color) {
		this.color = color;
	}

}
