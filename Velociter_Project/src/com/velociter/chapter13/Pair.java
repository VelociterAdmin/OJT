package com.velociter.chapter13;

import java.util.Iterator;

import com.itextpdf.text.log.SysoLogger;

public class Pair<KeyType, ValueType> {
	private KeyType key;
	private ValueType value;
	
	public Pair(KeyType akey,ValueType avalue) {
		key=akey;
		value=avalue;
	}
	public KeyType getKey() {
		return key;
	}
	
	public ValueType getValue() {
		return value;
	}
	public void setValue(ValueType avalue) {
		value=avalue;

		}
	}

