/*
Найти индекс последнего локального максимума в списке.
Локальный максимум — это элемент, который больше любого из своих соседей.
Элементы индексируются с нуля.

Подсказка. Цикл for: печатаем все элементы коллекции numbers, кроме первого и последнего

    val numbers = listOf(1,2,3)
    for(idx in 1..numbers.lastIndex - 1)
        println(numbers[idx])
 */

fun lastLocalMaxInd(numbers: List<Int>): Int {
    var answer: Int = -1
    for (idx in 0..numbers.lastIndex){
         var l_n:Int = if (idx - 1 >= 0) idx - 1 else idx + 1
         var r_n:Int = if (idx + 1 <= numbers.lastIndex) idx + 1 else idx - 1
         if((numbers[idx] > numbers[l_n]) and (numbers[idx] > numbers[r_n])){
             answer = idx
         }
     }
    return answer
}

fun main(args: Array<String>) {
    println(lastLocalMaxInd(listOf(0,4,2,6,3,8,5,3)))
}