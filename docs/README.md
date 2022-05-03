# 지하철 노선도 미션
스프링 과정 실습을 위한 지하철 노선도 애플리케이션

---

## 기능 요구사항 목록

### 지하철 역 관리

- 지하철역 등록
  - [ ] 지하철역 생성 시 이미 등록된 이름으로 요창한다면 에러를 응답


### 노선 관리

- 노선 등록
  - [ ] 노선 생성 시 이미 등록된 이름으로 요청한다면 에러를 응답

- 노선 조회

- 노선 수정

- 노선 삭제

---

## 프로그래밍 요구 사항

- End To End 테스트를 작성한다.
- @Service, @Component 등 스프링 빈 사용 금지
- DB를 사용하지 않고 Dao 객체 내부의 List에서 데이터를 관