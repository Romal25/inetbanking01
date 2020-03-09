package javaProgramme;

public class ifelsebasicprograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// find the largest number out of 3 numbers
		// switch numbers
		//find if the number is odd or even
		// array with sum total 
		//for loop with continue and break statement
		//switch case with days of the week 
		
		// find the largest number out of 3 numbers
		int a = 10;
		int b = 20;
		int c = 30;
		
		if(a>b && a>c)
		{
			System.out.println("a is biggest number");
		}
		else if(b>c && b>a)
		{
			System.out.println("a is biggest number");	
		}
		else 
		{
			System.out.println("c is biggest number");
		}

		// switch numbers
		
		int j=10;
		int k=20;
		
		System.out.println("j is "+ j + "before switch");
		System.out.println("k is "+ k + "before switch");
		
		int l=1;
		
		l=j;
		j=k;
		k=l;
		
		System.out.println("j is "+ j + "after switch");
		System.out.println("k is "+ k + "after switch");
		
		
		//find if the number is odd or even 
		
		int number=4;
		
		if(number % 2 == 0)
		{
			System.out.println("number is even number");
		}
		else
		{
			System.out.println("number is odd number");
		}
		
		// array with sum total 
		// int a[] = new int[5];
		// String a[] = new String[5];
		//Object a[] = new Object[5];
		
		int p[]=new int[5];
		p[0]=100;
		p[1]=200;
		p[2]=300;
		p[3]=400;
		p[4]=500;
		
		int sum=0;
		
		for(int t=0;t<=5;t++)
		{
			System.out.println(p[t]);
			sum = sum+p[t];
			System.out.println(sum);
			
		}
		    
				
		
	}

}