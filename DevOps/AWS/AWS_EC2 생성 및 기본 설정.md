# [ AWS ] EC2 생성 및 기본 설정
## EC2
**Amazon Elastic Compute Cloud(Amazon EC2)** 는 Amazon Web Services(AWS)가 제공하는 클라우드 컴퓨팅 서비스입니다.

이 서비스를 사용하면 사용자는 실제 하드웨어를 관리할 필요 없이 필요한 만큼의 컴퓨팅 파워를 할당받아 사용할 수 있습니다. 🌍


### Amazon EC2의 주요 특성

- **온디맨드 컴퓨팅 용량**: 필요할 때 원하는 만큼 컴퓨팅 자원을 확보하고, 사용량이 줄었을 때는 축소할 수 있는 유연성을 제공합니다.
- **가상 서버**: 원하는 수의 가상 서버를 구축하고 보안, 네트워킹 및 스토리지를 관리할 수 있습니다.


### 생성
![](https://i.imgur.com/s8GIcN1.png)

#### EC2 이름 설정
![](https://i.imgur.com/IRQLt8n.png)

#### Application and OS Images (Amazon Machine Image)
원하는 운영체제를 가진 AMI를 선택합니다.

![](https://i.imgur.com/eVnpmZK.png)


#### 인스턴스 유형 선택
![](https://i.imgur.com/0XlaGPZ.png)

#### Key Pair 생성 / 할당
새 키 페어 생서 클릭
![](https://i.imgur.com/cg0qs1W.png)

키 이름을 입력 후 키 페어 생성
![](https://i.imgur.com/EJ99f91.png)

키가 다운로드 된 것을 확인할 수 있다.
![](https://i.imgur.com/MgWSX4o.png)

#### 네트워크, 보안그룹
네트워크, 보안그룹은 여기서 따로 설정하지 않고 기본으로 진행합니다.

#### 스토리지 구성
30G 까지 무료 이므로 30으로 설정합니다.
![](https://i.imgur.com/xHUjfjl.png)

설정 완료 후 `인스턴스 시작` 을 누릅니다.


## 확인
다시 인스턴스 페이지에 가서 새로고침을 하면 생성 된 인스턴스를 확인 할 수 있습니다.

![](https://i.imgur.com/2JI5GIh.png)


## AWS 탄력적 IP (Elastic IP)
![](https://i.imgur.com/7P7L4An.png)
탄력적 IP 주소는 클라우드 환경에서 사용하기 위해 디자인된 정적 IPv4 주소입니다. AWS의 EC2 인스턴스나 네트워크 인터페이스에 할당할 수 있어서 안정적인 주소로 활용될 수 있습니다.

### 탄력적 IP 주소의 특징

- **정적 IP**: EC2 인스턴스에 고정적으로 할당하여 사용할 수 있는 IP 주소입니다.
- **다이나믹 리매핑**: 인스턴스의 장애나 소프트웨어 오류 시 빠르게 다른 인스턴스로 IP 주소를 재할당할 수 있어 높은 가용성을 보장합니다.
- **도메인 연결**: 탄력적 IP 주소를 도메인의 DNS 레코드에 지정하여 해당 도메인이 EC2 인스턴스를 가리키도록 설정할 수 있습니다.
- **요금**: AWS는 탄력적 IP 주소의 비효율적인 사용에 대해 요금을 부과할 수 있으므로 주의해야 합니다. 예를 들어, 사용하지 않는 탄력적 IP 주소나 인스턴스에 연결되지 않은 상태로 보유하고 있을 경우 추가 요금이 발생할 수 있습니다.

### EC2와 연결
![](https://i.imgur.com/dSTvwIT.png)

생성한 EC2를 선택 후 연결 합니다.

![](https://i.imgur.com/iJjPLyW.png)

다시 EC2에 들어가 확인 하면 탄력적 IP 정보란에 연결 된 것을 확인 할 수 있습니다.


1. AWS EC2 인스턴스 설정
2. EC2 네트워킹
3. EC2 보안 그룹 설정
4. EC2 인스턴스 유형
5. EC2 인스턴스 크기 조정
6. EC2 인스턴스 스토리지 관리
7. EC2 AMI (Amazon Machine Image)
8. EC2 인스턴스 모니터링
9. EC2 Auto Scaling
10. EC2 인스턴스 가용성 및 내구성