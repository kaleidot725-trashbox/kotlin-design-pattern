class EntranceCounterDevolution : Entrance {
    private val counter : Counter = Counter()
    override val headcount : Int  get () = counter.count
    override fun enter() { counter.increment() }
    override fun exit() { counter.decrement() }
    override fun exitAll() { counter.reset()}
}