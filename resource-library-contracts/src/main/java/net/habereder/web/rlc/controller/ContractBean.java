package net.habereder.web.rlc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import net.habereder.web.rlc.model.ui.Theme;

@Named("contractBean")
@SessionScoped
public class ContractBean implements Serializable {

	private static final long serialVersionUID = 5551425871717774789L;

	public ContractBean() {
	}

	private Theme selectedContract;
	private List<Theme> contracts;

	@PostConstruct
	public void init() {
		this.contracts = new ArrayList<Theme>();
		contracts.add(new Theme("titan-layout", "titan"));
		contracts.add(new Theme("spark-layout", "spark-blue"));
		contracts.add(new Theme("spark-layout", "spark"));
		contracts.add(new Theme("spark-layout", "spark-red"));
		contracts.add(new Theme("spark-layout", "spark-orange"));
		selectedContract = contracts.get(0);
	}

	public void selectContractByThemename(String themeName) {
		for (Theme theme : contracts) {
			if (theme.getThemeName().equals(themeName)) {
				selectedContract = theme;
			}
		}
	}

	public Theme getSelectedContract() {
		return selectedContract;
	}

	public void setSelectedContract(Theme selectedContract) {
		this.selectedContract = selectedContract;
	}

	public List<Theme> getContracts() {
		return contracts;
	}

	public void setContracts(List<Theme> contracts) {
		this.contracts = contracts;
	}
}
