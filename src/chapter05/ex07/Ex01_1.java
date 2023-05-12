package chapter05.ex07;

public class Ex01_1 {
	
	
public static void main(String[] args) {
	
	int totalScore = 0;
    int subjectCount = args.length / 2; // 과목 개수 계산
    for (int i = 0; i < args.length; i += 2) {
        String subject = args[i];
        int score = Integer.parseInt(args[i + 1]);
        totalScore += score; // 총합 계산
        System.out.println(subject + " 점수 : " + score);
    }
    double average = (double) totalScore / subjectCount; // 평균 계산
    System.out.println("총점 : " + totalScore);
    System.out.printf("평균 : %.2f", average);
    
    
    
    
    
    
    
	
	
	
	
}
	

}
