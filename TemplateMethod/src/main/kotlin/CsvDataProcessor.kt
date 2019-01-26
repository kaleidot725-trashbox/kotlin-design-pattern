import com.opencsv.CSVWriter
import java.io.FileWriter
import com.opencsv.bean.ColumnPositionMappingStrategy
import com.opencsv.bean.StatefulBeanToCsvBuilder
import com.opencsv.bean.CsvToBeanBuilder
import java.io.FileReader

class CsvDataProcessor<T>(name : String, property : Array<String>, clazz: Class<T>) : AbstractDataProcessor<T>(clazz)
{
    private val name : String = name
    private val mappingStrategy = ColumnPositionMappingStrategy<T>().apply {
        type = clazz
        setColumnMapping(*property)
    }

    override fun write(data: List<T>) {
        FileWriter(name).use {
            var beanToCsv = StatefulBeanToCsvBuilder<T>(it)
                .withMappingStrategy(mappingStrategy)
                .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                .build()
            beanToCsv.write(data)
        }
    }

    override fun read(): List<T> {
        FileReader(name).use {
            var csvToBean = CsvToBeanBuilder<T>(it)
                .withMappingStrategy(mappingStrategy)
                .build()
            return csvToBean.parse()
        }
    }
}