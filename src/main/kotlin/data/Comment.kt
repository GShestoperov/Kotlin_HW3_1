package data

data class Comment(
    val id: Long,
    val postId: Long,
    val fromId: Long,
    val date: Long,
    val text: String,
    val replyToUser: Long? = null,
    val replyToComment: Long? = null
) {
}