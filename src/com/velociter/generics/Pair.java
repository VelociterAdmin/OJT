package com.velociter.generics;import java.awt.RenderingHints.Key;

public class Pair<KeyType,ValueType>{
	//Constructor
	public Pair(KeyType aKey, ValueType aValue) {
		key = aKey;
		value = aValue;
	}	
	
	//Get the key for this pair
	public KeyType getKey() {
		return key;
	}
	
	//Get the Value for the pair
	public ValueType getValue() {
		return value;
	}
	
	//set the value for the pair
	public void setValue(ValueType aValue) {
		value = aValue;
	}
	
	//set the key for pair
	public void setKey(KeyType aKey) {
		key = aKey;
	}
	
	
	private KeyType key;
	private ValueType value;
	
}