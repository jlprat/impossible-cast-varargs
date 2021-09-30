val scala3Version = "3.0.2"
val scala31Version = "3.1.0-RC2"
val scala213Version = "2.13.6"

lazy val supportedScalaVersions = List(scala213Version, scala3Version, scala31Version)

lazy val root = project
  .in(file("."))
  .settings(
    name := "impossible-cast-varargs",
    version := "0.1.0",

    scalaVersion := scala3Version,
    crossScalaVersions := supportedScalaVersions

  )
