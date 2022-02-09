object WallService {
    private var array = emptyArray<Post>()
    private var comments = mutableListOf<Comment>()

    fun createComment(comment: Comment): Comment {
        val id = comment.postId
        val exception = findById(id)?.comments ?: throw PostNotFoundException("No post with id $id")
        comments.add(id,comment)

        return comments.last()
    }

    fun findById(id: Int): Post? {
        for (post in array) {
            if (post.id == id) {
                return post
            }
        }
        return null
    }

    fun add(post: Post): Post {
        var postCopy = post.copy(id = post.id + 1)
        array += postCopy
        return array.last()
    }

    fun get(index: Int) = array.getOrNull(index)

    fun set(index: Int, post: Post){
        array += post
        array[index] = post
    }

    fun update(post: Post): Boolean {
        var haveIndex = false
        var index = array.indexOf(post)
        for ((index, post) in array.withIndex()) {
            if (index == post.id) {
                haveIndex = true
                break
            } else haveIndex = false
        }
        array[index] = post.copy(
            id = post.id,
            ownerId = post.ownerId + 1,
            fromId = post.fromId + 1,
            createdBy = post.createdBy + 1
        )
        return haveIndex
    }



}