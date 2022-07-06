# Java Stack 클래스

## 📌정의

+ 입선출(선출후입), LIFO 라고 한다.
+ 한 쪽 끝에서만 자료(데이터)를 넣고 뺄 수 있는 형식의 자료 구조이다.
+ 스택 구조에서 가장 상단에 있는 데이터를 Top이라고 한다.



## 📑선언 & 함수

```java
Stack<Integer> stack = new Stack<>();
```

```java
public Element push(Element item); // 데이터 추가
public Element pop(); // 최근에 추가된(Top) 데이터 삭제
public Element peek(); // 최근에 추가된(Top) 데이터 조회
public boolean empty(); // stack의 값이 비었는지 확인, 비었으면 true, 아니면 false
public int seach(Object o); // 인자값으로 받은 데이터의 위치 반환, 그림으로 설명하겠음
```



## 🙌 LinkedList로 Stack 구현

### 구조

![image-20220706233521701](C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20220706233521701.png)

### 예제 코드

```java
private void push(int data) {
    Node node = new Node(data);
    node.linkNode(top);
    top = node;
}
```

```java
public int peek() {
    return top.getData();
}
```

```java
private void pop() {
    if (empty())
        throw new ArrayIndexOutOfBoundsException();
    else {
        top = top.getNextNode();
    }
}
```

```java
private int search(int item) {
    Node searchNode = top;
    int index = 1;
    while(true) {
        if (searchNode.getData() == item) {
            return index;
        } else {
            searchNode = searchNode.getNextNode();
            index ++;
            if (searchNode == null)
                break;
        }
    }
    return -1;
}
```

## 👍장점

**배열**

+ 구현이 쉽다.
+ 데이터의 접근 속도가 빠르다.

**링크드 리스트**

+ 데이터의 최대 개수가 정해져 있지 않다.
+ 삭입, 삭제가 쉽다.



## 👎단점

**배열**

+ 항상 최대 개수를 정해야 한다.

**링크드 리스트**

+ 노드를 따라서 조회를 해야하기 때문에 조회가 힘들다.

