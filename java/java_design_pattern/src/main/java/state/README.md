# State Pattern

## 概要
「状態」をクラスとして表現し、クラスの切り替えを「状態の変化」として表すパターン

## 登場人物
### State（状態）
状態を表すためのもので、状態ごとに異なる振る舞いをインターフェースとして定める  
状態に依存した振る舞いをするメソッドの集まり

サンプル：State

### Concrete State（具体的な状態）
Stateの実装で具体的な個々の状態を表現する  

サンプル：DayState, NightState

### Context（状況、前後関係、文脈）
現在の状態を表すConcreteStateを保持  
Stateパターンの利用に必要なインターフェースを提供

サンプル：Context, SafeFrame（分割して統治せよ）

### Concrete Observer（具体的な観察者）
Observerの実装  
Observer.updateメソッド内でSubjectの現在の状態を取得する。

サンプル：DigitObserver, GraphObserver
