/**
 *  Ch4 - 29. 숫자 중에 3의 배수(3,6,9)가 포함되어 있으면, 포함된 개수만큼 박수를 치는 369게임을 1부터 100까지 출력하는 예제
 */

public class FlowEx29 {
    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            System.out.printf("i=%d", i);

            int tmp = i;

            do {
                // tmp % 10(일의자리) 가 3의 배수인지 확인 (0도 제외한다)
                if(tmp%10%3==0 && tmp%10!=0){
                    System.out.print("짝");
                }
            }while((tmp/=10)!=0);       // tmp/=10 이 0이되면 (10으로 나눈 몫이 0 이면 해당 숫자를 다 확인 한 것이다.)
            System.out.println();
        }
    }
}
