# nuxt_todo

## init

Create Nuxt App.
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

Update dependencies.
```bash
$ ncu -u
 nuxt                    ^2.14.6  →  ^2.14.7   
 @nuxt/types             ^2.14.6  →  ^2.14.7   
 @nuxtjs/eslint-module    ^2.0.0  →   ^3.0.0   
 eslint                  ^7.10.0  →  ^7.11.0   
 eslint-config-prettier  ^6.12.0  →  ^6.13.0   
 lint-staged             ^10.4.0  →  ^10.4.2   
```

## Build Setup

```bash
# install dependencies
$ npm install

# serve with hot reload at localhost:3000
$ npm run dev

# build for production and launch server
$ npm run build
$ npm run start

# generate static project
$ npm run generate
```

For detailed explanation on how things work, check out [Nuxt.js docs](https://nuxtjs.org).
