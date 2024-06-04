package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MemberFrame extends JFrame implements ActionListener{
	// 필요한 필드 정의
	JTextField inputNum, inputName, inputAddr;
	DefaultTableModel model;
	List<MemberDto> list = new ArrayList<>();
	JTable table;

	//생성자
	public MemberFrame(String title) {
		super(title);
		setLayout(new BorderLayout());
		//JLable 3개
		JLabel label2=new JLabel("이름");
		JLabel label3=new JLabel("주소");
		//JTextField 3개
		inputName=new JTextField(10);
		inputAddr=new JTextField(10);
		//JButton
		JButton addBtn=new JButton("추가");
		addBtn.setActionCommand("add");
		JButton deleteBtn=new JButton("삭제");
		deleteBtn.setActionCommand("delete");
		
		//페널에 UI 배치
		JPanel panel=new JPanel();
		panel.add(label2);
		panel.add(inputName);
		panel.add(label3);
		panel.add(inputAddr);
		panel.add(addBtn);
		panel.add(deleteBtn);
		
		
		//페널을 프레임의 위쪽에 배치
		add(panel, BorderLayout.NORTH);
		
		// 테이블 (표에 출력할 data -> TableModel -> JTable) 
		//           table에 출력할 data를 TableModel에 넣어주면, TableModel이 JTable에 출력할 정보를 공급해주는 구조
		table = new JTable();
		// 테이블의 칼럼명을 배열로 미리 준비한다.
		String[] colNames = {"번호", "이름", "주소"};
		// 테이블에 연결 할 모델
		model = new DefaultTableModel(colNames, 0); // Model은 필드명 선언을 했기 때문에 정상작동됨, 지역변수로 작성시 이후 추가, 삭제 버튼 액션리스너에 메소드 실행시 오류 발생 
		// 모델을 테이블에 연결
		table.setModel(model);
		// 스크롤이 가능하도록 테이블을 JScrollPane에 에워싼다.
		JScrollPane scroll = new JScrollPane(table);
		// JScrollPane을 프레임의 가운데에 배치 
		add(scroll, BorderLayout.CENTER);
		
		

		  //버튼에 액션 리스너 등록
		 addBtn.addActionListener(this);
		 deleteBtn.addActionListener(this);
		
	    refreshTable();
	}

	// 생성자 
	// 필드에 있는 List<MemberDto>를 이용해서 JTable 에 목록을 출력하는 메소드
	public void refreshTable() {
		// DB에 있는 회원목록을 얻어온다.
		MemberDao dao = new MemberDao();
		list = dao.getList();
		// 기존에 출력된 내용은 한번 지워준다.
		model.setRowCount(0);
		// 반복문 실행
		for(MemberDto tmp:list) {
			// MemberDto 객체를 순서대로 참조하면서 Object[] 객체를 생성한다.
			Object[] row = {tmp.getNum(), tmp.getName(), tmp.getAddr()};
			// 생성한 Object[] 객체를 DefaultTableModel 객체에 추가하면 테이블 row 가 출력된다
			model.addRow(row);
			}
	}	
	
	// 메인메소드
	public static void main(String[] args) {
		MemberFrame f = new MemberFrame("회원정보 관리");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(100, 100, 700, 700);
		f.setVisible(true);
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command.equals("add")) {
			String name = inputName.getText();
			String addr = inputAddr.getText();
	
			MemberDto dto = new MemberDto(0, name, addr);
			
			// list 회원 한명의 정보를 담기
			new MemberDao().insert(dto);
			
			}else if(command.equals("delete")) {
				int selectedRow = table.getSelectedRow();
				if(selectedRow == -1) {
					JOptionPane.showMessageDialog(this, "삭제할 row 를 선택하세요");
					return; //메소드를 여기서 리턴시켜라(끝내라) 
					}

				// DB에서 삭제 (삭제할 회원의 primary key 값이 필요)
				
				// DefaultTalbleModel 객체를 이용해서 pk 얻어오기
				int num=(int) model.getValueAt(selectedRow, 0);
				// List<MemberDto> 객체로부터 pk 얻어오기
				int num2=list.get(selectedRow).getNum();
				// MemberDao 객체를 이용해서 삭제
				new MemberDao().delete(num);
			}
		// 새로고침
		refreshTable();
		// 파일에 저장하기
	

	
		
	}
}
		


