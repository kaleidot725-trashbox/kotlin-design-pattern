fun main(args : Array<String>) {
    val bookShelf : BookShelf = BookShelf(4)
    bookShelf.appendBook(Book("Around the World in 80 Days"))
    bookShelf.appendBook(Book("Bible"))
    bookShelf.appendBook(Book("Cinderella"))
    bookShelf.appendBook(Book("Daddy-Long-Legs"))

    val iterator : Iterator = bookShelf.iterator()
    while (iterator.hasNext()) {
        val book : Book = iterator.next() as Book
        println(book.name)
    }

    val array : Array<Book?> = arrayOfNulls(4)
    array[0] = Book("Around the World in 80 Days")
    array[1] = Book("Bible")
    array[2] = Book("Cinderalla")
    array[3] = Book("Daddy-Long-Legs")
    for(i in 0..3){
        println(array[i]?.name)
    }

    val list : MutableList<Book> = mutableListOf()
    list.add(Book("Around the World in 80 Days"))
    list.add(Book("Bible"))
    list.add(Book("Cinderalla"))
    list.add(Book("Daddy-Long-Legs"))
    for(i in 0..3){
        println(list.get(i))
    }
}