/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pioneerTrails.model;

import java.util.Objects;

/**
 *
 * @author Bonnie
 */
public class Resource implements Serializable {

    //class instance variables
    private String name;
    private int quantity;
    private int weight;
    

    //private Boolean need;
    //private Boolean broken;
    private Scene scene;
    private Game game;
    private Wagon wagon;
    
    public Resource(String name, int quantity, int weight) {
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }
    
    private static Resource[] resources = {
        new Resource("Hammer",1,10),
        new Resource("Bullets", 50, 50),
        new Resource("Wheel", 1, 100),
        new Resource("Food", 1,450 ),
        new Resource("Axe", 1,15),
        new Resource("Wood", 10, 50),
        new Resource("Water", 1, 450)};

    public Wagon getWagon() {
        return wagon;
    }

    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Resource() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

//    public Boolean getNeed() {
//        return need;
//    }
//
//    public void setNeed(Boolean need) {
//        this.need = need;
//    }
//
//    public Boolean getBroken() {
//        return broken;
//    }
//
//    public void setBroken(Boolean broken) {
//        this.broken = broken;
//    }

    @Override
    public String toString() {
        return "Resource{" + "name=" + name + ", quantity=" + quantity + ", weight=" + weight + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.quantity);
        hash = 53 * hash + Objects.hashCode(this.weight);
     // hash = 53 * hash + Objects.hashCode(this.broken);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Resource other = (Resource) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.quantity, other.quantity)) {
            return false;
        }
        if (!Objects.equals(this.weight, other.weight)) {
            return false;
        }
//        if (!Objects.equals(this.need, other.need)) {
//            return false;
//        }
//        if (!Objects.equals(this.broken, other.broken)) {
//            return false;
//        }
        return true;
    }

}
