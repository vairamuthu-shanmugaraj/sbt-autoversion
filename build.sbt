organization := "org.scala-sbt"

sbtPlugin := true
crossSbtVersions := Vector("0.13.16", "1.0.3")

libraryDependencies += "com.vdurmont" % "semver4j" % "2.0.2"

libraryDependencies += "org.scalatest"  %% "scalatest"  % "3.0.4"  % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"

// sbt plugin dependencies
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.6")
addSbtPlugin("com.typesafe.sbt"  % "sbt-git"     % "0.9.3")

scalacOptions := Seq(
  "-encoding",
  "UTF-8",
  "-deprecation",
  "-feature",
  "-unchecked",
  "-Xfuture"
)