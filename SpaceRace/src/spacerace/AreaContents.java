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
public class AreaContents {
    private String areaName;
    private String areaDescription;
    private ArrayList<CrewMate> people = new ArrayList<CrewMate>();
    private ArrayList<Item> localItems = new ArrayList<Item>();

    public AreaContents(String areaName, String areaDescription, ArrayList<CrewMate> people, ArrayList<Item> localItems) {
        this.areaName = areaName;
        this.areaDescription = areaDescription;
        this.people = people;
        this.localItems = localItems;
    }
    
    public AreaContents() {
        this.areaName = "";
        this.areaDescription = "";
    }

    public String getAreaName() {
        return areaName;
    }

    public String getAreaDescription() {
        String longDescription = areaDescription;
        for(int i = 0; i < people.size(); i++) {
            longDescription += "\n" + people.get(i).getDescription();
        }
        for(int i = 0; i < localItems.size(); i++) {
            longDescription += "\n" + localItems.get(i).getDescription();
        }
        
        return longDescription;
    }

    public ArrayList<CrewMate> getPeople() {
        return people;
    }

    public ArrayList<Item> getLocalItems() {
        return localItems;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public void setAreaDescription(String areaDescription) {
        this.areaDescription = areaDescription;
    }

    public void setPeople(ArrayList<CrewMate> people) {
        this.people = people;
    }

    public void setLocalItems(ArrayList<Item> localItems) {
        this.localItems = localItems;
    }

    @Override
    public String toString() {
        return "AreaContents{" + "areaName=" + areaName + ", areaDescription=" + areaDescription + ", people=" + people + ", localItems=" + localItems + '}';
    }
    
    
    
}
