# :space_invader: 미사용 포트 감지 시 이메일 알림 자동화

## 👨‍👨‍👧 개발팀원

| <img src="https://avatars.githubusercontent.com/u/65991884?v=4" width="80"> | <img src="https://avatars.githubusercontent.com/u/90691610?v=4" width="80"> | <img src="https://avatars.githubusercontent.com/u/79312705?v=4" width="80"> |
|:---:|:---:|:---:|
| [류채현](https://github.com/RyuChaeHyun) | [이석철](https://github.com/SeokCheol-Lee) | [김상민](https://github.com/isshomin) |

<br>

## 📌 개요

이 프로젝트는 디지털 환경에서 비밀정보(예: API 키, 패스워드)의 노출은 사이버 공격으로 이어질 수 있습니다. Trivy와 crontab을 활용한 자동화 시스템은 **비밀정보를 주기적으로 탐지하고, Slack 알림을 통해 팀 내 신속한 대응을 가능**하도록 하였습니다. 
<br><br>

즉, **정보 보안을 강화**를 목표로 진행되었습니다.

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

Trivy와 crontab을 이용한 비밀정보 탐지 및 슬랙 알림 자동화 시스템은 **현대의 DevOps 환경에서 필수적인 보안 솔루션**으로 자리 잡을 수 있습니다. 이 시스템을 통해 기업은 **비밀정보를 지속적으로 모니터링하고, 즉각적인 대응을 통해 보안 사고를 예방할 수** 있습니다.

자동화된 프로세스는 **팀의 생산성을 높이고, 발생 가능한 문제를 사전에 차단함**으로써 기업의 전체적인 보안 체계를 강화하는 데 기여합니다. 지속적인 보안 관리와 실시간 대응 체계 구축은 기업이 변화하는 보안 환경에 적응하고, 신뢰할 수 있는 비즈니스 운영을 지속하는 데 필수적입니다.

즉, Trivy와 crontab의 결합은 **비밀정보 관리의 효율성을 높이고, 기업의 보안 수준을 향상시키는 데 중요한 역할**을 합니다.

<br>

## 🤔 아쉬웠던 점

- **알림 과부하**:
    - 주기적으로 수행되는 스캔으로 인해 발생하는 많은 알림이 팀원들에게 부담이 될 수 있습니다. 중요하지 않은 경고가 자주 발생하면, 실제로 중요한 알림이 묻히는 문제가 발생할 수 있습니다.
- **실시간 대응 부족**:
    - crontab을 통해 주기적으로 스캔하는 방식은 실시간 대응이 어렵습니다. 비밀정보가 코드에 추가될 경우, 즉각적인 탐지가 이루어지지 않으므로 보안 위험이 증가할 수 있습니다.
- **스캔 한계**:
    - Trivy는 주로 컨테이너 이미지에 대해 스캔을 수행하므로, 다른 환경(예: 파일 시스템, 데이터베이스 등)에서 비밀정보를 탐지하는 데 한계가 있습니다.
- **위험 증가**:
   - 새로운 코드가 커밋되거나 배포될 때마다 자동으로 스캔을 실행하지 않으면, 보안 취약점이나 비밀정보가 포함된 채로 배포될 가능성이 높아집니다. 이는 시스템의 보안 위험을 증가시키고, 잠재적인 데이터 유출 사건을 초래할 수 있습니다.
- **효율성 저하**:
   - CI/CD 파이프라인의 이벤트 기반 스캐닝을 활용하지 않으면, 전체 개발 및 배포 과정에서 보안이 통합되지 않아 효율성이 저하됩니다. 수동으로 스캔을 진행해야 하는 추가적인 작업이 발생할 수 있으며, 이로 인해 개발팀의 생산성이 감소할 수 있습니다.

<br>
