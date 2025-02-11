#### 구분자로 문자열 자르기 -> split()
- 구분자를 사용하여 문자열을 자를 때에는 java.lang.String 클래스의 split() 메소드를 활용
---
## 메소드
- public String[] split(String regex)
- public String[] split(String regex, int limit)
- > 정규식 문자열을 파라메터로 받음
- > 정규식 문자열과 일치하는 부분을 중심으로 문자열을 자름
- > 잘려진 문자열들을 배열로 return

- 콤마+공백으로 문자열 나누기
1. split 할 문자열 준비
   - String str = "apple, banana, orange, grape";
2. ", "를 구분자로 문자열 split
   - String[] strArr = str.split(", ");
3. 결과
   - [apple, banana, orange, grape]

- 공백으로 문자열 나누기
1. split 할 문자열 준비
    - String str = "apple banana orange grape";
2. 공백(\s)을 구분자로 문자열 split
    - String[] strArr = str.split("\\s");
3. 결과
    - [apple, banana, orange, grape]

- split(String regex, int limit)
1. limit > 0 -> 패턴은 (limit - 1)만큼 적용
   - ex) str.split(", ", 4) -> (", ")패턴을 3번 적용
2. limit = 0 -> 패턴은 횟수 제한 없이 모두 적용, 마지막에 빈 문자열이 올 경우 삭제
3. limit < 0 -> 패턴은 횟수 제한 없이 모두 적용, 마지막에 빈 문자열이 올 경우 그대로 유지
