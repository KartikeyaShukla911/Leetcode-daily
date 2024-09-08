package com.demo.stream;

import java.util.stream.IntStream;

public class StreamSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(
				IntStream
				.range(1, 10)
		.sum());
		
		
	}

}
