/**
 * Ch 5 - 8. 로또 번호를 생성하는 예제
 * How to? - 길이가 45인 배열에 1부터 45까지의 값을 담고 반복문을 이용해 임의의 위치에 있는 값과 인덱스 0~5 까지의 6개 값을 바꾸고 이 값을 출력한다.
 * - 마치 1부터 45까지의 번호가 쓰인 카드를 섞은 다음 맨 위의 6장을 꺼내는 것과 같다.
 */

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        // 배열의 각 요소에 1~45 를 저장한다.
        for(int i=0; i<ball.length; i++){
            ball[i] = i+1;
        }

        int temp = 0;       // 두 값을 바꾸는데 사용할 임시변수
        int j = 0;          // 임의의 값을 얻어서 저장할 변수

        // 배열의 i 번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
        // 6개의 숫자만 필요하므로, 0번째부터 5번째 요소 까지 총 6개만 바꾼다.
        for (int i=0; i<6; i++){
            j = (int)(Math.random() * 45 );     /// 0~ 44 까지의 임의의 값을 얻는다.

            // ball[i] 와 ball[j] 를 바꾼다.
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }

        // 배열 ball 의 앞에서부터 6개의 요소를 출력한다.
        for (int i=0; i<6; i++){
            System.out.printf("ball[%d]=%d%n",i,ball[i]);
        }


    }
}
