package xyz.knowdeb;

import static org.junit.jupiter.api.Assertions.*;

class LoggerTest {

    private Logger logger;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        logger = new Logger();
    }

    @org.junit.jupiter.api.Test
    void getLog() {
        assertEquals("Hello", logger.getLog("Hello"));
    }
}