# Adapter Pattern
※別名`Wrapper Pattern`

下記の2種類が存在する
1. クラスによるAdapter Pattern（継承を利用）
1. インスタンスによるAdapter Pattergn（委譲を利用）

個人的には継承の考え方のほうがスッキリくる

## 概要
「すでに提供されているもの」と「必要なもの」の「ずれを埋める」パターン  
いまあるリソースを変更なく求める形に適合するパターン  

パソコンを使うために、家庭用電源の「交流100ボルト」を「直流12ボルト」に「変換する」イメージ

## 登場人物

### Target
必要となるメソッドを定める  
サンプル：`Print`

### Client
Targetを利用する  
サンプル：`App`

### Adaptee
適合される側で、大元の情報を持つもの（すでに提供されているもの）  
サンプル：`Banner`

### Adapter
適合する側で、Adapteeの提供するものをClientが求める形に変換する  
サンプル：`PrintBanner`
