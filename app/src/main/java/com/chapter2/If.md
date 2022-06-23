# If문

### if - else

```kotlin
fun main(args: Array<string>) {
	var x: Int = if (10 > 20) 5 else 10
	println("$x")
}
```

```C#
static void Main(string[] args)
{
	int x = 10 > 20 ? 5 : 10;
	Console.WriteLine(x);
}
```


### if - else, and return

```kotlin
fun main(args: Array<string>) {
	var x: Int
	x = if (10 < 20) {
		if (4 == 3) {
			56
		} else {
			96
		}
	} else if (12 > 13) {
		26
	} else {
		27
	}
	println("$x")
}
```