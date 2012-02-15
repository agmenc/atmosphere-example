#!/bin/bash

mkdir -p lib/src
rm -rf lib_managed/*
rm -rf lib/*.?ar
rm -rf lib/src/*.?ar

sbt update

cp -vp `find lib_managed -name "*.jar"` lib
cp -vp `find lib_managed -name "*.war"` lib
mv lib/*sources.jar lib/src/

rm lib/atmosphere-compat-jetty*.jar
