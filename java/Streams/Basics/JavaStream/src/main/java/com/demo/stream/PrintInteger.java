
package com.demo.stream;
import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class PrintInteger {

	public static void main(String args[])
    {
        IntStream
        .range(1,10)
        .forEach(System.out::println);
    }
}
