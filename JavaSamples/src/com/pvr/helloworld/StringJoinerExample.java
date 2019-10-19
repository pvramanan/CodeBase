package com.pvr.helloworld;

import java.util.StringJoiner;

/**
 * 
 * @author PrasannaV
 * 
 *         This class is used to explore the String joiner which is introduced
 *         in Java 8
 * 
 * @since 19-10-2019
 */
public class StringJoinerExample {

	public static void main(String[] args) {
		simpleIntizer();
		StringJoinerWithMerger();
		usageOFPrefixandSuffix();
	}

	private static void simpleIntizer() {
		StringJoiner joiner = new StringJoiner("-");
		joiner.add("String joiner").add("Example").add("BY Prasanna");
		System.out.println(joiner.toString());
	}

	private static void StringJoinerWithMerger() {
		System.out.println(new StringJoiner("-").add("First").add("Joiner")
				.merge(new StringJoiner("***").add("Second").add("Joiner")).toString());
	}

	private static void usageOFPrefixandSuffix() {
		System.out.println(new StringJoiner("-", "1 st sequense start ", " 1st sequence end").add("First").add("Joiner")
				.toString());
	}
}
