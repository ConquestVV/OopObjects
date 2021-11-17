import org.junit.Test
import org.junit.Assert.*

@Suppress("DEPRECATION")
class MainKtTest {

    @Test
    fun update_whenHaveIndexTrue() {
        val post = Post(0, 1, 1, 1, 1, "text", 1, 1, true, 1, true, true, true, true, true, true, 1, "description")
        val postt = Post(1, 1, 1, 1, 1, "text", 1, 1, true, 1, true, true, true, true, true, true, 1, "description")
        WallService.set(index = 0, post = post)
        WallService.set(index = 1, post = postt)
        val result = WallService.update(post = post)

        assertEquals(true, result)
    }

    @Test
    fun update_whenHaveIndexFalse() {
        val post = Post(1,1,1,1,1,"text",1,1,true,1,true,true,true,true,true,true,1,"description")
        WallService.set(index = 0, post = post)
        val result = WallService.update(post = post)

        assertEquals(false, result)
    }

    @Test
    fun add_isWorkingCorrectly() {
        val post = Post(1, 1, 1, 1, 1, "text", 1, 1, true, 1, true, true, true, true, true, true, 1, "description")
        val expectedNextPost = Post(2, 1, 1, 1, 1, "text", 1, 1, true, 1, true, true, true, true, true, true, 1, "description")

        val result = WallService.add(post = post)

        assertEquals(expectedNextPost, result)
    }
}



