/**
 * Ch5 - 7. 카드 한 벌을 생성하여 섞기
 * How to? - 배열의 임의의 위치(random)에 있는 값과 배열의 인덱스0번째 요소를 서로 교환한다.
 */

public class ArrayEx7 {
    public static void main(String[] args) {
        int [] cardArr = new int[10];

        for (int i=0; i < cardArr.length; i++){
            cardArr[i] = i;     //cardArr을 0~9까지의 배열로 만든다.
            System.out.print(cardArr[i]);
        }
        System.out.println();

        for (int i=0; i<100; i++){  // 100번 섞기
            int n = (int)(Math.random()*10);    // 임의로 0~9까지의 값을 얻는다.

            // 인덱스 0 자리에 있는 숫자 카드와 0~9 중에서 랜덤으로 뽑은 인덱스 n 자리에 있는 숫자 카드를 교환한다.
            int tmp = cardArr[0];
            cardArr[0] = cardArr[n];
            cardArr[n] = tmp;
        }

        /* 더 효율적인 코드
        for (int i=0; i < cardArr.length; i++){
            int n = (int)(Math.random()*10);
            int tmp = cardArr[i];   // cardArr[i] 의 값과 cardArr[n] 자리의 값을 교환한다.
            cardArr[i] = cardArr[n];
            cardArr[n] = tmp;

        }
        */

        for (int i=0; i< cardArr.length; i++){
            System.out.print(cardArr[i]);
        }


    }
}
