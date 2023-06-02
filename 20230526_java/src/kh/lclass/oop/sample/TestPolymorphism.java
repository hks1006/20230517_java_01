package kh.lclass.oop.sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestPolymorphism {
	int grade = 3;
	int age = 3;
	
	public static void main(String[] args) {
		
		ArrayList<Car>carArrList = new ArrayList<Car>();
		List<Car> carList         = new ArrayList<Car>(); // 가장 흔하게 선언하는 방식
//		List<Car> carList2 = new LinkedList()<Car>(); // 가장 흔하게 선언하는 방식
		Collection<Car> carCollection = new ArrayList<Car>();
//		carArrList.
		
		//오류new TestInterface();
		TestInterface kh = new Kh();
		Kh kh2 = new Kh();
		
		((Kh)kh).khSpecial();
		
		TestInterface bit;
		TestInterface bit2;
//		Kh kh2 = new Kh();
		kh2.khSpecial();
		kh2.method1();
		
		Driver ks = new DriverSub();
		ks.setMoney(10000);
		ks.buy(new Avante());
		ks.buy(new Sonata());
		Driver kj = new Driver2Sub();
		kj.setMoney(10000);
		kj.buy(new Avante());
		kj.buy(new Sonata());
	}
}
