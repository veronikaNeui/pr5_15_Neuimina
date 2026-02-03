fun main(){
    try{
        var num1:Double
        println("Введите первое число: ")
        num1=readLine()!!.toDouble()
        var num2:Double
        print("Введите второе число: ")
        num2= readLine()!!.toDouble()
        if (num1>num2)
        {
            println("Первое число больше второго")
            println("Получается: ${num1+1}, ${num2}")
        }
        else if (num2>num1)
        {
            println("Второе число больше первого")
            println("Получается: ${num2+1}, ${num1}")
        }
        else if (num1==num2)
        {
            println("Числа равны")
            num1=Math.pow(num1,3.00)
            println("Получается: ${num1}")
        }
        else {
            println("Вы не ввели число")
        }
    }catch (e:NumberFormatException)
    {
        println("Ошибка")
    }
}
