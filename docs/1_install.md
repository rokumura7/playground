# 構築編

## プロジェクトの作成

[公式](https://ja.nuxtjs.org/guide/installation#create-nuxt-app-%E3%82%92%E4%BD%BF%E7%94%A8%E3%81%99%E3%82%8B)に従い`create-nuxt-app`を利用した。

```bash
$ npx create-nuxt-app nuxt_todo

create-nuxt-app v3.4.0
✨  Generating Nuxt.js project in nuxt_todo
? Project name: nuxt_todo
? Programming language: TypeScript
? Package manager: Npm
? UI framework: None
? Nuxt.js modules: (Press <space> to select, <a> to toggle all, <i> to invert selection)
? Linting tools: ESLint, Prettier, Lint staged files
? Testing framework: None
? Rendering mode: Single Page App
? Deployment target: Server (Node.js hosting)
? Development tools: jsconfig.json (Recommended for VS Code if you're not using typescript)
? Continuous integration: None
? Version control system: Git
```

※`UI framework`はNoneを選択したが後でTailwindCSSを入れたので選択すればよかった。。

### TailwindCSSを後から追加

```bash
$ npm install --save-dev @nuxtjs/tailwindcss
```

## ライブラリの更新

`npm install`時にWARNが出たりdependabotから通知が来たり、と古いものがありそうだったためライブラリを最新に。

```bash
$ ncu -u
```

## `package.json`や`.gitignore`などの修正

デフォルトのままで特に問題はないが少し気になったので修正。

### `package.json`

1. `lint`に`.ts`を追加、precommit時に自動フォーマットするように変更
```json
// before
  "scripts": {
    "lint:js": "eslint --ext .js,.vue --ignore-path .gitignore .",
    "lint": "npm run lint:js"
  },
  "lint-staged": {
    "*.{js,vue}": "eslint"
  },

// after
  "scripts": {
    "lint:fix": "eslint --fix --ext .js,.ts,.vue --ignore-path .gitignore .",
    "lint": "npm run lint:fix"
  },
  "lint-staged": {
    "*.{js,ts,vue}": "eslint --fix"
  },
```

2. `dependencies`から`devDependencies`に移動
```json
// before
  "dependencies": {
    "@nuxt/typescript-runtime": "^2.0.0",
    "core-js": "^3.6.5",
    "nuxt": "^2.14.6"
  },
  "devDependencies": {
    "@nuxt/types": "^2.14.6",
  }

// after
  "dependencies": {
    "core-js": "^3.6.5",
    "nuxt": "^2.14.6"
  },
  "devDependencies": {
    "@nuxt/typescript-runtime": "^2.0.0",
    "@nuxt/types": "^2.14.6",
  }
```

### `.gitignore`

不要なものが多かったためほぼ削除。結果下記になった。

```
# Dependency directories
node_modules/

# nuxt.js build output
.nuxt

# Service worker
sw.*

# macOS
**.DS_Store

```