public class Project1 {
	private int pcode;
	private String ptitle;
	private int duration;
	private String cname;
	// project details
	public int getPcode() {
		return pcode;
	}
	public Project1(int pcode, String ptitle, int duration, String cname) {
		super();
		this.pcode = pcode;
		this.ptitle = ptitle;
		this.duration = duration;
		this.cname = cname;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public String getPtitle() {
		return ptitle;
	}
	@Override
	public String toString() {
		return "project [pcode=" + pcode + ", ptitle=" + ptitle + ", duration="+ duration + ", cname=" + cname + "]";
	}
	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
}