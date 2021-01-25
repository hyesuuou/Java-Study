## super

자식 클래스에서 **부모 클래스로부터 상속받은 멤버를 참조**한다. 자식 클래스에서 부모 클래스에 선언된 멤버변수와 같은 이름을 사용한다면, 참조변수 `super`을 이용하여 서로 구별한다.

```java
// 변수를 super로 호출하는 경우
class Parent {
	int x = 10;
}

class Child extends Parent{
	int x = 20;
	void method(){
		System.out.println("x=" + x); // x=20
		System.out.println("this.x=" + this.x); // this.x = 20
		System.out.println("super.x=" + super.x); // super.x = 10
	}
}
```

여기서 `super.x`는 조상클래스로 부터 상속받은 멤버변수 x를 뜻하고,`this.x`는 자손클래스에서 선언된 멤버변수 x 를 뜻한다.

```java
// 메서드를 super로 호출하는 경우
class Point {
	int x;
	int y;

	String getLocation(){
		return "x : " + x + ", y : " + y;
	}
}

class Point3D extends Point {
	int z;

	String getLocation(){
		return super.getLocation() + ", z : " + z;
	}
}
```

여기서는 부모 클래스의 메서드를 `super`를 이용하여 자식 클래스의 메서드에 포함시켰다.

<br>

## super() - 조상 클래스의 생성자

**super()는 조상 클래스의 생성자를 호출**하는 데 사용된다. (cf. this()는 같은 클래스의 다른 생성자를 호출하는 데 사용된다.) 만약 작성하지 않으면 컴파일러가 자동적으로 `super();` 를 생성자의 첫 줄에 삽입한다. 이때 super(); 에 해당하는 것이 부모 클래스에 없다면 오류가 나게 된다.

```java
class Point {
	int x, y;
	Point (int x, int y){
		this.x = x;
		this.x = y;
	}
}

class Point3D extends Point {
	int z;

	Point3D (int x, int y, int z){
		super(x,y);  // Point(int x, int y)를 호출한다.
		this.z = z;
	}
}
```

만약 Point3D에서 `super(x,y);` 를 호출하지 않는다면, 자동적으로 `super();` 이 호출된다. 그러면 부모 클래스인 Point 클래스에서 `Point() 생성자`가 존재하지 않으므로, 오류가 나게 된다.
