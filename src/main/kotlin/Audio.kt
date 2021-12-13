open class Audio(
    override var type: String,
    override var id: Int,
    override var ownerId: Int,
) : Attachments(){
    var title: String = "HUMBLE."
    var artist: String = "Kendrick Lamar"
    var duration: Int = 120
    override fun toString(): String {
        return "AUDIO"
    }
}

