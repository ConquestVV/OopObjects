import kotlin.Unit.toString

fun main() {
    val myPost = Post(1,1,1,1,1,"text",1,1,true,1,true,true,true,true,true,true,1,"description")
    val mySecondPost = Post(2,1,1,1,1,"text",1,1,true,1,true,true,true,true,true,true,1,"description")


    println(mySecondPost.toString())

    WallService.add(myPost)
    WallService.add(mySecondPost)
    //println(myPost)

}