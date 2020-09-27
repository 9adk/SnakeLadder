
public class SnakeLadderMain {
	
	public static final int NO_PLAYS = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;

	public static void main(String[] args) {
		// Variables
		int position = 0;
		int number =0;
		int option=0;
		int rolling_die =0;
		do{
		    number =(int) Math.floor((Math.random()*10))%7;
			option = (int) Math.floor((Math.random()*10))%3;
			rolling_die++;
			switch(option) {
			case NO_PLAYS: 
				break;
			case LADDER: 
			position=position + number;
			if(position>100) {
				position = position-number;
			}
			
			break;
			case SNAKE: 
			position=position-number;
			if(position<0) {
				position = 0;
				}
			break;
			}
			System.out.println("Position is "+ position);
		}
		while(position!=100);
		System.out.println("no of times die rolled:"+ rolling_die);

	}
}
