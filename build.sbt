val scala3Version = "3.3.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "impatient_scala_chapter8",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
