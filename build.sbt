name := "scala"

version := "0.98.5"

scalaVersion := "2.10.2"

crossScalaVersions := Seq("2.10.2", "2.10.3")

libraryDependencies ++= Seq(
  "junit"          % "junit"           % "4.5",
  "org.scalatest"  % "scalatest_2.10"  % "2.2.0"
)
