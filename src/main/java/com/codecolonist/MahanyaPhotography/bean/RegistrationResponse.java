package com.codecolonist.MahanyaPhotography.bean;

import com.codecolonist.MahanyaPhotography.Repository.MP_User;

public class RegistrationResponse {

	private MP_User mpuser;
	private String status;

	public MP_User getMpuser() {
		return mpuser;
	}

	public void setMpuser(MP_User mpuser) {
		this.mpuser = mpuser;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
