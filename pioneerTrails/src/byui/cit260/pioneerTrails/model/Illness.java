
package byui.cit260.pioneerTrails.model;

/**
 *
 * @author Tamlyn Laurence
 */
public enum Illness {
    Fever("Fever", "Your fever of 106 degrees is caused by a bacterial infection. Rest. Drink plenty of water. Eat mild bland foods.", 2, new Point()),
    Hypothermia("Hypothermia", "Hypothermia is causing shivering and mental confusion. Remove wet clothing. Wrap in blankets. Try to shiver.  Drink warm drinks.", 2, new Point()),
    Snake Bite("Snake Bite", "You have been bitten by a Rattlesnake. Remove tight clothing. Be still and rest.  Ask for a blessing.", 8, new Point()),
    Broken Bone("Broken Bone", "You have suffered a broken bone. Remove tight clothing. Splint the fracture.  Keep elevated. Eat Horsetail for silica which in calcium absorbtion.", 1, new Point());    
    
    private String type;
    private String treatment;
    private int mortalityRate;
    private Point coordinates;

Illness(String type, String treatment, int mortalityRate){
    this.type = type;
    this.treatment = treatment;
    this.mortalityRate= mortalityRate;
    this.coordinates = coordinates;
}

    public String getType() {
        return type;
    }

    public String getTreatment() {
        return treatment;
    }

    public int getMortalityRate() {
        return mortalityRate;
    }

    public Point getCoordinates() {
        return coordinates;
    }


}
