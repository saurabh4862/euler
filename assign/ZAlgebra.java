package assignment_java;

public class ZAlgebra {
	public static void main(String[] args) {
		ZDigit zd1 = new ZDigit('A');
		ZDigit zd2= new ZDigit('B');
		//System.out.println(zd1);
		ZNumber zn9 =new ZNumber(zd1,zd2);
		
		System.out.println(zn9);
		System.out.println(zn9.toDecimal());
		ZNumber zn = new ZNumber('A','B','C','D','E','F');
		System.out.println(zn);
		ZNumber zn1 = new ZNumber("ABCD");
		ZNumber zn2 = new ZNumber("ABCDEF");
		//ZNumber zn = new ZNumber(['A','B']);
		System.out.println(zn1);
		System.out.println(zn1.toDecimal());
		System.out.println(zn2.toDecimal());
		//System.out.println(zn3.toDecimal());
	}

}
