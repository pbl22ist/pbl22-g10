package robocode;

public class OscillationParameters{
	public double enemyAbsoluteCenterX;
	public double enemyAbsoluteCenterY;
	public double enemyOmega;
	public double enemyRadius;
	public double prevTerminalX;
	public double prevTerminalY;
	public double prevTime;
	
	public void setAbsoluteTerminal(		
			double x2,
			double y2,
			double t2){
		double x1 = prevTerminalX;
		double y1 = prevTerminalY;
		double t1 = prevTime;
		double dx = x2 - x1;
		double dy = y2 - y1;
		enemyAbsoluteCenterX = (x1 + x2) / 2;
		enemyAbsoluteCenterY = (y1 + y2) / 2;
		enemyRadius = Math.sqrt(dx*dx + dy*dy)/2;
		enemyOmega = 180 / (t2 - t1);
		prevTerminalX = x2;
		prevTerminalY = y2;
		prevTime = t2;
	}
}