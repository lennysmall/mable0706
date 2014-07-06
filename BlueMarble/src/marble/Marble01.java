package marble;


import java.awt.Color;
import java.awt.Dimension;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
// http://invincure.tistory.com/131 채팅프로그램 소스
// 채팅창 구현
// 버튼 크기및 위치조정
// 주사위 구현
// 플레이어 구현
// 버튼 이벤트 구현
// 상단 메뉴 조정 및 추가


class MainFrame extends JFrame implements ActionListener, ItemListener{
	public MainFrame(){
		Toolkit kit = Toolkit.getDefaultToolkit(); // 메인상단 아이콘 작업자 호출
		Dimension screenSize = kit.getScreenSize();  //현재 화면크기 얻음
//		setSize(1000,1000); 수정용
		setSize(getMaximumSize());
		//		setLocation(screenSize.width / 2, screenSize.height /2); //화면 중앙정렬
		
		setTitle("땅따먹기 0.4");
		// 메뉴바를 생성한다.
		JMenuBar menuBar = new JMenuBar();

		// 첫번째 매뉴를 생성
		JMenu menu = new JMenu("첫번째 메뉴");
		menu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(menu);
		// 메뉴 항목들을 생성
		JMenuItem menuItem1 = new JMenuItem("메뉴 항목 1", KeyEvent.VK_1);
		menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.ALT_MASK));
		menuItem1.addActionListener(this);
		menu.add(menuItem1);
		// 체크 박스 메뉴 항목들을 생성하여 메뉴에 추가
		menu.addSeparator();
		JCheckBoxMenuItem cbMenuItem1 = new JCheckBoxMenuItem("체크 박스 메뉴 항목 1");
		cbMenuItem1.addItemListener(this);
		menu.add(cbMenuItem1);
		// 서브 메뉴 생성
		menu.addSeparator();
		JMenu submenu = new JMenu("서브 메뉴");
		submenu.setMnemonic(KeyEvent.VK_S);
		menu.add(submenu);
		JMenuItem sbMenuItem1 = new JMenuItem("서브 메뉴 항목 1");
		sbMenuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,
				ActionEvent.ALT_MASK));
		submenu.add(sbMenuItem1);

		setJMenuBar(menuBar); //  프레임에 메뉴바를 설정한다.
		//메뉴 아이콘 변경		
		Image topImage = kit.getImage("url 경로지정");
		setIconImage(topImage);
		//========== 상단메뉴끝
		
		//===== 패널 배치 시작
		JPanel mainPanel = new JPanel();
		JPanel mainPanel02 = new JPanel();
		JPanel mainPanel03 = new JPanel();
		JPanel panelLeft = new JPanel();
		JPanel topPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
		JPanel centerPanel01 = new JPanel();
		JPanel centerPanelA = new JPanel();
		JPanel centerPanelB = new JPanel();
		JPanel centerPanelC = new JPanel();
		JPanel centerPanel03 = new JPanel();
		//		JLabel label01 = new JLabel("레이블1");
		//패널 배치관리자		
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
		panelLeft.setLayout(null);
		mainPanel02.setLayout(new BoxLayout(mainPanel02, BoxLayout.Y_AXIS));
		mainPanel03.setLayout(new BoxLayout(mainPanel03, BoxLayout.X_AXIS));
		topPanel.setLayout(new GridLayout(0,10));
		bottomPanel.setLayout(new GridLayout(0,10));
		centerPanel01.setLayout(new GridLayout(0,1));
		centerPanelA.setLayout(null);
		centerPanelB.setLayout(null);
		centerPanelC.setLayout(null);
		centerPanel03.setLayout(new GridLayout(0,1));

		//		//패널색상
		panelLeft.setBackground(Color.LIGHT_GRAY);mainPanel02.setBackground(Color.red);
		mainPanel03.setBackground(Color.black);topPanel.setBackground(Color.magenta);
		bottomPanel.setBackground(Color.pink);centerPanel01.setBackground(Color.yellow);
		centerPanelA.setBackground(Color.green);centerPanel03.setBackground(Color.gray);
		centerPanelB.setBackground(Color.orange);centerPanelC.setBackground(Color.white);
		// 패널위치		
		mainPanel.add(mainPanel02);
		mainPanel02.add(topPanel);
		mainPanel02.add(mainPanel03);
		mainPanel02.add(bottomPanel);
		mainPanel03.add(centerPanel01);
		mainPanel03.add(centerPanelA);
		mainPanel03.add(centerPanelB);
		mainPanel03.add(centerPanelC);
		mainPanel03.add(centerPanel03);
//		mainPanel.add(panelLeft);
		//====================패널 구성 끝
		
		//================================버튼 구성시작
		// 윗쪽 버튼
		JButton btnT01 = new JButton("버튼T01");JButton btnT02 = new JButton("버튼T02");JButton btnT03 = new JButton("버튼T03");JButton btnT04 = new JButton("버튼T04");JButton btnT05 = new JButton("버튼T05");JButton btnT06 = new JButton("버튼T06");JButton btnT07 = new JButton("버튼T07");JButton btnT08 = new JButton("버튼T08");JButton btnT09 = new JButton("버튼T09");JButton btnT10 = new JButton("버튼T10");
		topPanel.add(btnT01);topPanel.add(btnT02);topPanel.add(btnT03);topPanel.add(btnT04);topPanel.add(btnT05);topPanel.add(btnT06);topPanel.add(btnT07);topPanel.add(btnT08);topPanel.add(btnT09);topPanel.add(btnT10);
		// 아래 버튼
		JButton btnB01 = new JButton("버튼B01");JButton btnB02 = new JButton("버튼B02");JButton btnB03 = new JButton("버튼B03");JButton btnB04 = new JButton("버튼B04");JButton btnB05 = new JButton("버튼B05");JButton btnB06 = new JButton("버튼B06");JButton btnB07 = new JButton("버튼B07");JButton btnB08 = new JButton("버튼B08");JButton btnB09 = new JButton("버튼B09");JButton btnB10 = new JButton("버튼B10");
		bottomPanel.add(btnB01);bottomPanel.add(btnB02);bottomPanel.add(btnB03);bottomPanel.add(btnB04);bottomPanel.add(btnB05);bottomPanel.add(btnB06);bottomPanel.add(btnB07);bottomPanel.add(btnB08);bottomPanel.add(btnB09);bottomPanel.add(btnB10);	
		// 왼쪽 버튼
		JButton btnR01 = new JButton("버튼R01");JButton btnR02 = new JButton("버튼R02");JButton btnR03 = new JButton("버튼R03");JButton btnR04 = new JButton("버튼R04");JButton btnR05 = new JButton("버튼R05");JButton btnR06 = new JButton("버튼R06");JButton btnR07 = new JButton("버튼R07");JButton btnR08 = new JButton("버튼R08");
		centerPanel01.add(btnR01);centerPanel01.add(btnR02);centerPanel01.add(btnR03);centerPanel01.add(btnR04);centerPanel01.add(btnR05);centerPanel01.add(btnR06);centerPanel01.add(btnR07);centerPanel01.add(btnR08);		
		// 오른쪽 버튼
		JButton btnL01 = new JButton("버튼L01");JButton btnL02 = new JButton("버튼L02");JButton btnL03 = new JButton("버튼L03");JButton btnL04 = new JButton("버튼L04");JButton btnL05 = new JButton("버튼L05");JButton btnL06 = new JButton("버튼L06");JButton btnL07 = new JButton("버튼L07");JButton btnL08 = new JButton("버튼L08");
		centerPanel03.add(btnL01);centerPanel03.add(btnL02);centerPanel03.add(btnL03);centerPanel03.add(btnL04);centerPanel03.add(btnL05);centerPanel03.add(btnL06);centerPanel03.add(btnL07);centerPanel03.add(btnL08);
		// 중앙버튼 1
		JButton btnCA01 = new JButton("버튼C01");
		centerPanelA.add(btnCA01);
		btnCA01.setSize(100,100);
		// 중앙버튼 2
		JButton btnCB01 = new JButton("버튼CB01");
		centerPanelB.add(btnCB01);
		btnCB01.setSize(100,100);
		// 중앙버튼 3
		JButton btnCC01 = new JButton("버튼CC01");
		centerPanelC.add(btnCC01);
		btnCC01.setSize(100,100);
				
		// 오른쪽 채팅창 버튼
				JButton btnChat01 = new JButton("채팅창 구현");
				panelLeft.add(btnChat01);
				btnChat01.setSize(200,100);
		add(mainPanel);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}


public class Marble01 {
	public static void main(String[] args) {
		MainFrame mm = new MainFrame(); 
		mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mm.setVisible(true);


	}
}
