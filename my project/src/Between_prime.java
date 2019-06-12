
public class Between_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for(int n=1;n<50;n++)
	{
		int count=0;
    for(int i=2;i<=n/2;i++)
    {
    	if(n%i==0)
    	{
    		count++;
    	}
    		
    }
    if(count==0) {
    	System.out.println(n+"prime");
    }
    
	}
	}
}


	
