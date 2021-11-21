open abstract class Audio(
    override var type: String,
    override var id: Int,
//    override var title: String,
//    override var artist: String,
//    override var duration: Int,
) : Attachments {

    override fun toString(): String {
//        return "My $id photo, ownerId = $ownerId, userid: $userId, date: $date"
        return "AUDIO"
    }


}

//interface Audio {
//
//
//    val id: Int
//        get() = 1
//
//    val ownerId: Int
//        get() = 1
//
//    val title: String
//        get() = "name"
//
//    val artist: String
//        get() = "opisanie"
//
//    val duration: Int
//        get() = 1
//}