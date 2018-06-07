
package byui.cit260.pioneerTrails.view;

/**
 *
 * @author Tamlyn Laurence
 */


public class StartProgramView {
    public StartProgramView() {
        
    
}
        public void displayStartProgramView() {
            //   endOfView = false
            //   DO
            //      inputs = getInputs()
            //      IF no inputs were entered OR the first input is Q
            //              RETURN
            //      ENDIF
            //              endOFVIEW = doAction(inputs)
            //      WHILE endOfView != true
            
            boolean endOfView = false;
            
            do{
                String[] inputs = this.getInputs();
                //inputs[0].ToUpperCase();
                if (inputs.length < 1 || inputs[0] == "Q"){
                return;
                
            }else
                endOfView = doAction(inputs);
            }while(endOfView != true);
                   
    }

    private String[] getInputs() {
   //    System.out.println("*** getInputs() has been called ***");
        
   //   String[] inputs = new String[1];
   //     inputs[0] = "testInput";
   
      String[] inputs = new String[1];
      
      
   
   
   
        
        return inputs;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean doAction(String[] inputs) {
        System.out.println("***doAction() called***");
        System.out.println("\tinputs = " + inputs[0]);
        
        return true;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void display(){
        String[] testCode = getInputs();
        doAction(testCode);
    }
    
    }
    

