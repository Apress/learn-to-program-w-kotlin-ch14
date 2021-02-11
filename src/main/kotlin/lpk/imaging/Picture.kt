package lpk.imaging

import java.awt.Color
import java.io.File
import java.io.FileInputStream
import javax.imageio.ImageIO

class Picture(val pixels: Array<Array<Color>>) {
    fun height(): Int {
        return pixels.size
    }

    fun width(): Int {
        return pixels[0].size
    }

    fun pixelByRowColumn(row: Int, column: Int): Color {
        return pixels[row][column]
    }
}
