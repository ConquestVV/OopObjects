data class Comment(
    val ownerId: Int,
    val postId: Int,
    val comment: String,
) {


    override fun toString(): String {
        return "$comment. Added by User #$ownerId to post $postId."
    }
}
