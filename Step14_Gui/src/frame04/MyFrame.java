package frame04;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	//생성자
	public MyFrame() {
		// 프레임의 제목 설정
		this.setTitle("나의 프레임");
		// 프레임의 위치와 크기 설정 setBounds(x, y, width, height)
		this.setBounds(100, 100, 500, 500);
		// 종료 버튼을 눌렀을 때 프로세스 전체가 종료 되도록 한다.
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 레이아웃 매니저 객체 생성
		FlowLayout layout = new FlowLayout(FlowLayout.RIGHT);
		FlowLayout layout2 = new FlowLayout(0);
		
		// 프레임의 레이아웃 매니저 설정
		setLayout(layout);
		
		// JButton 객체 생성
		JButton btn1 = new JButton("버튼");
		// 프레임의 add() 메소드 호출하면서 JButton 객체의 참조값을 전달하면 프레임에 버튼이 배치된다. 
		this.add(btn1);
		// 인터페이스 type
		btn1.addActionListener(this);
	
		MyFrame a = this;
		JFrame b = this;
		Component c = this;
		Object d = this;
		ActionListener e =this;
		
		// 화면상에 실제 보이도록 한다. 
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

	//implements ActionListener 했기 때문에 강제로 구현 된 메소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼을 누르셨군요!");
	}
}
