package com.javalec.ex;

public class BMICalculator {
	// 비만 게산 클래스

	private double lowWeight; // 저체중
	private double normalWeight; // 정상체중
	private double overWeight; // 과체중
	private double obesity; // 비만

	public double getLowWeight() {
		return lowWeight;
	}

	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}

	public double getNormalWeight() {
		return normalWeight;
	}

	public void setNormalWeight(double normalWeight) {
		this.normalWeight = normalWeight;
	}

	public double getOverWeight() {
		return overWeight;
	}

	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	public double getObesity() {
		return obesity;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}

	public void bmiCalculation(double weight, double height) {

		double h = height * 0.01;
		double result = weight / (h * h); // BMI 지수

		System.out.println("당신의 BMI지수 : " + result);

		if (result > obesity) {
			System.out.println("고비만입니다.");
		} else if (result > overWeight) {
			System.out.println("과체중입니다.");
		} else if (result > normalWeight) {
			System.out.println("보통입니다.");
		} else {
			System.out.println("저체중입니다.");
		}
	}
}
