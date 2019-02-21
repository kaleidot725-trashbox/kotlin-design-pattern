import java.time.LocalDateTime

fun main(args: Array<String>) {
    println("start " + LocalDateTime.now().toString())
    println("created " + Singleton.created.toString())
    Singleton.write()
    Singleton.read()
    println("created " + Singleton.created.toString())
    println("finish " + LocalDateTime.now().toString())
}