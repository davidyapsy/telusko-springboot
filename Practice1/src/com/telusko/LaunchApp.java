package com.telusko;

import java.util.HashMap;
import java.util.Map;

interface IParent{
	int add(int n1, int n2);
}

interface IParent1 extends IParent{
	default void disp() {
		System.out.println("welcome");
	}
}
interface IParent2 extends IParent1{
}
interface IParent3 extends IParent2{
}
interface IParent4 extends IParent3{
}

class CChild implements IParent4{

	@Override
	public int add(int n1, int n2) {
		
		return n1+n2;
	}
	
}

public class LaunchApp {
	public static void main(String[] args) {
		System.out.println(addition(new CChild()));
		CChild c = new CChild();
		c.disp();
		HashMap<String, Integer> map1 = new HashMap<>();
		//map1.put
		
	}
	
	static int addition(IParent4 p) {
		return p.add(1, 2);
	}
	
}
