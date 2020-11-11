# Decorator Pattern

## 概要
包まれることを変更することなく機能を追加(デコレート)を行うパターン

## 登場人物

### Component
機能を追加するときの核になる役  
例えれば、デコレーション前のスポンジケーキ

サンプル：`Display`

### Concrete Component
Componentの実装  

サンプル：`StringDisplay`

### Decorator
Componentと同一のインターフェースを持ち、飾る対象のComponentを持っている  
Decoratorは飾る対象を知っている

サンプル：`Border`

### Concrete Decorator
Decoratorの実装
  
サンプル：`SideBorder`, `FullBorder`
