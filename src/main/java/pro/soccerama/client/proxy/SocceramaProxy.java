package pro.soccerama.client.proxy;

import java.util.concurrent.TimeUnit;

/**
 * Created by kevin on 21/05/2016.
 */
public abstract class SocceramaProxy {
	public static final String COMMON_URL_PARAMS = "?api_token={api_token}&include={includes}";
	public static final String VERSION = "v1.1";

	private static final double SECOND_IN_MILLISECOND = 1000.0;
	private static final double HOUR_IN_SECOND = 3600.0;
	private static final double CALL_BY_HOUR = 1000.0;
	private static final double TIME_BETWEEN_TWO_CALLS = Math.ceil(HOUR_IN_SECOND / CALL_BY_HOUR * SECOND_IN_MILLISECOND * 1.05); // Marge de 5%
	private static long lastCall = 0;

	/**
	 * Permet de respecter le delai entre chaque d'appel du end point
	 */
	protected void waitBeforeNextCall() {
		synchronized (this) {
			try {
				while (System.currentTimeMillis() - lastCall <= TIME_BETWEEN_TWO_CALLS) {
					TimeUnit.MILLISECONDS.sleep(1500);
				}
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}

			lastCall = System.currentTimeMillis();
			notifyAll();
			return;
		}
	}
}
