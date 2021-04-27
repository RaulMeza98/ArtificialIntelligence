package examples.SLR;

public class Equations{
	private Sumatoria suma = new Sumatoria();
	private Data data = new Data();
	private double beta_0;
	private double beta_1;
	double n = data.getN();
	double sumXY = suma.sumListas(data.getAllX(), data.getAllY());
	double sumX = suma.sum(data.getAllX());
	double sumY = suma.sum(data.getAllY());
	double sumX2 = suma.sumCuadrada(data.getAllX());
	
	
	public Equations() {
		b1();
		b0();
	}
	
	private void b1() {
		
		beta_1 = ((n*sumXY)-(sumX*sumY))/((n*sumX2)-(sumX)*(sumX));
	}
	
	private void b0() {
		 
		beta_0 = (sumY-(beta_1*sumX))/(n);
	}
	
	public double valorY(double x) {
		return beta_0 + (beta_1*x);
	}
	
	public String salida(){
		return "y = "+ beta_0 +" + "+ beta_1 +" Advertising";
	}
	
}