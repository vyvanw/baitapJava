package student;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class BuildSpellbook {
	
	public final Integer MAXCOMS = 1000;  // maximum number of specs

	// TODO: add appropriate attributes / variables
	

	public BuildSpellbook() {
		// Constructor
		
		// TODO
	
	}
	
	public Vector<String> execNSpecs (Vector<String> specs, Integer N) {
		// PRE: specs contains set of specifications read in by readSpecsFromFile()
		// POST: executed min(N, all) specifications,
        //       returning required output, one line per string in vector
		
		// TODO

		return new Vector<String>();
	}
	
	public Vector<String> execNSpecswCheck (Vector<String> specs, Integer N) {
		// PRE: specs contains set of specifications read in by readSpecsFromFile()
		// POST: executed min(N, all) specifications, checking for cycles,
        //       returning required output, one line per string in vector

		// TODO

		return new Vector<String>();
	}
	
	public Vector<String> execNSpecswCheckRecLarge (Vector<String> specs, Integer N) {
		// PRE: specs contains set of specifications read in by readSpecsFromFile()
		// POST: executed min(N, all) specifications, checking for cycles and 
		//       recommending fix by removing largest cycle,
		//       returning required output, one line per string in vector

		
		// TODO

		return new Vector<String>();
	}

	public Vector<String> execNSpecswCheckRecSmall (Vector<String> specs, Integer N) {
		// PRE: specs contains set of specifications read in by readSpecsFromFile()
		// POST: executed min(N, all) specifications, checking for cycles and 
		//       recommending fix by removing smallest cycle,
        //       returning required output, one line per string in vector

		
		// TODO

		return new Vector<String>();
	}

	// Provided files below

	public Vector<String> readSpecsFromFile(String fInName) throws IOException {
		// PRE: -
		// POST: returns lines from input file as vector of string

		BufferedReader fIn = new BufferedReader(
							 new FileReader(fInName));
		String s;
		Vector<String> comList = new Vector<String>();
		
		while ((s = fIn.readLine()) != null) {
			comList.add(s);
		}
		fIn.close();
		
		return comList;
	}

	public Vector<String> readSolnFromFile(String fInName, Integer N) throws IOException {
		// PRE: -
		// POST: returns (up to) N lines from input file as a vector of N strings;
		//       only the specification lines are counted in this N, not responses

		BufferedReader fIn = new BufferedReader(
							 new FileReader(fInName));
		String s;
		Vector<String> out = new Vector<String>();
		Integer i = 0;

		while (((s = fIn.readLine()) != null) && (i <= N)) {
			if ((i != N) || s.startsWith("   ")) // responses to commands start with three spaces
				out.add(s);
			if (!s.startsWith("   "))  
				i += 1;
		}
		fIn.close();
		
		return out;
	}
	
	public Boolean compareExecWSoln (Vector<String> execd, Vector<String> soln) {
		// PRE: -
		// POST: Returns True if execd and soln string-match exactly, False otherwise

		if (execd.size() != soln.size()) {
			return Boolean.FALSE;
		}
		for (int i = 0; i < execd.size(); i++) {
			if (!execd.get(i).equals(soln.get(i))) {
				return Boolean.FALSE;
			}
		}

		return Boolean.TRUE;

	}

	

	public static void main(String[] args) {
		

	}
}
