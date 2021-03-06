package root.busslogic.Services.interfaces;

import java.util.List;

import root.busslogic.SQLProc.entities.Rep_Holdings;
import root.busslogic.SQLProc.entities.Rep_PFSS;
import root.busslogic.entity.FundLine;
import root.busslogic.entity.Holding;
import root.busslogic.entity.Portfolio;
import root.busslogic.entity.Trade;
import root.user.model.User;

public interface IPortfolioSrv
{
	public List<Portfolio> getPortfoliosforUser(
	        User user
	);
	
	public int deletePortfolio(
	        int pfID
	);
	
	public void updatePortfolio(
	        Portfolio updPF
	) throws Exception;
	
	public void addPortfolioforUser(
	        Portfolio newPF, User user
	) throws Exception;
	
	public void assignFundLinetoPortfolio(
	        int pid, int flid
	) throws Exception;
	
	public FundLine getAssignedFundLine(
	        int pid
	) throws Exception;
	
	public Portfolio getPorfolioById(
	        int pid
	) throws Exception;
	
	public Portfolio getPorfolioByIdDeep(
	        int pid
	) throws Exception;
	
	public void updatePortfolioHeader(
	        Portfolio updPF
	);
	
	public List<Holding> getHoldings(
	        int pid
	);
	
	public Holding getHoldingforScrip(
	        int pid, String scCode
	);
	
	public void tradeforPF(
	        int pid, Trade tradeItem
	) throws Exception;
	
	public void createHolding(
	        Holding hlI
	);
	
	public void updateHolding(
	        Holding hlI
	);
	
	public void createTrade(
	        Trade tradeItem
	);
	
	public List<Rep_Holdings> getHoldingsReport(
	        int pid
	);
	
	public Rep_PFSS getPfStats(
	        int pid
	);
	
}
