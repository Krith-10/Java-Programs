package SpringInit;

import org.springframework.context.ApplicationEvent;

public class RunEvent extends ApplicationEvent {

	public RunEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car runs successfully";
	}
}
