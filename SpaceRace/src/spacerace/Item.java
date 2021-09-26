/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacerace;

/**
 *
 * @author efarrer
 */
public class Item {
    private String name;
    private String description;
    private int quantity;

    public Item(String name, String description, int Quantity) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
    }
    
    public Item(String name, String description) {
        this.name = name;
        this.description = description;
        this.quantity = 1;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    public String toString() {
        return "Item{" + "name=" + name + ", description=" + description + '}';
    }
    
    
    
}
