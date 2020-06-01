package com.javalec.ex;

public class Ambulence implements Car {

	public void run() {
		System.out.println("시속 200km로 달립니다.");

	}

	public void stop() {
		System.out.println("곧바로 멈춥니다.");

	}

	public void use() {
		System.out.println("사이렌 기능을 가지고 있습니다.");

	}

}
