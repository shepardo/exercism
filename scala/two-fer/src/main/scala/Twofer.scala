object Twofer {
  private def isEmpty(x: String) = x == null || x.isEmpty

  def twofer(name: String = ""): String = {
    name match {
      case name if isEmpty(name) => "One for you, one for me."
      case name => s"One for $name, one for me."
    }
  }
}
