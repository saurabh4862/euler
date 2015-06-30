package assignment_java;

public class ZDigit extends IllegalArgumentException{
	public char ch;
	String temp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0";
	 ZDigit (char ch)
	{
		if (temp.indexOf(ch)!=-1){
			this.ch=ch;
		}
		else{
			 throw new IllegalArgumentException("put b/w Ato Z or 0");
			 }
		
	}
}