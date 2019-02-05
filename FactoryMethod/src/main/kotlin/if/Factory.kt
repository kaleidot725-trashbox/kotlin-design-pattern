package `if`

abstract class Factory {
    fun create(mac : String) : Product {
        val p : Product = createProduct(mac)
        registerProduct(p)
        return p
    }

    abstract protected fun createProduct(mac : String) : Product
    abstract protected fun registerProduct(product : Product)
}