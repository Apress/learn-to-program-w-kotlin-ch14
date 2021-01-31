package lpk.imaging

import java.nio.file.Paths

fun main() {
    PhotoDisplayer().doLaunch()
}
class PhotoDisplayer : PictureDisplayer() {
    private val IMAGES = "src/main/resources/images/"
    override fun createPicture() : Picture {
        val file = Paths.get(IMAGES + "bay.png").toFile()
        return loadPictureFromFile(file)
    }
}
