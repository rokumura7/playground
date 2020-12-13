# State Pattern

## 概要
インスタンスを共有してメモリ消費を軽くするパターン

## 登場人物
### Flyweight（フライ級）
共有したほうがメモリ効率の良いものを表す

サンプル：BigChar

### Flyweight Factory（フライ級の工場）
Flyweight役を生成し、プールに保管する  
プールに既にある場合は生成せずにそれを提供する

サンプル：BigCharFactory

### Client（依頼者）
FleyweightFactory役を使ってFlyweight役を作り出しそれを利用する

サンプル：BigString
