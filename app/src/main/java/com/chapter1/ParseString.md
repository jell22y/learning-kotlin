# 문자열 파싱

1. 단순 파싱

```kotlin
fun main() {
	val str = "123"
	print(str.toLong())
	print(str.toInt())
	print(str.toDouble())
	print(str.toFloat())
}
```

2. 예외처리

```kotlin
fun main() {
	val str = "123"
	print(str.toLongOrNull())
	print(str.toIntOrNull())
}
```

3. 진법 변환

```kotlin
fun main() {
	val str1 = "11"
	val str2 = "333"
	print(str1.toLongOrNull(2)) // result is 3
	print(str2.toIntOrNull(10)) // result is 333
}
```