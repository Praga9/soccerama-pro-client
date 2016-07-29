package pro.soccerama.client.proxy;

/**
 * Created by kevin on 21/05/2016.
 */
public class OddProxyParams extends AbstractProxyParams {
	private Integer matchId;

	public Integer getMatchId() {
		return matchId;
	}

	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}

	public boolean isValidMatchId(){
		return matchId != null && matchId > 0;
	}
}
