package storage;

/**
 * @author Gregory Wagner 
 * Snoozle Software - www.snoozle.net
 * 
 * Class - Situation
 * 
 *  Pitching stats container
 *  Date - June 27, 2016
 */

public class PitchingStats {
	
	// constants
	public final static double onBaseAve = .317;
	public final static double aveNumOfPitchesAve = 90.0;
	public final static double minInningsPitched = 50.0;
	
	// attributes
	private int playerID = 0;
	private String playerName = "";
	private double onBase = 0.0;
	private double inningsPitched = 0.0; 
	private double aveNumOfPitches = 0.0;
	
	// ============= Constructors -------------------------------------
	public PitchingStats(int playerID, double onBase, double aveNumOfPitches, double inningsPitched) {
		super();
		this.playerID = playerID;
		this.onBase = onBase;
		this.aveNumOfPitches = aveNumOfPitches;
		this.inningsPitched = inningsPitched;
	}
	
	public PitchingStats(int playerID, String playerName, double onBase, double aveNumOfPitches, double inningsPitched) {
		super();
		this.playerID = playerID;
		this.playerName = playerName;
		this.onBase = onBase;
		this.aveNumOfPitches = aveNumOfPitches;
		this.inningsPitched = inningsPitched;
	}
	
	public PitchingStats(int playerID) {
		super();
		this.playerID = playerID;
	}
	
	public PitchingStats() {
		super();
	}

	// ---------------- getters and setters -------------------------------
	public int getPlayerID() {
		return playerID;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	public double getOnBase() {
		return onBase;
	}

	public void setOnBase(double onBase) {
		this.onBase = onBase;
	}

	public double getAveNumOfPitches() {
		return aveNumOfPitches;
	}

	public void setAveNumOfPitches(double aveNumOfPitches) {
		this.aveNumOfPitches = aveNumOfPitches;
	}

	public double getInningsPitched() {
		return inningsPitched;
	}

	public void setInningsPitched(double inningsPitched) {
		this.inningsPitched = inningsPitched;
	}

	public static PitchingStats getDefault() {
		PitchingStats pitchingStats = new PitchingStats(0);
		
		pitchingStats.onBase = onBaseAve;
		pitchingStats.aveNumOfPitches= aveNumOfPitchesAve; 
		pitchingStats.inningsPitched = minInningsPitched;
		return pitchingStats;
	}

	
} // class pitchingStats
