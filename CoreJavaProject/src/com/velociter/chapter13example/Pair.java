package com.velociter.chapter13example;

public class Pair <KeyType, ValueType> {
	private KeyType key;
	private ValueType value;
	// Constructor
	public Pair(KeyType akey, ValueType aValue) {
	key = akey;
	value = aValue;
	}
	// Get the key for this pair
	public  KeyType getKey() {
	return key;
	}
	
	
	// Get the value for this pair
	public ValueType getValue() {
	return value;
	}
	// Set the value for this pair
	public void setValue(ValueType aValue) {
	value = aValue;
	}

}
