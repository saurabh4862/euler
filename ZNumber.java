package assignment_java;
public class ZNumber{
	// private char[] chi;
	private String zn;
	public ZNumber(ZDigit... zd)
	{
		int n =zd.length;
		char[] chi = new char[n];
		for (int i=0;i<n;i++){
			chi[i]= zd[i].ch;
		}
		zn =new String(chi);
	}
	public ZNumber(char...chars)
	{
		int n =chars.length;
		char[] chi = new char[n];
		String temp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0";
		for (int i=0;i<n;i++)
		{
			if (temp.indexOf(chars[i])!=-1){
				chi[i]= chars[i];
			}
			else{
				 throw new IllegalArgumentException("put b/w Ato Z");
				 }
			
		}
		zn =new String(chi);	
	}
	public ZNumber (String s)
	{
		zn=s;
	}
	public String toString()
	{
		return zn;
	}
	public int toDecimal()
	{
		int su=0;
		for (int i=0; i<zn.length();i++)
		{
			if (zn.charAt(i)=='0'){
				su=su+0;
			}
			else{
				int ar =zn.charAt(i);
				int result=(int) Math.pow(26,zn.length()-i-1);
				su=su+ (result)*(ar-64);
			}
		}
		return su;
		
	}
	public ZDigit[] getDigits()
	{
		ZDigit[] z =new ZDigit[zn.length()];
		for (int i=0;i<zn.length();i++){
			z[i].ch=zn.charAt(i);
		}
		return z;	
		
	}
	
}