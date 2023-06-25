package com.attraya.java16.defaultmethods;

public interface Worker {

	default String work() {
		return "Done";
	}
}
