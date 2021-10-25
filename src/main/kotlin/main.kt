import kotlin.Unit.toString
import WallService.array

fun main() {

    val myPost = Post(1,1,1,1,1,"text",1,1,true,1,true,true,true,true,true,true,1,"description")
    val mySecondPost = Post(2,1,1,1,1,"text",1,1,true,1,true,true,true,true,true,true,1,"description")
    val service = WallService

    array += myPost
    array += mySecondPost


    println(myPost)
    service.add(mySecondPost)
    service.update(myPost)
    println(array.first())
    println(array.last())
    println(array.size)


}

