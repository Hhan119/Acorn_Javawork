package frame03;

/*
 *  새로운 Thread 생성 방법2
 *  
 *  1. RUnnable 인터페이스를 구현한 클래스를 정의한다.
 *  2. run() 메소드를 강제 오버라이드 한다.
 *  3. Thread 클래스로 객체를 생성하면서 해당 클래스로 만든 객체를 생성자의 인자로 전달한다.
 *  4. Thread 클래스로 만든 객체의 strat() 메소드를 호출해서 Thread를 시작 한다.
 */
public class CountRunnable implements Runnable{

	@Override
	public void run() {
		// count 값을 저장 할 지역변수를 만들고 초기 값 대입
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
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// count 1씩 감소
			count --;
	
			
		}
			
	}

}
