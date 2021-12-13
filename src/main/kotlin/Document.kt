open class Document(
    override var type: String,
    override var id: Int,
    override var ownerId: Int,
): Attachments() {
    var title: String = "Microsoft Office Doc"
    var size: Int = 100
    var ext: String = "null"
    override fun toString(): String {
        return "DOCUMENT"
    }
}