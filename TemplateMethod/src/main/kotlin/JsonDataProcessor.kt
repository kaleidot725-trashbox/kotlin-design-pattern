import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import java.io.FileReader
import java.io.FileWriter
import java.lang.reflect.ParameterizedType

class JsonDataProcessor<T>( name : String, clazz: Class<T>) : AbstractDataProcessor<T>(clazz)
{
    private val name : String = name
    private val type : ParameterizedType = Types.newParameterizedType(List::class.java, clazz)
    private val adapter : JsonAdapter<List<T>> = Moshi.Builder().build().adapter(type)

    override fun write(data: List<T>) {
        val fileWriter = FileWriter(name)
        val json = adapter.toJson(data)
        fileWriter.write(json)
        fileWriter.flush()
    }

    override fun read(): List<T> {
        val fileReader = FileReader(name)
        val json = fileReader.buffered().readText()
        return adapter.fromJson(json) ?: listOf()
    }
}