package bgu.spl.mics;

import java.util.*;

/**
 * The {@link MessageBusImpl class is the implementation of the MessageBus interface.
 * Write your implementation here!
 * Only private fields and methods can be added to this class.
 */
//adedd queue;
//change register function
public class MessageBusImpl implements MessageBus {

	private static MessageBusImpl instance = null;

	public static MessageBusImpl getInstance() {
		if(instance == null) {
			instance = new MessageBusImpl();
		}
		return instance;
	}
	private Map<MicroService,Queue<Message>> microServiceQueueMap;
	public MessageBusImpl(){

		//hash map that keeps the order of insertions
		microServiceQueueMap= new LinkedHashMap<MicroService,Queue<Message>>();

	}

	@Override
	public <T> void subscribeEvent(Class<? extends Event<T>> type, MicroService m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void subscribeBroadcast(Class<? extends Broadcast> type, MicroService m) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T> void complete(Event<T> e, T result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendBroadcast(Broadcast b) {
		// TODO Auto-generated method stu

	}

	
	@Override
	public <T> Future<T> sendEvent(Event<T> e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void register(MicroService m) {
		Queue<Message> queue = new PriorityQueue<Message>();
		microServiceQueueMap.put(m,queue);
		if(!regSuc(m))
			throw new NoSuchElementException("microServiceQueueMap doesn't contain MicroService m" +
					                         "after the register method act");
	}
	private boolean regSuc(MicroService m ){
		return(microServiceQueueMap.containsKey(m));
	}

	@Override
	public void unregister(MicroService m) {
		// TODO Auto-generated method stub

	}

	@Override
	public Message awaitMessage(MicroService m) throws InterruptedException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
