package impl

import `if`.Product

class iPhone(mac : String) : Product {

    override val mac: String = mac

    init {
        println("MACアドレスが${mac}であるiPhoneを作成します。")
    }

    override fun boot() {
        println("MACアドレスが${mac}であるiPhoneのiOSを起動します。")
    }

    override fun reboot() {
        println("MACアドレスが${mac}であるiPhoneのiOSを再起動します。")
    }

    override fun shutdown() {
        println("MACアドレスが${mac}であるiPhoneのiOSをシャットダウンします。")
    }
}