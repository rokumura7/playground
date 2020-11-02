# Prototype Pattern

## 概要
インスタンスから別のインスタンスを作り出すパターン

## 登場人物
### Prototype
インスタンスをコピーして新しいインスタンスを作るためのメソッドを定義

サンプル：`Product`

### Concrete Prototype
Prototypeの実装

サンプル：`MessageBox`, `UnderlinePen`

### Client
インスタンスをコピーするメソッドを利用して新しいインスタンスを生成する

サンプル：`Manager`

## MEMO
`clone()`は`java.lang.Object`に定義されている  
`java.lang.Cloneable`はクローンの生成が可能かどうかを示すインターフェースだが、実処理を何も持たないマーカーインターフェースである

なお、`clone()`は`field-for-field copy`（=Shallow Copy）であるため、  
フィールドの先にオブジェクトや配列がある場合は、`clone()`を独自にオーバーライドする必要がある。
