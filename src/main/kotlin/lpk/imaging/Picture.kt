package lpk.imaging

import java.awt.Color

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
