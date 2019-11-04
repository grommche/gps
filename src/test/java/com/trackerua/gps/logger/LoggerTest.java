package com.trackerua.gps.logger;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

@Log4j2
public class LoggerTest {

    @Test
    public void DebugTest(){
        log.debug("This is a debug message");
    }

    @Test
    public void InfoTest(){
        log.info("This is an info message");
    }

    @Test
    public void WarnTest(){
        log.warn("This is a warn message");
    }

    @Test
    public void ErrorTest(){
        log.error("This is an error message");
    }

    @Test
    public void FatalTest(){
        log.fatal("This is a fatal message");
    }

}
