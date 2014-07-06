package marble02;

import javax.swing.JInternalFrame;

public class MarbleMenu01 {
	JInternalFrame menuFrame 	= new JInternalFrame("메뉴 프레임", 
			false /* 크기변경 가능 */,
			false /* 종료 가능 */,
			false /* 최대 크기로 가능 */,
			false /* 아이콘화 가능 */ ); 

	public void setMenuFrame(JInternalFrame menuFrame) { //기능구현을 위해놔둠
		this.menuFrame = menuFrame;
	}
}
