package com.javalec.ex;

public class Truck implements Car {

	public void run() {
		System.out.println("트럭이 시속 200km로 달립니다.");

	}

	public void stop() {
		System.out.println("트럭이 늦게 멈춥니다.");

	}

	public void use() {
		System.out.println("짐을 옮길수 있습니다.");
		System.out.println("덮개 기능을 가지고 있습니다.");

	}

}
