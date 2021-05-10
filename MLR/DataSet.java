public class DataSet {
	private double[] xi1;
	private double[] xi2;
	private double[] yi;
	
	public DataSet() {
		xi1 = new double[17];
		xi1[0] = 41.9;
		xi1[1] = 43.4;
		xi1[2] = 43.9;
		xi1[3] = 44.5;
		xi1[4] = 47.3;
		xi1[5] = 47.5;
		xi1[6] = 47.9;
		xi1[7] = 50.2;
		xi1[8] = 52.8;
		xi1[9] = 53.2;
		xi1[10] = 56.7;
		xi1[11] = 57.0;
		xi1[12] = 63.5;
		xi1[13] = 65.3;
		xi1[14] = 71.1;
		xi1[15] = 77.0;
		xi1[16] = 77.8;
		
		xi2 = new double[17];
		xi2[0] = 29.1;
		xi2[1] = 29.3;
		xi2[2] = 29.5;
		xi2[3] = 29.7;
		xi2[4] = 29.9;
		xi2[5] = 30.3;
		xi2[6] = 30.5;
		xi2[7] = 30.7;
		xi2[8] = 30.8;
		xi2[9] = 30.9;
		xi2[10] = 31.5;
		xi2[11] = 31.7;
		xi2[12] = 31.9;
		xi2[13] = 32.0;
		xi2[14] = 32.1;
		xi2[15] = 32.5;
		xi2[16] = 32.9;
		
		yi = new double[17];
		yi[0] = 251.3;
		yi[1] = 251.3;
		yi[2] = 248.3;
		yi[3] = 267.5;
		yi[4] = 273.0;
		yi[5] = 276.5;
		yi[6] = 270.3;
		yi[7] = 274.9;
		yi[8] = 285.0;
		yi[9] = 290.0;
		yi[10] = 297.0;
		yi[11] = 302.5;
		yi[12] = 304.5;
		yi[13] = 309.3;
		yi[14] = 321.7;
		yi[15] = 330.7;
		yi[16] = 349.0;
	}
	
	public double getXi1(int index) {
		return xi1[index];		
	}
	
	public double getXi2(int index) {
		return xi2[index];		
	}
	
	public double getYi(int index) {
		return yi[index];
	}
	
	public int getN() {
		return xi1.length;
	}
	
	public double[] getAllXi1() {
		return xi1;		
	}
	
	public double[] getAllXi2() {
		return xi2;		
	}
	
	public double[] getAllYi() {
		return yi;
	}
	
	
	
}
