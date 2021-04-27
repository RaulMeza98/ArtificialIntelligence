package examples.SLR;

public class Sumatoria{


    public Sumatoria(){

    }

    public double sum(double[] lista){
		double res = 0;
		for (double i : lista) {
			res += i;
		}
		return res;
	}
	
	public double sumCuadrada(double [] lista) {
		double res = 0;
		for (double i : lista) {
			res += Math.pow(i, 2);
		}
		return res;
	}
	
	public double sumListas(double[] x, double[] y) {
		double res = 0;
		for(int i=0; i<x.length; i++) {
			res += (x[i]*y[i]);
		}
		return res;
	}
}