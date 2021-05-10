
public class SoE {
	Sumatoria suma = new Sumatoria();
	DataSet data = new DataSet();
	private double b0;
	private double b1;
	private double b2;
	private double ds;
	double dB2;
	double dB1;
	double n = data.getN();
	double sumaX2_1 = suma.sumaCuadrada(data.getAllXi1());
	double sumaX2_2 = suma.sumaCuadrada(data.getAllXi2());
	double sumaX_1 = suma.sumaArray(data.getAllXi1());
	double sumaX_1X_2 = suma.sumaDosArrays(data.getAllXi1(), data.getAllXi2());
	double sumaX_2 = suma.sumaArray(data.getAllXi2());
	double sumaX_2Y = suma.sumaDosArrays(data.getAllXi2(), data.getAllYi());
	double sumaY = suma.sumaArray(data.getAllYi()); 
	double sumaX_1Y = suma.sumaDosArrays(data.getAllXi1(), data.getAllYi());
	
	
	public SoE() {
		calculateDs();
		calculateB2();
		calculateB1();
		calculateB0();
	}
	
	public void calculateDs() {
		ds = ((n*sumaX2_1*sumaX2_2)+(sumaX_1*sumaX_1X_2*sumaX_2)+(sumaX_2*sumaX_1*sumaX_1X_2))-
			 ((sumaX_2*sumaX2_1*sumaX_2)+(sumaX_1X_2*sumaX_1X_2*n)+(sumaX2_2*sumaX_1*sumaX_1));
		
	}
	
	public void calculateB2(){
		dB2 = ((n*sumaX2_1*sumaX_2Y)+(sumaX_1*sumaX_1X_2*sumaY)+(sumaX_2*sumaX_1*sumaX_1Y))-
					((sumaY*sumaX2_1*sumaX_2)+(sumaX_1Y*sumaX_1X_2*n)+(sumaX_2Y*sumaX_1*sumaX_1));
		b2 = dB2/ds;
	}
	
	public void calculateB1() {
		dB1 = ((n*sumaX_1Y*sumaX2_2)+(sumaX_1*sumaX_2Y*sumaX_2)+(sumaX_2*sumaY*sumaX_1X_2))-
				((sumaX_2*sumaX_1Y*sumaX_2)+(sumaX_1X_2*sumaX_2Y*n)+(sumaX2_2*sumaY*sumaX_1));
		b1 = dB1/ds;
	}
	
	public void calculateB0() {
		b0 = (sumaY-(b1*sumaX_1)-(b2*sumaX_2))/n;
	}
	
	public double prediction(double x1, double x2) {
		return b0 + (b1*x1) + (b2*x2);
	}
	
	public String salida(){
		return "y = "+ b0 +" + "+ b1 +"x1"+ " + " + b2 +"x2";
	}
	
}
