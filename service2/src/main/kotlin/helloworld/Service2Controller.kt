package helloworld

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Service2Controller {

    @RequestMapping("/hello")
    fun getHello(): String {
        return "Hello From Service 2"
    }
}