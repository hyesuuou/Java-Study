/**
 * Ch4 - 25. 사용자로부터 숫자를 입력받아, 이 숫자의 각 자라의 합을 구하는 예제
 */

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int num =0, sum=0;
        System.out.print("숫자를 입력하세요. (예:12345)>");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        while (num != 0){
            //num 을 10으로 나눈 나머지를 sum에 저장
            sum += num%10;
            System.out.printf("sum = %3d num = %d%n",sum, num);
            num /=10;
        }
        System.out.println("각 자리 수의 합:" +sum);
    }
}
