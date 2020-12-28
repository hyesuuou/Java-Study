/**
 * Ch5 - 11. 배열에 어떤 값이 얼마나 저장되어 있는지 빈도를 계산해서 보여준다.
 * How to? - 배열 conter에서 배열 numArr에 저장된 값과 일치하는 인덱스의 요소에 저장된 값을 1만큼 증가시킨다.
 */

public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i=0; i< numArr.length; i++){
            numArr[i] = (int)(Math.random()*10);
            System.out.print(numArr[i]);
        }
        System.out.println();

        // ** 포인트 !!! 개수세기 -> counter
        for(int i=0; i<numArr.length; i++){
            counter[numArr[i]] ++;
        }

        for(int i=0; i<numArr.length; i++){
            System.out.println(i + "의 개수 : " + counter[i]);
        }

    }
}
