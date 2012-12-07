package sampleRobot;

public class Enemy {

	private String name;
	private double bearing;
	private double heading;
	private double velocity;
	private double distance;
	private double energy;
	private int id;
	private boolean alive;
	
	
	public Enemy(String name, double bearing, double heading, double velocity,
			double distance, double energy, int id) {
		this.setName(name);
		this.bearing = bearing;
		this.heading = heading;
		this.velocity = velocity;
		this.distance = distance;
		this.energy = energy;
		this.id = id;
		this.alive = true;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBearing() {
		return this.bearing;
	}
	public void setBearing(double bearing) {
		this.bearing = bearing;
	}
	public double getHeading() {
		return this.heading;
	}
	public void setHeading(double heading) {
		this.heading = heading;
	}
	public double getVelocity() {
		return this.velocity;
	}
	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}
	public double getDistance() {
		return this.distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getEnergy() {
		return this.energy;
	}
	public void setEnergy(double energy) {
		this.energy = energy;
	}
	
	public boolean isAlive() {
		return this.alive;
	}

	public void setAlive(boolean b) {
		this.alive = b;
	}

}
