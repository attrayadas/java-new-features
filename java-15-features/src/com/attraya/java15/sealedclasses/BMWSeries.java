package com.attraya.java15.sealedclasses;

/**
 * Rules wrt Sealed class:
 * 1. All permitted subclasses must belong to the same module as the sealed class.
 * 2. Every permitted subclass must explicitly extend the sealed class.
 * 3. Every permitted subclass must define a modifier: final, sealed or non-sealed.
 * 4. Reflection:
 * 		i. The iSealed method returns true if the given class or interface is sealed.
 * 		ii. Method permittedSubclasses returns an array of objects representing all the permitted subclasses.
 *
 */
public sealed class BMWSeries permits ThreeSeries, FiveSeries {

}
