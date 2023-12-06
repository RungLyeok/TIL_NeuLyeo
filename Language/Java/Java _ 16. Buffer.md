# \[ Java \] 버퍼 ( Buffer )
## 버퍼 ( Buffer ) 란?

스트림은 내부에 버퍼( buffer ) 라는 임시 메모리 공간을 가지고 있다.

> [위키백과](https://ko.wikipedia.org/wiki/%EB%B2%84%ED%8D%BC_(%EC%BB%B4%ED%93%A8%ED%84%B0_%EA%B3%BC%ED%95%99)) : 
> 
> 버퍼( buffer )는 데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 메모리의 영역이다.
> 
> 버퍼는 컴퓨터 안의 프로세스 사이에서 데이터를 이동 시킬 때 사용된다. 보통 데이터는 키보드와 같은 입력 장치로부터 받거나 프린터와 같은 출력 장치로 내보낼 때 버퍼 안에 저장된다.
> 

버퍼는 데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 메모리 영역으로 입출력 시에 많이 사용된다.

![](https://i.imgur.com/0dXLUoo.png)

예를 들어
### 입력 버퍼 사용 시
입력한 데이터가 프로그램으로 바로 전달되는 것이 아니라 우선 입력버퍼에 데이터가 저장된다.

그리고 엔터 키를 치거나, 개행문자(\n)가 입력버퍼로 들어오거나, 입력버퍼가 가득차면 버퍼를 비우면서 데이터를 프로그램으로 전달한다.

### 출력 버퍼 사용 시
프로그램에서 출력장치(모니터 등)로 데이터가 바로 전달되지 않고 우선 출력버퍼에 데이터가 저장된다.

그리고 개행문자(\n)가 출력버퍼로 들어오거나, 출력버퍼가 가득차면 버퍼를 비우면서 데이터를 출력장치로 전달한다.

>
 💡 버퍼를 비운다 = 버퍼에 저장된 데이터가 목적지로 전송된다.
> 

### 버퍼를 사용하는 이유
입력과 출력 시 데이터의 이동 속도에서 차이가 발생하는 문제를 해결하기 위해 사용한다.

또 프로그램와 운영체제가 데이터를 효율적으로 처리하기 위해 입출력 버퍼를 사용한다.


## 버퍼 사용
버퍼를 사용하여 데이터를 입출력하는게 Scanner를 통해 출력하는 것보다 훨씬 빠르기 때문에 Scanner 대신에 사용한다.

Scanner은 스페이스와 엔터를 경계로 입력값을 인식하지만,

BufferReader은 엔터만 경계로 인식하기 때문에 중간에 띄어쓰기( 공백 )이 있는 경우에는 데이터를 가공해줘야 한다.

또한 받은 데이터를 String으로 고정하기 때문에 받은 데이터를 사용하려면 형변환이 필 수 이다.

### import, 예외처리 필수
```
import java.io.BufferedReader; // 임포트 필수
import java.io.BufferedWriter;
import java.io.IOException;

// throws IOException or try ~ catch 사용 필수
public static void main(String[] args) throws IOException { 
	'''
} 
```

### BufferdReader( ) : 버퍼를 이용한 입력  
```
import java.io.BufferedReader;  
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		// 콘솔에서 입력 받는 경우
		BufferReader br = new bufferedReader(new InputStreamReader(System.in));

		// 파일에서 입력받는 경우
		FileReader fr = new FileReader("test.txt");
		BufferedReader br_f = new BufferedReader(fr);

		// data 형변환
		int num = Integer.parseInt(br.readLine());

		// 파일 한줄 씩 읽어서 출력
		String line = "";
		for(int i = 1; (line = br_f.readLine()) != null; i++){
			System.out.println(line);
		}

		// 공백 입력을 받는 경우
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
		StringTokenizer st = new StringTokenizer(br.readLine());  
		
		double a = Double.parseDouble(st.nextToken());  
		double b = Double.parseDouble(st.nextToken());

		System.out.print(a + b);
	}
}
```
### BufferedWriter( ) : 버퍼를 이용한 출력
줄 바꿈을 하려면 `\n`을 넣어야 한다.

```
import java.io.BufferedWriter;  
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferWriter bw = new bufferedWriter(new FileWriter("test.txt");

		bw.write("hello\n");
		bw.newLine();
		bw.write("bufferedWriter");
		bw.flush(); // 남아 있는 데이터 모두 출력
		bw.close();
	}
}
```





## reference
https://blog.naver.com/PostView.naver?blogId=harang8069&logNo=222426218462&parentCategoryNo=&categoryNo=64&viewDate=&isShowPopularPosts=true&from=search
https://itmaster98.tistory.com/31
https://terianp.tistory.com/19