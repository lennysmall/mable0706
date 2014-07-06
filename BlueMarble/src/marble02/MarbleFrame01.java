package marble02;

import javax.swing.JInternalFrame;

public class MarbleFrame01 {
	JInternalFrame gameFrame 	= new JInternalFrame("게임 프레임", 
			false /* 크기변경 가능 */,
			false /* 종료 가능 */,
			false /* 최대 크기로 가능 */,
			false /* 아이콘화 가능 */ ); 

	public void setGameFrame(JInternalFrame gameFrame) { //기능구현을 위해놔둠
		this.gameFrame = gameFrame;
	}


}
