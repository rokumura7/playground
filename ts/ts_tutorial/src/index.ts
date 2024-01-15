// コメント
/**
 * 複数行コメント
 */

// コンソール出力
console.log('Hello World');

// 変数
let x = 1;
console.log(x);
x = 10;
console.log(x);

// 定数
const y = 2;
console.log(y);
// y = 100; 定数のため再代入不可

// for文
for (let i = 0; i < 5; i++) {
  console.log(`${i}回目`);
}

// while文
let i = 0;
while (i < 5) {
  console.log(`${i}回目`);
  i++;
}

// if文
const age = 30;
if (age >= 20) {
  console.log('adult');
} else {
  console.log('child');
}

// switch文
let v = 0;
v = 1;

switch (v) {
  case 1:
    console.log('A');
    break;
  case 2:
    console.log('B');
    break;
  default:
    console.log('default');
    break;
}

// 関数
const sum = (n1: number, n2: number): number => n1 + n2;
console.log(sum(10, 200));

// 型ガード
const typeguardFunc = (arg: unknown): void => {
  // console.log(arg.length) エラーになる
  // console.log(arg * 2)    エラーになる
  if (typeof arg == 'string') {
    console.log(arg.length); // stringとして扱われる
  } else if (typeof arg == 'number') {
    console.log(arg * 2); // numberとして扱われる
  } else {
    console.log(typeof arg);
  }
};
typeguardFunc(10);
typeguardFunc('abc');

// Type Alias
// 型の定義
type User = {
  id: number;
  name: string;
};
const userFunc = (u: User) => console.log(`id: ${u.id} = name: ${u.name}`);
userFunc({ id: 1, name: 'hoge' });
// userFunc({ id: 1}); 構造が合わないためエラー

// 交差型（intersection types）
type StrAndNum = { str: string } & { num: number };
const funcIntersection = (arg: StrAndNum): string => `${arg.str} : ${arg.num}`;
console.log(funcIntersection({ str: 'hoge', num: 2 }));
// console.log(funcIntersection({str: 'hoge'))

// 共用体型（union types）
type StrOrNum = string | number;
const funcUnion = (arg: StrOrNum): string => `${arg}`;
console.log(funcUnion('fuga'));
console.log(funcUnion(2));

// 共用体型 -> 取りうる値の制御を行った場合
type Fruits = 'apple' | 'banana' | 'orange';
const funcFruits = (f: Fruits): void => console.log(f);
funcFruits('apple');
// funcFruits('pork') エラーになる

// TODO: Mapped Types

// interface
// オブジェクトの構造や振る舞いを定義
// 同名のinterfaceを定義するとマージされる
interface IUser {
  id: number;
  name: string;
}
interface IUser {
  age: number;
}
const u: IUser = {
  id: 1,
  name: 'hoge',
  age: 30,
};
console.log(u);

// クラス
class Student {
  fullName: string;
  constructor(
    public firstName: string,
    public middleInitial: string,
    public lastName: string
  ) {
    this.fullName = firstName + ' ' + middleInitial + ' ' + lastName;
  }
}

interface Person {
  firstName: string;
  lastName: string;
}

function greeter(person: Person) {
  return 'Hello, ' + person.firstName + ' ' + person.lastName;
}

const user = new Student('Jane', 'M', 'User');

console.log(greeter(user));
