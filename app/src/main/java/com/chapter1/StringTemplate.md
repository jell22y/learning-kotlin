# 문자열 템플릿

문자열 표현 방법

```kotlin
// $variableName
// ${expression}

fun main(args: Array<string>)
{
	val a = 3
    val aString = "a = $a"

    println(aString) // result is "a = 3"
    
    println("a == 3 ? ${a==3}") // result is "a == 3 ? true"
}
```