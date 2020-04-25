package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoSerializationWithCustomTypes {
	
	public static void main(String[] args) {
		String file = "src/serialization/BinaryFiles/Triangles.ser";
		List<EqTriangle> triangles = new ArrayList<>();
		Collections.addAll(triangles, new EqTriangle(3),
				new EqTriangle(5), new EqTriangle(7),
				new EqTriangle(9), new EqTriangle(11));
		System.out.println("Original triangles: " + triangles);
	//ser
		try(ObjectOutputStream serializer =
				new ObjectOutputStream(new FileOutputStream(file))){
			serializer.writeObject(triangles);
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//deser
		triangles = deserializeTriangles(file);
		System.out.println("deser tri: " +
		triangles);
		
		System.out.println("Done");
	}

	@SuppressWarnings("unchecked")
	private static List<EqTriangle> deserializeTriangles(String file) {
		List<EqTriangle> triangleList = null;
		try(ObjectInputStream deserializer =
				new ObjectInputStream(new FileInputStream(file))){
			triangleList = (List<EqTriangle>) deserializer.readObject();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return triangleList;
	}
}
