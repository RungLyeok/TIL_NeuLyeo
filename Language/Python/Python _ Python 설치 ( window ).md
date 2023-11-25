# [ Python ] Python 설치 ( window )
## 파이썬 설치 (window 기준)
파이썬 공식 다운로드 페이지 : https://www.python.org/downloads/

![](https://i.imgur.com/hW9kaXr.png)

### 설치 필수 설정

**설치 시 Add Python to PATH 클릭 필수** 

![](https://i.imgur.com/OB3He6i.png)


만약 Disable path length limit 문구가 뜨면 클릭 후 동의 한다.

![](https://i.imgur.com/8tv41Hj.png)


### 설치 확인
`win + R`  누르기

cmd 입력

터미널에서 python 버전 확인

```
python -v

python3 -v
```

## 파이썬 개발환경 구축
python 사용을 좀 더 편리하게 도와줄 3가지의 툴을 설치한다.
- Git for windows
- ipython
- Visual studio Code (VSC)

### Git for windows
Git은 소스 코드 관리 프로그램이다.

https://gitforwindows.org/

홈페이지에 접속 후 Download 버튼을 클릭

![](https://i.imgur.com/OLdsD4C.png)


다운 후 옵션 변경할 부분 없이 next를 눌러 설치한다.

#### 설치 확인
설치 후 바탕화면에서 마우스 우쿨릭 하면

`Git Bash Here`을 확인할 수 있다.

![](https://i.imgur.com/NYj0O8M.png)


### iPython
Git Bash 에서 설치를 진행한다.

```
> pip install ipython # 또는 아래 명령어로

> python -m pip install ipython

> ipython # ipython 접속
```

#### 설치 확인

![](https://i.imgur.com/CGoOWvv.png)

### Visual Studio Code (VSC)
https://code.visualstudio.com/

공식홈페이지에서 다운로드 받는다.

설치 시 아래 옵션 선택한다.
![](https://i.imgur.com/c4OkbVP.png)

VSC 실행 후, Extention에서 Python 설치
![](https://i.imgur.com/MGCNVJS.png)

아래 확장도 설치 한다.
![](https://i.imgur.com/pWwYsHX.png)

### python 간단 예제
`hello.py` 파일명으로 생성

 코드 작성
```
print("Hello, world!")
```

![](https://i.imgur.com/GfQT0AJ.png)

#### 파일 실행 방법

- (1) 왼쪽의 `hello.py` 위에서 마우스 오른쪽 클릭 후, `Run Python File in Terminal` 클릭

- 오른쪽 위 상단의 초록색 플레이 버튼 클릭

- Ctrl + F5 동시에 클릭

실행 확인

![](https://i.imgur.com/TiEk2Fl.png)
