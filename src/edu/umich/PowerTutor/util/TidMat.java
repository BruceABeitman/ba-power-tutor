package edu.umich.PowerTutor.util;

import java.util.ArrayList;
import java.util.List;

import android.util.Log;


public class TidMat {
	
	public class TidPair {
		public int Tid;
		public long[] Times;
		
		public int UserTime;
		public int SysTime;
		
		public String TidName;
		
		TidPair(int Tid, long[] Times, int UT, int ST, String TidName) {
			this.Tid = Tid;
			this.Times = Times;
			this.UserTime = UT;
			this.SysTime = ST;
			this.TidName = TidName;
		}
		
		public int GetT() {
			return Tid;
		}
	}
	
	public List<TidPair> Tids = new ArrayList<TidPair>();
	
	public TidMat() {
		//this.Tids = new ArrayList<TidPair>();
	}
	
	void AddTid(int Tid, long[] Times, String TidName) {
		int UT = (int) Times[13];
		int ST = (int) Times[14];
		
		
		TidPair TP = new TidPair(Tid, Times, UT, ST, TidName);
		this.Tids.add(TP);
//		Log.w("TidMat", "Adding tid: " + Tid + " with info: " 
//				+ TidName + " " 
//				+ Times[SystemInfo.INDEX_USER_TIME] + " " 
//				+ Times[SystemInfo.INDEX_SYS_TIME] + " " 
//				+ Times[2] + " " 
//				+ Times[3] + " " 
//				+ Times[4] + " " 
//				+ Times[5] + " " 
//				+ Times[6] + " " 
//				+ Times[7] + " " 
//				+ Times[8] + " " 
//				+ Times[9] + " " 
//				+ Times[10] + " " 
//				+ Times[11] + " " 
//				+ Times[12] + " " 
//				+ Times[13] + " " 
//				+ Times [14] 
//				+ " tid name info: "
//				+ TidName
//				);
	}
	
	public int GetTid(int Tid) {
		TidPair TP = (TidPair) this.Tids.get(Tid);
		return TP.Tid;
	}
	
	public long[] GetTInfo(int Tid) {
		return this.Tids.get(Tid).Times;
	}
	
	public int GetUT(int Tid) {
		return this.Tids.get(Tid).UserTime;
	}
	
	public int GetST(int Tid) {
		return this.Tids.get(Tid).SysTime;
	}
	
	public String GetTidName(int Tid) {
		return this.Tids.get(Tid).TidName;
	}
}
