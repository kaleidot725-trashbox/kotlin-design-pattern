import java.io.FileWriter

class CsvWriter(name : String) : AbstractWriter()
{
    private val name : String = name
    private val header : String = "lastName,firstName\n"
    private var file : FileWriter? = null

    override fun open() {
        file = FileWriter(name)
        file?.write(header)
    }

    override fun process(data: Person) {
        val csv = "${data.lastName},${data.firstName}\n"
        file?.write(csv)
    }

    override fun close() {
        file?.close()
    }
}