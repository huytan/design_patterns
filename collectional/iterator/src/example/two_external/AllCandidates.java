package example.two_external;

import java.util.*;

import exercise.one.LocationCandidates;

public class AllCandidates {
	private Vector data;

	public AllCandidates() {
		initialize();
	}

	private void initialize() {
		/* get data from db */
		data = new Vector();
		FileUtil util = new FileUtil();
		Vector dataLines = util.fileToVector("Candidates.txt");
		for (int i = 0; i < dataLines.size(); i++) {
			String str = (String) dataLines.elementAt(i);
			StringTokenizer st = new StringTokenizer(str, ",");

			data.add(new Candidate(st.nextToken(), st.nextToken(), st
					.nextToken()));
		}
	}

	public Enumeration getAllCandidates() {
		return data.elements();
	}

	public Iterator getCertifiedCandidates(String type) {
		return new CertifiedCandidates(this, type);
	}

	public Iterator getLocationCandidates(String type) {
		return new LocationCandidates(this, type);
	}
}
