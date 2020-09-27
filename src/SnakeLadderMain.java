
public class SnakeLadderMain {
	
	public static final int NO_PLAYS = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static int snakeLadder(int position,String Player ) {
		int number =0;
		int option=0;
		
		    number =(int) Math.floor((Math.random()*10))%7;
			option = (int) Math.floor((Math.random()*10))%3;
			switch(option) {
			case NO_PLAYS: 
				break;
			case LADDER: 
			position=position + number;
			if(position>100) {
				position = position-number;
			}	
				if(position!=100) {
					snakeLadder(position,Player);
					}
			break;
			case SNAKE: 
			position=position-number;
			if(position<0) {
				position = 0;
				}
			break;
			}
			System.out.println("Position of "+Player+" is "+position);
		return position;

	}
	public static void main(String[] args) {
		int positionOfP1 = 0;
		int positionOfP2 = 0;
		boolean turn = false;
		int x = (int) (Math.floor(Math.random()*2));
		if(x == 1) {
			turn =true;
		}
		while(positionOfP1 <100 && positionOfP2<100) {
		   
			if(turn) {
				positionOfP1 = snakeLadder(positionOfP1,"Player 1");
			}
			else {
				positionOfP2 = snakeLadder(positionOfP2,"Player 2");
			}
			
			turn = !turn ;
		}
		if(positionOfP1 == 100) {
			System.out.println("Player 1 wins");
		}
		else {
			System.out.println("Player 2 wins");
		}
	}
}
