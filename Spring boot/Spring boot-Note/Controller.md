## Controller

### 기본구조

```java
@Controller
public class HelloController {

	@GetMapping("hello")
	public string hello (Model model) {
		model.addAttribute(attributeName: "data", attributeValue: "hello!!");
		return "hello";
	}
}
```

- `@Controller` -> 컨트롤러임을 나타낸다.
- `@GetMapping("hello")` → 주소에서 ~~~~~/hello 가 입력되면 해당 메서드를 호출하게 된다.
- `return "hello";` → 뷰 리졸버 (`viewResolver`)가 **resource/template**/hello.html 를 찾아 렌더링한다.

    → 여기서 **${data}** (data : `attrubuteName`) 가 hello!!(`attributeValue`) 로 치환된다. (model에 'data:hello' 내용 넣어놓는다.)


<br>


### 외부 parameter 받기
```java
@GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
	return "hello-template";
}
```

- `@RequestParam` 을 이용해 받는다. (주소 뒤에 ?name=... 으로)
- `return "hello-template";` resource/templates/hello-template.html을 불러온다.

hello-template.html 

```html
<html xmlns:th="http://www.thymeleaf.org">
<body>
<p th:text="'hello ' + ${name}">hello! empty</p>

</body>
</html>
```

- 실제 서버를 통하면 th: 다음 값인 `'hello ' + ${name}` 이 hello empty 대신 나온다.
