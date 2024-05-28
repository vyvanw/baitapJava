package student;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Vector;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.*;

public class AllTest {

	String PATH = "/home/madras/teaching/24comp2010/ass/data/out/";
	// change to your own path
	

	/*
	 * Sample PASS level tests
	 */

	@Test
	public void testP1_5() {
		BuildSpellbook d = new BuildSpellbook();
		Vector<String> inSpecs = null;
		Vector<String> soln = null;
		Vector<String> execd = null;
		String datfile = "sample_P1";
		Integer N = 5;

		try {
			inSpecs = d.readSpecsFromFile(PATH+datfile+".in");
		}
		catch (IOException e) {
			System.out.println("in exception: " + e);
		}
		
		execd = d.execNSpecs(inSpecs, N);
		
		try {
			soln = d.readSolnFromFile(PATH+datfile+".out", N);
		}
		catch (IOException e) {
			System.out.println("in exception: " + e);
		}
		
		assertTrue(d.compareExecWSoln(execd, soln));
		
	}

	@Test
	public void testP1_9() {
		BuildSpellbook d = new BuildSpellbook();
		Vector<String> inSpecs = null;
		Vector<String> soln = null;
		Vector<String> execd = null;
		String datfile = "sample_P1";
		Integer N = 9;

		try {
			inSpecs = d.readSpecsFromFile(PATH+datfile+".in");
		}
		catch (IOException e) {
			System.out.println("in exception: " + e);
		}
		
		execd = d.execNSpecs(inSpecs, N);
		
		try {
			soln = d.readSolnFromFile(PATH+datfile+".out", N);
		}
		catch (IOException e) {
			System.out.println("in exception: " + e);
		}
		
		assertTrue(d.compareExecWSoln(execd, soln));
		
	}
	
	@Test
	public void testP1_all() {
		BuildSpellbook d = new BuildSpellbook();
		Vector<String> inSpecs = null;
		Vector<String> soln = null;
		Vector<String> execd = null;
		String datfile = "sample_P1";
		Integer N = d.MAXCOMS;

		try {
			inSpecs = d.readSpecsFromFile(PATH+datfile+".in");
		}
		catch (IOException e) {
			System.out.println("in exception: " + e);
		}
		
		execd = d.execNSpecs(inSpecs, N);
		
		try {
			soln = d.readSolnFromFile(PATH+datfile+".out", N);
		}
		catch (IOException e) {
			System.out.println("in exception: " + e);
		}
		
		assertTrue(d.compareExecWSoln(execd, soln));
		
	}

	@Test
	public void testP2_all() {
		BuildSpellbook d = new BuildSpellbook();
		Vector<String> inSpecs = null;
		Vector<String> soln = null;
		Vector<String> execd = null;
		String datfile = "sample_P2";
		Integer N = d.MAXCOMS;

		try {
			inSpecs = d.readSpecsFromFile(PATH+datfile+".in");
		}
		catch (IOException e) {
			System.out.println("in exception: " + e);
		}
		
		execd = d.execNSpecs(inSpecs, N);
		
		try {
			soln = d.readSolnFromFile(PATH+datfile+".out", N);
		}
		catch (IOException e) {
			System.out.println("in exception: " + e);
		}
		
		assertTrue(d.compareExecWSoln(execd, soln));
		
	}

	/*
	 * Sample CREDIT level tests 
	 */
	
	@Test
	public void testC1_6() {
		BuildSpellbook d = new BuildSpellbook();
		Vector<String> inSpecs = null;
		Vector<String> soln = null;
		Vector<String> execd = null;
		String datfile = "sample_C1";
		Integer N = 6;

		try {
			inSpecs = d.readSpecsFromFile(PATH+datfile+".in");
		}
		catch (IOException e) {
			System.out.println("in exception: " + e);
		}
		
		execd = d.execNSpecswCheck(inSpecs, N);
		
		try {
			soln = d.readSolnFromFile(PATH+datfile+".out", N);
		}
		catch (IOException e) {
			System.out.println("in exception: " + e);
		}
		
		assertTrue(d.compareExecWSoln(execd, soln));
		
	}

	@Test
	public void testC1_all() {
		BuildSpellbook d = new BuildSpellbook();
		Vector<String> inSpecs = null;
		Vector<String> soln = null;
		Vector<String> execd = null;
		String datfile = "sample_C1";
		Integer N = d.MAXCOMS;

		try {
			inSpecs = d.readSpecsFromFile(PATH+datfile+".in");
		}
		catch (IOException e) {
			System.out.println("in exception: " + e);
		}
		
		execd = d.execNSpecswCheck(inSpecs, N);
		
		try {
			soln = d.readSolnFromFile(PATH+datfile+".out", N);
		}
		catch (IOException e) {
			System.out.println("in exception: " + e);
		}
		
		assertTrue(d.compareExecWSoln(execd, soln));
		
	}

	/*
	 * Sample (HIGH) DISTINCTION level tests 
	 */


	@Test
	public void testD1_all() {
		BuildSpellbook d = new BuildSpellbook();
		Vector<String> inSpecs = null;
		Vector<String> soln = null;
		Vector<String> execd = null;
		String datfile = "sample_D1";
		Integer N = d.MAXCOMS;

		try {
			inSpecs = d.readSpecsFromFile(PATH+datfile+".in");
		}
		catch (IOException e) {
			System.out.println("in exception: " + e);
		}
		
		execd = d.execNSpecswCheckRecLarge(inSpecs, N);
		
		try {
			soln = d.readSolnFromFile(PATH+datfile+".out", N);
		}
		catch (IOException e) {
			System.out.println("in exception: " + e);
		}
		
		assertTrue(d.compareExecWSoln(execd, soln));
		
	}

	
	//	public void testD1a_8() {
	
	@Test
	public void testD1a_8() {
		BuildSpellbook d = new BuildSpellbook();
		Vector<String> inSpecs = null;
		Vector<String> soln = null;
		Vector<String> execd = null;
		String datfile = "sample_D1a";
		Integer N = 8;

		try {
			inSpecs = d.readSpecsFromFile(PATH+datfile+".in");
		}
		catch (IOException e) {
			System.out.println("in exception: " + e);
		}
		
		execd = d.execNSpecswCheckRecLarge(inSpecs, N);
		
		try {
			soln = d.readSolnFromFile(PATH+datfile+".out", N);
		}
		catch (IOException e) {
			System.out.println("in exception: " + e);
		}
		
		assertTrue(d.compareExecWSoln(execd, soln));
		
	}

	@Test
	public void testD2_8() {
		BuildSpellbook d = new BuildSpellbook();
		Vector<String> inSpecs = null;
		Vector<String> soln = null;
		Vector<String> execd = null;
		String datfile = "sample_D2";
		Integer N = 8;

		try {
			inSpecs = d.readSpecsFromFile(PATH+datfile+".in");
		}
		catch (IOException e) {
			System.out.println("in exception: " + e);
		}
		
		execd = d.execNSpecswCheckRecSmall(inSpecs, N);
		
		try {
			soln = d.readSolnFromFile(PATH+datfile+".out", N);
		}
		catch (IOException e) {
			System.out.println("in exception: " + e);
		}
		
		assertTrue(d.compareExecWSoln(execd, soln));
		
	}

	@Test
	public void testD2a_8() {
		BuildSpellbook d = new BuildSpellbook();
		Vector<String> inSpecs = null;
		Vector<String> soln = null;
		Vector<String> execd = null;
		String datfile = "sample_D2a";
		Integer N = 8;

		try {
			inSpecs = d.readSpecsFromFile(PATH+datfile+".in");
		}
		catch (IOException e) {
			System.out.println("in exception: " + e);
		}
		
		execd = d.execNSpecswCheckRecSmall(inSpecs, N);
		
		try {
			soln = d.readSolnFromFile(PATH+datfile+".out", N);
		}
		catch (IOException e) {
			System.out.println("in exception: " + e);
		}
		
		assertTrue(d.compareExecWSoln(execd, soln));
		
	}


}
