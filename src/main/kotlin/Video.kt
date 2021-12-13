open class Video(
    override var type: String,
    override var id: Int,
    override var ownerId: Int,
    ): Attachments() {
    var title: String = "Cuttie cats"
    var description: String = "meow"
    var duration: Int = 120
    override fun toString(): String {
        return "VIDEO"
    }
}
