package SpringInit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;


public class Car implements ApplicationEventPublisherAware {
	
	private Tyre t;
	ApplicationEventPublisher publisher;
	RunEvent event = new RunEvent(this);
	
	public void go() {
		System.out.println("Car is running with "+t);
		publisher.publishEvent(event);
	}

	public Tyre getT() {
		return t;
	}

	@Autowired
	public void setT(Tyre t) {
		this.t = t;
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher = publisher;
	}
}
