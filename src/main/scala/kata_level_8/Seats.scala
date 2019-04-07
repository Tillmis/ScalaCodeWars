package kata_level_8

object Seats
{
  def seatsInTheater(totCols: Int, totRows: Int, col: Int, row: Int): Int =
  {
    (totCols - (col - 1)) * (totRows - row)
  }
}
