package com.velociter.chapter6modified;

public abstract class Shape implements Shapes{
    public abstract double area();           //declared the method as abstract so that it can be used as requirement in child class
    public abstract double perimeter();      //declared the method as abstract so that it can be used as requirement in child class
}
