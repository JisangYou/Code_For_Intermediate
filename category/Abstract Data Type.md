## 6. Abstract Data Type

### Definition

- 추상자료형(ADT)
- Def
``` 
구체적인 기능의 완성과정을 언급하지 않고, 순수하게 기능이 무엇인지를 나열한 것
```
 
### Explanation

- ex
```
- int TakeOutMoney(Wallet * pw, int coinNum, int billNum)
    - 첫 번째 인자로 전달된 주소의 지갑에서 돈을 꺼냄
    - 두 번쨰 인자로 꺼낼 동전의 수, 세 번째 인자로 꺼낼 지폐의 수를 전달한다.
    - 꺼내고자 하는 돈의 총액이 반환된다. 그리고 그만큼 돈은 차감된다.

- void PutMoney(Wallet * pw, int CoinNum, int billNum)
    - 첫 번쨰 인자로 전달된 주소의 지갑에 돈을 넣는다.
    - 두 번째 인자로 넣을 동전의 수, 세번째 인자로 넣을 지폐의 수를 전달한다.
    - 넣은 만큼 동전과 지폐의 수가 증가한다. 

```

### Reference

- 위키백과
- 자료구조(윤성우 저)