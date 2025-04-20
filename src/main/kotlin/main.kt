import data.*
import service.WallService

fun main() {

    WallService.addPost(
        Post(
            id = 0,
            ownerId = 2,
            fromId = 2,
            date = 150
        )
    )

    WallService.updatePost(
        Post(
            id = 1,
            ownerId = 10,
            fromId = 10,
            date = 250,
            text = "Это мой пост!"
        )
    )

    WallService.createComment(
        1, Comment(
            1, 2,
            fromId = 1,
            date = 260,
            text = "Это мой первый комментарий"
        )
    )

    WallService.createComment(
        1, Comment(
            2, 2,
            fromId = 1,
            date = 270,
            text = "Это мой второй комментарий"
        )
    )


    println(WallService)
}