package robocode;

public class getPredictedImpactTime {
	public double getPredictedImpactTime(EstimationFunction f){
		double t0 = 10;	//Initialize
		double t1 = 20;
		double d0 = getEstimationFunction(f, t0);
		double tolerance = 0.001;
		
		for (int i = 0; i < 20; i++){
			if (Math.abs(t1 - t0) < tolerance) break;
			double d1 = getEstimationFunction(f, t1);
			
		}
	}
}
