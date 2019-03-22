package main

abstract class Product : Cloneable {
    abstract fun createClone() : Product
}
