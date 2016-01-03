https://gitter.im/spring-projects/spring-boot/archives/2015/04/16
https://spring.io/blog/2014/12/02/latest-jackson-integration-improvements-in-spring
http://docs.spring.io/autorepo/docs/spring-android/1.0.x/reference/html/rest-template.html
http://stackoverflow.com/questions/23674046/get-list-of-json-objects-with-spring-resttemplate

#build and test by maven 3x with java 1.7
mvn -U clean package

#run
cd target
java -jar GoEuroTest.jar Warszawa
more  Warszawa.csv
