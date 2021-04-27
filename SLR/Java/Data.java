public class Data {
	private double x[] = {23, 26, 30, 34, 43, 48, 52, 57, 58};
	private double y[] = {651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518};
	
	public Data() {
	}


	public double getX(int index) {
		return x[index];		
	}
	
	public double getY(int index) {
		return y[index];
	}
	
	public int getN() {
		return x.length;
	}
	
	public double[] getAllX() {
		
		return x;		
	}
	
	public double[] getAllY() {
		return y;
	}
	
}
