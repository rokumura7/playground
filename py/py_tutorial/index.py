# コメント

# コンソール出力
print('Hello World')

# 変数
## Pythonでは定数はサポートされていない
x = 1
print(x)
x = 2
print(x)

# 四則演算
print(1 + 1)  # 2
print(3 - 1)  # 2
print(4 * 2)  # 8
print(10 / 2) # 5
print(10 % 3) # 1

# 冪乗
print(5 ** 2) # 25

# if
x = 20
if x < 20:
  print('Under 20')
elif x > 60:
  print('Over 60')
else:
  print('Between 20 and 60')

# for
words = ['cat', 'window', 'defenestrate']
for w in words:
  print(w)

# range関数とfor
for i in range(5):
  print(i)

# 関数定義
def greet(name):
  print('Hello, ' + name)

greet('Hanako')
greet(name = 'Hanako')

# 文字列から配列
text = 'Dog,Pig,Cat'
ary = text.split(',')
print(ary)

# 配列から文字列
join = ('*').join(ary)
print(join)