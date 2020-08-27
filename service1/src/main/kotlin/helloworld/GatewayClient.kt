package helloworld

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(value = "gateway", url = "http://localhost:8080")
interface GatewayClient {

    @GetMapping("/service1/hello")
    fun getHelloFromService1(): String

    @GetMapping("/service2/hello")
    fun getHelloFromService2(): String
}