package test.mypac;

public class PostDto {
	// 글번호를 저장할 필드
	private int num;
	// 작성자를 저장할 필드
	private String name;
	// 제목을 저장할 필드
	private String title;

	//기본 생성자
	public PostDto() {
	}
	
	public PostDto(int num, String name, String title) {
		this.num=num;
		this.name=name;
		this.title=title;
	}
	
	
	//setter, getter 메소드
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String content) {
		this.title = title;
	}
	
	
	
}	

