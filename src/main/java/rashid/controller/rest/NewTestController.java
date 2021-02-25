package rashid.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/testcontroller")
public class NewTestController {

    @GetMapping("/start")
    public String sayHello() {

        return "hello test world";
    }
}
