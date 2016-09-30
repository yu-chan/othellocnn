package nn;

public class GameState {
	public int data[][];
	public int turn;
	int player;
	int black;
	int white;
	
	public GameState(int mas) {
		data = new int[mas][mas];
		
		//黒:1 白:-1 なし:0
		data[3][3] = 1;
		data[3][4] = -1;
		data[4][3] = -1;
		data[4][4] = 1;
		
		turn = 1;
		player = 1;//0:CPU 1:プレイヤー
		black = 2;
		white = 2;
	}
}
