package Entity;

public class ST_Social extends Student{

	@Override
	public String getQuocTich() {
		// TODO Auto-generated method stub
		return super.getQuocTich();
	}

	@Override
	public void setQuocTich(String quocTich) {
		// TODO Auto-generated method stub
		super.setQuocTich(quocTich);
	}

	@Override
	public String getHoTen() {
		// TODO Auto-generated method stub
		return super.getHoTen();
	}

	@Override
	public void setHoTen(String hoTen) {
		super.setHoTen(hoTen);
	}

	@Override
	public String getTruong() {
		return super.getTruong();
	}

	@Override
	public void setTruong(String truong) {
		super.setTruong(truong);
	}

	@Override
	public int getTuoi() {
		return super.getTuoi();
	}

	@Override
	public void setTuoi(int tuoi) {
		super.setTuoi(tuoi);
	}

	@Override
	public double getCongDan() {
		return super.getCongDan();
	}

	@Override
	public void setCongDan(double congDan) {
		super.setCongDan(congDan);
	}

	@Override
	public double getToan() {
		return super.getToan();
	}

	@Override
	public void setToan(double toan) {
		super.setToan(toan);
	}

	@Override
	public Student textStudent() {
		return super.textStudent();
	}
	
	public ST_Social(String quocTich, String hoTen, String truong, int tuoi, double congDan, double toan) {
		super(quocTich, hoTen, truong, tuoi, congDan, toan);
	}

	public double DTB_Social() {
		return (this.getCongDan() * 2 + this.getToan())/3;
	}
}
