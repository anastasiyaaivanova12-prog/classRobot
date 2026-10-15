enum class Direction {
    UP, DOWN, RIGHT, LEFT
}

class Robot(var x:Int, var y:Int, var direction:Direction){
    fun turnLeft(){
        when (direction) {
            Direction.DOWN -> direction=Direction.RIGHT
            Direction.RIGHT -> direction=Direction.UP
            Direction.UP -> direction=Direction.LEFT
            Direction.LEFT -> direction=Direction.DOWN
            else -> println("Ошибка!")
        }
    }
    fun turnRight(){
        when (direction) {
            Direction.DOWN -> direction=Direction.LEFT
            Direction.LEFT -> direction=Direction.UP
            Direction.UP -> direction=Direction.RIGHT
            Direction.RIGHT -> direction=Direction.DOWN
            else -> println("Ошибка!")
        }
    }
    fun stepForward(){
        when(direction){
            Direction.DOWN -> y--
            Direction.LEFT -> x--
            Direction.UP -> y++
            Direction.RIGHT -> x++
            else -> println("Ошибка!")
        }
    }

    override fun toString(): String {
        return "x: $x, y: $y, dir: $direction"
    }
}