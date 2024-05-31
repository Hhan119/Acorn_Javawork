package exemple;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MemberFrame3 extends JFrame implements ActionListener{
	//필요한 필드 정의하기
	JTextField inputNum, inputName, inputAddr;
	DefaultTableModel model;
	
	//생성자 
	public MemberFrame3(String title) {
		super(title);
		setLayout(new BorderLayout());
		//JLable 3개
		JLabel label1=new JLabel("번호");
		JLabel label2=new JLabel("이름");
		JLabel label3=new JLabel("주소");
		//JTextField 3개
		inputNum=new JTextField(10);
		inputName=new JTextField(10);
		inputAddr=new JTextField(10);
		//JButton
		JButton addBtn=new JButton("추가");
		
		//페널에 UI 배치
		JPanel panel=new JPanel();
		panel.add(label1);
		panel.add(inputNum);
		panel.add(label2);
		panel.add(inputName);
		panel.add(label3);
		panel.add(inputAddr);
		panel.add(addBtn);
		
		//페널을 프레임의 위쪽에 배치
		add(panel, BorderLayout.NORTH);
		
		//테이블
		JTable table=new JTable();
		//테이블의 칼럼명을 배열로 미리 준비한다.
		String[] colNames= {"번호", "이름", "주소"};
		//테이블에 연결할 모델
		model=new DefaultTableModel(colNames, 0);
		//모델을 테이블에 연결
		table.setModel(model);
		//스크롤이 가능 하도록 테이블을 JScrollPane 에 감싼다.
	    JScrollPane scroll=new JScrollPane(table);
	    //JScrollPane  을 프레임의 가운데에 배치하기 
	    add(scroll, BorderLayout.CENTER);
	    
		// Table에 sample 데이터 출력해보기 
		Object[] data1 = {1, "첼시", "잉글랜드"};
		Object[] data2 = {2, "레알마드리드", "스페인"};
		model.addRow(data1);
		model.addRow(data2);
		Vector<Object> data3 = new Vector<>();
		data3.add(3);
		data3.add("맨시티");
		data3.add("잉글랜드");
		model.addRow(data3);
	    
	    //버튼에 액션 리스너 등록
	    addBtn.addActionListener(this);
		//입력한 번호를 읽어와서 정수로 바꿔준다.
	    
	

	}

	public static void main(String[] args) {
		MemberFrame3 f = new MemberFrame3("회원정보 관리");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int num = Integer.parseInt(inputNum.getText());
		//이름
		String name = inputName.getText();
		//주소
		String addr = inputAddr.getText();
		//입력한 번호, 이름, 주소를 Object[] 에 넣는다.
		Object[] info = {num, name, addr};
		//DefaultTableModel 객체에 .addRow() 메소드를 호출하면서 전달한다.
		model.addRow(info);
	    Object a=this;
	    MemberFrame3 b=this;
	}
}




