# javalin-mockk-header-bug

This repository demonstrates that mocking the header method in javalin's Context class is flaky.

run the following command several times to see that sometimes it fails and other it passes.
```shell
$ ./gradlew clean test
```
