import java.util.LinkedList;

public class Race
{
	private String name;
	private int abilityBonus[] = new int[6];
	private Skill skillBonus[] = new Skill[38];
	private LinkedList<SpellAbility> spellLikeAbility;
	
	public Race()
	{
		name = "";
		
		for(int i = 0; i < abilityBonus.length; i++)
			abilityBonus[i] = 0;
		
		for(int i = 0; i < skillBonus.length; i++)
			skillBonus[i] = new Skill();
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int[] getAbilityBonus()
	{
		return abilityBonus;
	}

	public void setAbilityBonus(int[] abilityBonus)
	{
		this.abilityBonus = abilityBonus;
	}

	public Skill[] getSkillBonus()
	{
		return skillBonus;
	}

	public void setSkillBonus(Skill[] skillBonus)
	{
		this.skillBonus = skillBonus;
	}
}
