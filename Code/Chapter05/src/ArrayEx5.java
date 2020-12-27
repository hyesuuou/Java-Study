/**
 * Ch5 - 5. 배열의 모든 요소를 더해서 총합과 평균을 구한다.
 */

public class ArrayEx5 {
    public static void main(String[] args) {
        int sum  = 0; // 총점을 저장하기 위한 변수
        float average = 0; // 평균을 저장하기 위한 변수

        int score[] = {100, 88, 100, 100, 90};
        for(int i=0; i< score.length; i++){
            sum += score[i];        // 반복문을 이용하여 배열에 있는 요소 하나하나의 값을 sum 변수에 더한다
        }
        average = sum / (float)score.length;    // 계산결과를 float 로 만들어 주기 위해 casting
        System.out.println("총점 : "+ sum);
        System.out.println("평균 : "+ average);

    }
}
