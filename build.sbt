scalaVersion := "2.12.4"

name := "wc-chap10"
organization := "br.unb.cic.wc"
version := "1.0"

libraryDependencies += "org.typelevel" %% "cats-core" % "1.0.1"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.4"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"

libraryDependencies ++= Seq(
   "org.backuity.clist" %% "clist-core"   % "3.3.0",
   "org.backuity.clist" %% "clist-macros" % "3.3.0" % "provided")

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}
