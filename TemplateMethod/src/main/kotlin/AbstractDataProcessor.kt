
abstract class AbstractDataProcessor<T>(clazz: Class<T>) {
    abstract fun write(data : List<T>)
    abstract fun read() : List<T>
}