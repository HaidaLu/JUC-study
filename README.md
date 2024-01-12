## ## 创建线程

## 多线程

## 原理之线程运行

### 栈与栈帧

### Thread Context Switch


## start vs run

- 创建一个线程需要重写run()方法, 如果你在main方法中创建了这个线程, 然后再调用run()方法, 其实还是在main线程内.
- start()方法只能调用一次

```java
sout(t1. getState())
t1.start();
sout(t1.getState())

// output
NEW
RUNNABLE
```

## yield vs sleep


## join
