# [ Python ] Python (파이썬) 자료형
## 파이썬 자료형


자료형 = 자료를 담는 그릇

> 파이썬 자료형 (Data Type)
>1. 숫자형 (Number) - 123
>2. 문자형 (String) - "word"
>3. 리스트형 (List) - ["12", "24", "566"]
>4. 튜플형(Tuple), 딕셔너리형(Dict), 집합형(Set)
>5. 불형 (Boolean) - True, False

### 파이썬 변수
변수란, 값을 저장할 때 사용
변수명 = 입력할 값

a=1
id(a) # 주소값을 가르킨다. 변수 a 의값이 어떠한 공간에 저장 되어있다는 뜻

대 / 소 문자를 구분한다.

여러 변수에 값을 동시에 입력하고 싶을 때
```
a=b=3

a, b = ("hello", "python")
```

숫자로 시작하는 변수는 만들 수 없다.

### (1) 숫자형
#### 1.정수형 (integer)
```
a = 1 
a = -1 
a = 123123123 
a = -123123121 
a = 0
```

#### 2. 실수형 (float)
소수점이 포함된 숫자
```
a = 1.0 
a = -1.2 
a = -1123123.2
```

#### 특징
사칙연산 (+, -, *, /)이 가능하다.

```
a = 1+1 
a = 100 - 1 
a = 12 * 12 
a = 3 / 4
```

### (2) 문자형 (String)
문자형은 큰 따옴표("") 또는 작은 따옴표('')에 감싸져 있는 형태

```
a = "python"
type(a)

b = 'easy'
type(b)
```

#### 문자형 다루기
(1) 여러 줄 (Multiline Strings)을 나타내고 싶을 때

```
Act as though
it is impossible to fail

(1) \n 사용

a = "Act as though \nit is impossible to fail"

(2) """문장""" 또는 '''문장'''
a = """Act as though
it is impossible to fail
"""
```


(2) 문자열 안에 ', " 가 들어가는 경우

```
It's kind of fun to do the impossible

(1) ' 또는 " 바로 앞에 백슬래시(\)를 삽입
a = 'It\'s kind of fun to do the impossible'

(2) ""로 문자열 만들기
b = "It\'s kind of fun to do the impossible"
```


(3) 문자열 연산

```
(더하기)
"Life"
a= "L"
b= "i"
c = "f"
d = "e"
a+b+c+d 

a = "Life"
b = "is good"
a + b

(곱하기)
a = “Life\n”
print(a*10)
```


(4) 문자열 길이 구하기 (len)

```
a = “Act as though it is impossible to fail”
len(a)
```


(5) 문자열 인덱싱 (Indexing)

문자열의 위치를 숫자로 나타내는 것

![](https://i.imgur.com/6g0iY0Z.png)

(6) 문자열 슬라이싱 (Slicing)

문자열을 분리하고 싶을 때 사용

```
x = “hello python!”
x[0:5] => hello
x[6:11] => python
x[12] 또는 x[-1] => !
```


### (3) 리스트형
a, b, c, d, e를 한번에 담을 수는 없을까? 하는 생각에서 나온 자료형

리스트를 만들려면 대괄호([ ])로 감싸고, 각 요소들 사이에 콤마(,)를 넣는다.

```
x = [“a”, “b”, “c”, “d”, “e”]

x = [“Hello”, “Python”]

x = [1, 2, 3, [“a”, “b”]]
```

#### 특징
- 리스트형도 인덱싱과 슬라이싱이 가능
- 리스트형도 더하고 곱하기가 가능

###  (4) 튜플형, 딕셔너리형, 집합형
#### 4-1. 튜플형 (Tuple)
리스트형([ ])과 거의 비슷하고, () 괄호로 생성.

```
t = ()

t = (“a”, “b”, “c”, “d”, “e”)

t = (“Hello”, “Python”)

t = (1, 2, 3, (“a”, “b”))
```
##### 특징
- 튜플형도 인덱싱과 슬라이싱이 가능
- 튜플형도 더하고 곱하기가 가능
- 단, 리스트형은 **요소값 수정이 가능하나 튜플은 불가능**

#### 4-2.딕셔너리형 (Dict)
중괄호 안에 키와 벨류로 구성되어 있는 형태

```
{Key1:Value1, Key2:Value2, Key3:Value3, ...}

x = {“name” : “tony”, “age” : “25”, “country” : “korea”}x
print(x[“name”])

value에는 리스트 형태도 가능
x = {“name” : “tony”, “age” : “25”, “country” : [“korea”, “usa”]}

단, 키는 중복이 안된다.
```

#### 4-3.집합형 (Set)
집합(set)은 **순서가 없고, 인덱스가 없는 모음**

set()을 사용해 만들 수 있다.

```
x = set([5,2,1])
x = set(‘abcde’)

x = set(‘abccccde’)
```

##### 특징
-  순서를 갖지 않는다. (Unordered)
-  중복을 허용하지 않는다.

### (5) 불형 (Boolean)
참(True), 거짓(False)

```
print(1>2)
print(1<2)
print(1==2)

x = True
x = False
```

