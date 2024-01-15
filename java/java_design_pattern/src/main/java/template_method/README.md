# Template Method Pattern

## 概要
親が枠組みを作り、具体的な内容を子に任せるパターン

## 登場人物
### Abstract Class
テンプレートメソッドを実装  
そのテンプレートメソッドで利用する抽象メソッドの宣言も行う

### Concrete Class
AbstractClassで宣言された抽象メソッドを実装する  
ここで実装されたメソッドが親のテンプレートメソッドから呼び出される
