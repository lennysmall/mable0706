package marble02;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JInternalFrame;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class MarbleChatFrame01 extends JFrame implements ActionListener, ItemListener{
	public JMenuBar menuBar;
	public JMenu menu, submenu;
	public JMenuItem menuItem1, menuItem2;
	public JMenuItem sbMenuItem1, sbMenuItem2;
	public JRadioButtonMenuItem rbMenuItem1, rbMenuItem2;
	public JCheckBoxMenuItem cbMenuItem1, cbMenuItem2;
	
	JInternalFrame chatframe = new JInternalFrame("내부 채팅 프레임", 
		false /* 크기변경 가능 */,
		true /* 종료 가능 */,
		false /* 최대 크기로 가능 */,
		true /* 아이콘화 가능 */ ); 
	
	public MarbleChatFrame01(){
		Toolkit kit = Toolkit.getDefaultToolkit(); // 메인상단 아이콘 작업자 호출
		
		// 메뉴바를 생성한다.
		JMenuBar menuBar = new JMenuBar();

		// 첫번째 매뉴를 생성
		JMenu menu = new JMenu(" 메뉴");
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
		menuBar.setSize(350, 50);
		chatframe.add(menuBar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menuItem1) {
			JOptionPane.showMessageDialog(this, "메뉴 항목1이 선택되었습니다.");
		}
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == cbMenuItem1) {
			JOptionPane.showMessageDialog(this, "체크 박스 메뉴 항목1이 변경되었습니다.");
			// 체크 박스 메뉴 항목에 대한 처리
		}
	}

	public void setWindowBar01(JMenuBar menuBar) { //기능구현을 위해놔둠
		this.menuBar = menuBar;
	}
			
	public void setChatframe(JInternalFrame chatframe) { //기능구현을 위해놔둠
		this.chatframe = chatframe;
			}
	
}
