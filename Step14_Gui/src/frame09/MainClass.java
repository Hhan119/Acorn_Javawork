package frame09;

public class MainClass {
	public static void main(String[] args) {
		MyFrame f =new MyFrame("나의 프레임");
		//f.setTitle("title");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}
}
