# :space_invader: 미사용 포트 감지 시 이메일 알림 자동화

## 👨‍👨‍👧 개발팀원

| <img src="https://avatars.githubusercontent.com/u/65991884?v=4" width="80"> | <img src="https://avatars.githubusercontent.com/u/90691610?v=4" width="80"> | <img src="https://avatars.githubusercontent.com/u/79312705?v=4" width="80"> |
|:---:|:---:|:---:|
| [류채현](https://github.com/RyuChaeHyun) | [이석철](https://github.com/SeokCheol-Lee) | [김상민](https://github.com/isshomin) |

<br>

## 📌 개요


본 프로젝트는 서버 환경에서 미사용 포트를 감지하고, 이를 이메일로 관리자에게 자동으로 알림을 보내는 시스템입니다. 서버의 보안성을 높이기 위해 Trivy를 활용하여 미사용 포트를 실시간으로 모니터링하며, 포트가 비활성 상태일 경우 즉시 이메일로 통지합니다.

이 시스템은 주기적으로 Trivy를 통해 서버의 포트 상태를 체크하고, 발견된 미사용 포트에 대한 정보를 포함하여 알림을 발송합니다. 이를 통해 시스템 관리자는 신속하게 보안 위협에 대응할 수 있으며, 서버 운영의 안전성을 더욱 높일 수 있습니다.


<br>

## 🎖️ 주요 기능

<br>

## 📊 프로젝트 과정

<br>

### 1️⃣ Trivy 설치

```
# Trivy를 설치하기 위해 필요한 도구와 패키지를 설치
sudo apt-get install wget apt-transport-https gnupg lsb-release

# Trivy 저장소의 패키지를 신뢰할 수 있도록 GPG 키 추가
wget -qO - https://aquasecurity.github.io/trivy-repo/deb/public.key | sudo apt-key add -

# APT 소스 목록에 Trivy 저장소 추가
echo deb https://aquasecurity.github.io/trivy-repo/deb $(lsb_release -sc) main | sudo tee -a /etc/apt/sources.list.d/trivy.list

# 패키지 목록 업데이트
sudo apt-get update

# Trivy 설치
sudo apt-get install trivy
```
<br>

### 2️⃣ 

<br>

### 3️⃣ 

<br>

### 4️⃣ 

## 🧐 결론

<br>

## 🤔 아쉬웠던 점

<br>
