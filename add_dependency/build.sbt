ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.knoldus"
ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "add_dependency",
    idePackagePrefix := Some("com.knoldus.dependency")
  )
libraryDependencies += "joda-time" % "joda-time" % "2.9.3"
libraryDependencies += "org.joda" % "joda-convert" % "1.8"
libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.32" //JDBC
updateOptions := updateOptions.value.withCachedResolution(true) //cached resolution

