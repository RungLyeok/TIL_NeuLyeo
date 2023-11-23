# \[Java\] 12. 자바 입출력

---



## 01\. 자바 입출력과 스트림

### 스트림이란?

자바에서 모든 입출력은 스트림(Stream)을 통해 이루어진다.

입출력 장치는 매우 다양하여 장치에 따라 입출력 부분을 일일이 다르게 구현하면 프로그램 호환성이 떨어질 수 밖에 없다.

  
이런 문제를 해결하기 위해 자바는 입출력 장치와 무관하고 일관성 있게 프로그램을 구현할 수 있도록 일종의 가상 통로인 스트림을 제공한다.

자료를 읽어 들이려는 소스(source)와 자료를 쓰려는 대상(target)에 따라 각각 다른 스트림 클래스를 제공한다.  
  
  
  

### 입, 출력 스트림

어떤 대상으로부터 자료를 읽어 들일 때 사용하는 스트림이 입력 스트림이다.

편집 화면에 사용자가 쓴 글을 파일에 저장할 때는 출력 스트림을 사용한다.

스트림은 단방향으로 자료가 이동하기 때문에 입력과 출력을 동시에 할 수 없다.

| **종류** | **예시** |
| --- | --- |
| **입력 스트림** | FileInputStream, FileReader, BufferInputStream, BufferReader 등 |
| **출력 스트림** | FileOutputStream, FileWriter, BufferOutputStream, BufferWriter 등 |

  
  

### 바이트 스트림

원래 자바의 스트림은 바이트(Byte)단위로 자료의 입출력이 이루어진다.

그러므로 그림, 동영상, 음악 파일 등 대부분 파일은 바이트 단위로 읽거나 쓰면 된다.

그런데 자바에서 하나의 문자를 나타내는 Char형은 2바이트이기 때문에 1바이트만 읽으면 한글과 같은 문자는 깨져버리고 만다.

따라서 입출력 중 가장 많이 사용하는 자료인 문자를 위해 문자 스트림을 별도로 제공한다.

즉 읽어 들이는 자료형에 따라 바이트용과 문자용 스트림이 있다.

| **종류** | **예시** |
| --- | --- |
| **바이트 스트림** | FileInputStream, FileOutputStream, BufferInputStream, BufferOutputStream등 |
| **문자 스트림** | FileReader, FileWriter, BufferReader, BufferWriter 등 |

  
  

### 기반, 보조 스트림

기반 스트림은 읽어 들일 곳(소스)나 써야할 곳(대상)에서 직접 읽고 쓸 수 있으며 입출력 대상에 직접 연결되어 생성되는 스트림이다.

보조 스트림은 직접 읽고 쓰는 기능은 없으며, 항상 다른 스트림을 포함하여 생성된다.

| **종류** | **예시** |
| --- | --- |
| **기반 스트림** | FileInputStream, FileOutputStream, FileReader, FileWriter등 |
| **보조 스트림** | InputStreamReader, OutputStreamWriter, BufferedInputStream, BufferedOutputStream 등 |

## 02\. 콘솔 입력

### System.in

```
System.out.print("입력 : ");  
int a = System.in.read() - '0'; // 아스키코드 값만큼 빼서 숫자로 변환  
System.out.println("a = " + a);  
System.in.read(new byte[System.in.available()]);  
// System.in 은 엔터값 까지 받아오기 때문에 엔터값을 제거 해야 한다.
```

### InputStreamReader

```
InputStreamReader reader = new InputStreamReader(System.in);  
// 배열의 크기 만큼만 문자열을 받는다.  
char[] c = new char[3];  
System.out.print("입력 : ");  
reader.read(c);  
System.out.println(c);
```

  
  

### BufferedReader

```
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
System.out.print("입력 : ");  
String s1 = br.readLine();  
System.out.println("s1 = " + s1);
```

  
  

### Scanner

```
        //1-2. Scanner  
        System.out.println("== Scanner ==");  
        Scanner sc = new Scanner(System.in);  
        System.out.print("입력1 : ");  
        System.out.println(sc.next());  
        sc.nextLine();  

        System.out.print("입력2 : ");  
        System.out.println(sc.nextInt());  
        sc.nextLine();  

        System.out.println("입력3 : ");  
        System.out.println(sc.nextLine());  

//      참고) 정수, 문자열 변환  
        int num = Integer.parseInt("12345");  
        String str = Integer.toString(12345);
```

  
  
  

## 03\. 콘솔 출력

```
//      2. 출력  
        System.out.println("Hello");  
        System.out.println("World");  

        System.out.print("Hello");  
        System.out.print("World");  
        System.out.println();  

        System.out.printf("Hello");  
        System.out.printf("World");  
        System.out.println();  

        String s = "자바";  
        int number = 3;  

        System.out.println(s + "는 언어 선호도 " + number +"위 입니다.");  
        System.out.printf("%s는 언어 선호도 %d위 입니다.\n", s, number);  

        System.out.printf("%d\n", 10); //정수  
        System.out.printf("%o\n", 10); //8진수  
        System.out.printf("%x\n", 10); //16진수  
        System.out.printf("%f\n", 5.2f); // float  
        System.out.printf("%c\n", 'a'); //char  
        System.out.printf("%s\n", "안녕하세요"); //String  

        // 줄 정렬  
        System.out.printf("%-5d\n", 123);  
        System.out.printf("%5d\n", 1234);  
        System.out.printf("%5d\n", 12345);  

        System.out.printf("%.2f\n", 1.123);  
        System.out.printf("%.2f\n", 1.126);
```

  
  
  

## 04\. 파일 출력

### 파일 쓰기

#### FileWriter

```
// 파일 경로 설정
FileWriter fw = new FileWriter("./memo.txt");  
String memo = "1줄 입니다."\n";  
fw.write(memo);  

memo = "2줄 작성 중 입니다.\n";  
fw.write(memo);  

// 파일 쓰기가 끝나면 항상 종료 해야한다.  
fw.close();

//파일 이어 쓰기
FileWriter fw2 = new FileWriter("./memo.txt", true);  
memo = "파일을 이어 쓰는 중 입니다.\n";  
fw2.write(memo);  
fw2.close();
```

#### PrintWriter

```
PrintWriter pw = new PrintWriter("memo.txt");  
memo = "1줄 작성 중입니다.";  
pw.println(memo);  

memo = "2번 작성 중입니다.";  
pw.println(memo);  
pw.close();

//파일 이어 쓰기
PrintWriter pw2 = new PrintWriter(new FileWriter("./memo.txt", true));  
memo = "3줄 이어 쓰기 입니다.\n";  
pw2.println(memo);  
pw2.close();
```

  
  

### 파일 입력

```
BufferedReader br = new BufferedReader(new FileReader("./memo.txt"));  

while  (true) {  
    String line = br.readLine();  
    if (line == null) {  
        break;  
    }  
    System.out.println(line);  
}  
br.close();
```