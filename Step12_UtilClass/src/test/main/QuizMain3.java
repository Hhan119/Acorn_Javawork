package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;
import test.mypac.PostDto;

public class QuizMain3 {
	public static void main(String[] args) {
		/*
		 *  1. PostDto 클래스를 만들어 보세요.
		 *     PostDto에는 글번호, 작성자, 제목을 담믈 수 있어야 합니다.
		 *     즉 3개의 필드를 만드세요
		 *     필드명은 마음대로, 필드의 Data type은 잘 고려해서 작성
		 *     dto 작성 규약 맞게 만들어 주세요 (eclipse generate 기능 활용)
		 *     test.mypac 패키지 만들기 
		 */
		
		// 2. PostDto 객체에 임의의 글 3개의 정보를 담아 보세요.
		//    총 3개의 PostDto 객체가 생성이 되어야 합니다. 
		PostDto dto1 = new PostDto(1, "짱구", "첼시");
		PostDto dto2 = new PostDto(2, "철수", "레알");
		PostDto dto3 = new PostDto(3, "맹구", "독일");
		
		
		// 3. PostDto 객체를 담을 수 있는 ArrayList 객체를 생성해서 위에서 생성한 PostDto 객체를 ArrayList에 담아 보세요.
		List<PostDto> post = new ArrayList<>();
		post.add(dto1);
		post.add(dto2);
		post.add(dto3);
		
		// 4. 반복문 돌면서 ArrayList에 담긴 글 목록을 콘솔창에 출력해보세요.
		for(PostDto tmp : post) {
			String info = String.format("글번호:%d, 작성자:%s, 제목:%s",
					tmp.getNum(),tmp.getName(),tmp.getTitle());
			System.out.println(info);
			
			//.out.println("글번호:"+tmp.getNum()+" "+"작성자:"+tmp.getName()+" "+"제목:"+tmp.getTitle());
			}
		}
}
