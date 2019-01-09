class BookShelf(maxsize : Int) : Aggregate {
    private val books : Array<Book?> = arrayOfNulls(maxsize)
    private var last : Int = 0

    val length : Int get() = last

    fun getBookAt(index : Int) : Book? {
        return books[index]
    }

    fun appendBook(book : Book) {
        this.books[last] = book
        last++
    }

    override fun iterator(): Iterator {
        return BookShelfIterator(this)
    }
}