package com.fedpartner.model;

import java.util.ArrayList;

public class SpPartnerList {
	private ArrayList<SpPartnerDetails> spPartnerList;

	public SpPartnerList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SpPartnerList(ArrayList<SpPartnerDetails> spPartnerList) {
		super();
		this.spPartnerList = spPartnerList;
	}

	public ArrayList<SpPartnerDetails> getSpPartnerList() {
		return spPartnerList;
	}

	public void setSpPartnerList(ArrayList<SpPartnerDetails> spPartnerList) {
		this.spPartnerList = spPartnerList;
	}

	@Override
	public String toString() {
		return "SpPartnerList [spPartnerList=" + spPartnerList + "]";
	}

}
