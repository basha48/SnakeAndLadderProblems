
public class SnakeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int diceplayed=0;
		int Startposition =0;
		int Total=0;
		int  Checknum =(int)(Math.random() * 6) + 1;
		 
	
		
		System.out.println("Single person Start position is " +Startposition);
		while(true) {
			diceplayed=diceplayed+1;
			int FindOptions= (int)(Math.random() * 3);
		 if (FindOptions==0) {
			
			 System.out.println("player cannot be move because of Position " +FindOptions);
			
		 }
		 else if (FindOptions==1) {
			 Total=Total +Checknum;
			 System.out.println("player  move  " +Total+ ":steps up ");
			 if (Total==100) {
			 
			
			 System.out.println("player  win " +Total+ ":steps congracts ");
			 break;
			 }
		 }
		 
		 else {
			 Total=Total -Checknum;
			 if(Total<=0) {
				 Total= 0;
				 
			 }
			 
			 System.out.println(" oops player has attacked snake current position is " +Total);
			 
		 }
		 
		}
		System.out.println(" number of times person played is  " +diceplayed);
		 
	}

}
