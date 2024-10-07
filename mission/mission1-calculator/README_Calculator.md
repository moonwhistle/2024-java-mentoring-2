# Mission1 계산기 구현 

---
## review
#### step1
- [x] 나눗셈과 곱셈에 예외처리하기(숫자 0같은 경우)
  * try-catch 문법을 사용하려 했으나 reassigned variable 이라는 또다른 문제점이 발생해 if으로 대체

- [x] view 패키지와 domain 패키지에서 예외처리는 어떤 점이 다른지 알아보기
  * view 패키지에서 예외처리를 한다면, 입력받는 값에서 0을 제외하는 것이고, <br>
    domain 패키지에서 예외처리를 한다면, 입력받은 값은 0이 될 수 있지만 계산에서는 0이 제외되는 것!

- [x] 적절한 네이밍 선택
  * a와 b같은 변수 이름 대신 변수의 의미에 맞춰 선택 ex) a, b -> firstNumber, secondNumber

- [x] 네이밍에서 약어 사용금지임을 다시 한 번 숙지하기 (클린코드 관점)
  * ex) sc -> scanner

- [x] 개행 추가
  * 메서드 사이, 클래스 등 각 단위가 끝나는 부분에는 개행을 추가해 가독성을 높임!

- [x] 적절한 주입방식 선택
  * 필드 주입은 불변성을 보장할 수 없고 지연 주입에 의해 필드를 수정하게 되면 객체도 수정해야하는 문제점이 발생하고,<br>
    수정자 주입은 객체가 변경될 가능성이 있을 때 사용하게되는데 현재 가능성이 없고 에러가 발생할 확률이 높아<br>
    객체의 불변성도 확보하며 테스트 용이성이 높은 생성자 주입방식을 선택!

- [x] 생성자, 필드, 수정자 의 주입방식들에 대해 알아보고 장단점 파악하기
  * 아래 Acquire를 참고하기

- [x] private, public, private final 차이점이 무앗이고,불면선언의 장점은 무엇인지 알아보기

#### step2

---
### Acquire 
#### 1. 에외처리 문법 try-catch(-finally)
```j
try {
    // 예외가 발생할 가능성이 있는 코드
} catch (ExceptionType1 e1) {
    // ExceptionType1 예외가 발생했을 경우 실행할 코드
} catch (ExceptionType2 e2) {
    // ExceptionType2 예외가 발생했을 경우 실행할 코드
} finally {
    // 예외 발생 여부와 상관없이 항상 실행
}
```
- various ExceptionType: <br> 
  * ArithmeticException 정수를 0으로 나눌경우 발생<br>
  * ArrayIndexOutOfBoundsExcetion 배열의 범위를 벗어난 index를 접근할 시 발생 <br>
  * ClassCastExcetion 변환할 수 없는 타입으로 객체를 반환 시 발생 <br>
  * NullPointException 존재하지 않는 레퍼런스를 참조할때 발생 <br>
  * IllegalArgumentException 잘못된 인자를 전달 할 때 발생 <br>
  * IOException	입출력 동작 실패 또는 인터럽트 시 발생 <br>
  * OutOfMemoryException 메모리가 부족한 경우 발생 <br>
  * NumberFormatException 문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환시 발생 <br>

- throw를 통해 강제로 에러를 만들어내는 경우도 있다.
#### 2. 의존성 주입
- Constructor Injection(생성자 주입)
  * 강한 의존성 보장: 객체가 생성될 때 필요한 의존성이 반드시 주입되도록 보장한다.
  * 불변성: 의존성 필드를 'final'로 선언할 수 있어 객체의 상태가 불변임을 보장할 수 있다.
  * 테스트 용이성: 주입된 의존성을 쉽게 모킹할 수 있어 단위 테스트가 편하다.

- Field Injection(필드 주입)
  * 유연성: 객체 생성 후에도 의존성을 주입할 수 있어 더 유연하다.
  * 지연 주입: 의존성이 필요한 시점에 주입할 수 있다.
  * 선택적 의존성: 필수적이지 않은 의존성을 선택적으로 주입할 수 있다.
  * 단점: 
    + 사용하면 편리하고 코드가 간결하다는 장점이 있지만, 필드 주입으로 객체를 주입하면 외부에서 수정이 불가능하고, 이러한 이유 때문에 테스트 코드를 작성할 때 객체를 수정할 수 없게 됨.
    + 반드시 Spring 같은 DI를 지원하는 프레임워크가 있어야 사용 가능하다.
    + @Autowired 어노테이션으로 의존성 주입을 남발할 수 있다.

- Setter Injection(수정자 주입)
  * 유연성: 객체 생성 후에도 의존성을 주입할 수 있어 더 유연하다.
  * 지연 주입: 의존성이 필요한 시점에 주입할 수 있다.
  * 선택적 의존성: 필수적이지 않은 의존성을 선택적으로 주입할 수 있다.
  * 단점: 
    + public으로 구현하기 때문에, 관계를 주입받는 객체의 변경 가능성을 열어두는데, 이런 이유 때문에, 수정자 주입 방식은 주입받는 객체가 변경될 필요성이 있을 때만 사용해야 한다.
    + 변경의 가능성을 열어두면, 다른 곳에서 임의로 객체를 변경할 수 있기 때문에 에러가 발생할 위험이 높다.

- Interface Injection(인터페이스 주입)
  * 복잡성: 주입을 위한 인터페이스를 별도로 정의해야 하므로 코드의 복잡성이 올라간다.
  * 유연성: 인터페이스를 통해 의존성을 주입받기 때문에 유연한 설계가 가능하다.

#### 3. 상수처리
- 프로그램에서 변하지 않고 고정된 값인 경우 상수를 선언하여 사용해준다.
- 아래 예문에서는 상수값을 final과 static을 이용해 상수 선언을 하였다. <br>
  final은 변수의 값이 변하지 않고, static은 새로운 메모리에 할당하지 않고 한 메모리에 계속 재사용하겠다는 의미이다.
```j
private static final int EXCEPTION_ZERO = 0;
private static final String EXCEPTION_STRING = "0은예외처리";
```
- 에러가 난 경우 에러코드/에러메시지를 보여줄 때, 프로그램의 기본적인 환경설정정보(DB정보, IP주소정보 등)를 설정할 때, 기독성을 높일 때 사용한다.

#### 4. 강제 예외 처리 throw
- throw는 예외를 강제로 발생시켜주는 선언문이다.
- 아래 예문에서는 new로 예외처리 오브젝트를 생성해 예외를 강제로 발생시켰다. 이후 상수화된 에러문장을 출력하는 것으로 예외를 처리하였다.
```j
throw new RuntimeException(EXCEPTION_STRING);
```
- try-catch와 throws의 차이:
  * try~catch는 발생한 예외를 처리한다. throws는 예외처리가 발생한 메소드를 호출한 메소드에게 예외를 처리한다(=예외를 떠넘긴다.)
  * try~catch는 예외 발생한 이후의 코드를 실행할 수 있지만, throws는 예외 발생 이후의 코드를 실행하지 않는다.

#### 5. Junit5
- 메서드 위에 @Test 어노테이션을 추가해 함수를 테스트 함수로 변환한다.
- Assertions: 결과값 리턴 여부 확인, 에러 발생 여부 확인하는 메서드
  * Assertions.asserAll(                   <br>
        () -> //assert메서드1(), <br>
        () -> //assert메서드2(), <br>
              (생략)             <br>
    ); :여러 개의 assert를 실행하고 중간에 실패하더라도 모든 결과를 확인
  * assertTrue(boolean condition) : 조건이 성공하면 True
  * assertFalse(boolean condition) : 조건이 실패하면 False
  * assertNull(Object actual) :조건이 Null이면 True
  * assertNotNull(Obejct actual) : 조건이 Not Null 이면 True
  * assertEquals(expected, actual) : expected와 actual이 동일하면 True 
  * assertNotEquals(unexpected, actual) : expected와 actual이 다르면 True
  * assertSame(Object expected, Object actual) : 동일한 object면 True
  * assertNotSame(Object unexpected, Object actual) : 다른 object먄 True
  * assertThrows(발생이 예상되는 에러의 class, 에러가 발생해야하는 로직) : 예상한 에러가 발생하면 True
  * assertTimeout() : 테스트가 지정한 시간보다 오래 걸리지 않으면 True <br>
    (지정한 시간보다 오래 걸려도 테스트가 끝날 때까지 대기)
  * assertTimeoutPreemptively() : 테스트가 지정한 시간보다 오래 걸리지 않으면 True <br>
    (지정한 시간보다 오래 걸린 경우 바로 테스트 종류)
  * fail() : 테스트를 실패 처리한다.
- Assumptions: 조건을 만족할 경우 진행, 아니라면 스킵하는 메서드(if와 같은 느낌!)
  * assumeTrue() : 테스트가 실패하면 에러 발생
  * assumeFalse(): 테스트가 성공하면 에러 발생
  * assumingThat(boolean, executable) : 첫번째 인자가 True면 두 번째 인자로 들어온 함수 실행

--- 
### ETC
- README 파일은 새로운 file을 생성 후, .md를 붙여준다.
- 리드미에서 줄바꿈을 하고 싶다면 <br>을 앞에 붙여준다.
- scanner로 사용자에게 입력받을 떄 흔히 발생하는 공백은 .nextLine()을 통해 없애준다.
- POSIX 표준은 텍스트 파일을 "하나 이상의 줄"로 정의하며, 각 줄은 개행 문자로 끝나야 한다고 명시하고 있다.
  * Setting(설정) -> Editor(에디터) -> General(일반) -> Ensure every saved file ends with a line break 체크해줌으로써 파일 저장마다 자동 개행 처리로 해결했다.
- ctrl + / 로 한 번에 주석처리한다.
- 와일드 카드는 지양한다 -> 컴파일 시행시 시간이 오래 걸리기 때문이다.
