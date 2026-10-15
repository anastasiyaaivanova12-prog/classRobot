fun moveRobot(r:Robot, toX:Int, toY:Int){
    var needDirX = when{
        r.x < toX -> Direction.RIGHT
        r.x > toX -> Direction.LEFT
        else -> null
    }
    var needDirY = when{
        r.y < toY -> Direction.UP
        r.y > toY -> Direction.DOWN
        else -> null
    }

    if(needDirX!=null){
        while(r.direction!=needDirX){
            when{
                (needDirX==Direction.RIGHT && r.direction == Direction.DOWN)||
                        (needDirX==Direction.LEFT && r.direction == Direction.UP) -> r.turnLeft()
                else -> r.turnRight()
            }
        }
        while(r.x!=toX){
            r.stepForward()
        }
    }

    if(needDirY!=null){
        while(r.direction!=needDirY){
            when{
                (needDirY==Direction.UP && r.direction == Direction.RIGHT) ||
                        (needDirY==Direction.DOWN && r.direction == Direction.LEFT)-> r.turnLeft()
                else -> r.turnRight()
            }
        }
        while(r.y!=toY){
            r.stepForward()
        }
    }
}

fun main(){
    val r = Robot(0,1,Direction.UP)
    println(r.toString())
    println("перемещение")
    moveRobot(r, 3, 7)
    println(r.toString())

    println(' ')

    println(r.toString())
    println("перемещение")
    moveRobot(r, -9, 2)
    println(r.toString())
}