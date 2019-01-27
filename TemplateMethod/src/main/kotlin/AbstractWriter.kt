
abstract class AbstractWriter() {
    abstract fun open()
    abstract fun process(data : Person)
    abstract fun close()

    fun write(data : List<Person>)
    {
        open()

        data.forEach {
            process(it)
        }

        close()
    }
}