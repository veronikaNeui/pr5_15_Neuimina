fun main(){
    try{
        var num:Int
        println("Введите трехзначное число: ")
        num= readLine()!!.toInt()
        val x=Math.abs(num)
        if (x<100||x>999)
        {
            println("число не является трехзначным")
            return
        }
        val hundreds=x/100
        val tens=(x/10)%10
        val ones=x%10
        if (hundreds==tens&&tens==ones)
        {
            println("Да, все цифры одинаковы")
        }
        else {
            println("Нет, цифры не одинаковы")
        }

    }catch(e:NumberFormatException)
    {
        println("Ошибка")
    }
}
