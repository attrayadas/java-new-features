package com.attraya.java17.random;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomGeneratorDemo {

	public static void main(String[] args) {

		RandomGenerator randomGenerator = RandomGeneratorFactory.getDefault().create();
		System.out.println(randomGenerator.getClass()); // This is the algorithm that will be used to generate random
														// numbers if we use getDefault()

		System.out.println("All the available algorithms:");
		RandomGeneratorFactory.all().map(factory -> factory.group() + " : " + factory.name()).sorted()
				.forEach(System.out::println); // Prints all the algorithm available

		int i = 0;
		int j = 0;
		System.out.println("Using default algorithm:");
		while (i <= 10) {
			int num = randomGenerator.nextInt(20);
			System.out.println(num);
			i++;
		}

		System.out.println();

		RandomGenerator randomGenerator2 = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create(888);
		System.out.println("Using Xoshiro256PlusPlus algorithm:");
		while (j <= 10) {
			int num2 = randomGenerator2.nextInt(20);
			System.out.println(num2);
			j++;
		}
	}

}

//Output:
//	class jdk.random.L32X64MixRandom
//	All the available algorithms:
//	LXM : L128X1024MixRandom
//	LXM : L128X128MixRandom
//	LXM : L128X256MixRandom
//	LXM : L32X64MixRandom
//	LXM : L64X1024MixRandom
//	LXM : L64X128MixRandom
//	LXM : L64X128StarStarRandom
//	LXM : L64X256MixRandom
//	Legacy : Random
//	Legacy : SecureRandom
//	Legacy : SplittableRandom
//	Xoroshiro : Xoroshiro128PlusPlus
//	Xoshiro : Xoshiro256PlusPlus
//	Using default algorithm:
//	12
//	11
//	2
//	3
//	6
//	8
//	19
//	6
//	16
//	17
//	13
//
//	Using Xoshiro256PlusPlus algorithm:
//	18
//	16
//	15
//	9
//	18
//	19
//	10
//	6
//	19
//	12
//	14
