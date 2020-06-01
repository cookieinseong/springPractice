package com.javalec.ex;

public class Taxi implements Car {

	public void run() {
		System.out.println("시속 250km로 달립니다.");

	}

	public void stop() {
		System.out.println("빨리 멈춥니다.");

	}

	public void use() {
		System.out.println("미터기 기능이 있습니다.");

	}

}
