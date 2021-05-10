package examples.behaviours;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

public class MLR extends Agent {
   private MLRGui myGui;

  protected void setup() {
    myGui = new MLRGui(this);
     myGui.showGui();
    addBehaviour(new MyOneShotBehaviour());
  } 

  private class MyOneShotBehaviour extends OneShotBehaviour {

    public void action(final double x1,final double x2) {
        SoE s = new SoE();
		
		System.out.println(s.salida());
		System.out.println(s.prediction(x1, x2));

    } 
    
    public int onEnd() {
      myAgent.doDelete();   
      return super.onEnd();
    } 
  }    // END of inner class ...Behaviour
}
