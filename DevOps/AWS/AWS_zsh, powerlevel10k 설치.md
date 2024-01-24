# [ AWS ] zsh, powerlevel10k 설치

## Zsh (Z Shell) 소개
![](https://i.imgur.com/OF9yvAp.png)


Zsh는 인기 있는 커맨드 라인 인터페이스인 Bash의 강력한 대안 커맨드 쉘(shell)로, 다양한 기능과 편의성, 향상된 스크립트가 가능합니다. 특히 프로그래밍 작업의 생산성을 증가시키는 많은 기능이 있어 개발자들에게 인기가 높죠. 👨‍💻🔧

### Zsh (Z Shell)의 특징
- **풍부한 기능**: Zsh는 별칭(alias), 탭 완성(tab-completion), 스펠링 검사(spell-check), 히스토리 기능 등 Bash보다 확장된 기능들을 제공합니다. 
- **Oh My Zsh 프레임워크**: Oh My Zsh는 Zsh의 설정을 관리하고 풍부한 테마와 플러그인을 제공하는 커뮤니티 기반 프레임워크입니다. 이를 통해 쉘 경험을 보다 향상시킬 수 있습니다. 

## Powerlevel10k 테마 소개
Powerlevel10k은 Zsh 쉘을 위한 테마로, 깔끔하고 유연한 프롬프트 디자인을 제공합니다. 사용자 설정에 따라 프롬프트의 모양과 정보를 변경할 수 있으며, 개발 환경을 더욱 개인화하고 생산적으로 만들 수 있는 다양한 옵션들을 가지고 있어요. 💻✨

### Powerlevel10k의 특징
- **맞춤형 설정 지원**: 설치 후 `p10k configure`를 실행하여 사용자에게 가장 적합한 프롬프트 스타일을 쉽게 설정할 수 있습니다. 
- **향상된 프롬프트 디자인**: 다양한 스타일과 아이콘을 통해 현재 상태를 쉽게 인지하고, 작업 환경에 대한 정보를 한눈에 파악할 수 있게 해줍니다. 

## zsh, powerlevel10k 설치

### 명령어 
아래 명령어를 차례대로 입력하면 설치할 수 있습니다.

```bash
sudo apt update

sudo apt install zsh -y

sudo apt install git -y

sh -c "$(curl -fsSL https://raw.github.com/ohmyzsh/ohmyzsh/master/tools/install.sh)"

// zsh의 자동 완성 플러그인 이다.
git clone https://github.com/zsh-users/zsh-autosuggestions ${ZSH_CUSTOM:-~/.oh-my-zsh/custom}/plugins/zsh-autosuggestions

//
git clone https://github.com/zsh-users/zsh-completions ${ZSH_CUSTOM:-${ZSH:-~/.oh-my-zsh}/custom}/plugins/zsh-completions

// 명령어와 문자열 등 문맥에 맞게 구분하여 색상을 달리 표현해 주는 기능
git clone [https://github.com/zsh-users/zsh-syntax-highlighting.git](https://github.com/zsh-users/zsh-syntax-highlighting.git) ${ZSH_CUSTOM:-~/.oh-my-zsh/custom}/plugins/zsh-syntax-highlighting
- 
// 디렉토리 이동을 쉽게 해주는 플러그인 
sudo apt-get install autojump

git clone --depth=1 https://github.com/romkatv/powerlevel10k.git ${ZSH_CUSTOM:-$HOME/.oh-my-zsh/custom}/themes/powerlevel10k

// VSCode로 진행 시
code .zshrc

// Putty로 진행 시
nano ~/.zshrc  

// zsh의 테마와 플러그인을 설정파일에 추가로 작성해줘야한다.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
ZSH_THEME="powerlevel10k/powerlevel10k"
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
plugins=(
    git

    zsh-autosuggestions

    zsh-syntax-highlighting

    zsh-completions

    autojump
)
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

exec zsh
```

### 설정 진행
폰트가 깨지는지 확인하는 부분입니다.

![](https://i.imgur.com/w2r5QXp.png)

이후 자기가 원하는 설정으로 진행하면 됩니다.

![](https://i.imgur.com/qfbBLqA.png)

설정을 저장합니다.

![](https://i.imgur.com/CpZdJWx.png)

설치 완료 된 것을 확인 할 수 있습니다.

![](https://i.imgur.com/55YS6FL.png)

### 폰트 깨질 시

[GitHub - romkatv/powerlevel10k: A Zsh theme](https://github.com/romkatv/powerlevel10k#fonts)

1. 수동 글꼴 설치 항목에서 파일은 다운로드해서 설치한다.

- [https://github.com/romkatv/powerlevel10k-media/raw/master/MesloLGS NF Regular.ttf](https://github.com/romkatv/powerlevel10k-media/raw/master/MesloLGS%20NF%20Regular.ttf)
- [https://github.com/romkatv/powerlevel10k-media/raw/master/MesloLGS NF Bold.ttf](https://github.com/romkatv/powerlevel10k-media/raw/master/MesloLGS%20NF%20Bold.ttf)
- [https://github.com/romkatv/powerlevel10k-media/raw/master/MesloLGS NF Italic.ttf](https://github.com/romkatv/powerlevel10k-media/raw/master/MesloLGS%20NF%20Italic.ttf)
- [https://github.com/romkatv/powerlevel10k-media/raw/master/MesloLGS NF Bold Italic.ttf](https://github.com/romkatv/powerlevel10k-media/raw/master/MesloLGS%20NF%20Bold%20Italic.ttf)

2. Visual Studio Code 설정에서 `terminal.integrated.fontFamily` 항목에 `MesloLGS NF`를 넣는다.
