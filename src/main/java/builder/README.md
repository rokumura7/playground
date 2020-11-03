# Builder Pattern

## 概要
複雑な構造を持ったインスタンスを組み上げていくパターン

## 登場人物

### Builder
インスタンスを作成するためのインターフェースを定める  
サンプル：`Builder`

### Concrete Builder
Builderを実装  
サンプル：`TextBuilder`, `HTMLBuilder`

### Director
Builderのインターフェースを利用  
Builderの実体は知らない  
サンプル：`Director`

### Client
Directorに生成を依頼  
サンプル：`App`
