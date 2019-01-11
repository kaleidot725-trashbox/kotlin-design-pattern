class EntranceCounterInheritance : Counter(), Entrance {
    override val headcount : Int  get () = super.count
    override fun enter() { super.increment() }
    override fun exit() { super.decrement() }
    override fun exitAll() { super.reset()}
}