<!-- markdownlint-disable MD041 -->
 https://gist.github.com/ihoneymon/652be052a0727ad59601
<h1 align="center">
    inter-office Api Server
</h1>


<p align="center">
  <a href="#개요">개요</a> •
    <a href="#아키텍처">아키텍처</a> •
  <a href="#개발환경">개발환경</a> 
  
</p>

## 개요

interface와 office의 합성어로 공유 오피스(office) 이용 고객분들 간의 인터(inter)페이스 역할을 하는 서비스 입니다. 미팅룸 예약, 커뮤니티, 회사별 그룹 채팅 등의 기능을 제공합니다.
이 프로젝트의 목표는 공유오피스의 전반적인 기능 API를 제공하는 것입니다.

## 아키텍쳐

### Layered Architecture
![image](https://user-images.githubusercontent.com/51815044/172231669-1a75de5c-c06c-439d-abaf-41f18d8f707e.png)
![image](https://user-images.githubusercontent.com/51815044/172258199-95931db4-646c-4074-bf5f-2d64ab93cbbc.png)


## 개발환경
Gradle  
도커기반의 로컬환경.
* Docker Compose를 사용하는 다중 구성요소 "docker-compose up -d"
