import org.apache.spark.sql.SparkSession

object Ratings {

  def main(args: Array[String]): Unit = {
    //    Logger.getLogger("org").setLevel(Level.ERROR)

    val Array(path, _ *) = args
    val spark = SparkSession.builder().appName("Test").getOrCreate()
    val data = spark.read.csv(path)
    data.show()
  }
}
