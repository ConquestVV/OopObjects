interface Note {
    val id: Int
        get() = 1

    val ownerId: Int
        get() = 1

    val title: String
        get() = "name"

    val text: String
        get() = "opisanie"

    val date: Int
        get() = 1
}