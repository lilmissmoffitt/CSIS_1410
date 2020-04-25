package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class DemoSerialization {

	public static void main(String[] args) {
		String file = "src/serialization/BinaryFiles/Words.ser";
		String[] words = {"one", "two", "three", "four", "five", "six"};
		System.out.println("Words " + Arrays.deepToString(words));
		
		serializeWords(file, words);
		
		for(int i = 0; i < words.length; i++) {
			if(i % 2 == 1) {
				words[i] = null;
		}
			System.out.println("Modified words " 
					+ Arrays.deepToString(words));
			
			words = deserializeWords(file, i);

			System.out.println("Deser words: " + Arrays.deepToString(words));
		
		}
		System.out.println("done");
	}

	private static String[] deserializeWords(String file, int i) {
		String[] stringArray = null;
		try(ObjectInputStream deserializer =
				new ObjectInputStream(new FileInputStream(file))){
			int size = deserializer.readInt();
			stringArray = new String[size];
			for(int j = 0; j < size; j++) {
				stringArray[i] = (String)deserializer.readObject();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("A problem occurred when deserializing");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Problem casting to String");
			e.printStackTrace();
		}
		return stringArray;
	}

	private static void serializeWords(String file, String[] words) {
		try(ObjectOutputStream serializer =
				new ObjectOutputStream(new FileOutputStream(file))){
			serializer.writeInt(words.length);
			for(int i = 0; i < words.length; i++) {
				serializer.writeObject(words[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("A problem occurred when serializing words");
			e.printStackTrace();
		}
	}

}
