name := """poc"""
organization := "tanin.test"

version := "1.0-SNAPSHOT"

bloopAggregateSourceDependencies in Global := true

lazy val root = (project in file("."))