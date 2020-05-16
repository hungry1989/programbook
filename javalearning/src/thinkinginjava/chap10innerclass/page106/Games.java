package thinkinginjava.chap10innerclass.page106;

public class Games {
   
	public static void playGame(GameFactory factory) {
		Game sGame = factory.getGame();
		while(sGame.move()) {
			System.out.println("hello world");
		}
	}
	
	public static void main(String args[]) {
		playGame(Checkers.getFactory());
		playGame(Chess.factory);
	}
	
}
