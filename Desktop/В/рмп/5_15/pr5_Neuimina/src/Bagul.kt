import java.lang.NumberFormatException

fun main(){
    try{
        var num:Int
        println("Введите число: ")
        num= readLine()!!.toInt()
        if (num>=0&&num<=9)
        {
            when (num)
            {
                0->println("Ноль")
                1->println("Один")
                2->println("Два")
                3->println("Три")
                4->println("Четыре")
                5->println("Пять")
                6->println("Шесть")
                7->println("Семь")
                8->println("Восемь")
                9->println("Девять")
            }
        }
        else
        {
            println("Число не входит в диапозон")
        }

    }catch(e:NumberFormatException)
    {
        print("Вы ввели не число")
    }
}