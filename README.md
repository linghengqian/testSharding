## testSharding

- For https://github.com/apache/shardingsphere/issues/28331 .

- Log in `gradle clean test`. 

- I don't understand why your `./gradlew` file has been tampered with Unix permissions. It looks like you copied 
the Gradle Wrapper file from another file system.

```shell
$ gradle clean test

> Task :compileJava
注: /home/linghengqian/TwinklingLiftWorks/git/public/testSharding/src/main/java/com/example/testsharding/OeeCycleAlgorithmSharding.java使用了未经检查或不安全的操作。
注: 有关详细信息, 请使用 -Xlint:unchecked 重新编译。
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2023-09-02T13:12:14.914+08:00  INFO 30345 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2023-09-02T13:12:14.920+08:00  INFO 30345 --- [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.

Deprecated Gradle features were used in this build, making it incompatible with Gradle 9.0.

You can use '--warning-mode all' to show the individual deprecation warnings and determine if they come from your own scripts or plugins.

For more on this, please refer to https://docs.gradle.org/8.3/userguide/command_line_interface.html#sec:command_line_warnings in the Gradle documentation.

BUILD SUCCESSFUL in 46s
5 actionable tasks: 5 executed
```