// You can test using ScalaTest (http://www.scalatest.org/).
import org.scalatest._
import kata_level_8.Seats

// TODO: replace this example test with your own, this is just here to demonstrate usage.
// See http://www.scalatest.org/at_a_glance for example usages
class SeatsTest extends FlatSpec with Matchers {
  "seatsInTheater(16,11,5,3)" should "return 96" in {
    Seats.seatsInTheater(16,11,5,3) should be (96)
  }
  "seatsInTheater(1,1,1,1)" should "return 0" in {
    Seats.seatsInTheater(1,1,1,1) should be (0)
  }
  "seatsInTheater(13,6,8,3)" should "return 18" in {
    Seats.seatsInTheater(13,6,8,3) should be (18)
  }
  "seatsInTheater(60,100,60,1)" should "return 99" in {
    Seats.seatsInTheater(60,100,60,1) should be (99)
  }
  "seatsInTheater(1000,1000,1000,1000)" should "return 0" in {
    Seats.seatsInTheater(1000,1000,1000,1000) should be (0)
  }
}