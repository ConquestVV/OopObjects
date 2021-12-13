open class Photo(
    override var type: String,
    override var id: Int,
    override var ownerId: Int,

): Attachments() {
    var albumId: Int = 1
    var userId: Int = 1
    override fun toString(): String {
        return "PHOTO"
    }
}