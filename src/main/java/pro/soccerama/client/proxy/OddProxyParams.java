package pro.soccerama.client.proxy;

/**
 * Created by kevin on 21/05/2016.
 */
public class OddProxyParams extends AbstractProxyParams {
	private Integer matchId;
	private Integer bookmakerId;
	private String date;

	public Integer getMatchId() {
		return matchId;
	}

	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}

	public boolean isValidMatchId(){
		return matchId != null && matchId > 0;
	}

	public boolean isValidBookmakerId(){
		return bookmakerId != null && bookmakerId > 0;
	}

	public void setBookmakerId(Integer bookmakerId) {
		this.bookmakerId = bookmakerId;
	}

	public Integer getBookmakerId() {
		return bookmakerId;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	/**
	 *
	 */
	public boolean isValidDate(){
		return date != null && !date.toString().trim().isEmpty() && date.toString().length() == 10;
	}
}
