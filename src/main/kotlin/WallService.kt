object WallService {
    private var array = emptyArray<Post>()

    fun add(post: Post): Post {
        array += post
        for ((index, post) in array.withIndex()) {
            array[index] = post.copy(id = post.id + 1)
        }

        return array.last()

    }

    fun get(index: Int) = array.getOrNull(index)

    fun update(post: Post): Boolean {
        var haveIndex = false
        for ((index, post) in array.withIndex()) {
            if (index == post.id) {
                haveIndex = true
                break
            } else haveIndex = false
        }
        for ((index, post) in array.withIndex()) {
            array[index] = post.copy(
                id = post.id,
                ownerId = post.ownerId + 1,
                fromId = post.fromId + 1,
                createdBy = post.createdBy + 1
            )
        }
        return haveIndex
    }
}