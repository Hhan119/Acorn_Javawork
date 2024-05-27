package frame03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
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
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌렀네요");
			}
		};
		
		btn1.addActionListener(listener);
		// 버튼 추가 생성
		JButton btn2 = new JButton("수정");
		// 프레임 추가
		this.add(btn2);
		// 액션리스너 등록
		btn2.addActionListener((e)->{
			System.out.println("수정을 눌렀네요");
		});
		
		// 화면상에 실제 보이도록 한다. 
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
