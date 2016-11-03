package com.jianguo.array;

public class TextArray {

	public static void main(String[] args) {
		
		/*int[] i = new int[3];*/
		int i[] = new int[3];
		i[0] = 1;	//数据类型可以直接赋值
		i[1] = 2;
		i[2] = 3;
		System.out.println(i[2]);
		
		Car[] cars = new Car[2];
		cars[0] = new Car("宝马");	//必须通过new的方式给与初始化值
		cars[1] = new Car("现代");
		System.out.println(cars[1].name);
	}

}
