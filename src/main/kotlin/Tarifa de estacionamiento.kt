fun main(args: Array<String>) {
    var hours = readLine()!!.toDouble()
    var total: Double = 0.0
    var restante: Double = 0.0
     if (hours <= 23) {
        while (hours > 5) {
            hours--
            restante++
        }
         total = hours +(restante*0.5)
         println(total)
    }
    else if (hours>=24) {
        while (hours >= 24) {
            hours -= 24
            total += 15.0
        }
         total= (hours*0.5) + total

         println(total)
    }
}
