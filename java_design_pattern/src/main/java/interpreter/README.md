# Interpreter Pattern

## 概要
メインの処理を変更せずミニプログラムの改修だけを行うパターン

## 登場人物
### Abstract Expression（抽象的な表現）
構文木のノードに共通のインターフェースを定義する

サンプル：Node

### Terminal Expression（終端となる表現）
BNFのターミナルエクスプレッションに対応する

サンプル：PrimitiveCommandNode

### Non-terminal Expression（非終端となる表現）
BNFのノンターミナルエクスプレッションに対応する

サンプル：ProgramNode, CommandNode, RepeatCommandNode, CommandListNode

### Context（文脈、前後関係）
インタプリタが構文解析を行うための情報を提供する

サンプル：Context

### Client（依頼者）
構文木を組み立てるためにTerminalExpressionやNon-terminalExpressionを呼び出す

サンプル：App
