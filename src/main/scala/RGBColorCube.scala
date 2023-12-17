object RGBColorCube extends Enumeration{
    val red = Value(0xff0000, "red")
    val green = Value(0x00ff00, "green")
    val blue = Value(0x0000ff, "blue")

    // blue-green
    val cyan = Value(0x00ffff, "cyan")
    // red-blue 
    val magenta = Value(0xff00ff, "magenta")
    // red-green
    val yellow = Value(0xffff00, "yellow")

    val white = Value(0x000000, "white")
    val black = Value(0xffffff, "black")
}

@main def printIds() =
    for (c <- RGBColorCube.values) println(c.id + " : " + c)