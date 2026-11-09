package com.futureexcexutor;

import java.util.List;

public class MyRunnable implements Runnable
{
	List<Integer> value;
	public MyRunnable(List<Integer> _value) {
		value = _value;
	}

	@Override
	public void run() {
		value.add(100);
		
	}

}
