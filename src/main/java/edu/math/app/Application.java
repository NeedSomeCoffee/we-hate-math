package edu.math.app;

public class Application {
	public static void main(String[] args) {
		int one = 99459;
		int two = 45645;
		
		System.out.println(outputEquation(one, two));
	}
	
	public static String outputEquation(int one, int two) {
		StringBuilder builder = new StringBuilder();
		
		String result = String.valueOf(one * two);
		int fullLength = result.length();
		
		String firstLine = formatSpaces(String.valueOf(one), fullLength);
		String secondLine = formatSpaces(String.valueOf(two), fullLength);
		String thirdLine = formatUnderline(fullLength);
		
		builder.append(firstLine)
				.append("\n")
				.append(secondLine)
				.append("\n")
				.append(thirdLine)
				.append("\n")
				.append(result);
		
		return builder.toString();
	}
	
	
	public static String formatSpaces(String raw, int fullLength) {
		StringBuilder builder = new StringBuilder();
		
		int difference = fullLength - raw.length();
		
		for(int i = 0; i < difference; i++) {
			builder.append(" ");
		}
		
		builder.append(raw);
		
		return builder.toString();
	}
	
	public static String formatUnderline(int length) {
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < length; i++) {
			builder.append("_");
		}
		
		return builder.toString();
	}
}
