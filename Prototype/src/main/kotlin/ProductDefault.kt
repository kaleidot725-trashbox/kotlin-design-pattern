package main

class ProductDefault : Product() {
    override fun createClone(): ProductDefault {
        try {
            return clone() as ProductDefault
        } catch (e : CloneNotSupportedException) {
            throw e
        }
    }
}