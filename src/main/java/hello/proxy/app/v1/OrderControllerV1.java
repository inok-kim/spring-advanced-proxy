package hello.proxy.app.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping// 스프링은 @Controller 또는 @RequestMapping 이 있어야 스프링 컨트롤러로 인식
@ResponseBody
public interface OrderControllerV1 {

    @GetMapping("/v1/request")
    String request(@RequestParam("itemId") String itemId); // 인터페이스에는 @RequestParam 넣어줘야함, 자바버전에 따라서 이름을 명시하지 않으면 컴파일하면서 제대로 인식 못할수 있기때문에

    @GetMapping("/v1/no-log")
    String noLog();
}
