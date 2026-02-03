fun main(){
    try{
        var x:Double
        print("Введите х: ")
        x = readLine()!!.toDouble()
        when {
            x<=7->
            {
                val f=(3*x-9)
                println("F($x)=$f")
            }
            x>7->
            {
                val f=1/(x*x-4)
                println("F($x)=$f")
            }
        }
    }
    catch(e:NumberFormatException)
    {
        println("Неверный ввод данных")
    }
}
