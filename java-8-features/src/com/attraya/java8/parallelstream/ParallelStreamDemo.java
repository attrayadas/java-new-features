package com.attraya.java8.parallelstream;

import java.io.IOException;
import java.util.stream.IntStream;

/**
 * Order of execution is not constant in parallel stream Response wise, parallel
 * stram is better than plain stream
 *
 */
public class ParallelStreamDemo {

	public static void main(String[] args) throws IOException {

		long start = 0;
		long end = 0;

		start = System.currentTimeMillis();
		IntStream.range(1, 100).forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Plain stream took time: " + (end - start) + "ms");

		System.out.println("---------------------------------");

		start = System.currentTimeMillis();
		IntStream.range(1, 100).parallel().forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Parallel stream took time: " + (end - start) + "ms");

		System.in.read();

		IntStream.range(1, 10).forEach(x -> {
			System.out.println("Thread: " + Thread.currentThread().getName() + " : " + x);
		});

		IntStream.range(1, 10).parallel().forEach(x -> {
			System.out.println("Thread: " + Thread.currentThread().getName() + " : " + x);
		});

	}

}

//Output:
//	Plain stream took time: 54ms
//	Parallel stream took time: 25ms
//	
//	Thread: main : 1
//	Thread: main : 2
//	Thread: main : 3
//	Thread: main : 4
//	Thread: main : 5
//	Thread: main : 6
//	Thread: main : 7
//	Thread: main : 8
//	Thread: main : 9
//	Thread: main : 6
//	Thread: main : 5
//	Thread: ForkJoinPool.commonPool-worker-7 : 8
//	Thread: ForkJoinPool.commonPool-worker-7 : 9
//	Thread: ForkJoinPool.commonPool-worker-3 : 3
//	Thread: ForkJoinPool.commonPool-worker-7 : 7
//	Thread: ForkJoinPool.commonPool-worker-3 : 4
//	Thread: ForkJoinPool.commonPool-worker-7 : 1
//	Thread: ForkJoinPool.commonPool-worker-5 : 2