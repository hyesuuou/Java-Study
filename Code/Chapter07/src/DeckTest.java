public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();    // 카드한벌 생성 (카드객체배열을 포함하여 생성됨)
        Card c = d.pick(0); // 가장 맨 위의 카드를 한 벌 뽑는다.
        System.out.println(c); // System.out.println(c.toString())

        d.shuffle();
        c = d.pick(0);
        System.out.println(c);
    }
}

class Deck {
    final int CARD_NUM = 52;
    Card cardArr[] = new Card[CARD_NUM]; // Card객체 배열을 포함

    // 생성자
    Deck () { //Deck 의 카드를 초기화한다.
        int i=0;    // 카드를 하나씩 돌면서

        for (int k=Card.KIND_MAX; k>0; k--){    // 카드 모양 설정
            for (int n=0; n<Card.NUM_MAX; n++)  // 카드 번호 설정
                cardArr[i++] = new Card(k, n+1);
        }
    }

    // 해당 인덱스의 카드를 반환한다.
    Card pick(int index){
        return cardArr[index];
    }

    // Deck 에서 카드를 하나 선택
    Card pick(){
       int index = (int)(Math.random()*CARD_NUM);
       return pick(index);
    }

    // 카드의 순서를 섞는다.
    void shuffle(){
        for (int i=0; i<cardArr.length; i++){
            int r = (int)(Math.random() * CARD_NUM);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }

}

class Card {
    static final int KIND_MAX = 4; // 카드 무늬의 수
    static final int NUM_MAX = 13; // 무늬별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    // 멤버변수
    int kind;
    int number;

    // 생성자
    Card (){
        // 아무 입력값이 없는 경우 spade 1로 한다.
        this (SPADE,1);
    }

    Card (int kind, int number){
        this.kind = kind;
        this.number = number;
    }

    public String toString(){   // 무슨 카드인지 출력함.
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK"; // 10은 X로 표현
        return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
    }

}
