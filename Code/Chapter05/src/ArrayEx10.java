/**
 * Ch5 - 10. 정렬하기(Bubble sort)
 * How to? - 배열의 길이가 n 일때, 배열의 첫번째 부터 n-1번째 인덱스의 요소까지에 대해 근접한 값과 크기를 비교하여 자리바꿈을 반복한다.
 */

public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i=0; i< numArr.length; i++){
            System.out.print(numArr[i] = (int)(Math.random()*10));
        }
        System.out.println();

        // Bubble sort
        /* 한번 실행되면 가장 큰 수가 가장 마지막 값이 된다. */
        for (int i=0; i< numArr.length-1; i++) {
            boolean changed = false;    // 자리바꿈 발생여부 확인

            for (int j = 0; j < numArr.length - 1; j++) {
                // 오른쪽 숫자가 더 작으면 둘의 자리를 바꾼다.
                if (numArr[j] > numArr[j + 1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = temp;
                    changed = true; //자리 바꿈이 발생
                }
            }

            if (!changed) break;    // 자리바꿈이 없으면(==정렬이 완료되었으면) 반복문을 벗어난다.

            for (int k = 0; k < numArr.length; k++) {
                System.out.print(numArr[k]);    //정렬된 결과를 출력한다.
            }
            System.out.println();
        }
    }
}
