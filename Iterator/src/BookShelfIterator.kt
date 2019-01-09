class BookShelfIterator(bookShelf : BookShelf) : Iterator{
    private val bookShelf : BookShelf = bookShelf
    private var index : Int = 0

    override fun hasNext(): Boolean = (index < bookShelf.length)
    override fun next(): Object {
        val book = bookShelf.getBookAt(index)
        index++
        return book as Object
    }
}