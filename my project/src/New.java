interface Animal{
			   //abstract method
			    void sound();
			}

		
			//Dog class extends Animal class
public class New implements Animal{

			   public void sound(){
				System.out.println("Woof");
			   }
			   public static void main(String args[]){
				Animal obj = new New();
				obj.sound();
			   }
			}
	


