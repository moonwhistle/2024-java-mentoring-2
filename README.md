# 2024 자바 멘토링 미션 안내
---
# 목표
* 클린코드 학습
* MVC 학습
* 객체지향 익숙해지기와 도메인 설계 배우기
* 원시 값 포장 / 일급 컬렉션 / 정적 팩토리 배우기
* dto 사용해보기

---
## 1. 설명
* 미션 시작시 Fork 및 클론을 한 후 [미션명/step1, 미션명/step2] 라는 브랜치 명으로 단계 별로 미션을 진행합니다.
* 단계 별 완료 후 moonwhistle/2024-java-mentoring 레포지토리에 자신 깃허브 id에 해당하는 곳으로 pr을 올립니다.
* 미션 순서는 calculation -> racing -> lotto 순서입니다.

---

## 2. 규칙
* 미션 별로 생성 및 기능 구현 목록과 고민한 점에 대해 작성해서 제출해주세요.
* setter를 지양해주세요.
* 인덴트 2가 넘어가지 않도록 해주세요.
* 가급적 가능한 모든 메서드에 대해 테스트를 진행해주세요.
* 메서드의 기능 단위를 최대한 작게 유지해주세요.
* 불필요한 dependency 추가는 지양해주세요.
* 구글링은 좋으나 gpt는 가급적 사용하지 말아주세요.
* 자신이 작성한 코드가 어떤 역할을 하는지 최대한 이해하면서 미션을 진행해주세요.
* 미션 제출 전 불필요한 import, 주석을 모두 제거하고 정렬한 후 제출 해주세요.

---
## 3. 미션
* 각 미션에 대한 설명은 해당 미션 디렉토리에 README.md 파일을 만들어두었습니다. 참고하여 미션 진행해주세요!
---
## 참고사항

- 최대한 객체지향적으로 생각해본다 (리뷰 후 수정)
- 모든 도메인 로직은 테스트를 한다.
- 깃을 공부해서 다음 단계로 넘어갈때 upstream 방식을 공부해본다.
- 각 미션마다 리뷰 받은 내용들을 공부해서 정리를 한다.
- 자바 셋팅을 해본다.
- 구현 목록을 마크다운에 정리해서 적용한다.
- 컨벤션을 꼭 지킨다
- 와일드카드 사용을 지양한다.

[객체지향생활체조](https://jamie95.tistory.com/99)

[github업스트림](https://yeopseung.tistory.com/165)

[github](https://yeopseung.tistory.com/140)





- https://github.com/moonwhistle/2024-java-mentoring-2  << upstream이 될 레포지토리 입니다.
- URL 접속 후
- ![스크린샷 2024-09-23 오전 10.32.56.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fm4%2Fn9zxyvgx4lx03pl_7nrbhpyr0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_G2nbee%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202024-09-23%20%EC%98%A4%EC%A0%84%2010.32.56.png)
- 포크를 따옵니다.
- ![스크린샷 2024-09-23 오전 10.33.31.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fm4%2Fn9zxyvgx4lx03pl_7nrbhpyr0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_ot2wQT%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202024-09-23%20%EC%98%A4%EC%A0%84%2010.33.31.png)
- 포크를 따오게 되면 본인의 레포지토리에 레포지토리가 생깁니다 이것이 미션을 진행 할 레포지토리 입니다.
- ![스크린샷 2024-09-23 오전 10.34.35.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fm4%2Fn9zxyvgx4lx03pl_7nrbhpyr0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_y6sj0b%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202024-09-23%20%EC%98%A4%EC%A0%84%2010.34.35.png)
- 본인의 레포지토리를 들어간 후 code를 눌러 주소를 복사합니다. (최종 레포지토리가 아닌 본인의 레포지토리 입니다.)
- 이제 본인의 데스크탑에 code라는 폴더를 만든 후 터미널에서 그 폴더까지 이동합니다.
- ![스크린샷 2024-09-23 오전 10.35.31.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fm4%2Fn9zxyvgx4lx03pl_7nrbhpyr0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_Pdbw8N%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202024-09-23%20%EC%98%A4%EC%A0%84%2010.35.31.png)
- ![스크린샷 2024-09-23 오전 10.35.54.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fm4%2Fn9zxyvgx4lx03pl_7nrbhpyr0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_mThXF2%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202024-09-23%20%EC%98%A4%EC%A0%84%2010.35.54.png)
- git clone 을 진행합니다. (협업을 하게되면 꼭 쓰는 방식)
- intellij를 열어 클론 해온 패키지로 이동합니다.
- ![스크린샷 2024-09-23 오전 10.36.57.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fm4%2Fn9zxyvgx4lx03pl_7nrbhpyr0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_gTFPrk%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202024-09-23%20%EC%98%A4%EC%A0%84%2010.36.57.png)
- ![스크린샷 2024-09-23 오전 10.37.19.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fm4%2Fn9zxyvgx4lx03pl_7nrbhpyr0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_0Vmzdt%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202024-09-23%20%EC%98%A4%EC%A0%84%2010.37.19.png)
- main 브런치가 아닌 새로운 브런치를 만들어서 진행합니다. 컨벤션은 사진과 같습니다.
- main에서 가지를 처오는 방식으로 무조건 자주 써봐야 편합니다.  이제
- ![스크린샷 2024-09-23 오전 10.38.22.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fm4%2Fn9zxyvgx4lx03pl_7nrbhpyr0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_yAeV78%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202024-09-23%20%EC%98%A4%EC%A0%84%2010.38.22.png)
- 천천히 읽으면서 미션을 어떻게 진행해야 할지 고민해봅니다.
- ![스크린샷 2024-09-23 오전 10.38.47.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fm4%2Fn9zxyvgx4lx03pl_7nrbhpyr0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_3v75qt%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202024-09-23%20%EC%98%A4%EC%A0%84%2010.38.47.png)
- 각 미션마다 있는 .md 파일 (마크다운 파일을 보며) 미션을 진행합니다.
- ![스크린샷 2024-09-23 오전 10.40.23.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fm4%2Fn9zxyvgx4lx03pl_7nrbhpyr0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_mLs07a%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202024-09-23%20%EC%98%A4%EC%A0%84%2010.40.23.png)
- 터미널에서 git add Calculator.java를 하던 커밋 창에서 커밋을 합니다. 보통 메서드 하나 당 1 커밋을 권장합니다.
- ![스크린샷 2024-09-23 오전 10.41.12.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fm4%2Fn9zxyvgx4lx03pl_7nrbhpyr0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_KoDKQ4%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202024-09-23%20%EC%98%A4%EC%A0%84%2010.41.12.png)
- 커밋 후 푸쉬를 진행합니다. 커밋 푸쉬하면 저장소로 이동을 하게 되는데
- 최종적으로 미션을 구현완료했을 때 pr을 보냅니다.
- ![스크린샷 2024-09-23 오전 10.42.16.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fm4%2Fn9zxyvgx4lx03pl_7nrbhpyr0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_xcBCuE%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202024-09-23%20%EC%98%A4%EC%A0%84%2010.42.16.png)
- upstream 이라고 설명했 던 레포지토리에 들어가
- ![스크린샷 2024-09-23 오전 10.42.53.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fm4%2Fn9zxyvgx4lx03pl_7nrbhpyr0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_D0GNkK%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202024-09-23%20%EC%98%A4%EC%A0%84%2010.42.53.png)
- base 부분에 자기 이름을 향하게 해서 보내셔야합니다 main에 보내는 것 x
- 그 다음 리뷰를 받습니다. 리뷰 후 리뷰를 반영하고 git commit push 진행하면 pr에 계속해서 쌓여서 머지전 까진 리뷰를 계속해서 달 수 있습니다.
- ![스크린샷 2024-09-23 오전 10.44.42.png](..%2F..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fm4%2Fn9zxyvgx4lx03pl_7nrbhpyr0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_BcHtVQ%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202024-09-23%20%EC%98%A4%EC%A0%84%2010.44.42.png)
- 미션 진행 후 카카오톡으로 이런 식으로 카톡을 보냅니다.
# 머지가 됐다면
[github업스트림](https://yeopseung.tistory.com/165)

