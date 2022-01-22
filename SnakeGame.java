

public class SnakeGame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int diceplayed=0;
		int Startposition =0;
		int Total=0;
		int Totalplayerscore2=0;
		int  Checknum =(int)(Math.random() * 6) + 1;
		 int Checkplayernumber2=(int)(Math.random() * 6) + 1;
	
		
		System.out.println("Single person Start position is " +Startposition);
		while(true) {
			diceplayed=diceplayed+1;
			if (diceplayed==800) {
				
				 System.out.println("match is draw due to Time completed");
					break;
			}
			int FindOptions= (int)(Math.random() * 3);
			int FindOptionsplayer2= (int)(Math.random() * 3);
		 if (FindOptions==0) {
			
			 System.out.println("player1 cannot be move because of Position " +FindOptions);
			
		 }
		  if (FindOptionsplayer2==0) {
				
			 System.out.println("player2 cannot be move because of Position " +FindOptionsplayer2);
			
		 }
		 
		 if (FindOptionsplayer2==1) {
			 Totalplayerscore2=Totalplayerscore2 +Checkplayernumber2;
			 System.out.println("player2  move  " +Total+ ":steps up ");
			 if (Totalplayerscore2==100) {
			 
			
			 System.out.println("player2  win " +Totalplayerscore2+ ":steps congracts ");
			 break;
			 }
		 }
		 
		if (FindOptions==1) {
			 Total=Total +Checknum;
			 System.out.println("player1  move  " +Total+ ":steps up ");
			 if (Total==100) {
			 
			
			 System.out.println("player1  win " +Total+ ":steps congracts ");
			 break;
			 }
		 }
		 
		   if(FindOptions==2){
			 Total=Total -Checknum;
			 if(Total<=0) {
				 Total= 0;
				 
			 }
			 
			 System.out.println(" oops player1 has attacked snake current position is " +Total);
			 
		 }
		 
		  if (FindOptionsplayer2==2){
			 Totalplayerscore2=Totalplayerscore2 - Checkplayernumber2;
			 if(Totalplayerscore2<=0) {
				 Totalplayerscore2= 0;
				 
			 }
			 
			 System.out.println(" oops player2 has attacked snake current position is " +Total);
			 
		 }
		 
		}
		System.out.println(" number of times person played is  " +diceplayed);
		 
	}

}
