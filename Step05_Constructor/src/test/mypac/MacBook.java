package test.mypac;

public class MacBook {
	//외부에서 접근 불가하도록 접근 지정자를 private로 해서 필드 3개 선언
	//객체를 생성할 때 특별한 이유가 아니면, 필드는 private로 가린다.  
	//ex) 부품을 건들지 못하도록 막아 놓은 것처럼 
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	//생성자
	//생성자의 매개변수로 전달되는 값을 필드에 저장
	public MacBook(Cpu cpu, Memory memory, HardDisk hardDisk) {
		//필드 값 초기화 
		this.cpu=cpu;
		this.memory=memory;
		this.hardDisk=hardDisk;
		
		
	}
}
