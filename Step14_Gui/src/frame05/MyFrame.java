package frame05;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	private JButton saveBtn;
	private JButton updateBtn;
	private JButton deleteBtn;

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
		
		// JButton 객체 생성해서 참조값을 필드에 저장(다른 메소드에서 사용가능)
		this.saveBtn = new JButton("저장");
		this.updateBtn = new JButton("수정");
		this.deleteBtn = new JButton("삭제");
		
		// 버튼 추가
		add(saveBtn);
		add(updateBtn);
		add(deleteBtn);
		
		saveBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		
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
		if(which == this.saveBtn) {
			System.out.println("저장");	
		}
			else if(which == updateBtn) {
				System.out.println("수정");
		}
		
			else if(which == deleteBtn) {
				System.out.println("삭제");
		}
		
	
			
	}
}

