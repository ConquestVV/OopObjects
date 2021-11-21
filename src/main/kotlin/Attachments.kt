interface Attachments {
    var type: String
    var id: Int
    var ownerId: Int
    var userId: Int
    var date: Int
//    var title: String
//    var artist: String
//    var duration: Int

    fun get(type:Attachments) = "$type"
}





