open class Video(
    override var type: String,
    override var id: Int,
    override var ownerId: Int,
    override var title: String,
    override var description: String,
    override var duration: Int,
    override var userId: Int,
    override var date: Int,
    override var artist: String,
    override var size: Int,
    override var ext: String,
    ): Attachments() {
    override fun toString(): String {
        return "VIDEO"
    }
}
