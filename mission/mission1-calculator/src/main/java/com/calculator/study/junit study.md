## JUnit
- java 프로그래밍 언어용 Unit Test Framework
- Test를 위한 API -> JUnit Jupiter API 제공
- test 코드를 작성할 때 가장 많이 사용하고, 가장 유용하게 사용하는 메서드나 어노테이션들이 담겨 있는 API
---
## 장점
- test 결과는 Test 클래스로 동료 개발자에게 test 방법 및 클래스의 history를 공유해 줄 수 있음
    - history란, 초기 클래스 정의부터 현재까지 변해온 일련의 과정
- assert 메서드로 test case의 결과를 손쉽게 판별
- 어노테이션으로 간결하게 test 코드를 작성
---
## @Test
- test 메서드의 기본 문법은 아래와 같음
    1. test 메서드에 @Test 어노테이션을 꼭 붙인다.
    2. 메서드의 return type은 무조건 void
~~~
@Test
void basicTest(){
  System.out.println("Execute test");
  assertEquals(1, 1);  // 예상값(1)과 실제값(1)
}
~~~
- test의 결과를 성공과 실패로 구분하기 때문에 return 값이 필요 없어 void로 선언
---
## 정리: @Test의 역할
- test 메서드임을 알려줌
- 해당하는 메서드의 return type을 void로 강제
    - 성공, 실패라고 해서 boolean으로 선언하면 error
---
## 단언(Assert) 메서드
- test case의 실행 결과를 판별해주는 메서드
- 주요 단언 메서드
    - assertEquals(기대값, 실제값) : 실제값이 기대값과 같은 지 검사, 같으면 success, 다르면 fail로 종료
    - fail() : test를 강제로 실패 시키고자 할 때 사용
    - assertThrow() : exception 발생 유무 검증이 필요한 경우 사용, 어떤 Exception이 발생했는지까지 판단해줌
---
## 테스트 라이프 사이클
- @BeforeAll : 모든 테스트 코드가 수행되기 전에 최초로 수행되는 메서드
    - 주의) static 메서드로 선언해야 함
- @BeforeEach :  각각의 테스트 코드가 실행되기 전에 수행되는 메서드
    - 테스트를 실행하는데 필요한 준비 작업을 할 때 사용한다고 생각
- @Test : 실제 테스트가 필요한 메서드 또는 테스트 코드가 여기서 실행, 의도했던 테스트 결과가 나오는지 확인
- @AfterEach : 각각의 테스트 코드가 실행된 후에 수행되는 메서드
    - 테스트 종료 후 정리할 것이 있을 때 사용한다고 생각
- @AfterAll : 모든 테스트 코드가 수행된 후 마지막으로 수행되는 메서드
    - 테스트 환경에 부가적으로 필요했던 인스턴스의 return이나 종료 등을 여기에서 수행
    - 주의) static 메서드로 선언해야 함
---
## 총 정리
- 테스트 코드는 무조건 독립성을 가져야 함
- 다른 테스트 메서드에 의존해서는 안됨
