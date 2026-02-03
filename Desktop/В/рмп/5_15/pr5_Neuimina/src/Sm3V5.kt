fun main(){
    try{
        var a:Double
        print("Введите размер отвестия a: ")
        a=readLine()!!.toDouble()
        var b:Double
        print("Введите размер отвестия b: ")
        b=readLine()!!.toDouble()

        var x:Double
        print("Введите размер кирпича x: ")
        x=readLine()!!.toDouble()
        var y:Double
        print("Введите размер кирпича y: ")
        y=readLine()!!.toDouble()
        var z:Double
        print("Введите размер кирпича z: ")
        z=readLine()!!.toDouble()

        fun fits(p:Double, q:Double, A:Double, B:Double)=(p<=A&&q<=B)||(p<=B&&q<=A)

        val canPass=fits(x,y,a,b)||fits(x,z,a,b)||fits(y,z,a,b)
        if (canPass) {
            println("Кирпич попадет в отверстие")
        }
        else {
            println("Кирпич НЕ попадет в отверстие")
        }

    }catch(e:NumberFormatException)
    {
        println("Вы ввели не число")
    }
}
