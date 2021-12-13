data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String?,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val signedIn: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val postponedId: Int,
    val description: String,
    val attachment: List<Attachments>
){


    override fun toString(): String {
        return "My $id post, ownerId = $ownerId, message: $message, pin accesses: $canPin, attachment: $attachment"
    }

    var message = text ?: "404 not found :("





}

