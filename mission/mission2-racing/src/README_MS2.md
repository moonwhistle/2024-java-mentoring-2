## 💡 배운 점

### try-catch vs if 에러처리
- **try-catch**
  - 코드 실행 중 예상치 못한 에러가 발생해도 프로그램이 즉시 종료되지 않고 처리 가능
  - 구체적인 예외처리 가능
  - 에러가 발생할 가능성이 있는 코드를 명확하게 구분하므로 코드 가독성 증가
  - 에러 발생 시 스택 추적이 발생하여 성능에 영향 가능성 존재
- **if**
  - 입력값 확인 및 논리 조건 체크에 유용
  - try-catch에 비해 스택 추적을 사용하지 않아 성능면에서 유리
  - if 문 만으로 처리 불가능한 예외 상황이 존재
- **결론**
  - 상황에 맞게 알잘딱하게 써라

### parseStringTryCount 클래스에서는  어떻게 에러처리를 할까?
- parseStringTryCount 클래스는 사용자에게 받은 string 타입의 number 값을 number 형태로 parse하는 클래스다.
- 이 과정으로 발생 가능한 에러는 NumberFormatException e(런타입 에러) 자바스크립트의 NaN 타입 에러와 같다.
- 에러처리를 위해 if(match.regex) 를 통해 예외 발생 가능성을 줄일 수 있으나, 실제로 에러를 반환하지는 못한다.
- 즉 try-catch를 사용하여 에러를 처리해야 함.

### interface를 활용한 다형성 확보
- interface를 사용하면 여러 클래스가 동일한 메서드를 각자의 방식으로 구현 가능하다.
```java
// 기존 코드
public int getRandomNumber(){
    return (int) (Math.random() * 10); 
}
```
```java
// interface 적용한 경우
public interface RandomNumberGenerator {
  int getRandomNumber();
}

public class GetZeroToNineRandomNumber implements RandomNumberGenerator{
  @Override
  public int getRandomNumber(){
    return (int) (Math.random() * 10);
  }
}
```
- **왜 interface를 사용하는걸까?**
  - interface는 껍데기다. 프로그램에게 interface를 통해 getRandomNumber() 메서드의 존재를 알게 한다.
  - 실제 구현 클래스 GetZeroToNineRandomNumber를 통해 getRandomNumber() 메서드를 작성한다.
  - 만약 제작 중에 다양한 경우의 난수를 출력해야하는 경우에 @Override를 통해 여러 클래스의 객체를 작성할 수 있다.
  - 즉, **다형성**을 통해 RandomNumberGenerator interface 타입으로 여러 클래스의 객체를 사용 가능해진다.
  - **다형성**은 같은 타입의 객체가 다양한 형태로 동작할 수 있게 하는 특성을 의미한다.

### 중첩 클래스에서 static 키워드의 활용
- static으로 선언된 클래스 멤버(필드, 메서드, 중첩 클래스 등..)은 인스턴스가 아닌 클래스 자체에 속하게 된다.
- 즉, 인스턴스를 정의하지 않고 직접 접근이 가능해진다.
- 독립적인 기능을 수행하는 클래스를 외부 클래스 안에 논리적으로 묶어 둘 때 유용