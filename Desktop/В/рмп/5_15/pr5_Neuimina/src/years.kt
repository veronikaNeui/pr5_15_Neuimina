import java.lang.NumberFormatException

fun main(){
    try{
        var age:Int
        println("Введите возраст: ")
        age =readLine()!!.toInt()
        if (age>=0&&age<=120)
        {
            when (age)
            {
                in 0..2->println("младенец")
                in 3..12->println("ребенок")
                in 13..17->println("подросток")
                in 18..64->println("взрослый")
                in 65..120->println("пожилой")
            }
        }
        else{
            println("Возраст не входит в диапозон")
        }


    }catch(e:NumberFormatException)
    {
        println("Введите число")
    }
}
