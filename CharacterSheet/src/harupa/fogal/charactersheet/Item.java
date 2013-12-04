
public class Item
{
	private String name;
	private int costPP;
	private int costGP;
	private int costSP;
	private int costCP;
	private double weight;
	private boolean mastercraft;
	
	public Item()
	{
		name = "";
		costPP = costGP = costSP = costCP = 0;
		weight = 0;
		mastercraft = false;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getCostPP()
	{
		return costPP;
	}

	public void setCostPP(int costPP)
	{
		this.costPP = costPP;
	}

	public int getCostGP()
	{
		return costGP;
	}

	public void setCostGP(int costGP)
	{
		this.costGP = costGP;
	}

	public int getCostSP()
	{
		return costSP;
	}

	public void setCostSP(int costSP)
	{
		this.costSP = costSP;
	}

	public int getCostCP()
	{
		return costCP;
	}

	public void setCostCP(int costCP)
	{
		this.costCP = costCP;
	}

	public double getWeight()
	{
		return weight;
	}

	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	public boolean isMastercraft()
	{
		return mastercraft;
	}

	public void setMastercraft(boolean mastercraft)
	{
		this.mastercraft = mastercraft;
	}
}