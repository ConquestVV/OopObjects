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
    val attachment: List<Attachments>,
    val comments: MutableList<Comment>
){
    private var array = emptyArray<Post>()

    override fun toString(): String {
        val comment = mutableListOf<Comment>(id)
        return "My $id post, ownerId = $ownerId, message: $message, pin accesses: $canPin, attachment: $attachment, comment: $comment"
    }

    private fun <T> mutableListOf(index: Int): MutableList<Comment>? {
        comments += comments.get(id)
        if (index != comments.get(id).postId) {
            return null
        }
        val comment = mutableListOf<Comment>()
        comment += comments.get(id)
        return comment
    }


    var message = text ?: "404 not found :("

}

