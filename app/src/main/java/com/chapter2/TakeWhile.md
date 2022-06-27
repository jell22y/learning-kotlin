
# takeWhile, forEach

### takeWhile, forEach

```kotlin  
//kotlin
val numbers = arrayOf(5, 6, 7, 1, 3, 4, 5, 7, 12, 1)

(0..9).takeWhile {  
  println("Inside takeWhile")  
    it < numbers[it]  
}.forEach {
  println("Inside forEach")  
} 
```  

```C#  
//C#
int[] numbers = new int[] {5, 6, 7, 1, 3, 4, 5, 7, 12, 1};
		
numbers.TakeWhile((n, index) => index < n).ToList().ForEach(m => Console.WriteLine(m));  
```  


### asSequence

지연처리, takeWhile 모두 동작한 후 결과를 forEach 에 넘기지 않고
forEach 에서 필요로 할 때, 하나씩 확인 후 넘긴다.

```kotlin  
val numbers = arrayOf(5, 6, 7, 1, 3, 4, 5, 7, 12, 1)  
  
(0..9).asSequence().takeWhile {  
  println("Inside takeWhile")  
  it < numbers[it]  
}.forEach {  
  println("Inside forEach")  
}  

/*
result
Inside takeWhile
Inside forEach
Inside takeWhile
Inside forEach
Inside takeWhile
Inside forEach
Inside takeWhile
*/
  
(0..9).takeWhile {  
  println("Inside takeWhile")  
    it < numbers[it]  
}.forEach {  
  println("Inside forEach")  
}

/*
result
Inside takeWhile
Inside takeWhile
Inside takeWhile
Inside takeWhile
Inside forEach
Inside forEach
Inside forEach
*/
```