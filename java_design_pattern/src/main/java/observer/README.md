# Observer Pattern

## 概要
観察対象(=Subject)の状態が変化すると、観察者(=Observer)に通知されるパターン

## 登場人物
### Subject（被験者）
観察される側を表す。観察者であるObserverに登録するメソッドと、削除するメソッドを持っている。  

サンプル：NumberGenerator

### Concrete Subject（具体的な被験者）
Subjectの実装  
状態の変化があった場合、Observerに通知を行う。

サンプル：RandomNumberGenerator

### Observer（観察者）
Subjectからの状態変化を通知してもらう  

サンプル：Observer

### Concrete Observer（具体的な観察者）
Observerの実装  
Observer.updateメソッド内でSubjectの現在の状態を取得する。

サンプル：DigitObserver, GraphObserver
