
package byui.cit260.pioneerTrails.view;

/**
 *
 * @author Tamlyn Laurence
 */


public class StartProgramView {
    public StartProgramView () {
    
}
        public void displayStartProgramView() {
            //endOfView = false
            //DO
            //      inputs = getInputs()
            //      IF no inputs were entered OR the first input is Q
            //              RETURN
            //      ENDIF
            //              endOFVIEW = doAction(inputs)
            //      WHILE endOfView != true
            
            boolean endOfView = false;
            
            do{
                String[] inputs = this.getInputs();
                if (inputs.length < 1 || inputs[0] == "Q"){
                return ;
                
            }else
                    endOfView = doAction(inputs);
            }while(endOfView!=true);
                   
    }

    private String[] getInputs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean doAction(String[] inputs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    

