
public class Primewhile {

	public static void main(String[] args) {
		
		int i=2,count=0,n=20;
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
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}

	}

}
