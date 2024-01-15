# Facade Pattern

## 概要


## 登場人物
### Facade（正面）
システムを構成しているその他大勢の「シンプルな窓口」  
高レベルなインターフェースを外部に提供

サンプル：PageMaker

### システムを構成するその他大勢
Facadeから呼び出されるがFacadeのことは意識せず、Facadeを呼び出すこともない

サンプル：Database, HtmlWriter

### Client
Facadeを利用

サンプル：App
