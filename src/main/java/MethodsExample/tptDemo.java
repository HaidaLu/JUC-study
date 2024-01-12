package MethodsExample;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class tptDemo {
    public static void main(String[] args) throws InterruptedException {
        TwoPhaseTermination tpt = new TwoPhaseTermination();
        tpt.start();
        Thread.sleep(3500);
        tpt.stop();
    }
}
