# Spring-Cloud-Gateway-With-OpenFeign

Spring Cloud Gateway + OpenFeign 을 이용한 Service 1과 Service 2가 통신하는 간단한 MSA 예제이다


## 실행

1. Gateway 와 Service1, Service2 를 각자에 맞는 IDE 로 열어 모두 실행한다
- Gateway (8080)
- Service1 (10001)
- Service2 (10002)

2. http://localhost:8080/service1/hello 를 입력하면 Service 1 에서 OpenFeign 을 통해 Gateway 에 연결되어 있는 Service2 의 Hello 를 호출하여 결과를 반환한다


## 기타

OpenFeign 은 클라이언트의 Request로부터 오는 인증정보를 다른 서비스로 넘길 수 있는데 [JWT 기반 예제 링크](https://gist.github.com/lutics/96c690df874bdc3b50a1ad28d6ad9d18)를 참고하면 된다
