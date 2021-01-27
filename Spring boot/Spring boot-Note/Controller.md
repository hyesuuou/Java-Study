## Controller

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
