/**
 * Ch 5 - 9. 임의의 값으로 배열 채우기 (연속 또는 불연속적인 값들로 배열을 초기화한다.)
 */

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        int[] code = {-4, -1, 3, 6, 11};    // 불연속적인 값으로 구성된 배열 생성
        int[] arr = new int[10];

        for (int i=0; i<arr.length; i++){
            int tmp = (int) (Math.random() * code.length);  //랜덤하게 코드
            arr[i] = code[tmp];
        }

        System.out.println(Arrays.toString(arr));
    }
}
