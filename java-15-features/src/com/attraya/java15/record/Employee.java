package com.attraya.java15.record;

/**
 * Enhancements in Record in Java 15:
 * 1. We can use record locally within a function. 
 * 2. We can use record with the sealed feature
 * 3. We can use annotations within your record
 *
 */
public sealed interface Employee permits Doctor, Nurse{

}
