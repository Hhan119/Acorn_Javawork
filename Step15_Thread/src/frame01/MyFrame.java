package frame01;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	// 생성자
	public MyFrame(String title) {
		super(title);
		// 레이아웃 설정
		setLayout(new FlowLayout(FlowLayout.CENTER));
		// - type 추론이 가능하다면, 지역변수의 type 선언 대신에 var로 선언 할 수 있다.
		// - java 10에서 추가된 문법이며, 실무에서 1.8버전을 쓰는 곳이 많으므로 주의!
		// - 지역변수에만 사용가능, 필드는 불가 
		// - 인터페이스 type 추론 불가, null로 초기화 불가
		var StartBtn = new JButton("작업 시작");
		add(StartBtn);
		// 리스너 등록
		StartBtn.addActionListener((e)->{
			System.out.println("10초 걸리는 작업을 시작합니다.");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("작업이 종료 되었습니다. ");
		});
	
		var StratBtn2 = new JButton("작업 시작2");
		add(StratBtn2);
		StratBtn2.addActionListener((e)->{

		});
	// 스레드 클래스를 내부 클래스로 만들어보
	}
	
	// run 했을 때 실행의 흐름이 시작되는(Main Thread가 시작) Main 메소드
	public static void main(String[] args) {
		MyFrame f = new MyFrame("스레드 테스트 프레임"); // 생성자 MyFrame으로 보내지고 supuer()로 통해서 부모객체에게 보내짐
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}
