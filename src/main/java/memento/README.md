# Memento Pattern

## 概要
カプセル化を保ちつつ、状態を保存してインスタンスのundoやredoを可能とするパターン

## 登場人物
### Originator（作成者）
自分の現在の状態を保存したいときにMementoを作成  
任意のMementoを用いて復元を行う

サンプル：Gamer

### Memento（記念品）
Originatorの内部情報をスナップショットのように保持  
アクセス装飾子を活用して、Originatorにのみ公開するAPIとCaretakerに公開するAPIを作る

サンプル：Memento

### Caretaker（世話をする人）
Originatorの状態からundoするかredoするかを判断し、そのことをOriginatorに伝える  
CaretakerはMementoを保持するがその中身を把握しない

サンプル：App

### Concrete Observer（具体的な観察者）
Observerの実装  
Observer.updateメソッド内でSubjectの現在の状態を取得する。

サンプル：DigitObserver, GraphObserver
