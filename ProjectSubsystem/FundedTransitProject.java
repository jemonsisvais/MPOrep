package ProjectSubsystem;

public class FundedTransitProject extends FundedProject {
	private String TDCAwardAmount;
	private String TDCAwardDate;

	public String getTDCAwardAmount() {
		return TDCAwardAmount;
	}
	public String getTDCAwardDate() {
		return TDCAwardDate;
	}
	public void setTDCAwardAmount(String tDCAwardAmount) {
		TDCAwardAmount = tDCAwardAmount;
	}
	public void setTDCAwardDate(String tDCAwardDate) {
		TDCAwardDate = tDCAwardDate;
	}
}
