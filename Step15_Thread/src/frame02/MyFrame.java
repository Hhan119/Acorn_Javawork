package frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import frame01.WorkThread;

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
				e1.printStackTrace();
			}
			System.out.println("작업이 종료 되었습니다. ");
		});
	
		var StratBtn2 = new JButton("작업 시작2");
		add(StratBtn2);
		StratBtn2.addActionListener((e)->{
			new WorkThread().start();
		});
	}
		// MyFrame 클래스의 메소드
		public void test() {
			MyFrame a = this;
		}
		
	// 스레드 클래스를 내부 클래스로 만들어보기
	class WorkThread extends Thread{
		// WorkThread 클래스의 메소드
		@Override
		public void run() {
			// 새로운 스레드에서 해야 할 작업을 run() 메소드 안에서 한다. 
			System.out.println("10초 걸리는 작업이 시작합니다. ");
			try {
				Thread.sleep(1000*10);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			WorkThread a = this;
			// 내부 클래스에서 외부에 있는 클래스로 생성 된 객체의 참조값이 필요할 때가 있다.
			MyFrame b = MyFrame.this;
			JOptionPane.showMessageDialog(MyFrame.this, "작업이 종료 되었습니다. ");
			}
		}
	
	// run 했을 때 실행의 흐름이 시작되는(Main Thread가 시작) Main 메소드
	public static void main(String[] args) {
		MyFrame f = new MyFrame("스레드 테스트 프레임"); // 생성자 MyFrame으로 보내지고 supuer()로 통해서 부모객체에게 보내짐
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}
