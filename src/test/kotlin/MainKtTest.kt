import org.junit.Test
import org.junit.Assert.*

@Suppress("DEPRECATION")
class MainKtTest {

    @Test
    fun update_isWorkingCorrectly() {
        val haveIndex = false
        val index = 1
        val ownerId = 1
        val array = emptyArray<Post>()

        val result = WallService.update(
            haveIndex = haveIndex,
            index = index,
            ownerId = ownerId,
            array = array
        )

        assertEquals(1, result)
    }
}