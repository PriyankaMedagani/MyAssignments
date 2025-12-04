package week1.day2;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8; //input number
		int a=0; //first number of fibbanacci
		int b=1; //second number of fibbanacci
		System.out.println(a+"\n"+b);
		//System.out.println(b);
		for(int i=3;i<=n;i++) {  
			
		int c=a+b; //next numbers
		System.out.println(c+" ");
				a=b; //shifting
				b=c;
		}
	}

}
