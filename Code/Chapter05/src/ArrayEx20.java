/**
 * ch5-20. 다차원 배열의 활용 - 입력된 2차원 좌표의 위치에 x를 표시하는 예제 (지뢰찾기)
 */

import java.util.*;

public class ArrayEx20 {
    public static void main(String[] args) {
        final int SIZE = 10;
        int x=0, y=0;

        char[][] board = new char[SIZE][SIZE];
        byte[][] shipboard = {
                // 1 ~ 9
                {0, 0, 0, 0, 0, 0, 1, 0, 0}, // 1
                {1, 1, 1, 1, 0, 0, 1, 0, 0}, // 2
                {0, 0, 0, 0, 0, 0, 1, 0, 0}, // 3
                {0, 0, 0, 0, 0, 0, 1, 0, 0}, // 4
                {0, 0, 0, 0, 0, 0, 0, 0, 0}, // 5
                {1, 1, 0, 1, 0, 0, 0, 0, 0}, // 6
                {0, 0, 0, 1, 0, 0, 0, 0, 0}, // 7
                {0, 0, 0, 1, 0, 0, 0, 0, 0}, // 8
                {0, 0, 0, 0, 0, 1, 1, 1, 0} // 9
        };

        // 1행에 행번호를, 1열에 열번호를 저장한다.
        for(int i=0; i<SIZE; i++){
            board[0][i] = board[i][0] = (char)(i+'0');
        }

        for(int i=1; i<SIZE; i++){
            for(int j=1; j<SIZE; j++){
                board[i][j] = ' ';
            }
        }

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.printf("좌표를 입력하세요. (종료는 00)>");
            String input = scanner.nextLine();  //입력받은 내용을 input 에 저장한다.

            // 두 글자를 입력한 경우
            if(input.length() == 2){
                x = input.charAt(0) - '0';  // 문자를 숫자로 변환
                y = input.charAt(1) - '0';

                if (x==0 && y==0){  // 종료를 위해 00을 입력한 경우 -> 종
                    break;
                }
            }

            if (input.length() != 2 || x<0 || x>=SIZE || y<=0 || y>=SIZE){
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;   // 다음 반복으로 넘어가기
            }

            // shipBoard[x-1][y-1]의 값이 1이면, 'o'을 board[x][y]에 저장한다.
            board[x][y] = (shipboard[x-1][y-1]==1) ? 'O' : 'X';

            // 배열 board 의 내용을 화면에 출력한다.
            for (int i=0; i<SIZE ; i++){
                System.out.println(board[i]);   // board[i]는 1차원 배열
            }
            System.out.println();

        }

    }
}
