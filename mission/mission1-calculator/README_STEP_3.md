# STEP3
---
### 기능 요구사항
- [ ] 쉼표, 콜론으로 구분자를 가지는 문자열을 전달
- [ ] 구분자를 기준으로 분리한 각 숫자의 합을 반환
- [ ] 기본 구분자 외에 커스텀 구분지를 지정할 수 없음
- [ ] 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 함
---
### 메서드 구현
- [x] 구분자별로 메서드(public)
- [x] 구분자 추출 메서드(private)
- [x] 숫자 추출 메서드(private)
- [x] 기본 구분자 메서드(private)
- [x] 구분자로 나누고 합 계산 메서드(private)
- [ ] 예외처리 메서드
---
### REVIW

---
###  공부내용
1. 구분자를 통해 받을 수 있는 방법 
   - useDelimiter(특정문자): 기준을 둬서 입력받는다.
   - split(특정문자): 입력을 받은 후 기준을 나눈다.
2. 리스트 변환 메서드
   - Arrays.stream(): 배열을 스트림으로 변환한다. 각 요소에 연산을 수행 할 수 있음
   - map(변환할 값::변환 변수): 변환할 값을 변환 변수로 변경
   - collect(Collect.toList()): 결과를 리스트로 수집
   - Arrays.asList(): 배열을 고정된 크기의 리스트로 변환
3. 자바 스트림(Stream)
   - 원본 데이터는 변하지 않음
   - 일회용이 불가하고 재사용 불가능
   - 최종 연산 전까지 중간 연산을 실행하지 않음
   - 쓰는 절차 및 방법
   - 1. 스트림 만들기
         - Arrays.stream(문장): 배열 스트림
         - .stream: 컬렉션 스트림
   - 2. 중간 연산(가공하기)
         - Filtering: 스트림 내 요소들을 하나씩 평가해서 걸러내기(if문) .filter
         - Mappng: 스트림 내 요소들을 하나씩 특정 값으로 변환 시킴 .map
         - Sorting: 스트림 내 요소들을 정렬
         - 기타연산: 중복제거(.distinct()), 최대 크기 제한(.limit(max)), 앞에서 n개 스킵하기(.skip(n)), 중간 작업 결과 확인(.peek(System.out::println))
   - 3. 최종 연산(결과 만들기)
        - 1. Calculating
                - .count(): 스트림 요소 개수 반환
                - .sum(): 스트림 요소 합 반환
                - .min(): 스트림 최소값 반환
                - .max(): 스트림의 최대값 반환
                - .average(): 스트림 요소 평균 반환
        - 2. 기타
                - Reduction: 스트림 요소를 하나씩 줄여가며 누적연산 수행
                - Collecting: 스트림 요소를 원하는 자료형
                - Matching: 특정 조건을 만족하는 요소가 있는지 체크한 결과를 반환
                - lterating: forEach로 스트림을 돌면서 실행되는 작업
                - Finding: 스트림에서 하나의 요소를 반환
4. 특정 문자열 클래스 메서드
   - indexof(): 문자열에서 주어진 문자열의 위치를 반환
   - substring(int index): index 위치에서 끝까지 자른 새로운 문자열 반환
   - substring(int beginIndex, int endIndex): beginIndex에서 endIndex전까지 잘라낸 문자열 반환
5. 정규표현식
    - Pattern Class: 정규식을 기반으로 문자열에 대한 검증을 수행 (Pattern.quote([;,]): ";"와 "," 를 반환)
    - Matcher Class: 문자열 내에 일치하는 문자열을 확인하기 위해 "정규식"을 이용하고 존재여부 반환
    - replaceAll Class: 문자를 제거 혹은 대체하기 위해 정규식을 이용하여 찾고 치환을 해주는 함수
6. RuntimeException: Unchecked에 속함
    -
7. type 확인 방법
    - instanceof 연산자: 왼쪽에 있는 객체가 오른쪽에 있는 인스턴스인지 확인
    - getClass() 메서드: 비슷하지만 정확한 클래스 반환
    - Type 연산자: 원시타입으로 알 수 있다.