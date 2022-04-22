package config

object Configuration {

  val baseUrl: String = "http://localhost:8080"
  val users: Int = Integer.getInteger("users", 1).toInt
  val rampUp: Int = Integer.getInteger("rampup", 1).toInt

}
