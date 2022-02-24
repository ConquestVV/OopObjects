import org.junit.Test
import org.junit.Assert.*

@Suppress("DEPRECATION")
class MainKtTest {

    @Test
    fun update_whenHaveIndexTrue() {
        var arrayOfAttachments = emptyList<Attachments>()
        val myComment = Comment(1,1,"haha")
        val comments: MutableList<Comment> = mutableListOf(myComment)
        arrayOfAttachments += Photo("photo",2,1)
        val post = Post(0, 1, 1, 1, 1, "text", 1, 1, true, 1, true, true, true, true, true, true, 1, "description", arrayOfAttachments, comments)
        val postt = Post(1, 1, 1, 1, 1, "text", 1, 1, true, 1, true, true, true, true, true, true, 1, "description", arrayOfAttachments, comments)
        WallService.set(index = 0, post = post)
        WallService.set(index = 1, post = postt)
        val result = WallService.update(post = post)

        assertEquals(true, result)
    }

    @Test
    fun update_whenHaveIndexFalse() {
        var arrayOfAttachments = emptyList<Attachments>()
        val myComment = Comment(1,1,"haha")
        val comments: MutableList<Comment> = mutableListOf(myComment)
        arrayOfAttachments += Photo("photo",2,1)
        val post = Post(1,1,1,1,1,"text",1,1,true,1,true,true,true,true,true,true,1,"description", arrayOfAttachments, comments)
        WallService.set(index = 0, post = post)
        val result = WallService.update(post = post)

        assertEquals(false, result)
    }

    @Test
    fun add_isWorkingCorrectly() {
        var arrayOfAttachments = emptyList<Attachments>()
        val myComment = Comment(1,1,"haha")
        val comments: MutableList<Comment> = mutableListOf(myComment)
        arrayOfAttachments += Photo("photo",2,1)
        val post = Post(1, 1, 1, 1, 1, "text", 1, 1, true, 1, true, true, true, true, true, true, 1, "description",arrayOfAttachments, comments)
        val expectedNextPost = Post(2, 1, 1, 1, 1, "text", 1, 1, true, 1, true, true, true, true, true, true, 1, "description",arrayOfAttachments, comments)
        val result = WallService.add(post = post)

        assertEquals(expectedNextPost, result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        var arrayOfAttachments = emptyList<Attachments>()
        val myComment = Comment(1,2,"comment")
        val comments: MutableList<Comment> = mutableListOf(myComment)
        arrayOfAttachments += Photo("photo",2,1)
        val post = Post(1, 1, 1, 1, 1, "text", 1, 1, true, 1, true, true, true, true, true, true, 1, "description",arrayOfAttachments, comments)
        WallService.set(0, post)
        WallService.createComment(myComment)
    }

    @Test
    fun createComment_isWorkingCorrectly() {
        var arrayOfAttachments = emptyList<Attachments>()
        val myComment = Comment(1,1,"comment")
        val comments: MutableList<Comment> = mutableListOf(myComment)
        arrayOfAttachments += Photo("photo",2,1)
        val post = Post(1, 1, 1, 1, 1, "text", 1, 1, true, 1, true, true, true, true, true, true, 1, "description",arrayOfAttachments, comments)
        WallService.set(0, post)
        val result = WallService.createComment(myComment)

        assertEquals(comments.last(), result)
    }
}









