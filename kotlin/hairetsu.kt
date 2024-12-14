fun main() {
    //行数を入力
    print("input rows：")
    val rows = readLine()!!.toInt()
    //列数を入力
    print("input colmun：")
    val cols = readLine()!!.toInt()

    // 入力された行数と列数で二次元配列を生成し、0で初期化
    val array = Array(rows) { IntArray(cols) { 0 } }

    // 二次元配列の内容を表示
    for (row in array) {
        for (value in row) {
            print("$value ")
        }
        println()
    }
}