package test.mypac;

public class test {
	public int width;
	public int height;
	
	public void showArea() {
		// 가로, 세로 값을 구하기
		int area = this.width * this.height;
		// 콘솔창에 출력한다.
		System.out.println("넓이:"+area);
		System.out.println("사각형 넓이는" +this.width*height +"입니다.");
	}
}
