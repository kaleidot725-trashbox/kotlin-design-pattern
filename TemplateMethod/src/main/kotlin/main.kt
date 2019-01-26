fun main(args : Array<String>) {

    val persons = listOf<Person>(Person("太郎", "姫路"), Person("真喜子", "榊"), Person("優輔", "喜々津"))
    val csvDataProcessor = CsvDataProcessor<Person>( "persons.csv", arrayOf("firstName", "lastName"), Person::class.java)
    val jsonDataProcessor = JsonDataProcessor<Person>("persons.json", Person::class.java)

    println("CSV :")
    csvDataProcessor.write(persons)
    val personsFromCsv = csvDataProcessor.read()
    personsFromCsv.forEach {
        println(" ${it.lastName} ${it.firstName}")
    }

    println()
    
    println("Json :")
    jsonDataProcessor.write(persons)
    val personsFromJson = jsonDataProcessor.read()
    personsFromJson.forEach {
        println(" ${it.lastName} ${it.firstName}")
    }
}