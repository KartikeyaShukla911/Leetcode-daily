package com.demo.stream;

import java.util.stream.Stream;

public class StreamSortedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream
		.of("Ada","Amang","Allice","Bob","Tom")
		.sorted()
		.findFirst()
		.ifPresent(System.out::print);
	}

}
