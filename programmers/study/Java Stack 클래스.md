# Java Stack ํด๋์ค

## ๐์ ์

+ ์์ ์ถ(์ ์ถํ์), LIFO ๋ผ๊ณ  ํ๋ค.
+ ํ ์ชฝ ๋์์๋ง ์๋ฃ(๋ฐ์ดํฐ)๋ฅผ ๋ฃ๊ณ  ๋บ ์ ์๋ ํ์์ ์๋ฃ ๊ตฌ์กฐ์ด๋ค.
+ ์คํ ๊ตฌ์กฐ์์ ๊ฐ์ฅ ์๋จ์ ์๋ ๋ฐ์ดํฐ๋ฅผ Top์ด๋ผ๊ณ  ํ๋ค.



## ๐์ ์ธ & ํจ์

```java
Stack<Integer> stack = new Stack<>();
```

```java
public Element push(Element item); // ๋ฐ์ดํฐ ์ถ๊ฐ
public Element pop(); // ์ต๊ทผ์ ์ถ๊ฐ๋(Top) ๋ฐ์ดํฐ ์ญ์ 
public Element peek(); // ์ต๊ทผ์ ์ถ๊ฐ๋(Top) ๋ฐ์ดํฐ ์กฐํ
public boolean empty(); // stack์ ๊ฐ์ด ๋น์๋์ง ํ์ธ, ๋น์์ผ๋ฉด true, ์๋๋ฉด false
public int seach(Object o); // ์ธ์๊ฐ์ผ๋ก ๋ฐ์ ๋ฐ์ดํฐ์ ์์น ๋ฐํ, ๊ทธ๋ฆผ์ผ๋ก ์ค๋ชํ๊ฒ ์
```



## ๐ LinkedList๋ก Stack ๊ตฌํ

### ๊ตฌ์กฐ

![image-20220706233521701](C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20220706233521701.png)

### ์์  ์ฝ๋

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

## ๐์ฅ์ 

**๋ฐฐ์ด**

+ ๊ตฌํ์ด ์ฝ๋ค.
+ ๋ฐ์ดํฐ์ ์ ๊ทผ ์๋๊ฐ ๋น ๋ฅด๋ค.

**๋งํฌ๋ ๋ฆฌ์คํธ**

+ ๋ฐ์ดํฐ์ ์ต๋ ๊ฐ์๊ฐ ์ ํด์ ธ ์์ง ์๋ค.
+ ์ญ์, ์ญ์ ๊ฐ ์ฝ๋ค.



## ๐๋จ์ 

**๋ฐฐ์ด**

+ ํญ์ ์ต๋ ๊ฐ์๋ฅผ ์ ํด์ผ ํ๋ค.

**๋งํฌ๋ ๋ฆฌ์คํธ**

+ ๋ธ๋๋ฅผ ๋ฐ๋ผ์ ์กฐํ๋ฅผ ํด์ผํ๊ธฐ ๋๋ฌธ์ ์กฐํ๊ฐ ํ๋ค๋ค.

