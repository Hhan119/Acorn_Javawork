package frame09;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	private JMenuItem newIteml;
	// 생성자
	public MyFrame(String title) {
		//this.setTitle("나의 프레임");
		//this.setBounds(100, 100, 500, 500);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.setVisible(true);
		
		// 부모 생성자
		super(title);
		
		// 프레임의 레이아웃을 BorderLayout으로 설정
		this.setLayout(new BorderLayout());
		// 메뉴바
		JMenuBar mb = new JMenuBar();
		// 메뉴
		JMenu menu = new JMenu("File");
		// 메뉴 아이템
		JMenuItem newItem = new JMenuItem("New");
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem saveItem = new JMenuItem("Save");
		// 메뉴에 메뉴 아이템을 순서대로 추가 
		menu.add(newItem);
		menu.add(openItem);
		menu.add(saveItem);
		// 메뉴를 메뉴바에 추가
		mb.add(menu);
		// 프레임의 메소드를 이용해서 메뉴바를 추가하기
		setJMenuBar(mb);
		
		JTextArea ta = new JTextArea();
		// 프레임의 가운데에 JTextArea 배치하기
		add(ta, BorderLayout.CENTER);
		ta.setVisible(false);
		
		newItem.addActionListener((e) ->{
			ta.setVisible(true);	
		});
		
	}
		
		
}
