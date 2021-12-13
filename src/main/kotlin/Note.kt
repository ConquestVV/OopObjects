open class Note(
    override var type: String,
    override var id: Int,
    override var ownerId: Int,
): Attachments() {
    var title: String = "Notes"
    var date: Int = 15
    override fun toString(): String {
        return "NOTE"
    }
}