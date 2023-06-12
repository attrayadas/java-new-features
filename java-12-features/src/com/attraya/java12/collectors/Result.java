package com.attraya.java12.collectors;

import java.util.List;

public class Result {

	Result(Long count, List<Integer> filtered) {
		this.count = count;
		this.filtered = filtered;
	}

	private long count;
	List<Integer> filtered;

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public List<Integer> getFiltered() {
		return filtered;
	}

	public void setFiltered(List<Integer> filtered) {
		this.filtered = filtered;
	}

	@Override
	public String toString() {
		return "Result [count=" + count + ", filtered=" + filtered + "]";
	}

}
