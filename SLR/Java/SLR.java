public class SLR {
    public static void main(String[] nousan) {
    	SoE equation = new SoE();
		
	    System.out.println(equation.salida());
	    System.out.println("Valor predecido de y = " + equation.valorY(Double.parseDouble(nousan[0])));
	    		
	}
}
