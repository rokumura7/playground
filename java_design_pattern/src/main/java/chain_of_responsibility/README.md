# Chain of Responsibility Pattern

## 概要
要求を処理する複数のインスタンスを鎖状に並べておき、要求を解決できる処理まで渡り歩くパターン

## 登場人物
### Handler（処理者）
要求を処理するインターフェース  
「次の人」を保持し、自分で処理できない場合「次の人」に要求をまわす  

サンプル：Support

### Concrete Handler（具体的処理者）
要求を処理するHandlerの実装

サンプル：NoSupport, LimitSupport, OddSupport, SpecialSupport

### Client（要求者）
最初のConcreteHandlerに要求を出す

サンプル：App
