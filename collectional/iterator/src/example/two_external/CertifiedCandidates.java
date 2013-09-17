package example.two_external;

import java.util.*;

public class CertifiedCandidates implements Iterator {

	String certifiedcationType;
	Candidate nextCandidate;
	Enumeration ec;

	public CertifiedCandidates(AllCandidates inp_ac, String certifiedcationType) {
		this.certifiedcationType = certifiedcationType;
		this.ec = inp_ac.getAllCandidates();
	}

	@Override
	public boolean hasNext() {
		boolean matchFound = false;
		while (ec.hasMoreElements()) {
			Candidate tempObj = (Candidate) ec.nextElement();
			if (tempObj.getCertificationType().equals(certifiedcationType)) {
				matchFound = true;
				nextCandidate = tempObj;
				break;
			}
			if (matchFound == true) {

			} else {
				nextCandidate = null;
			}
		}

		return matchFound;
	}

	@Override
	public Object next() {
		if (nextCandidate == null) {
			throw new NoSuchElementException();
		} else {
			return nextCandidate;
		}
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}
