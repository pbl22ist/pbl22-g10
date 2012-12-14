package robocode;
public class LinearFunction implements EstimationFunction {

    double enemyVelocity;
    double enemyHeading;
    double enemyInitialX;
    double enemyInitialY;


    public LinearFunction(double v, double h, double b, double d) {
	enemyVelocity = v;
	enemyHeading = h;
	enemyInitialX = d * Math.sin(Math.toRadians(b));
	enemyInitialY = d * Math.cos(Math.toRadians(b));
    }

    public double getEstimatedX(double t) {
	double ve = enemyVelocity;
	double he = enemyHeading;
	double xe = enemyInitialX;
	return xe + ve * t * Math.sin(Math.toRadians(he));
    }

    public double getEstimatedY(double t) {
	double ve = enemyVelocity;
	double he = enemyHeading;
	double ye = enemyInitialY;
	return ye + ve * t * Math.cos(Math.toRadians(he));
    }
}
