package frame06;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	private JButton sendBtn;
	private JTextField inputMsg;
	
	//생성자
	public MyFrame() {
		// 프레임의 제목 설정
		this.setTitle("나의 프레임");
		// 프레임의 위치와 크기 설정 setBounds(x, y, width, height)
		this.setBounds(100, 100, 500, 500);
		// 종료 버튼을 눌렀을 때 프로세스 전체가 종료 되도록 한다.
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 레이아웃 매니저 객체 생성
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		FlowLayout layout2 = new FlowLayout(0);
		
		// 프레임의 레이아웃 매니저 설정
		setLayout(layout);
		
		
		JTextField inputMsg = new JTextField(10);
		add(inputMsg);
		
		JButton sendBtn = new JButton("전송");
		add(sendBtn);
		
		//버튼에 액션 리스너 등록
		sendBtn.addActionListener((e)->{
			String msg = inputMsg.getText();
			System.out.println(msg);
		});
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
		// 눌러진 버튼의 참조값 얻어내기
		Object which = e.getSource();
		}
			
}

