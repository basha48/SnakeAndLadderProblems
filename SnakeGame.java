
public class SnakeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int Startposition =0;
		
		int  checknum =(int)(Math.random() * 6) + 1;
		 int FindOptions= (int)(Math.random() * 2);
		
		
		System.out.println("Single person Start position is " +Startposition);
		
		 if (FindOptions==0) {
			 System.out.println("player cannot be move because of Position " +FindOptions);
			 
		 }
		 else if (FindOptions==1) {
			 System.out.println("player  move  " +checknum+ ":steps up ");
			 
		 }
		 
		 else {
			 System.out.println(" oops player has attacked snake   " +checknum+ ":steps down ");
			 
		 }
		 
		

	}

}
