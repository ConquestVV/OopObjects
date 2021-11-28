import org.junit.Test
import org.junit.Assert.*

@Suppress("DEPRECATION")
class MainKtTest {

    @Test
    fun update_whenHaveIndexTrue() {
        var arrayOfAttachments = emptyArray<Attachments>()
        arrayOfAttachments += Photo("photo",2,1,1,1,"null","null",0,"null",1,"null")
        val post = Post(0, 1, 1, 1, 1, "text", 1, 1, true, 1, true, true, true, true, true, true, 1, "description", arrayOfAttachments)
        val postt = Post(1, 1, 1, 1, 1, "text", 1, 1, true, 1, true, true, true, true, true, true, 1, "description", arrayOfAttachments)
        WallService.set(index = 0, post = post)
        WallService.set(index = 1, post = postt)
        val result = WallService.update(post = post)

        assertEquals(true, result)
    }

    @Test
    fun update_whenHaveIndexFalse() {
        var arrayOfAttachments = emptyArray<Attachments>()
        arrayOfAttachments += Photo("photo",2,1,1,1,"null","null",0,"null",1,"null")
        val post = Post(1,1,1,1,1,"text",1,1,true,1,true,true,true,true,true,true,1,"description", arrayOfAttachments)
        WallService.set(index = 0, post = post)
        val result = WallService.update(post = post)

        assertEquals(false, result)
    }

    @Test
    fun add_isWorkingCorrectly() {
        var arrayOfAttachments = emptyArray<Attachments>()
        arrayOfAttachments += Photo("photo",2,1,1,1,"null","null",0,"null",1,"null")
        val post = Post(1, 1, 1, 1, 1, "text", 1, 1, true, 1, true, true, true, true, true, true, 1, "description",arrayOfAttachments)
        val expectedNextPost = Post(2, 1, 1, 1, 1, "text", 1, 1, true, 1, true, true, true, true, true, true, 1, "description",arrayOfAttachments)
        val result = WallService.add(post = post)

        assertEquals(expectedNextPost, result)
    }
}



