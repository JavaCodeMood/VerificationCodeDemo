package com.lhf.check;

public class Check_Code {
	private String checknum = "";  //���ɵ���֤��
	private String checknums = "";
	private int number = 4;   //�û������λ��
	
	public String getChecknum() {
		return checknum;
	}

	public void setChecknum(String checknum) {
		this.checknum = checknum;
	}

	public String getChecknums() {
		return checknums;
	}

	public void setChecknums(String checknums) {
		this.checknums = checknums;
	}

	public void makeChecknum(){
		String sourcenum = "0123456789";
		String siglenum = "";
		String checknum = "";
		String checknums = "";
		int index = 0;
		int i = 0;
		while(i < number){
			index = ((int)(Math.random()*100))%(sourcenum.length()-1);
			siglenum = sourcenum.substring(index, index + 1);
			checknum += siglenum;
			checknum += "<img src='images\\"+siglenum+".jpg'/>";
			i++;
		}
		this.checknum = checknum;
		this.checknums = checknums;
	}
	
	

}
