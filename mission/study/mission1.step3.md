# 구현 기능
[] 커스텀 구분자를 찾는 메서드
[] |n까지를 날리는 메서드
[] 구분자를 기준으로 쪼개어 배열에 넣는 메서드
[] 배열을 list로 변환하는 메서드
[] list의 합을 구하는 메서드



# 객체 생성
- 클래스명, 참조 변수명 = new 생성자();  ex) A a = new A();
  생성자는 클래스의 이름과 동일. 위 코드의 경우 A()생성자로 만든 객체를 힙 메모리에 넣고 위치값을 A 타입의 참조 변수 a에 저장하라는 뜻.

# 생성자 주입 코드 예시
- 사용할 의존 객체를 생성자를 통해 주입받는 방식 --> 객체의 불변성 확보와 테스트 코드 작성의 편리함.
예시 코드
@RestController
public class HelloController {

private HelloRepository helloRepository;
private HelloService helloService;

@Autowired
public HelloController(HelloRepository helloRepository, HelloService helloService) {
this.helloRepository = helloRepository;
this.helloService = helloService;
}
}

# 캡슐화
- 객체 내부의 속성이나 행위를 외부에서 직접 접근할 수 없게 하는것. 접근 제어자{ex) public, private 등}를 통해 이루어짐.

# stream
- 자바 스트림
  배열과 컬렉션을 함수형으로 간단하게 처리할 수 있는 기술. 기존의 for문과 lterator을 사용하는 방식은 코드가 길어져 가독성과 재사용성이 떨어짐. 
  스트림은 데이터 소스를 추상화하고 데이터를 다루는데 자주 사용되는 메소드를 정의해 놓아 데이터 소스에 상관없이 모두 같은 방식으로 다룰 수 있으므로 재사용성이 높음.

특징
1. 원본 데이터 소스를 변경X. 읽기만 함
2. 일회용. 한 번 사용하면 재사용 불가.
3. 최종 연산 전까지 중간 연산 수행 X.
4. 작업을 내부 반복으로 처리.
5. 기본형 스트림 제공.


스트림 사용 절차
1. 스트림 만들기
- 배열 스트림: .Arrays.stream())
ex)
String[] arr = new String[]{"a", "b", "c"};
Stream<String> stream = Arrays.stream(arr);

- 컬렉션 스트림 : .stream();
ex)
List<String> list = Arrays.asList("a","b","c");
Stream<String> stream = list.stream();

2. 중간 연산
- Filtering: 스트림 내 요소들을 하나씩 평가해서 걸러내는 작업, if문 역할

- Mapping: 스트림 내 요소들을 하나씩 특정 값으로 변환하는 작업, 값을 변환하기 위한 람다를 인자로 받음. 스트림을 원하는 새로운 모양의 스트림으로 변환하고 싶을 때 사용.
           스트림에 있는 값을 원하는 메소드에 입력값으로 넣으면 메소드 실행 결과(반환 값)가 담김

- Sorting: 스트림 내 요소들을 정력하는 작업 COmparator 사용

3. 최종 연산
- Calculatin: 기본형 타입을 사용하는 경우 스트림 내 요소들로 최소, 최대, 합, 평균 등을 구하는 연산을 수행

- Reduction: 스트림의 요소를 하나씩 줄여가며 누적연산을 수행

- Collecting: 스트림의 요소를 원하는 자료형으로 변환-->tolist()이용시 리스트로 반환

- Matching: 특정 조건을 만족하는 요소가 있는지 체크한 결과를 반환

- lterating: forEach로 스트림을 돌면서 실행되는 작업

- Finding: 스트림에서 하나의 요소를 반환

# 기타
- contains를 사용해 list 안에 포함여부를 확인할때는 타입 맞추기
- 


