package thinkinginjava.chap10innerclass.page106;


public class Checkers implements Game{
     
	private Checkers() {};
	private int moves = 0;
    private static  final int MOVES = 3;
	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		System.out.println("Checkers move = "+moves);
		return ++moves != MOVES;
	}
	
	public static GameFactory getFactory() {
		return new GameFactory() {
			
			@Override
			public Game getGame() {
				return new Checkers();
			}
		};
	}

}
