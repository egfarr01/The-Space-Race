/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacerace;
import java.util.ArrayList;
/**
 *
 * @author efarrer
 */
public class Player {
    private String name;
    private String sanityStatus = "Fair";
    private int age;
    private String job;
    private ArrayList<Item> inventory = new ArrayList<Item>();
    private Ship spaceShip;

    public Player(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getSanityStatus() {
        return sanityStatus;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSanityStatus(String sanityStatus) {
        this.sanityStatus = sanityStatus;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public void addItemToInventory(Item Item) {
        inventory.add(Item);
        System.out.println(Item.getName() + " was added to your space backpack.");
    }
    
    public void removeItemFromInventory(Item Item) {
        inventory.remove(Item);
        System.out.println(Item.getName() + " was removed from your space backpack.");
    }
    public String toString() {
        return "Player{" + "name=" + name + ", sanityStatus=" + sanityStatus + ", age=" + age + ", job=" + job + ", inventory=" + inventory + '}';
    }
    
    
}
