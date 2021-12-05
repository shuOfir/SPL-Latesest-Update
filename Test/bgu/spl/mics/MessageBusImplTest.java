package bgu.spl.mics;

import org.junit.Test;

import static org.junit.Assert.*;

class TestMicroService extends MicroService{
    public TestMicroService(String name){
        super(name);
    }
    @Override
    protected void initialize() {
        terminate();
    }
}

public class MessageBusImplTest {
    TestMicroService microService;
    MessageBusImpl messageBus;

    @Test
    public void getInstance(){

        //check if we can create to msgBus accidentally
        MessageBusImpl firstInstance = MessageBusImpl.getInstance();
        MessageBusImpl secondInstance = MessageBusImpl.getInstance();
        assertNotSame(null, secondInstance);
    }

    @Test
    public void subscribeEvent() {
    }

    @Test
    public void subscribeBroadcast() {
    }

    @Test
    public void complete() {
    }

    @Test
    public void sendBroadcast() {
    }

    @Test
    public void sendEvent() {

    }

    @Test
    public void register() {
        microService = new TestMicroService("test");
        messageBus = new MessageBusImpl();
        try {
            messageBus.register(microService);
        } catch (Exception exception){
            //crash if couldn't enter?
            exception.getMessage();
        }
    }

    @Test
    public void unregister() {
    }

    @Test
    public void awaitMessage() {
    }
}