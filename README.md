# test-gradle-transitive-dependencies
Gradle 4 breaks things.

Output from `./gradlew compileJava`:
```
$ ./gradlew compileJava

> Task :compileJava FAILED
<...>/test-gradle-transitive-dependencies/src/main/java/Main.java:6: error: cannot find symbol
        Throwables.throwIfInstanceOf(new Exception(), RuntimeException.class);
                  ^
  symbol:   method throwIfInstanceOf(Exception,Class<RuntimeException>)
  location: class Throwables
1 error


FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':compileJava'.
> Compilation failed; see the compiler error output for details.

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 0s
1 actionable task: 1 executed
```

This problem did not occur on Gradle 3.5 or 3.5.1, and first occurs in version 4.0.

https://github.com/gradle/gradle/issues/3817

https://github.com/google/error-prone/issues/864
