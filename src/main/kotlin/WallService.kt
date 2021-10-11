import WallService.posts

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post:Post): Post {
        posts += post
        for ((index,post) in posts.withIndex()) {
            posts[index] = post.copy(id = post.id + 1)
        }
        return posts.last()
    }


}