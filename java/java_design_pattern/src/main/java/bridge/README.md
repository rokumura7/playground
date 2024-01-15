# Bridge Pattern

## 概要
「機能のクラス階層」と「実装のクラス階層」を橋渡しするパターン

## 登場人物

### Abstraction
「機能のクラス階層」の最上位のクラス  
Implementor役のメソッドを使って基本的な機能だけが記述されているクラス  

サンプル：`Display`

### Refined Abstraction
Abstraction役に対して機能を追加したクラス  

サンプル：`CountDisplay`

### Implementor
「実装のクラス階層」の最上位のクラス  
Abstraction役のインターフェースを実装するためのメソッドを規定するクラス  

サンプル：`DisplayImpl`

### Concrete Implementor
具体的にImplementor役のインターフェースを実装するクラス
  
サンプル：`StringDisplayImpl`
