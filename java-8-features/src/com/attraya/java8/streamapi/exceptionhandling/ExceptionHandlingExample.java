package com.attraya.java8.streamapi.exceptionhandling;

import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {

		List<String> list = List.of("44", "373", "123", "Attraya");
		List<Integer> list1 = List.of(1, 0);
		List<Integer> list2 = List.of(10, 20);

		// List<Integer> intList = list.stream().map(i ->
		// Integer.parseInt(i)).collect(Collectors.toList()); // Exception can occur
		// System.out.println(intList);

		/* Approach-1 : Not a good way of handling exception */
//		list.forEach(i -> {
//			try {
//				System.out.println(Integer.parseInt(i));
//			} catch (Exception e) {
//				System.out.println("exception: " + e.getMessage());
//			}
//			
//		});

		/* Approach-2 */
//		list.forEach(ExceptionHandlingExample::printList);

		/* Approach -3 */
//		list.forEach(handleExceptionIfAny(s -> System.out.println(Integer.parseInt(s))));

		/* Approach -4 */
//		list.forEach(handleGenericException(s->System.out.println(Integer.parseInt(s)), NumberFormatException.class));

//		list1.forEach(handleGenericException(s->System.out.println(10/s), ArithmeticException.class));

		list2.forEach(handleCheckedExceptionConsumer(i -> {
			Thread.sleep(i);
			System.out.println(i);
		}));

	}

	/* Approach-2 */
	public static void printList(String s) {
		try {
			System.out.println(Integer.parseInt(s));
		} catch (Exception e) {
			System.out.println("exception: " + e.getMessage());
		}

	}

	/* Approach-3 */
	static Consumer<String> handleExceptionIfAny(Consumer<String> payload) {
		return obj -> {
			try {
				payload.accept(obj);
			} catch (Exception e) {
				System.out.println("exception: " + e.getMessage());
			}
		};

	}

	/* Approach-4 */
	static <Target, ExObj extends Exception> Consumer<Target> handleGenericException(Consumer<Target> targetConsumer,
			Class<ExObj> exObjClass) {
		return obj -> {
			try {
				targetConsumer.accept(obj);
			} catch (Exception e) {
				try {
					ExObj exObj = exObjClass.cast(e);
					System.out.println("exception: " + exObj.getMessage());
				} catch (ClassCastException ecx) {
					throw e;
				}
			}
		};
	}

	static <Target> Consumer<Target> handleCheckedExceptionConsumer(
			CheckedExceptionHandlerConsumer<Target, Exception> handlerConsumer) {
		return obj -> {
			try {
				handlerConsumer.accept(obj);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

}
