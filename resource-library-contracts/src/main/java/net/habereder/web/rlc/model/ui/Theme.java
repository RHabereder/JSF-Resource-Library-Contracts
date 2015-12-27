package net.habereder.web.rlc.model.ui;

public class Theme {
	
	private String contractName;
	private String themeName;
	
	public Theme(String contractName, String themeName) {
		super();
		this.contractName = contractName;
		this.themeName = themeName;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getThemeName() {
		return themeName;
	}

	public void setThemeName(String themeName) {
		this.themeName = themeName;
	}
}
