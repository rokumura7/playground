# Flyweight Pattern

## 概要
実処理が重い場合などに本人ではなくてもできる仕事を肩代わりし、必要に応じて本人を生成・呼び出すパターン

## 登場人物
### Subject（主体）
Proxy役とRealSubject役を同一視するためのインターフェース

サンプル：Printable

### Proxy（代理人）
Clientからの要求を可能な限り実行する  
RealSubjectが必要になった場合生成する

サンプル：PrinterProxy

### RealSubject（実際の主体）
Proxyでは対応ができない場合に利用

サンプル：Printer

### Client（依頼者）
Proxyパターンの利用者

サンプル：App
