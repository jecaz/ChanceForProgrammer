package wordWrapExample;

import static java.lang.Math.min;

public class WordWrap {

	// a method that breaks word on specified space with new line, like a word processor would.
	public static String wrap(final String inputLine, final int lineLength) {
		
		final StringBuilder accumulator = new StringBuilder();
		final int length = inputLine.length();
		
		// Character sequence is inputLine, start is 0 and end is lineLength.
		// Append from 0 to lineLength of the inputLine
		accumulator.append(inputLine, 0, min(length, lineLength));
		
		int split = lineLength;
		while(length > split){
			accumulator.append('\n');
			accumulator.append(inputLine, split, min(length, split + lineLength));
			split += lineLength;
		}
		
		return accumulator.toString();
	}

}
