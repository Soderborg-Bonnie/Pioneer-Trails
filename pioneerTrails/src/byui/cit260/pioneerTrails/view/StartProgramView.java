
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
            //   WHILE endOfView != true
            
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
        char[] arrayVar = new char[1];
        
        
        
        
    }
   //{
   //    System.out.println("*** getInputs() has been called ***");
        
   //   String[] inputs = new String[1];
   //     inputs[0] = "testInput";
//         String[] inputs = new String[1];
//      
//        return inputs;
//        
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//   
//algorithm from assignment  
//   getInputs(): String[] {
//
// inputs = new String array one element long
// Display a description of the view
//
//valid = false
//WHILE valid == false (no input value has been entered)
//
//Display the prompt message
//Get the value entered from the keyboard
//Trim off leading and trailing blanks from the value
//IF length of the value < 1 then
//Display "You must enter a non-blank value”
//Continue (move to the top of the loop and repeat)
//ENDIF
//Assign the value to the fist position in the inputs array
//valid = true (ends the loop)
//ENDWHILE
//
//RETURN inputs 
   
   


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
    

