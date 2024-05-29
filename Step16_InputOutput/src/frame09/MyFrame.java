
package frame09;

import java.awt.BorderLayout;
import java.awt.Font;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyFrame extends JFrame {
	// 필요한 필드 선언
	File openedFile; // 현재 열린 파일의 참조값을 저장 할 필드
	JTextArea ta;
	
	// 생성자
	public MyFrame(String title) {
		// 부모 생성자
		super(title);
		
		// 프레임의 레이아웃을 BorderLayout으로 설정
		this.setLayout(new BorderLayout());
		// 메뉴바
		JMenuBar mb = new JMenuBar();
		// 메뉴
		JMenu menu = new JMenu("File");
		// 메뉴 아이템
		JMenuItem newItem = new JMenuItem("New");
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem saveItem = new JMenuItem("Save");
		saveItem.setEnabled(false);
		JMenuItem saveAsItem = new JMenuItem("Save As");
		saveAsItem.setEnabled(false);
		
		// 메뉴에 메뉴 아이템을 순서대로 추가 
		menu.add(newItem);
		menu.add(openItem);
		menu.add(saveItem);
		menu.add(saveAsItem);
		// 메뉴를 메뉴바에 추가
		mb.add(menu);
		// 프레임의 메소드를 이용해서 메뉴바를 추가하기
		setJMenuBar(mb);
		
		// JTextArea 객체의 참조값을 필드에 저장 
		ta = new JTextArea();
		// JTextArea를 Scroll 패널 안에 위치 시키기
		JScrollPane scp = new JScrollPane(ta);
		
		// 프레임의 가운데에 JTextArea 배치하기
		add(scp, BorderLayout.CENTER);
		ta.setVisible(false);
		// JTextArea의 글자크기 조절하기
		Font font=new Font("Serif", Font.PLAIN,  30);
		ta.setFont(font);

		// New를 눌렀을때 실행 할  리스너 등록
		newItem.addActionListener((e) ->{
			ta.setVisible(true);
			setTitle("제목 없음");
			saveAsItem.setEnabled(true);
		});
		
		// Save As를 눌렀을 때 실행할 리스너 등록 
		saveAsItem.addActionListener((e)->{
			// 파일 선택을 도와주는 객체 생성
			var fc =new JFileChooser("C:/Users/user/playground/myFolder");
			int result=fc.showSaveDialog(this); // this는 saveAsItem에 해당한다.
			// 만약에 제대로 파일 생성을 준비를 했다면
			if (result == JFileChooser.APPROVE_OPTION) {
				openedFile=fc.getSelectedFile();
				setTitle(openedFile.getName());
				// 새로운 파일을 실제로 만들기
				try {
					openedFile.createNewFile();
				} catch(Exception e2) {
					e2.printStackTrace();
				}
				saveToFile();
			}
		});
		openItem.addActionListener((e)->{
			JFileChooser fc = new JFileChooser("C:/Users/user/playground"); 
			int result=fc.showOpenDialog(this);
			if(result == JFileChooser.APPROVE_OPTION) {
				// 선택한 파일을 제어할 수 있는 File 객체의 참조값 얻어내서 필드에 저장
				openedFile=fc.getSelectedFile();
				// 선택한 파일의 이름을 title에 출력하기
				String fileName=openedFile.getName();
				// 프레임의 setTitle() 메소드를 이용해서 제목 수정
				setTitle(fileName);
				// TextArea를 보이게 활성화
				ta.setVisible(true);
				loadFromFile();
			}
		});
		
	}// 생성자

		// 선택 된 파일로부터 문자열을 읽어와서 JTextArea에 출력하는 메소드
		private void loadFromFile() {
		
	}

		// 현재까지 JTextArea에 입력된 문자열을 읽어와서 File에 저장하기
		public void saveToFile() {
			// 입력한 문자열 읽어오기
			String content=ta.getText();
			FileWriter fw = null;
			try {
				// 선택한 FIle 객체의 참조값을 생성자에게 넘겨주면서 FIle FileWriter 객체 생성하기  
				fw = new FileWriter(openedFile);
				fw.write(content);
				fw.flush();
				JOptionPane.showMessageDialog(this, "저장했습니다.");
			}catch(Exception e) {
					e.printStackTrace();
			}finally {
					try {
						fw.close();
					}catch (Exception e) {}
			}
		}
			
		public static void main(String[] args) {
			MyFrame f =new MyFrame("나의 프레임");
			//f.setTitle("title");
			f.setBounds(100, 100, 500, 500);
			f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
			f.setVisible(true);
			
		}
	}
		

