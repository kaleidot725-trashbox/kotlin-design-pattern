import main.ProductData
import main.ProductDefault

fun main(args: Array<String>) {
    val p = ProductDefault()
    val c = p.createClone()
    println("-- Class Clone Test --")
    println("pとpは${if (p === p) "同じ" else "別の"}インスタンス")
    println("pとcは${if (p === c) "同じ" else "別の"}インスタンス")

    val data = ProductData("iPhone", "0000-1111-2222-3333")
    val copyData = data.copy()
    println("-- Data Class Clone Test --")
    println("dataとdataは${if (data === data) "同じ" else "別の"}インスタンス")
    println("dataとcopyDataは${if (data === copyData) "同じ" else "別の"}インスタンス")
}