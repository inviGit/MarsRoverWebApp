package com.invi.marsrover.model;

public class MarsCameras {

	private boolean marsCamFHAZ;
	private boolean marsCamRHAZ;
	private boolean marsCamMAST;
	private boolean marsCamCHEMCAM;
	private boolean marsCamMAHLI;
	private boolean marsCamMARDI;
	private boolean marsCamNAVCAM;
	private boolean marsCamPANCAM;
	private boolean marsCamMINITES;
	
	public MarsCameras() {
		this.marsCamFHAZ = false;
		this.marsCamRHAZ = false;
		this.marsCamMAST = false;
		this.marsCamCHEMCAM = false;
		this.marsCamMAHLI = false;
		this.marsCamMARDI = false;
		this.marsCamNAVCAM = false;
		this.marsCamPANCAM = false;
		this.marsCamMINITES = false;
	}
	@Override
	public String toString() {
		return "MarsCameras [marsCamFHAZ=" + marsCamFHAZ + ", marsCamRHAZ=" + marsCamRHAZ + ", marsCamMAST="
				+ marsCamMAST + ", marsCamCHEMCAM=" + marsCamCHEMCAM + ", marsCamMAHLI=" + marsCamMAHLI
				+ ", marsCamMARDI=" + marsCamMARDI + ", marsCamNAVCAM=" + marsCamNAVCAM + ", marsCamPANCAM="
				+ marsCamPANCAM + ", marsCamMINITES=" + marsCamMINITES + "]";
	}
	public boolean isMarsCamMINITES() {
		return marsCamMINITES;
	}
	public void setMarsCamMINITES(boolean marsCamMINITES) {
		this.marsCamMINITES = marsCamMINITES;
	}
	public boolean isMarsCamFHAZ() {
		return marsCamFHAZ;
	}
	public void setMarsCamFHAZ(boolean marsCamFHAZ) {
		this.marsCamFHAZ = marsCamFHAZ;
	}
	public boolean isMarsCamRHAZ() {
		return marsCamRHAZ;
	}
	public void setMarsCamRHAZ(boolean marsCamRHAZ) {
		this.marsCamRHAZ = marsCamRHAZ;
	}
	public boolean isMarsCamMAST() {
		return marsCamMAST;
	}
	public void setMarsCamMAST(boolean marsCamMAST) {
		this.marsCamMAST = marsCamMAST;
	}
	public boolean isMarsCamCHEMCAM() {
		return marsCamCHEMCAM;
	}
	public void setMarsCamCHEMCAM(boolean marsCamCHEMCAM) {
		this.marsCamCHEMCAM = marsCamCHEMCAM;
	}
	public boolean isMarsCamMAHLI() {
		return marsCamMAHLI;
	}
	public void setMarsCamMAHLI(boolean marsCamMAHLI) {
		this.marsCamMAHLI = marsCamMAHLI;
	}
	public boolean isMarsCamMARDI() {
		return marsCamMARDI;
	}
	public void setMarsCamMARDI(boolean marsCamMARDI) {
		this.marsCamMARDI = marsCamMARDI;
	}
	public boolean isMarsCamNAVCAM() {
		return marsCamNAVCAM;
	}
	public void setMarsCamNAVCAM(boolean marsCamNAVCAM) {
		this.marsCamNAVCAM = marsCamNAVCAM;
	}
	public boolean isMarsCamPANCAM() {
		return marsCamPANCAM;
	}
	public void setMarsCamPANCAM(boolean marsCamPANCAM) {
		this.marsCamPANCAM = marsCamPANCAM;
	}
}
