package com.velociter.chapter7;

import java.io.BufferedInputStream;
import java.io.IOException;

public class ItrationCount{
	int itration=0;
	public ItrationCount() {}
	public ItrationCount(String s) {
	super(s);
}
public ItrationCount(int itration) {
	super();
	this.itration=itration;
}
public int getItreration() {
	return itration;
 }
}
