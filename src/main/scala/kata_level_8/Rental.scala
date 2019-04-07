package kata_level_8

object Rental
{
  def cost(days: Int): Int =
  {
    if(days < 3) days * 40
    else if(days < 7) days * 40 - 20
    else days * 40 - 50
  }
}
