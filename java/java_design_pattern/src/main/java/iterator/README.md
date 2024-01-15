# Iterator Pattern

## 概要
集合体の要素を統一した方法で１つ１つ数え上げていくパターン

## 登場人物
### Iterator
要素を順番にスキャンしていくインターフェースを定める

### Concrete Iterator
Iteratorの実装  
スキャンするための情報を保持しておく必要がある

どのような順番でスキャンするかなどはここで決められる

### Aggregate
Iteratorを作り出すインターフェースを定める  

### Concrete Aggregate
Aggregateの実装  
具体的なIterator(=Concrete Iterator)のインスタンスを生成する
