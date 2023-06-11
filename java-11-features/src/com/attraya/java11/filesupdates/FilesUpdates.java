package com.attraya.java11.filesupdates;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Java 11 makes it super easy to write and read Strings to and from a file
 *
 */
public class FilesUpdates {

	public static void main(String[] args) throws IOException {

		Path path = Files.writeString(Files.createTempFile("test", ".txt"), "Java 11 is cool");
		System.out.println(path);

		String str = Files.readString(path);
		System.out.println(str);

	}

}

//Output:
//	C:\Users\Attraya\AppData\Local\Temp\test4098513014224357384.txt
//	Java 11 is cool