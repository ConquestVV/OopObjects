interface Video {
    val id: Int
        get() = 1

    val ownerId: Int
        get() = 1

    val title: String
        get() = "name"

    val description: String
        get() = "opisanie"

    val duration: Int
        get() = 1
}