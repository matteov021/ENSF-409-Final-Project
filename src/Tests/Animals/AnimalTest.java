/**
 * @author Matteo Valente
 * @author Marcus Gee
 * @author Findlay Dunn-Wolbaum
 * @author Omar Ahmed
 * @version 1.0.0
 * @since 1.0.0
 */

 package Tests.Animals;
 
 import Schedule.Item;
 import Animals.*;
 import org.junit.Test;
 import static org.junit.Assert.*;
 
 public class AnimalTest {
 
     /**
      * Test the constructor of the "Animal" class with valid inputs.
      */
     @Test
     public void testAnimalConstructor_ValidInputs() {
         // Create a new animal object with valid ID, nickname, and species.
         Animal animal = new Animal(1, "Fido", "Dog");
 
         // Verify that the object's attributes are correctly set.
         assertEquals("The ID should be 1", 1, animal.getID());
         assertEquals("The nickname should be Fido", "Fido", animal.getNickName());
         assertEquals("The species should be Dog", "Dog", animal.getAnimalSpecies());
     }
 
     /**
      * Test the getter methods of the "Animal" class after setting the kit status.
      */
     @Test
     public void testSetKitStatus_And_Getters() {
         // Create a new animal object and set kit status to true.
         Animal animal = new Animal(2, "Spot", "Cat");
         animal.setKitStatus();
 
         // Verify that getKitStatus returns true after setting kit status.
         assertTrue("Kit status should be true", animal.getKitStatus());
 
         // Verify the correctness of the other getter methods.
         assertEquals("The ID should be 2", 2, animal.getID());
         assertEquals("The nickname should be Spot", "Spot", animal.getNickName());
         assertEquals("The species should be Cat", "Cat", animal.getAnimalSpecies());
     }
 }
 