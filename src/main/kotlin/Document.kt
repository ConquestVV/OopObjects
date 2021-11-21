interface Document {
    val id: Int
        get() = 1

    val ownerId: Int
        get() = 1

    val title: String
        get() = "name"

    val size: Int
        get() = 1

    val ext: String
        get() = "text"
}