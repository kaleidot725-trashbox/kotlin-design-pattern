import java.io.FileWriter

class TextWriter(name : String) : AbstractWriter()
{
    private val name : String = name
    private var count : Int = 0
    private var file : FileWriter? = null

    override fun open() {
        file = FileWriter(name)
    }

    override fun process(data: Person) {
        count++

        var text = "${this.count} ${data.lastName} ${data.firstName}\n"
        file?.write(text)
    }

    override fun close() {
        file?.close()
        count = 0
    }
}