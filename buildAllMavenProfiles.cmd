del java8-okhttp-gson\pom.xml
del java8-okhttp-gson\build.gradle
rmdir java8-okhttp-gson\src\main  /s /q
rmdir javascript\src /s /q
rmdir csharp-net45\src\Sphereon.SDK.Vision  /s /q

call mvn -Phtml-docs clean install
call mvn -Pjavascript clean install
call mvn -Pjava8-okhttp-gson clean install
call mvn -Pcsharp-net45 clean install