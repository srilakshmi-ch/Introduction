
public class BetweenPrimeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,count,n=1,m=50;
		while(n<=m)
		{
			count=0;
			i=2;
		while(i<n/2)
		{
			if(n%i==0)
			{
				count++;
			}
			i++;
		}
		if(count==0)
		{
			System.out.println(n+"is prime");
		}
		n++;
	}
		
}
   
}