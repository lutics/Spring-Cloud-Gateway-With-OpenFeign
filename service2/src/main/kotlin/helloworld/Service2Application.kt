package helloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class Service2Application

fun main(args: Array<String>) {
    runApplication<Service2Application>(*args)
}
