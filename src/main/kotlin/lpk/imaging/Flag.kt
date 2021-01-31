package lpk.imaging

import java.awt.Color

fun main() {
    Flag().show()
}

class Flag : PictureDisplayer() {

    fun createPictureOfFlag(): Picture {
        val height = 300
        val width = 450

        val pixels = Array(height) {
            Array(width) { Color(255, 255, 255) }
        }
        for (row in 0..height - 1) {
            for (column in 0..width - 1) {
                if (row < height / 2) {
                    pixels[row][column] = Color(255, 0, 0)
                } else {
                    pixels[row][column] = Color(255, 255, 255)
                }
            }
        }
        return Picture(pixels)
    }

    //Don't change anything below here.
    override fun createPicture(): Picture {
        return createPictureOfFlag()
    }

    fun show() {
        doLaunch()
    }
}