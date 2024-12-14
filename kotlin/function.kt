fun main(){
    greeding("World")

    println()

    val calc : Int = sumcalc(1,3)
    println(calc) 

    val myList = listOf("Apple", "Banana", "Cherry")
    printList(myList)

    val array2D = create2DArray(3, 4)
    for (row in array2D) {
        println(row.joinToString())
    }

    array2D[1][1] = 1
    println()
    
    print2dList(array2D)

}

fun greeding(greed : String){
    println("Hello ${greed}!!")
}

//返り値Intで定義する
fun sumcalc(num1:Int, num2:Int):Int{
    return (num1 + num2)
}

//リストを引数とする例
fun printList(items: List<String>) {
    for (item in items) {
        println(item) 
        } 
}

//二次元配列を引数とする例
fun print2dList(items: Array<Array<Int>>) {
    for (itemR in items) {
        for (itemC in itemR){
            print(itemC)
            print(" ")
        }
        println()
    } 
}
//二次元配列を返り値とする例
fun create2DArray(rows: Int, cols: Int): Array<Array<Int>> {
    val array = Array(rows) { Array(cols) { 0 } }
    return array
}
