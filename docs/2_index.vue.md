# レイアウト修正

デフォルトの表示を最終イメージに一旦作り込み。

## `pages/index.vue`の書き換え

### ピュアHTMLで構造確認

TailwindCSSを使わず一旦構造のみを定義。
合わせて`layouts/default.vue`のCSS定義を精査した。
後々TailwindCSSと競合すると面倒なため。

### TailwindCSSでスタイル定義

[公式](https://tailwindcss.com/docs/installation)と[サンプル集](https://tailwindcomponents.com/)を見ながら定義。  
今回は[こちらのサンプル](https://tailwindcomponents.com/component/todo-list-app)を大いに参考にさせてもらった。