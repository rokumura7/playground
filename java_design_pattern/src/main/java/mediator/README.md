# Mediator Pattern

## 概要
メンバーは相談役にのみ報告を行い、メンバーへの指示は相談役からのみ行われるパターン  

### メモ
OOPでは一極集中を避けて処理を分散させることが多い。  
ただし、分散させるべきことは分散させ、集中させるべきことは集中させないと、  
クラス分割がかえって災いとなってしまう。

## 登場人物
### Mediator（調停者、仲介者）
Colleagueと通信を行い調整を行うためのインターフェースを宣言

サンプル：Mediator

### Concrete Mediator（具体的な調停者、仲介者）
Mediatorを実装  

サンプル：LoginFrame

### Colleague（同僚）
Mediatorと通信を行うインターフェースを宣言  

サンプル：Colleague

### Concrete Colleague（具体的な同僚）
Colleagueを実装

サンプル：ColleagueButton, ColleagueTextField, ColleagueCheckbox
