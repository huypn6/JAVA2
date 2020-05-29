package com.java;

import java.io.Serializable;

public interface AnimalInterface extends Serializable, DemoInterface {
	String a = "A";
	abstract public void run(); //void run(); 
}
