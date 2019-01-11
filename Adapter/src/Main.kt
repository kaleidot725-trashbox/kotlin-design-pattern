fun main(args : Array<String>) {

    val east : Entrance = EntranceCounterInheritance()
    val west : Entrance = EntranceCounterDevolution()

    east.enter()
    println("東 ${east.headcount}人 入室中")

    east.exit()
    println("東 ${east.headcount}人 入室中")

    east.enter()
    println("東 ${east.headcount}人 入室中")

    east.enter()
    println("東 ${east.headcount}人 入室中")

    east.exitAll()
    println("東 ${east.headcount}人 入室中")

    west.enter()
    println("西 ${west.headcount}人 入室中")

    west.exit()
    println("西 ${west.headcount}人 入室中")

    west.enter()
    println("西 ${west.headcount}人 入室中")

    west.enter()
    println("西 ${west.headcount}人 入室中")

    west.exitAll()
    println("西 ${west.headcount}人 入室中")
}