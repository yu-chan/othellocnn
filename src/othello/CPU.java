package othello;

import nn.GameState;

public class CPU {
	int color;//白
	
	public CPU() {
		color = -1;
	}
	
	public void put(GameState state) {
		for(int x = 0; x < 8; x++) {
			for(int y = 0; y < 8; y++) {
				//駒があるなら、飛ばす
				if(state.data[x][y] != 0) {
					continue;
				}
			}
		}
	}
}
