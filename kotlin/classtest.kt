fun main(){
    //インスタンス生成
    val greeding = Greeding("Kotlin")
    //クラス内の関数を呼び出し
    greeding.greed(2)
    println()

    //<インスタンスの配列登録>
    //クラスGreeding型のインスタンス用配列を作成
    val greedary = ArrayList<Greeding>()

    for(i in 0..3){
        var greedinginstance = Greeding("${i}")
        greedary.add(greedinginstance)
    }
    
    for(i in 0..3){
        greedary[i].greed(1)
    }
}

class Greeding(_name:String){
    val name = _name
    //インスタンス生成時に呼び出される
    init{
        println("generated class")
    }
    //インスタンス生成時の引数を指定回数分printする関数
    fun greed(num:Int){
        for(i in 1..num){
            println("Hello ${name}")
        }
    }
}