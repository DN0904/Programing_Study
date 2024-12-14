fun main(){    //コンソールへの出力
    println("Hello world")

    //コンソールからの入力受付
    print("数字を入力：")
    val inputInt  = readLine()!!.toInt() 
    println(inputInt)

    //リスト定義(listは内容の変更不可)
    val testlist = listOf("1","2","3")
    println(testlist)

    println("\n")

    //mutableListOfは要素の追加変更が可能
    val testmutablelist = mutableListOf("Red","Orange","Yello")
    testmutablelist.add("Green")
    testmutablelist[1] = inputInt.toString()
    println(testmutablelist)

    println("\n")
    //listの要素でループ
    println("listの中身でループ")
    for(i in 1..3){
        println(i)
    }

    println("\n")
    //listの要素でループ(repeat)
    repeat(testmutablelist.size){
        println(it) //itにはループしているリストの要素が入る
    }

    println("\n")
    //forEachで要素をループ
    val ary = arrayOf(1,2,3,4,5)
    ary.forEach{ i ->
        println(i)
    }

    println("\n")
    //forEachで要素をループ
    testmutablelist.forEach{ item ->
        println(item)
    }

    //標準入力をspace区切りで行った場合の受け取り方
    print("input number a b:")
    val (a, b) = readLine()!!.split(" ").map{it.toInt()}
    println("${a} ${b}")

    //標準入力をスペース区切りで行った場合、リストに入力する
    val num = readLine()!!.toInt()
    var ary = listOf(num)
    ary = readLine()!!.split(" ").map{it.toInt()}
}