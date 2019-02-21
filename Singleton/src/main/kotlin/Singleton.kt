import java.time.LocalDateTime
import java.util.*

object Singleton {
    val created = LocalDateTime.now()

    fun write() {
        println("write")
    }

    fun read()  {
        println("read")
    }
}