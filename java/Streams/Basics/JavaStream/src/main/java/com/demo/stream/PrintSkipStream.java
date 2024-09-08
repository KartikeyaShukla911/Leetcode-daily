/**
 * 
 */
package com.demo.stream;

import java.util.stream.IntStream;

/**
 * @author ellit
 *
 */
public class PrintSkipStream {

	public static void main(String args[])
    {
        IntStream
        .range(1,15)
        .skip(5)
        .forEach(System.out::print);
    }
}
