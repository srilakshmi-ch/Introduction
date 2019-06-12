

public class Strongnum {
	static int fact(int a)
	{    int f=1;
		for(int i=1;i<=a;i++)
		{
			f=f*i;
			
		}
	return f;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=145;
		int n,rem=0,sum=0;
		n=num;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+fact(rem);
			n=n/10;
		}
		
		if(sum==num)
		{ 
			System.out.println(num+"is strong number");
		}
		else
		{
			System.out.println(num+"is not strong number");
		}
		}
	
	
	
	}


