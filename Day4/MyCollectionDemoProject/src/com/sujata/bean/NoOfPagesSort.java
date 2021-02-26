package com.sujata.bean;

import java.util.Comparator;

public class NoOfPagesSort implements Comparator<MyBook> {

	@Override
	public int compare(MyBook arg0, MyBook arg1) {
		if(arg0.getNoOfPages()>arg1.getNoOfPages())
			return 1;
		else if(arg0.getNoOfPages()<arg1.getNoOfPages())
			return -1;
		return 0;
	}

}
