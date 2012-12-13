package lifegame;

public class OscillationFunction implements EstimationFunction{
	OscillationParameters p;
	double eenmyVelocity;
	double enemyHeading;
	double selfPositionX;
	double selfPositionY;
	double currentTime;
	public OscillationFunction(
			OscillationParameters p,
			double v,
			double h,
			double x,
			double y,
			double t){
		this.p = p;
		this.enemyVelocity = v;
		this.enemyHeading = h;
		this.selfPositionX = x;
		this.selfPositionY = y;
		this.currentTime = t;		
	}
	
	public double getEstimatedX(double t){
		double v = (enemyVelocity < 0)? -1 : 1;
		double h = enemyHeading;
		double r = p.enemyRadius;
		double w = p.enemyOmega;
		double t0 = currentTime - p.prevTime;
		double x0 = p.enemyAbsoluteCenterX - selfPositionX;
		return x0 - v * Math.sin(Math.toRadians(h)) * r
				*Math.cos(Math.toRadians(w * (t0+t)));
	}
	
	public double getEstimatedY(double t){
		double v = (enemyVelocity < 0)? -1 : 1;
		double h = enemyHeading;
		double r = p.enemyRadius;
		double w = p.enemyOmega;
		double t0 = currentTime - p.prevTime;
		double y0 = p.enemyAbsoluteCentery - selfPositionY;
		return y0 - v * Math.sin(Math.toRadians(h)) * r
				*Math.cos(Math.toRadians(w * (t0+t)));
	}

}