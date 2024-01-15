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

## lint, prettierの設定

```sh
# 必要なライブラリインストール
npm install -D prettier eslint eslint-config-prettier eslint-plugin-prettier @typescript-eslint/eslint-plugin @typescript-eslint/parser
```

`package.json`の修正
```javascript
  "scripts": {
    "start": "npm run build:live",
    "build": "tsc -p .",
    "build:live": "nodemon --watch 'src/**/*.ts' --exec 'ts-node' src/index.ts",
    "lint": "eslint 'src/**/*.ts'" // 追加
  },
```

`.vscode/settings.json`の追加
```javascript
{
  "editor.codeActionsOnSave": {
    "source.fixAll": true
  }
}
```

`.eslintrc.json`の追加
```javascript
{
  "extends": [
    "eslint:recommended",
    "plugin:@typescript-eslint/eslint-recommended",
    "plugin:@typescript-eslint/recommended",
    "plugin:prettier/recommended",
    "prettier/@typescript-eslint"
  ],
  "plugins": [
    "@typescript-eslint"
  ],
  "env": { "node": true, "es6": true },
  "parser": "@typescript-eslint/parser",
  "parserOptions": {
    "sourceType": "module",
    "project": "./tsconfig.json"
  },
  "rules": {
    "prettier/prettier": [
      "error", {
        "singleQuote": true,
        "trailingComma": "es5"
      }
    ]
  }
}
```

## 参考
* [Node.js & TypeScriptのプロジェクト作成](https://typescript-jp.gitbook.io/deep-dive/nodejs)