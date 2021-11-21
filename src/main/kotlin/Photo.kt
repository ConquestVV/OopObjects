open class Photo(
    override var type: String,
    override var id: Int,
    override var ownerId: Int,
    override var userId: Int,
    override var date: Int,
) : Attachments {

    override fun toString(): String {
//        return "My $id photo, ownerId = $ownerId, userid: $userId, date: $date"
    return "PHOTO"
    }


}
