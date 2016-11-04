package nn;

public class GameState {
	public int data[][];
	public int turn;
	int player;
	int black;
	int white;
	
	public GameState(int mas) {
		data = new int[mas][mas];
		
		//��:1 ��:-1 �Ȃ�:0
		data[3][3] = 1;
		data[3][4] = -1;
		data[4][3] = -1;
		data[4][4] = 1;
		
		turn = 1;
		player = 1;//0:CPU 1:�v���C���[
		black = 2;
		white = 2;
	}
	
	//���o�[�X����
	public void reverse(int x, int y) {
	}
	
	//�u���邩�ǂ���
	public boolean whether_put(int x, int y) {
		
		//�����Ȃ�A�u���Ȃ�
		if(data[x][y] != 0) {
			return false;
		}
		
		//�t�ɂł��Ȃ��Ȃ�A�u���Ȃ�
		if(whether_reverse(x, y) == false) {
			return false;
		}
		
		//���u��
		data[x][y] = 1;
		turn++;
		
		return true;
	}
	
	//���o�[�X�ł��邩
	public boolean whether_reverse(int x, int y) {
		int dir[][] = {
				{-1, -1}, {0, -1}, {1, -1},
				{-1, 0},			{1, 0},
				{-1, 1}, {0, 1}, {1, 1}
		};
		
		for(int i = 0; i < 8; i++) {
			//�ׂ̃}�X
			int x0 = x + dir[i][0];
			int y0 = y + dir[i][0];
			
			//�ׂ̃}�X���{�[�h�O�Ȃ�A��΂�
			if(isOut(x0, y0) == true) {
				continue;
			}
			
			int nextState = data[x0][y0];
			if(nextState == 1) {//�ׂȃ}�X����(�v���C���[)�Ȃ�A��΂�
				continue;
			} else if(nextState == 0) {//�����Ȃ��Ȃ�A��΂�
				continue;
			}
			
			//�ׂ̃}�X���瑖�����āA��������΃��o�[�X����
			int j = 2;
			while(true) {
				int x1 = x + dir[i][0] * j;
				int y1 = y + dir[i][1] * j;
				if(isOut(x1, y1) == true) {
					break;
				}
				
				//�����̋����΁A���o�[�X����
				if(data[x1][y1] == 1) {
					for(int k = 1; k < j; k++) {
						int x2 = x + dir[i][0] * k;
						int y2 = y + dir[i][1] * k;
						data[x2][y2] = 1;
					}
					break;
				}
				
				//�������Ă���}�X�������Ȃ��Ȃ�A��΂�
				if(data[x1][y1] == 0) {
					break;
				}
				
				j++;
			}
			
		}
		
		return false;
	}
	
	public boolean isOut(int x, int y) {
		if(x < 0 || y < 0 || x >= 8 || y >= 8) {
			return true;
		}
		return false;
	}
	
	//�p�X���`�F�b�N����
	public boolean checkPass() {
		
		//�{�[�h�𑖍�����
		for(int x = 0; x < 8; x++) {
			for(int y = 0; y < 8; y++) {
				
				//�����Ƃ���́A��΂�
				if(data[x][y] != 0) {
					continue;
				}
				
				//���o�[�X�ł���Ȃ�A�p�X���Ȃ�
				if(whether_reverse(x, y) == true) {
					return false;
				}
			}
		}
		
		//�p�X����
		return true;
	}
	
	//���ƍ��̋�𐔂���
	public void countPiece() {
		black = 0;
		white = 0;
		
		for(int x = 0; x < 8; x++) {
			for(int y = 0; y < 8; y++) {
				if(data[x][y] == 1) {
					black++;
				} else if(data[x][y] == -1) {
					white++;
				}
			}
		}
	}
}