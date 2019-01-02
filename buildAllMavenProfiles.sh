rm java8-okhttp-gson/pom.xml
rm java8-okhttp-gson/build.gradle
rm -r java8-okhttp-gson/src/main 
rm -r javascript/src
rm -r csharp-net45/src/Sphereon.SDK.Vision

mvn -Phtml-docs clean install
mvn -Pjavascript clean install
mvn -Pjava8-okhttp-gson clean install
mvn -Pcsharp-net45 clean install