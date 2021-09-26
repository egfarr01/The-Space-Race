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
public class CurrentLocation {
    String name;

    public CurrentLocation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public AreaContents defineArea() {
        if (name == "Space Force HQ") {
            String description = """
                  PLANET EARTH: Space Force HQ: 
                  The strength of the flourescent lights hurts your perfect 
                  space-faring eyes.You think about all of the great men and 
                  women who stood where you have the oppourtunity to stand right
                  now.
                                 
                  This. Is. It. 
                  Space is just as far away as it has always been but feels
                  closer today. You can almost taste the emptiness. 
                                 
                  You look down at your big astronaut boots and start to think 
                  maybe they picked the wrong person for this job and quickly 
                  stop yourself. You've been working your whole life for this.
                  You know the Milky Way like the back of your hand, 
                  won \"Most likely to be the dopest astronaut of all time\" 
                  in your graduating class, and have the boundless IQ necessary 
                  to succeed in this position.
                                 
                  You almost feel like you were specifically designed for this,
                  and you're not typically a superstitious person.
                                 """;
            ArrayList<CrewMate> people = new ArrayList();
            ArrayList<Item> items = new ArrayList();
            CrewMate captain = new CrewMate("Captain", """
                       The person who hand picked you for the space program is 
                       standing in front of you. You don't know how old he is 
                       but you are sure he looks excellent for his age. 
                       He's not the type to show any of the cards he's holding, 
                       but you notice something different today.
                       A certain... look in his eye. Is he sad?
                                                       """, "");
            CrewMate family = new CrewMate("Family", """
                       Your family waits outside the door, ready to see you off.
                       They are going through tissues like there's no tomorrow.
                       Tissues and tissue boxes litter the ground around them and
                       they're all constantly blowing their noses very hard and 
                       sobbing uncontrollably.
                                                     """, "");
            people.add(captain);
            people.add(family);
            Item astroIceCream = new Item("Astronaut Ice Cream", """
                       A package of astronaut ice cream sits on the table.
                       You aren't sure if most real astronauts eat this in space, 
                       but you sure as heck will. This is what you do it for. 
                       May have healing properties.
                                                                 """, 3);
            items.add(astroIceCream);
            AreaContents earth = new AreaContents(name, description, people, items);
            return earth;
        }
        else {
            AreaContents theVoid = new AreaContents();
            return theVoid;
        }
    }

    @Override
    public String toString() {
        return "CurrentLocation{" + "name=" + name + '}';
    }
    
    
}
