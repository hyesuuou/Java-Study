## for-each문 (향상된 for문)

```java
for ( 타입변수명 : 배열 또는 컬렉션 ){
		// 반복할 문장
}
```

java JDK 1.5 부터 배열과 컬렉션에 저장된 요소에 기존보다 더 쉽게 접근할 수 있도록 추가된 문법이다.  향상된 for문은 일반적인 for 문과는 달리, **배열이나 컬렉션에 저장된 요소를 읽어오는 용도**로만 사용될 수 있는 제약이 있다.

### 타입변수명

**배열 또는 컬렉션의 요소의 타입**이어야 한다.

- 2차원 배열에서의 주의 예시

```java
int [][] score = { 
	// 2차원 배열
}

for ( int[] tmp : score ){
	for (int i : tmp) {
		// 반복내용
	}
}
```

위의 코드에서 바깥쪽 for 문은 타입변수명으로 int [] tmp 라는 배열을 가지고 있다. 이는 **2차원 배열 score 의 각 요소가 1차원 배열이기 때문**이다. 따라서 배열이 아니라 int tmp 만 작성하는것은 잘못된 코드이다.

### 일반적인 for 문과의 비교

```java
int[] arr = {10,20,30,40,50};

// 일반적인 for 문
for (int i=0; i<arr.length; i++){
	System.out.println(arr[i]);
}

// 향상된 for 문
for (int tmp : arr){
	System.out.println(tmp);
}
```
