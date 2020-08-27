package helloworld

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Service1Controller(
        private val gatewayClient: GatewayClient
) {

    @GetMapping("/hello")
    fun index(): String {
        return gatewayClient.getHelloFromService2()
    }
}