import `if`.Factory
import `if`.Product
import impl.iPhoneFactory

fun main(args: Array<String>) {
    val factory : Factory = iPhoneFactory()
    val product1 : Product = factory.create("80-88-31-47-c9-0c")
    val product2 : Product = factory.create("13-54-01-93-16-bb")
    val product3 : Product = factory.create("b7-ea-3a-c3-b0-cb")

    product1.apply {
        boot()
        reboot()
        shutdown()
    }

    product2.apply {
        boot()
        reboot()
        shutdown()
    }

    product3.apply {
        boot()
        reboot()
        shutdown()
    }
}