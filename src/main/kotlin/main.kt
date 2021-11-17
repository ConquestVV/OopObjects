import kotlin.Unit.toString

fun main() {

    val myPost = Post(1,1,1,1,1,"text",1,1,true,1,true,true,true,true,true,true,1,"description")
    val mySecondPost = Post(2,1,1,1,1,"text",1,1,true,1,true,true,true,true,true,true,1,"description")


    WallService.set(0, myPost)
    WallService.set(1, mySecondPost)
    WallService.add(mySecondPost)
    WallService.update(myPost)

    println(WallService.get(0))
    println(WallService.get(1))
    println(WallService.get(2))

}

