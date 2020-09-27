
public class SnakeLadderMain {
	
	public static final int NO_PLAYS = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;

	public static void main(String[] args) {
		// Variables
		int position = 0;
		int number =0;
		int option=0;
		number = (int) ( Math.floor(Math.random()*10)%6)+1;
		
		option = (int) Math.floor((Math.random()*10))%3;

		switch(option) {
		case NO_PLAYS: 
			break;
		case LADDER: 
		position=position + number;
		
		break;
		case SNAKE: 
		position=position-number;
		
		break;
		}
	}
}
