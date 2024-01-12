package MethodsExample;


import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.TwoPhaseTermination")
public class TwoPhaseTermination {
    private Thread monitor;

    public void start() {
        monitor = new Thread(() -> {
            while(true) {
                Thread currentThread = Thread.currentThread();
                if(currentThread.isInterrupted()) {
                    log.debug("料理后事");
                    break;
                }
                try {
                    Thread.sleep(1000);
                    log.debug("执行监控记录");

                } catch (InterruptedException e) { // 这里会把currentThread.isInterrupted() 变成false;
                    e.printStackTrace();
                    // 重新设置打断标记 下次循环可以料理后事
                    currentThread.interrupt();
                }
            }
        });

        monitor.start();
    }

    public void stop(){
        monitor.interrupt();
    }
}
