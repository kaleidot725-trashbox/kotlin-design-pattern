fun main(args : Array<String>) {

    val persons = listOf<Person>(Person("太郎", "姫路"), Person("真喜子", "榊"), Person("優輔", "喜々津"))
    val csvWriter = CsvWriter( "persons.csv")
    val textWriter = TextWriter("persons.txt")

    csvWriter.write(persons)
    textWriter.write(persons)
}