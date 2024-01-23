# [ AWS ] EC2 접속 - putty (win)
## putty

PuTTY는 보통 원격 서버에 접속하여 작업을 수행할 때 사용하는 무료 오픈소스 프로그램입니다. 

😊 윈도우와 같은 운영체제에서 서버에 텔넷이나 SSH와 같은 프로토콜을 이용하여 원격으로 접속할 수 있도록 도와주는 가상 단말기를 제공해요.

### PuTTY의 주요 기능 및 사용 방법
- **기능**: PuTTY는 텔넷(Telnet), SSH, Rlogin 등의 네트워크 프로토콜을 지원하여 원격 서버에 접속할 수 있게 해줍니다. 
- **사용 법**: 간단하게 PuTTY 실행 파일을 다운로드 후 실행하면 되며, 사전에 설치가 필요하지 않습니다. 

### putty 설치
https://putty.org/

![](https://i.imgur.com/jHhh4eO.png)

![](https://i.imgur.com/gnruans.png)

### puttygen 실행
`puttygen` 실행 후 EC2 생성할 때 만든 키 불러온 후 

`Save private key` 로 저장한다.

pem 형식을 ppk 형식으로 키 변환을 시켜준다.

![](https://i.imgur.com/Pxjb3pb.png)


AWS 에서 키 생성 시 바로 ppk 형식의 키를 다운로드 받을 수 있다.

### putty 실행
EC2 탄력적 ip 복사 후 사진의 빈 칸에 넣기

![](https://i.imgur.com/v4UySt8.png)

### 메뉴 에서 SSH -> Auth 이동
아까 생성한 ppk 키 넣기

![](https://i.imgur.com/Idv6Cza.png)

다시 `Session` 으로 이동 후 지금까지 진행한 설정을 저장합니다.

다음번 접속에서 똑같은 설정을 하지 않고 바로 접속 할 수 있습니다.

![](https://i.imgur.com/wjPYJIJ.png)

오픈하면 아래와 같은 창을 볼 수 있다.

위 화면에서 `ubuntu` 를입력 하면 접속하는 것을 확인할 수 있다.

![](https://i.imgur.com/xK9ZKem.png)
