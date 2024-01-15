# Composite Pattern

## 概要
「容器」と「中身」を同一視し、再帰的な構造を作るパターン

## 登場人物

### Leaf
「中身」を表す役  
この中には他のものを入れることはできない

サンプル：`File`

### Composite
「容器」を表す役  
LeafやCompositeを入れることができる

サンプル：`Directory`

### Component
LeafとCompositeを同一視するための役  
2つに共通のスーパークラスを定義することで実現

サンプル：`Entry`

### Client
Compositeパターンの利用書
  
サンプル：`App`
