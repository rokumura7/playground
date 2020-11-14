# Visitor Pattern

## 概要
データ構造と処理を分離し、構造内を渡り歩き(訪問者=visitor)、構造側はその訪問者を受け入れる処理を実装するパターン

## 登場人物
### Visitor（訪問者）
データ構造の具体的な要素(ConcreteElement役)ごとに訪問したメソッド(`visit`)を宣言  
`visit(element)`はConcreteVisitorで実装

サンプル：Visitor

### Concrete Visitor（具体的な訪問者）
Visitorを実装  
`visit(element)`で個々のConcreteElementごとの処理を記述

サンプル：ListVisitor

### Element（要素）
Visitorの訪問先を表す  
訪問者を受け入れる`accept(visitor)`メソッドを宣言

サンプル：Element

### Concrete Element（具体的要素）
Elementの実装  

サンプル：File, Directory

### Object Structure（オブジェクトの構造）
Elementの集合を扱う  
ConcreteVisitorが個々のElementを扱えるようなメソッドを備える  
サンプルではDirectoryがこの役を努め、`iterator`メソッドを提供

サンプル：Directory
