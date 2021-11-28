fun main() {
    var arrayOfAttachments = emptyArray<Attachments>()

    arrayOfAttachments += Photo("photo",2,1,1,1,"null","null",0,"null",1,"null")
    arrayOfAttachments += Audio("audio",1,"HUMBLE.","Kendrick Lamar",5,0,0,0,"null",1,"null")
    arrayOfAttachments += Note("note",1,1,"Note",1,1,"null",0,"null",1,"null")
    arrayOfAttachments += Video("video",1,1,"Happy Cats","meow",1,1,0,"null",1,"null")
    arrayOfAttachments += Document("document",1,1,"MicrosoftWordDoc",5,"ext",1,1,"null",1,"null")


    val myPost = Post(1,1,1,1,1,null,1,1,true,1,true,true,true,true,true,true,1,"description", arrayOfAttachments)
    val mySecondPost = Post(2,1,1,1,1,"text",1,1,true,1,false,true,true,true,true,true,1,"description", arrayOfAttachments)

    WallService.set(0, myPost)
    WallService.set(1, mySecondPost)
    WallService.add(mySecondPost)
    WallService.update(myPost)

    println(WallService.get(0))
    println(WallService.get(1))
    println(WallService.get(2))
}

