package exercise.one;

import java.util.*;

import example.two_external.AllCandidates;
import example.two_external.Candidate;

public class LocationCandidates implements Iterator {

	String locationType;
	Enumeration ec;
	Candidate nextCandidate;

	public LocationCandidates(AllCandidates ac, String locationType) {
		this.locationType = locationType;
		this.ec = ac.getAllCandidates();
	}

	@Override
	public boolean hasNext() {
		boolean matchFound = false;
		while (ec.hasMoreElements()) {
			Candidate tempObj = (Candidate) ec.nextElement();
			if (tempObj.getLocation().equals(locationType)) {
				matchFound = true;
				nextCandidate = tempObj;
				break;
			}
			if (matchFound != true) {
				nextCandidate = null;
			}
		}
		return matchFound;
	}

	@Override
	public Object next() {
		if (nextCandidate == null) {
			throw new NoSuchElementException();
		}
		return nextCandidate;
	}

	@Override
	public void remove() {
	}

}
