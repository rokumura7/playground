# Command Pattern

## 概要
命令を、動作ではなく、インスタンスという一個の「もの」として表現するパターン

## 登場人物
### Command（命令）
命令のインターフェースを定義する  

サンプル：Command

### Concrete Command（具体的命令）
Commandの実装  

サンプル：MacroCommand, DrawCommand

### Receiver（受信者）
Command役が実行する時に対象となる  
命令の受け取り手  
サンプルプログラムではDrawCommandの命令をDrawCanvasが受け取っている

サンプル：DrawCanvas

### Client（依頼者）
ConcreteCommandを生成し、Receiverを割り当てる  
サンプルプログラムではAppがマウスドラッグを起点にDrawCommandのインスタンスを生成し、ReceiverのDrawCanvasをコンストラクタに渡している

サンプル：App

### Invoker（起動者）
命令の実行を開始する  
サンプルプログラムではAppとDrawCanvasがCommandインターフェースのexecuteを呼び出している

サンプル：App, DrawCanvas
