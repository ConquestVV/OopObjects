import java.util.*

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    //val comments: Objects,
    //val likes: Objects,
    //val reposts: Objects,
    //val vies: Objects,
    val signedIn: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    //val donut: Objects,
    val postponedId: Int,
    val description: String){

    override fun toString(): String {
        return "My $id post"
    }
}