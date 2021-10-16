import org.junit.Assert.*
import org.junit.Test

@Suppress("DEPRECATION")
class MainKtTest

    @Test
    fun add_isWorkingCorrectly(){
    val haveIndex = false
    val index = 1
    val ownerId = 1
    val array = emptyArray<Post>()

    val result = add(
        array = array,
        haveIndex = haveIndex,
        index = index,
        ownerId = ownerId
    )

        assertEquals(1, result)
    }