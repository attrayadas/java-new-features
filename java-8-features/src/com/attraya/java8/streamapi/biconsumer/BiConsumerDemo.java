package com.attraya.java8.streamapi.biconsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 *  Real-life usecase is map.forEach()
 *
 */
public class BiConsumerDemo implements BiConsumer<String, Integer> {

	@Override
	public void accept(String i1, Integer i2) {
		System.out.println("Using traditional approach: input 1: " + i1 + "; input 2: " + i2);
	}

	public static void main(String[] args) {

		BiConsumer<String, Integer> biConsumer = new BiConsumerDemo();
		biConsumer.accept("javatechie", 53000);
		
		BiConsumer<String, Integer> biConsumer1=new BiConsumer<String, Integer>() {

			@Override
			public void accept(String i1, Integer i2) {
				System.out.println(i1+"::"+i2);
			}
		};
		biConsumer1.accept("Using anynomous implementation: Welcome", 143);
		
		BiConsumer<String, Integer> biConsumer2=(i1, i2)-> System.out.println("Using Lambda Expression: "+i1+"---->"+i2);
		biConsumer2.accept("Hello", 455);
		
		/* Real life usecase: */
		Map<String, Integer> map = new HashMap<>();
		map.put("basant", 5000);
		map.put("santosh", 15000);
		map.put("javed", 12000);
		
		map.forEach((k, v)->System.out.println(k+"  ::  "+v));
	}

}

//Output:
//	Using traditional approach: input 1: javatechie; input 2: 53000
//	Using anynomous implementation: Welcome::143
//	Using Lambda Expression: Hello---->455
//	basant  ::  5000
//	santosh  ::  15000
//	javed  ::  12000