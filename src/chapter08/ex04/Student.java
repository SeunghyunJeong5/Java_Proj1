package chapter08.ex04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
	
	private String stuName;
	private String stuEmail;
	private int stuAge;
	private double stuWeight;

	
	// Lombok 어노테이션 (@) : 클래스 블락 위에 어노테이션을 붙임.
		// @Getter : 클래스 하위의 모든 필드에 대해서 getter 를 자동으로 만듦.
	
		// @Setter : 						   setter
	
		// @Tostring : 							toString
	
		// @NoArgsConstructor : 기본 생성자를 자동으로 만듦 ==> Student() {} 
				
		// @Data : 위의 모든 명령어를 한번에 다 만들어줌.
	
		// @AllArgsConstructor : 모든 생성자를 자동으로 만듦 (모든 변수를 다 가진 생성자를 만듦)
}	
