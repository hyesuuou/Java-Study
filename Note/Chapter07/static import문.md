### static import 문

static import 문을 사용하면 static 멤버를 호출 할 때, 클래스 이름을 생략할 수 있다.

```java
// 사용하지 않았을 때
System.out.println(Math.random());
System.out.println("Math.PI : " + Math.PI);
```

```java
// 사용하면
import static java.lang.System.out;
import static java.lang.Math.*;

//..
out.println(random());
out.println("Math.PI : " + PI);
```
