# 📖 삼육대 4학년 예비 졸업생 키우기!
![001](https://github.com/Java-TeamProject/MISA/assets/106863692/cf2e04d2-3b71-423f-9603-cc2c6e216096)

<br>

## 프로젝트 소개
<p align="center"><img src="https://github.com/Java-TeamProject/MISA/assets/106863692/3b963f56-9dc5-4195-9dc6-0f43ca61be63" height=540 width=540></p>

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
|[<img src="https://github.com/Java-TeamProject/MISA/assets/106863692/83587648-9e28-4b27-88c6-f5b797b161e3" width="150" height="150"/><br/> @GTU9](https://github.com/GTU9) | [<img src="https://github.com/Java-TeamProject/MISA/assets/106863692/70af628a-2e87-42ed-a4b4-dd95d6e9c490" height=150 width=150><br/> @joy:)](https://github.com/sb-77) | [<img src="https://github.com/Java-TeamProject/MISA/assets/135615995/cf018c8a-408c-48ae-b9ef-43e297affcf8" width="150" height="150"/> <br/> @ohdyo](https://github.com/ohdyo) | [<img src="https://github.com/Java-TeamProject/MISA/assets/106863692/efcbf343-fa03-4115-880e-07f32cfc87bb" height=150 width=150> <br/> @Baeminseo](https://github.com/Baeminseo) |[<img src="https://github.com/Java-TeamProject/MISA/assets/106863692/c67336ee-7883-400d-9368-18f69594add9" width="150" height="150"/><br/> @ddoddo1228](https://github.com/ddoddo1228)

</div>

<br>

## 1. 개발 환경

![Number of GitHub contributors](https://img.shields.io/github/contributors/Java-TeamProject/MISA)
[![Number of GitHub issues that are open](https://img.shields.io/github/issues/ToolJet/ToolJet)](https://github.com/Java-TeamProject/MISA/issues)
![GitHub commit activity](https://img.shields.io/github/commit-activity/m/Java-TeamProject/MISA)

<p align="center"><img src="https://github.com/Java-TeamProject/MISA/assets/106863692/5a7fb18a-1694-4c3c-a762-cbcc942a22bb" height=540 width=540></p>



- Back-end : IntelliJ IDEA, 아스키코드
- 버전 및 이슈관리 : Github, Github Issues, Github Project
<div align=left><h4>협업 툴</h4></div>
<div align=left><img src="https://img.shields.io/badge/Discord-5865F2?style=for-the-badge&logo=Discord&logoColor=white"/><a href="https://www.notion.so/2-45d202bdf20147158b4ce13cec217a66?pvs=4"><img src="https://img.shields.io/badge/Notion-000000?style=for-the-badge&logo=Notion&logoColor=white"/></a><img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=GitHub&logoColor=white"/></div>





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
![005](https://github.com/Java-TeamProject/MISA/assets/106863692/fbc771b2-62a1-4470-8310-0b1b697f8817)



### 😼 이재혁

- **기능**
    - 오전 고정, 돌발, 출발 이벤트, 오후 수업 클래스 병합, 수치 조정 테스트

    
### 🐰 오송은

- **기능**
    - 프롤로그, 오전 수업 고정, 돌발이벤트, 병합


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

- 전체 개발 기간 : 2024-3-19 ~ 2024-3-26
- 기능 구현 : 2024-3-21 ~ 2024-3-26
<p align="center"><img src="https://github.com/Java-TeamProject/MISA/assets/106863692/0fb4b2ea-32be-4e1b-8d57-14b46926a3de" height=540 width=540></p>

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
- 6-1. 마지막 고정 고정이벤트 시작
- 6-2. 고정 이벤트 중간에 돌발이벤트 발생 가능

<br>

### [하교 후]
- 7.1 함수 이벤트로 14일차가 종료되었을 때, 엔딩이벤트로 넘어갑니다.
- 7.2 엔딩 이벤트는 지금까지의 능력치를 기반해 알맞은 엔딩을 출력합니다. (4가지)

<br>

## 7. 프로젝트 후기

### 😼 이재혁

git을 연동해서 프로젝트를 계획한여 협업을 이번 수업에서 처음 경험해봤습니다. 그만큼 미숙하고 낯설어 처음 조가 짜여지고 깃을 연동하려 했을 때 연동도 제대로 되지 않아 따라가기 너무 벅찼는데 시간이 지나면서 조금씩 git에 적응하고 팀원들하고도 어색함이 사그라지면서 좋은 프로젝트를 만들어간것 같습니다. 특히 git에서 각자의 맡은 부분을 하고 머지를 할때 처음 해보는 작업이고 에러도 나서 에러가 왜 생겼는지 이해하기도 어려웠고 해결도 오래걸렸습니다. 하지만 처음으로 git을 통한 협업 프로젝트를 해본 경험으로 앞으로 할 팀프로젝트에서 큰 도움이 될거라 확신합니다.

<br>

### 🐰 오송은

이번 프로젝트에서 깃허브를 통한 협업 경험은 제게 성장의 발판이 되었습니다. 이전에는 깃허브를 코드 공유 용도로만 활용하여 제대로 활용해본 적이 없었습니다. 그러나 이번 프로젝트를 통해 이슈 트래킹, 풀 리퀘스트, 머지 등을 배우며 협업 툴의 중요성과 활용 방법에 대해 깊이 이해할 수 있었습니다. 수 많은 오류와 어려움을 겪으며 힘든 순간도 많았지만 오히려 오류 덕분에 깃허브를 이용한 협업에 대해 더욱 깊이 배울 수 있었습니다.
더불어 협업 툴을 활용함으로써 이번 프로젝트가 더욱 완성도 있게 만들어졌다는 느낌을 받았습니다. 팀 분위기도 좋았고 서로 협력하며 프로젝트를 성공적으로 마무리한 것 같아서 뿌듯합니다. 이번 프로젝트를 통해 깃허브를 이용한 협업에 대한 기초를 다졌으며, 앞으로의 프로젝트에서도 보다 효율적으로 협업할 수 있을 것이라고 생각합니다.

<br>

### 🦒 이수빈

백엔드과정을 시작한지 얼마안된 상황에서 팀프로젝트를 시작하게 되어서 조금 힘들었지만, 팀원분들을 잘 만나서 잘 마무리 할 수 있었습니다. 팀 프로젝트 초기에 기획을 하면서 프로젝트의 방향성을 제대로 잡을 수 있었고, 초기 설정을 진행하며 쳬계적인 설계의 중요성을 느낄 수 있었습니다. 앞으로의 프로젝트들도 체계적이고 효율적으로 진행할 수 있는 방법을 많이 배웠던 프로젝트 였습니다. 각자 기능역할에 대해서 공부하며 코드를 짜보는 시간을 갖고, 그 다음에 팀원들끼리 서로 부족한 부분을 채우면서 프로젝트를 진행하여 좋은 팀 협업을 경험할 수 있었습니다. 팀원들이 서로서로 도와서 문제를 해결하려고 해서 예상보다 더 빠르게 프로젝트를 마무리할 수 있었습니다. 하지만 빠르게 작업을 진행하느라 함께 해결한 이슈가 어떤 이슈이며 어떻게 해결했는지에 대해 자세히 정리해볼 시간이 없어서 아쉬웠습니다. 이번의 경험을 통해 다음 프로젝트에서도 더욱 발전된 모습을 보일 수 있었으면 좋겠습니다. 늦은 시간까지도 항상 열심히 참여해준 팀원들에게 감사합니다. 다음에도 또 만나요:)

<br>

### 🐹 배민서

지금까지 배운 자바를 통해 기획을 하고 그것을 실현시키는 과정에서 깃허브와 노션을 이용할 수 있어서 무척 뜻깊었습니다.
언어를 배워왔지만 깃허브를 이용하는 방법은 모르고 있었는데 이번 팀플 과제를 하면서 팀원들과 함께 깃과 깃 허브를 배우며
이슈를 작성하고, 그에 대한 코멘트도 작성해보았고, 서로의 코드를 공유하기 위한 브랜치 생성과 메인 풀, 푸쉬 등의 기능을 제대로 배운 것 같아 무척 뿌듯했습니다.
기능 구현할때도 밝고 열정적인 팀원들과 함께라 좋은 아이디어도 나오고 기능 구현하면서도 재밌게 서로 도와가며 짤 수 있었던 것 같습니다.
앞으로 할 팀플에서도 지금까지 배운 깃허브 이용방법과 노션, 그리고 readme 꾸미는 것을 잘 응용해서 기록남길 것이며,
제 깃허브를 꾸며서 취업할때 도움될 수 있게 노력하고 싶습니다!

<br>

### 🐶 김상익

깃허브를 활용한 프로젝트 진행은 이번이 처음이 아니었습니다. 보통 친한 친구들과 같이 구두로 모든 것을 진행하였고, 제게 깃허브는 코드를 공유하는 툴 그이상 그이하도 아니었습니다. 그런데 이번 협업 프로젝트를 사람들과 진행하면서 깃허브를 어떤 식으로 활용을 해야하는지 다시 한번 깨달은 것 같았습니다. 이슈와 태그를 통해 다른 사람들과 커뮤니케이션 하는 방법, 코드 리뷰를 통해서 다른 사람들과 코드를 보면서 서로 피드백 하는 방법 등을 익히면서 지금까지 부족했던 깃허브 활용법을 채우는 느낌이어서 굉장히 유의미한 경험이었던 것 같습니다. 아쉬움 점으로는 적은 개발기간으로 인해 기획한 것을 완벽히 수행하지 못헀다는 점입니다. 프로젝트를 진행하면서 이렇게 했으면 보다 좋지 않을까, 이걸 다르게 표현한다면 좀 더 사용자가 재밌지 않을까 라고 계속 생각했습니다. 그리고 그런 아쉬움을 뒤로 하며 개발기간에 맞춰 기획을 수정하고 타협을 한다는 것 또한 협업 프로젝트의 묘미라고 생각했습니다.
끝으로, 이번 협업 프로젝트를 진행하면서 알게되고 익히게된 깃허브 활용능력이 또 다른 협업 프로젝트의 밑거름이 되어 보다 좋은 결과물을 만들어 줄 수 있는 좋은 경험이라고 생각했습니다.
