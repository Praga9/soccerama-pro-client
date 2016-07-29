package pro.soccerama.client.proxy;

import java.util.concurrent.TimeUnit;

/**
 * Created by kevin on 21/05/2016.
 */
public abstract class SocceramaProxy {
	public static final String COMMON_URL_PARAMS = "?api_token={api_token}&include={includes}";
	public static final String VERSION = "v1.1";

	private static long lastCall = 0;

	/**
	 * Permet de respecter le delai entre chaque d'appel du end point
	 */
	protected void waitBeforeNextCall() {
		synchronized (this) {
			try {
				while (System.currentTimeMillis() - lastCall < 5 * 1000) {
					TimeUnit.SECONDS.sleep(1);
					// System.out.println(".");
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
