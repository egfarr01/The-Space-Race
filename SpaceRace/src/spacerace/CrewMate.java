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
public class CrewMate {
    private String name;
    private String description;
    private String response; 

    public CrewMate(String name, String description, String response) {
        this.name = name;
        this.description = description;
        this.response = response;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    
    public String getResponse() {
        return response;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "CrewMate{" + "name=" + name + ", description=" + description + '}';
    }
    
}
