ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "sbt-assignment"
  )
lazy val core = (project in file("core"))
  .settings(
    name := "core",
    version := "1.0.0",
    scalaVersion := "2.13.8",
    libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.2.9" % Test ,
      "com.knoldus" %% "add_dependency" % "0.1.0-SNAPSHOT")    //adding dependencies from another project
  )
  .dependsOn(utils)


lazy val utils = (project in file("utils"))
  .settings(
    name := "utils",
    version := "1.0.0",
    scalaVersion := "2.13.8"
  )

// getting dependencies from add_dependency project

//libraryDependencies += "com.knoldus" %% "add_dependency" % "0.1.0-SNAPSHOT"