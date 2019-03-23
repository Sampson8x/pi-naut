package pi.naut.gpio.bonnet.inputs.listener;

import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;

import javax.inject.Singleton;

@Singleton
public class IncrementItemListener implements GpioPinListenerDigital {


	@Override
	public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
		if (event.getState().isHigh()) {
			System.out.println("--> Increment Item and redisplay layout");
		}
	}

}
