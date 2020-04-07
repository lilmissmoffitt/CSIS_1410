package exerciseStringBuilder;

public class ExerciseStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Cats live");
		
		sb.setCharAt(0, 'r');
		sb.append(" on ");
		System.out.println("sb:" + sb);
		
		StringBuilder temp = new StringBuilder(sb);
		sb.append(temp.reverse());
		System.out.println("sb:"+ sb);
		
		int doubleSpace = sb.indexOf("  ");
		sb.deleteCharAt(doubleSpace);
		sb.append(".").setCharAt(0, 'C');
		System.out.println("sb:"+ sb);
	}

}
