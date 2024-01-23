# [ AWS ] EC2 접속 - VSCode (win)
## VSCode
### VSCode SSH 연결의 장점
#### 간편한 원격 개발 환경 설정
- **플러그인을 통한 간단한 연결**: VSCode에는 Remote - SSH와 같은 플러그인이 있어서 간편하게 원격 서버로의 SSH 연결을 설정할 수 있습니다. 
- **별도의 소프트웨어 불필요**: 다른 프로그램을 사용할 때 필요한 별도의 소프트웨어 설치나 설정 없이 VSCode 내에서 모든 작업을 처리할 수 있어요.

#### 효율적인 작업 플로우
- **로컬과 동일한 경험 제공**: 프론트엔드 작업은 로컬 시스템에서 진행되지만, 실제 서버에서 프로그램 실행 및 디버깅이 이루어집니다. 이를 통해 로컬 개발환경과 동일한 경험을 원격으로도 누릴 수 있습니다. 
- **다양한 확장 기능**: VSCode는 풍부한 확장 기능과 플러그인을 제공합니다. 이를 통해 여러 개발 언어와 프레임워크에 쉽게 접근하고 가장 최신의 개발 툴을 활용할 수 있죠. 

#### 향상된 하드웨어 활용
- **강력한 서버 리소스 활용**: 로컬 시스템의 사양에 구애받지 않고, 더 높은 성능의 서버 리소스를 활용해 개발 작업을 할 수 있어요. 특히 고사양을 요구하는 작업(예: 머신러닝, 딥러닝 등)에 유용합니다.

#### 편리한 권한 관리
- **Root 권한으로의 접근**: 필요한 경우 쉽게 Root 권한으로 서버에 접속하여 파일 시스템을 관리하고 수정할 수 있습니다. 이는 보안에 영향을 줄 수 있으니 주의하며 사용해야 합니다.


### Remote - SSH 설치
![](https://i.imgur.com/tfxuF0B.png)

### Remote - SSH Configuration 설정
![](https://i.imgur.com/aUx6bjb.png)

- Host : 접속할 EC2의 이름을 입력합니다
	- HostName : AWS EC2의 Public IP 를 입력합니다.
	- User : 접속 유저명을 입력합니다.
	- IdentityFile : EC2의 pem key 경로를 입력합니다.

![](https://i.imgur.com/9tA9cBO.png)

### Remote-SSH : Connect to Host
클릭 하면 위에 호스트 연결창이 뜨는 것을 볼 수 있습니다.

![](https://i.imgur.com/krNUCgH.png)

![](https://i.imgur.com/5tX1adr.png)

![](https://i.imgur.com/1X8noXL.png)

터미널을 띄우면 접속 된 것을 확인 할 수 있다.

![](https://i.imgur.com/WMroA8G.png)
