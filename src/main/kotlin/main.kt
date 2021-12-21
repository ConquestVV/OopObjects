fun main() {
    var arrayOfAttachments = emptyList<Attachments>()

    arrayOfAttachments += Photo("photo",1,1)
    arrayOfAttachments += Audio("audio",1,1)
    arrayOfAttachments += Note("note",1,1)
    arrayOfAttachments += Video("video",1,1)
    arrayOfAttachments += Document("document",1,1)

    val myComment = Comment(1,1,"haha")
    val mySecondComment = Comment(2,2,"omg")
    val myPost = Post(1,1,1,1,1,null,1,1,true,1,true,true,true,true,true,true,1,"description", arrayOfAttachments, myComment)
    val mySecondPost = Post(2,1,1,1,1,"text",1,1,true,1,false,true,true,true,true,true,1,"description", arrayOfAttachments, mySecondComment)



    WallService.set(0, myPost)
    WallService.set(1, mySecondPost)
    WallService.add(mySecondPost)
    WallService.update(myPost)
    WallService.createComment(myComment)
    WallService.createComment(mySecondComment)

    println(WallService.get(0))
    println(WallService.get(1))
    println(WallService.get(2))
}

