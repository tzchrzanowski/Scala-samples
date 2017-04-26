case class Year(year: Int) {
  private def divisable(divisor: Int) = year % divisor == 0
    
  val isLeap: Boolean = (divisable(4) && !divisable(100)) || divisable(400)
}