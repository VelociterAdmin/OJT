package com.velociter.chapter13;
// 2 example of chapter 13
import java.util.Iterator;

import com.itextpdf.text.log.SysoLogger;
// program for store multiple Type parameter;
public class Pair<KeyType, ValueType> {
	private KeyType key;
	private ValueType value;
	// create Constructor
	public Pair(KeyType akey,ValueType avalue) {
		key=akey;
		value=avalue;
	}
	// Get the key for this pair
	public KeyType getKey() {
		return key;
	}
	// get the value for this pair
	public ValueType getValue() {
		return value;
	}
	// Set the value for this pair
	public void setValue(ValueType avalue) {
		value=avalue;

		}
	}

