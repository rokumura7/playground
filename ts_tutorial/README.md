# ts_tutorial

## プロジェクトの作成

```sh
# package.jsonの作成
npm init

# TypeScriptのインストール
npm install typescript --save-dev
# Node.jsのプログラムに必要な形宣言ファイルをインストール
npm install @types/node --save-dev
```

### 自動コンパイル

```sh
# TypeScriptをコンパイルし、Node.jsで実行するためにts-nodeをインストール
npm install ts-node --save-dev
# ファイル変更のたびにts-nodeを再起動するためにnodemonをインストール
npm install nodemon --save-dev
```

package.jsonを編集
```javascript
 "scripts": {
    "start": "npm run build:live",
    "build": "tsc -p .",
    "build:live": "nodemon --watch 'src/**/*.ts' --exec 'ts-node' src/index.ts"
  },
```
`npm start`で変更のたびに下記が自動で行われる

* nodemonがts-nodeを再実行
* ts-nodeが自動でtsconfig.jsonとTypeScriptバージョンを取得し、TypeScriptをコンパイル
* ts-nodeは出力されたJavaScriptをNode.jsで実行

## 参考
* [Node.js & TypeScriptのプロジェクト作成](https://typescript-jp.gitbook.io/deep-dive/nodejs)