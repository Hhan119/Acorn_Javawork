package frame03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import frame01.WorkThread;

public class MyFrame extends JFrame implements ActionListener{
	// 생성자
	public MyFrame(String title) {
		super(title);
		// 레이아웃 설정
		setLayout(new FlowLayout(FlowLayout.CENTER));
		// - type 추론이 가능하다면, 지역변수의 type 선언 대신에 var로 선언 할 수 있다.
		// - java 10에서 추가된 문법이며, 실무에서 1.8버전을 쓰는 곳이 많으므로 주의!
		// - 지역변수에만 사용가능, 필드는 불가 
		// - 인터페이스 type 추론 불가, null로 초기화 불가
		var StartBtn = new JButton("Count Down");
		add(StartBtn);
		StartBtn.addActionListener(this);
		
	}

	
	// run 했을 때 실행의 흐름이 시작되는(Main Thread가 시작) Main 메소드
	public static void main(String[] args) {
		MyFrame f = new MyFrame("스레드 테스트 프레임"); // 생성자 MyFrame으로 보내지고 supuer()로 통해서 부모객체에게 보내짐
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// Thread 객체를 생성하면서 CountRunnable 객체의 참조밗을 넘겨주고 start() 메소드를 호출한다. 
		//new Thread(new CountRunnable()).start();
		
			new Thread(new Runnable() { // 여기서 this는 내부영역에서만 바라보기 떄문에 중복된 변수명을 쓸 수가 있다. 
				
				@Override
				public void run() {
					
				}
			});
		
		
			new Thread(()->{  // Runnable에 함수가 하나인 경우(run()) 이렇게 ()-> 줄여 쓸 수 있다. 여기서 this는 외부영역을 바라본다.
				int count = 10;
				// 반복문 실행
				while(true) {
					System.out.println("현재 count:"+count);
					if(count==0) { // 만일 count가 0이면
						break; // 반복문 탈출
					}
					// 1초마다 
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e2) {
						e2.printStackTrace();
					}
					// count 1씩 감소
					count --;
				}
			}).start();
	}
	
}
