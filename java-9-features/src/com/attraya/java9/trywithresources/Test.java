package com.attraya.java9.trywithresources;

public class Test {

	public static void main(String[] args) {

		MyWorker worker = new MyWorker();

		/**
		 * Earlier to Java 9 we had to use, try(MyWorker worker = new MyWorker()){}. In
		 * Java 9, we can define the resources wherever we want
		 */
		try (worker) {
			worker.doSomething();
		} catch (Exception e) {

		}

	}

}

//Output:
//	Creating the resource...
//	Doing something...
//	Closing the resource...
