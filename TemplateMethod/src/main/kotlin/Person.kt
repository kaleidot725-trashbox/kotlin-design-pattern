class Person {
    var firstName: String? = null
    var lastName: String? = null

    constructor() {}
    constructor(firstName: String?, lastName: String?) {
        this.firstName = firstName
        this.lastName = lastName
    }

    override fun toString(): String {
        return "Customer [FirstName= ${this.firstName}, LastName= ${this.lastName}]"
    }
}