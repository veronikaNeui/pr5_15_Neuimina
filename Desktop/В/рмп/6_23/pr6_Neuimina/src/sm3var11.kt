import java.lang.NumberFormatException

fun main(){
    try{
        var p:Int
        print("Введите количество пятерок: ")
        p=readLine()!!.toInt()
        var ch:Int
        print("Введите количество четверок: ")
        ch=readLine()!!.toInt()
        var tr:Int
        print("Введите количество троек: ")
        tr=readLine()!!.toInt()
        var dv:Int
        print("Введите количество двоек: ")
        dv=readLine()!!.toInt()

        val result=when{
            p<0||ch<0||tr<0||dv<0 ->
            {
                println("Ошибка: коичество оценок не может быть отрицатеьным")
                return
            }
            else -> p+ch+tr+dv
        }
        println("Общее количество учеников в кассе: $result")

    }catch(e:NumberFormatException)
    {
        println("Ошибка")
    }
}
