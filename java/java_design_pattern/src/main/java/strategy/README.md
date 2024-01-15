# Strategy Pattern

## 概要
任意のアルゴリズムに切り替えるパターン

## 登場人物

### Strategy
戦略を利用するためのインターフェース  

サンプル：`Strategy`

### Concrete Strategy
Strategyの実装

サンプル：`WinningStrategy`, `ProbStrategy`

### Context
Strategyを利用する役  
Concrete Strategyのインスタンスを持ち、必要に応じて利用（Strategyのインターフェースしか知らない）

サンプル：`Player`
