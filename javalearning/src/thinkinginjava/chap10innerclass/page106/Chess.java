package thinkinginjava.chap10innerclass.page106;

public class Chess implements Game{
     
	private Chess() {};
	private int moves = 0;
	private final int MOVES = 4;
	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		System.out.println("Chess move = "+moves);
		return ++moves != MOVES;
	}
   
	public static GameFactory factory = new GameFactory() {
		
		@Override
		public Game getGame() {
			// TODO Auto-generated method stub
			return new Chess();
		}
	};
}
