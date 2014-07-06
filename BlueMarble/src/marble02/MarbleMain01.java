package marble02;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class MarbleMain01 {

	public static void main(String args[]) {
		MarbleFrame01 mainFrame = new MarbleFrame01(); //게임창
		MarbleChatFrame01 innerChat = new MarbleChatFrame01(); //채팅창
		MarbleMenu01 mainMenu = new MarbleMenu01(); // 하단 메뉴
		
		// 프레임 생성
		JFrame frame = new JFrame("내부 프레임 테스트 프로그램"); 
		// JDesktopPane 생성
		JDesktopPane desktop = new JDesktopPane();
		
		// 내부 프레임 생성
		desktop.add(mainFrame.gameFrame); // JDesktopPane 컴포넌트에 내부 프레임 추가
		desktop.add(innerChat.chatframe);
		desktop.add(mainMenu.menuFrame);
		// 프레임 윈도우의 contentPane을 JDesktopPane 컴포넌트로 지정
		frame.setContentPane(desktop);
		// 내부 프레임의 위치와 크기 지정 //x축,y축,가로,세로
		mainFrame.gameFrame.setBounds(0, 0, 1000, 1000);
		mainFrame.gameFrame.setVisible(true);
		innerChat.chatframe.setBounds(1000, 0, 350, 1000); //이너프레임1 크기
		innerChat.chatframe.setVisible(true);
		mainMenu.menuFrame.setBounds(0, 1000, 1350, 200);
		mainMenu.menuFrame.setVisible(true);

		frame.setSize(1350,1200); // 메인프레임의 크기 지정
		frame.setResizable(false); //크기재조정 방지
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}