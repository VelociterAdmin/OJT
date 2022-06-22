package com.velociter.chapter8examples;

public class InvalidUserInputException extends Exception {
public InvalidUserInputException() {}
public InvalidUserInputException(String message) {
super(message);
}
}