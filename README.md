### 📆 FastCampus Project Board Admin

> 이 프로젝트는 FastCampus의 게시판 구현 강의 이후 이어지는 고급 과정인 **어드민 게시판** \
> **확장 강의**를 기반으로, 직접 구현하며 학습한 실습형 클론 프로젝트입니다.  
> 실무에 가까운 게시판 시스템에 관리자 기능을 확장하며, Spring Security, 사용자 인증/인가, \
> 운영자/관리자 계정 제어, 대시보드 설계 등 실전 개발 역량을 강화하는 데 목표가 있습니다.

<br/>

### 주요 기능

- **관리자 전용 페이지 구현**
- 관리자 전용 인증 및 로그인 처리
- 회원 관리 (조회, 정지 처리 등)
- 게시글 관리 (게시글 목록/검색/삭제)
- REST API 기반 백오피스 구성
- 관리자를 위한 대시보드 View
- Spring Security 기반 역할(Role) 기반 권한 제어
- 테스트 및 REST Docs 문서화

<br/>

### 기술 스택

| 구분 | 기술 |
|------|------|
| Language | Java 17 |
| Framework | Spring Boot 3.x |
| ORM | Spring Data JPA, QueryDSL |
| Database | H2 (개발용), MySQL |
| Build Tool | Gradle |
| 인증/보안 | Spring Security |
| View | Thymeleaf |
| 문서화 | Spring REST Docs |
| Test | JUnit 5, Mockito |
| IDE | IntelliJ IDEA |

<br/>

### 프로젝트 구조

```
src
├── main
|   ├── java/com/fastcampus/projectboardadmin
|   |   ├── config
|   |   ├── controller
|   |   ├── domain
|   |   ├── dto
|   |   ├── repository
|   |   └── service
|   └── resources
|       ├── static
|       |   ├── css
|       |   ├── images
|       |   └── js
|       └── templates
|           ├── admin
|           ├── layouts
|           └── management
└── test/java/com/fastcampus/projectboardadmin
    ├── config
    ├── controller
    ├── dto/security
    ├── repository
    └── service
```

<br/>

### 관리자 권한 관리

- 일반 사용자와 관리자 계정을 구분하여 로그인
- `ROLE_ADMIN`, `ROLE_USER` 등 권한 기반 접근 제어
- Spring Security의 다중 SecurityConfig를 활용해 `/admin/**` 경로를 분리 관리
- 관리자 전용 페이지는 로그인 후 접근 가능

<br/>

### 데모 페이지

- https://project-board-admin.herokuapp.com/
  
<br/>

### 학습 포인트

* Spring Security 다중 설정을 통한 관리자/일반 사용자 인증 분리
* Thymeleaf와 Spring MVC를 활용한 어드민 UI 구성
* 게시판 운영 로직의 관리자 제어 방식 이해
* 도메인/계층 분리를 통한 서비스 아키텍처 확장
* REST Docs를 통한 API 문서화 경험
* 보안 강화 및 권한 제어 로직 설계

</br>

#### 🙋‍♀️ 만든 사람

- 👩‍💻 이름: 양수영 (Yang Sooyoung)
- 🔗 GitHub: [@Yang-Sooyoung](https://github.com/Yang-Sooyoung)

<br/>

