package edu.math.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
	public static void main(String[] args) {
		int one = 1231223;
		int two = 1221;
		
		System.out.println(outputEquation(one, two));
	}
	
	public static String outputEquation(int multiplierOne, int multiplierTwo) {
		StringBuilder builder = new StringBuilder();
		
		String result = String.valueOf(multiplierOne * multiplierTwo);
		int fullLength = result.length();
		
		
		// Format first two multipliers and 
		String firstLine = String.valueOf(multiplierOne);		
		String secondLine = String.valueOf(multiplierTwo);
		String underline = formatUnderline(firstLine.length() > secondLine.length() ? firstLine.length() : secondLine.length());
		
		String formattedFirstLine = formatSpaces(firstLine, fullLength);
		String formattedSecondLine = formatSpaces(secondLine, fullLength);
		String formattedUnderline = formatSpaces(underline, fullLength);
		
		builder.append(formattedFirstLine).append("\n")
				.append(formattedSecondLine).append("\n")
				.append(formattedUnderline).append("\n");
		
		// Perform formatting of intermediate calculations

		List<String> splittedMultiplier = Arrays.asList(secondLine.split(""));		
		splittedMultiplier = splittedMultiplier.stream().filter(E -> !" ".equals(E)).collect(Collectors.toList());		
		Collections.reverse(splittedMultiplier);
		
		int position = 0;
		
		for(String singleNumber : splittedMultiplier) {
			String rawResult = String.valueOf(multiplierOne * Integer.valueOf(singleNumber));
			
			builder.append(formatIntermediateResult(rawResult, position, fullLength)).append("\n");
			
			position++;
		}
		
		
		// Format and append last underline and result
		builder.append(formatUnderline(fullLength)).append("\n")
				.append(result);
		
		return builder.toString();
	}
	
	public static String formatIntermediateResult(String raw, int position, int fullLength) {
		StringBuilder builder = new StringBuilder();
		int difference = fullLength - (raw.length() + position);

		for(int i = 0; i < difference; i++) {
			builder.append(" ");
		}
		
		builder.append(raw);
		
		for(int i = 0; i < position; i++) {
			builder.append(" ");
		}
		
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
