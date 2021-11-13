import org.junit.Test
import org.junit.Assert.*

@Suppress("DEPRECATION")
class MainKtTest {

    @Test
    fun update_isWorkingCorrectly() {
        val post = Post(1, 1, 1, 1, 1, "text", 1, 1, true, 1, true, true, true, true, true, true, 1, "description")

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

