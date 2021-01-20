// @GENERATOR:play-routes-compiler
// @SOURCE:/home/papalayeba/Bureau/play-2.0/api-projet-uvs-scala/conf/routes
// @DATE:Wed Jan 06 12:20:07 UTC 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
