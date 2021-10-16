import kotlin.Unit.toString

fun main() {
    var array = emptyArray<Post>()

    val myPost = Post(1,1,1,1,1,"text",1,1,true,1,true,true,true,true,true,true,1,"description")
    val mySecondPost = Post(2,1,1,1,1,"text",1,1,true,1,true,true,true,true,true,true,1,"description")

    array += myPost
    array += mySecondPost

    fun add(post: Post): Post {
        array += post
        for ((index, post) in array.withIndex()) {
            array[index] = post.copy(id = post.id + 1)
        }

        return array.last()
    }

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


    update(myPost)
    println(array.first())
    add(mySecondPost)
    println(array.last())
    println(array.size)


}