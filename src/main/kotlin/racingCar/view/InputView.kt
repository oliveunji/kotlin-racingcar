package racingCar.view

object InputView {
    fun getNumberOfCar(): Int {
        println("자동차 대수는 몇 대인가요?")
        return readln().toInt()
    }

    fun getNumberOfTrial(): Int {
        println("시도할 횟수는 몇 회인가요?")
        return readln().toInt()
    }
}
