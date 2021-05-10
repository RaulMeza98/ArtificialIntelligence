
public class Sumatoria {
	DataSet dataSet = new DataSet();
	
	public Sumatoria() {
		
	}
	
	public double sumaCuadrada(double array[]) {
		double res = 0;
		for (double i : array) {
			res += Math.pow(i, 2);
		}
		
		return res;
	}
	
	public double sumaArray(double array[]) {
		double res = 0;
		for (double i : array) {
			res += i;
		}
		
		return res;
	}
	
	public double sumaDosArrays(double x[], double y[]) {
		double res = 0;
		for(int i=0; i<x.length; i++) {
			res += x[i]*y[i];
		}
		
		return res;
	}
}
