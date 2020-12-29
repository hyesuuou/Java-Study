### String 클래스

자바에서는 문자열을 char 배열이 아니라 **String 클래스**를 이용하여 처리한다. 그 이유는 String 클래스가 char 배열에 여러가지 기능을 추가하여 확장한 것이기 때문에 문자열을 다루기가 더 편리하기 때문이다.

- 주의 ! - char 배열과 달리 String클래스로 만들어진 객체(문자열)은 **읽기만 가능할 뿐, 내용을 변경할 수 없다.** (변경 가능한 문자열을 다루려면 StringBuffer 클래스를 사용하면 된다.)

```java
String str = "Java"; 
str = str + "8";        // "Java8" 이라는 !! 새로운 문자열 !! 이 str에 저장된다.
System.out.println(str); // "Java8"
```

str = str + "8" 이 문자열의 내용을 바꾸는 것처럼 보일 도 있지만, String 클래스로 만들어진 문자열은 변경할 수 없으므로, 새로운 내용의 문자열이 생성되고 그 문자열이 str에 저장되는 것이다.

### String 클래스의 메서드

1. **char charAt(int index)** - 문자열이 해당위치(index) 에 있는 문자를 반환한다.
2. **int length()** - 문자열의 길이를 반환한다.
3. **String substring(int from, int to)** - 문자열의 해당범위(from~to-1)의 문자열을 반환한다.
4. **boolean equals(Object obj)** - 문자열의 내용이 obj와 같은지 확인한다. (같- true) 대소문자를 구분하지 않으려면 equalsIgnoreCase() 를 사용한다.
5. **char[] toCharArray()** - 문자열을 문자배열(char []) 로 변환하여 반환한다.

    ```java
    char[] chArr = { 'A', 'B', 'C'};

    // char 배열 -> String 클래스 객체
    String str = new String(chArr);

    // String 클래스 객체 -> char 배열
    char[] tmp = str.toCharArray();
    ```
