/**
 * Ch5 - 13. 16진수를 2진수로 변환하는 예제
 */
public class ArrayEx13 {
    public static void main(String[] args) {
        char[] hex = {'C', 'A', 'F', 'E'};

        String[] binary = {"0000", "0001", "0010", "0011"
                , "0100", "0101", "0110", "0111"
                , "1000", "1001", "1010", "1011"
                , "1100", "1101", "1110", "1111"
        };
        String result = ""; // *** 문자열 더하기 위해서 !

        for(int i=0; i<hex.length; i++){
            if(hex[i] >= '0' && hex[i] <'9'){
                result += binary[hex[i]-'0'];
            }
            else{
                result += binary[hex[i]-'A'+10];    // 예륻들어 'C'-'A' = 2 이므로 10을 더해줘야 한다.
            }
        }

        System.out.println("hex: "+ new String(hex));
        System.out.println("binary:" + result);

    }
}
