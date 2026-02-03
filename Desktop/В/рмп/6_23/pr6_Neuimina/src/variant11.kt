fun main(){
    try
    {
        var input:Int
        print("Введите трехзначное число: ")
        input=readLine()!!.toInt()
        val absN=Math.abs(input)
        if (absN<100||absN>999)
        {
            println("Число не является трехзначным")
            return
        }
        val lastnum=absN%10
        when {
            lastnum % 2 != 0 -> {

                println("Да-последняя цифра НЕчетная")
            }
            else -> {
                println("Нет-последняя цифра четная")
            }
        }
    }
    catch(e:NumberFormatException)
    {
        println("Неверный ввод данных")
    }
}
