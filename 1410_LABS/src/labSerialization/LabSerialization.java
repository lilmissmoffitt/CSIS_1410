package labSerialization;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;




/**
 * LabSerialization demonstrates how to serialize and deserialize
 * a custom object that references other objects on the heap.
 * Author(s): Starter Code + Melissa Moffitt
 */
public class LabSerialization {
    public static void main(String[] args) {
    	String file = "src/labSerialization/Demo.ser";
        ListVsSetDemo demo = new ListVsSetDemo(
                new ColoredSquare(4, Color.RED),
                new ColoredSquare(6, Color.BLUE),
                new ColoredSquare(4, Color.RED),
                new ColoredSquare(8, Color.YELLOW));

        serialize(demo, file);
		System.out.println("Serialization is complete\n");

        ListVsSetDemo newDemo = deserialize(file);
        displayListAndSet(newDemo);
		
    };

    /**
     * Displays the elements of the list and the set.
     */
    private static void displayListAndSet(ListVsSetDemo demo) {
        System.out.println("List:");
        System.out.println(demo.getListElements());
        System.out.println("Set:");
        System.out.println(demo.getSetElements());
    }
    
    /**
     * Serializes the object to Demo.ser
     */
    private static void serialize(ListVsSetDemo demo, String filename) {
    	try(ObjectOutputStream serializer =
				new ObjectOutputStream(new FileOutputStream(filename))){
			serializer.writeObject(demo);
		}catch (IOException e) {
			// TODO Auto-generated catch block
		}	
    }
    
    /**
     * Deserializes the object from Demo.ser
     */
    private static ListVsSetDemo deserialize(String filename) {
    	ListVsSetDemo newDemo = null;
		try(ObjectInputStream deserializer =
				new ObjectInputStream(new FileInputStream(filename))){
			newDemo = (ListVsSetDemo) deserializer.readObject();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newDemo;
    }
}
