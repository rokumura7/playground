# Abstract Factory Pattern

## 概要
各パーツの具体的な実装には意識を向けず、インターフェースのみで組み立てるパターン  

抽象的な工場で、抽象的な部品を組み合わせて、抽象的な製品を生成する

## 登場人物

### Abstract Product
Abstract Factoryによって生成される抽象的な製品や部品のインターフェースを定める  
サンプル：`Link`, `Tray`, `Page`

### Abstract Factory
Abstract Productを生成するためのインターフェースを定める
サンプル：`Factory`

### Client
Abstract FactoryとAbstract Productのインターフェースを用いて仕事を行う  
サンプル：`App`

### Concrete Product
Abstract Productの実装  
サンプル：`ListLink`, `ListTray`など

### Concrete Factory
Abstract Factoryの実装  
サンプル：`ListFactory`, `TableFactory`
