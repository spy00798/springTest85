package testpage;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class testpage {

    @GetMapping("/")

    public String hello(){
        System.out.println("확인");
        return "<h1>Hello World!</h1>";
    }
}
