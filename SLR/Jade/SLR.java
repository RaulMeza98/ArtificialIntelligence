package examples.SLR;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class SLR extends Agent {
  private Equations equation; 
  
  protected void setup() {
    addBehaviour(new MyOneShotBehaviour());
  } 

  private class MyOneShotBehaviour extends OneShotBehaviour {
    
    public void action() {
        equation = new Equations();
        
        System.out.println(equation.salida());
        System.out.println("Valor predecido de y = " + equation.valorY(Double.parseDouble(getLocalName())));

    } 
    
    public int onEnd() {
      myAgent.doDelete();   
      return super.onEnd();
    } 
  }    // END of inner class ...Behaviour
}
