package impl

import `if`.Factory
import `if`.Product
import java.lang.Exception

class iPhoneFactory : Factory() {

    val iphones = mutableListOf<Product>()

    override fun createProduct(mac: String): Product {
        if (iphones.find { item -> item.mac == mac } != null) {
            throw Exception("duplicated mac address")
        }

        return iPhone(mac)
    }

    override fun registerProduct(product: Product) {
        if (iphones.find { item -> item.mac == product.mac } != null) {
            throw Exception("duplicated mac address")
        }

        iphones.add(product)
    }
}