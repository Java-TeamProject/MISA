# 📖 삼육대 4학년 예비 졸업생 키우기!
![001](https://github.com/Java-TeamProject/MISA/assets/106863692/cf2e04d2-3b71-423f-9603-cc2c6e216096)

<br>

## 프로젝트 소개

- 삼육대학교 4학년 2학기를 보낼 예정인 예비 졸업생을 대상으로 졸업을 향한 학생 키우기 게임입니다!
- 게임 시간 기준으로 14일 동안 진행되며 1일 안에 아침 시간, 오전 수업, 점심 시간, 오후 수업, 오후 수업 후 시간으로 나누어 진행됩니다.
- 각 시간별 고정으로 지정된 이벤트들이 있고, 고정 이벤트를 진행하다 지정되어있는 확률로 갑작스러운 돌발 이벤트가 발생됩니다.
- 이벤트를 진행하며 상황에 따라 인망, 체력, 지능 변수에 수치 변화가 진행되어 최종 엔딩에 반영됩니다.
- 14일간 진행되며 쌓인 최종 수치에 따라 최종 엔딩이 결정되어 졸업하게 됩니다! 

<br>

## 팀원 구성

<div align="center">

| **김상익** | **이수빈** | **이재혁** | **배민서** | **오송은** |
| :------: |  :------: | :------: | :------: |:------: |
|[<img src="https://github.com/Java-TeamProject/MISA/assets/106863692/83587648-9e28-4b27-88c6-f5b797b161e3" width="150" height="150"/><br/> @joy:)](https://github.com/sb-77) | [<img src="https://github.com/Java-TeamProject/MISA/assets/106863692/70af628a-2e87-42ed-a4b4-dd95d6e9c490" height=150 width=150> <br/> @GTU9](https://github.com/GTU9) | [<img src="https://github.com/Java-TeamProject/MISA/assets/135615995/cf018c8a-408c-48ae-b9ef-43e297affcf8" width="150" height="150"/> <br/> @ohdyo](https://github.com/ohdyo) | [<img src="https://github.com/Java-TeamProject/MISA/assets/106863692/efcbf343-fa03-4115-880e-07f32cfc87bb" height=150 width=150> <br/> @Baeminseo](https://github.com/Baeminseo) |[<img src="https://github.com/Java-TeamProject/MISA/assets/106863692/c67336ee-7883-400d-9368-18f69594add9" width="150" height="150"/><br/> @ddoddo1228](https://github.com/ddoddo1228)

</div>

<br>

## 1. 개발 환경
![Number of GitHub contributors](https://img.shields.io/github/contributors/Java-TeamProject/MISA)
[![Number of GitHub issues that are open](https://img.shields.io/github/issues/ToolJet/ToolJet)](https://github.com/Java-TeamProject/MISA/issues)
![Number of GitHub closed issues](https://img.shields.io/github/issues-closed/Java-TeamProject/MISA)
![Number of GitHub pull requests that are open](https://img.shields.io/github/issues-pr-raw/Java-TeamProject/MISA)
![GitHub release; latest by date](https://img.shields.io/github/v/release/Java-TeamProject/MISA)
![GitHub commit activity](https://img.shields.io/github/commit-activity/m/Java-TeamProject/MISA)


![004](https://github.com/Java-TeamProject/MISA/assets/106863692/9aa89b66-62a6-46a0-b3a5-9e095de2fa88)


- Back-end : IntelliJ IDEA, 아스키코드
- 버전 및 이슈관리 : Github, Github Issues, Github Project
- 협업 툴 : Discord, Notion, Github


<br>

## 2. 채택한 개발 기술과 브랜치 전략

### 자바 콘솔

- 자바 언어를 이용하여 제어문(반복문, 조건문)을 통해 콘솔에서 입력받고 실행하도록 설정했습니다.

<br>

### 브랜치 전략

- main, develop 브랜치와 feature 보조 브랜치를 운용했습니다.
- main, develop 브랜치로 나누어 개발을 하였습니다.
    - **main** 브랜치는 배포 단계에서만 사용하는 브랜치입니다.
    - **develop** 브랜치는 main 브랜치에 merge 하기 전 테스트 용으로 사용하는 브랜치입니다.
    - **feature** 브랜치는 각자의 이름 이니셜과 맡은 파트를 함께 작성하여 생성해서 자기 브랜치 커밋용으로 만들었습니다.

<br>

## 3. 프로젝트 구조

```
MISA
├── .github
├── .idea
├── gradle
├── out
└── src
     └── main
          └── java
               └── com
                    └── SYproject
                            └── After_EndingASCIICodeArt
                            └── AfterFix
                            └── AfternoonClass
                            └── AfterSuddenEvent
                            └── Application 
                            └── Ending
                            └── EventTxt
                            └── LunchTimeEvent
                            └── Morning
                            └── RandomEvent
                            └── Start
                            └── Student
```

<br>

## 4. 역할 분담

![005](https://github.com/Java-TeamProject/MISA/assets/106863692/351a1b3e-d9ec-4b32-9d00-95084f354306)

### 😼 이재혁

- **기능**
    - 오전 고정, 돌발, 출발 이벤트, 오후 수업 클래스 병합, 수치 조정 테스트

    
### 🐰 오송은

- **기능**
    - 프롤로그, 오전 수업 고정, 돌발이벤트


### 🦒 이수빈

- **기능**
    - 점심 시간 고정, 돌발 이벤트, 오후 수업 고정, 돌발 이벤트


### 🐹 배민서

- **기능**
    - 오후 고정 이벤트 오후 돌발이벤트 병합


### 🐶 김상익

- **기능**
    - 오후 돌발 이벤트, 엔딩, 수치 조정 테스트, 아스키코드
    
<br>

## 5. 개발 기간 및 작업 관리

### 개발 기간

- 전체 개발 기간 : 2024-3-20 ~ 2024-3-26
- 기능 구현 : 2024-3-21 ~ 2024-3-26

<br>

### 작업 관리

- GitHub Projects와 Issues를 사용하여 진행 상황을 공유했습니다.
- 2일에 한번씩 회의를 진행하며 작업 순서와 방향성에 대한 고민을 나누고 노션에 회의 내용을 기록했습니다.

<br>

## 6. 시간별 기능

### [프롤로그]
- 1.1 게임에 대한 간단한 소개와 문구를 출력합니다.
- 1.2 캐릭터의 상황, 배경 그리고 사용자가 목표 방향성 간단하게 제시합니다.
- 1.3 캐릭터의 이름을 사용자가 설정하는 기능합니다.

<br>

### [아침 시간]
- 2.1 첫번째 고정이벤트 시작합니다.
- 2.2 하루가 끝나면, 아침 기상 이벤트로 다시 돌아와 다음 하루 시작합니다.
- 2.3 돌발이벤트 발생합니다.

<br>

### [오전 수업]
- 3.1 아침기상 이벤트 다음 함수 이벤트로 지능 얻습니다.
- 3.2 간단한 미니 게임을 통해 결과에 따라 얻을 수 있는 지능 수치를 얻습니다.
- 3.3 돌발이벤트 발생합니다.

<br>

### [점심시간]
- 4.1 고정 이벤트를 발생합니다.
- 4.2 돌발 이벤트 발생합니다. 
- 4.3 히든 이벤트를 발생하여 비밀 능력치를 높입니다.

<br>

### [오후 수업]
- 5.1 고정 이벤트를 발생합니다.
- 5.2 지능 수치를 얻습니다.
- 5.3 돌발 이벤트를 발생합니다.

<br>

### [하교 후]
- 6.1 다른 고정 이벤트와는 차별점을 갖고 발생합니다.
- 6.2 하교 후에는 많은 시간을 쓸 수 있기 때문에 네번의 같은 고정 이벤트를 사용합니다.
- 6.3 돌발 이벤트를 발생합니다.

<br>

### [하교 후]
- 7.1 함수 이벤트로 14일차가 종료되었을 때, 엔딩이벤트로 넘어갑니다.
- 7.2 엔딩 이벤트는 지금까지의 능력치를 기반해 알맞은 엔딩을 출력합니다. (4가지)

<br>

## 7. 프로젝트 후기

### 😼 이재혁

깃헙을 통한 협업에 익숙해지는 것, 서로 감정 상하지 않고 무사히 마무리하는 것이 1차적인 목표였어서 항상 이 부분을 명심하면서 작업했습니다.
각자 페이지를 작업하고 합치는 과정에서 마주친 버그들이 몇 있었는데, 시간에 쫓기느라 해결하기에 급급해서 제대로 트러블슈팅 과정을 기록하지 못한 게 살짝 아쉬운 부분으로 남습니다. 그래도 2022년 한 해 동안 가장 치열하게 살았던 한 달인 것 같습니다. 조원들 모두에게 고생했다고 전하고 싶습니다🧡

<br>

### 🐰 오송은

여러모로 많은 것들을 배울 수 있었던 한 달이었습니다. 혼자서는 할 수 없었던 일이라는 것을 너무 잘 알기에 팀원들에게 정말 감사하다는 말 전하고 싶습니다. 개인적으로 아쉬웠던 부분은 기한 내에 기능을 구현하는 데에만 집중하면서 트러블 슈팅이나 새로 배웠던 것들을 체계적으로 기록하지 못했다는 점입니다. 이렇게 느낀 바가 있으니 이후의 제가 잘 정리하면서 개발할 거라 믿습니다… 하하 다들 수고하셨습니다!!!!

<br>

### 🦒 이수빈

팀 프로젝트 시작에 앞서 초기 설정을 진행하며 체계적인 설계의 중요성을 느꼈습니다. 앞으로는 점점 더 체계적이고 효율적으로 프로젝트를 진행할 수 있도록 발전하고 싶습니다.
정규 수업 직후에 프로젝트를 진행하면서 배운 내용을 직접 구현하는 과정이 어색했지만 어떤 부분이 부족한지 알 수 있는 기회였습니다. 스스로 최대한 노력해보고 팀원들과 함께 해결해 나가면서 협업의 장점을 체감할 수 있었습니다. 하지만 빠르게 작업을 진행하면서 팀원들과 함께 해결한 이슈가 어떤 이슈이며 어떻게 해결했는지에 대해 자세히 작성하지 못한 것이 아쉽습니다.
’멋쟁이 사자처럼’이라는 같은 목표를 가진 집단에서 프로젝트에 함께할 수 있는 소중한 경험이었습니다. 함께 고생한 조원들 모두 고생하셨습니다! 앞으로도 화이팅해서 함께 목표를 이뤄가고 싶습니다.

<br>

### 🐹 배민서

컨벤션을 정하는 것부터 Readme 파일 작성까지 전 과정을 진행하려니 처음 생각보다 많은 에너지를 썼어요. 좋은 의미로 많이 썼다기보다, 제 능력을 십분 발휘하지 못해서 아쉬움이 남는 쪽입니다. 개발한다고 개발만 해서는 안 된다는 것을 몸소 느껴보는 기간이었던 것 같습니다. 이번 기회로 프로젝트를 진행하면서, 제가 잘하는 점과 부족한 점을 확실하게 알고 가는 건 정말 좋습니다. 기술적인 부분에 있어서는 리액트의 컴포넌트화가 주는 장점을 알았습니다. 조금 느린 개발이 되었을지라도 코드 가독성 부분에 있어서 좋았고, 오류가 발생해도 전체가 아닌 오류가 난 컴포넌트와 근접한 컴포넌트만 살펴보면 수정할 수 있는 부분이 너무 편했습니다. 모두 고생 참 많으셨고 리팩토링을 통해 더 나은 프로젝트 완성까지 화이팅입니다.

<br>

### 🐶 이상익
