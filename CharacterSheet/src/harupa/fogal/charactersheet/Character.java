import java.util.LinkedList;

public class Character
{
	private String name;
	private Race race;
	private int age;
	private LinkedList<D20Class> classes;
	private Religion religion;
	private String gender;
	private int abilityScores[] = new int[6];
	private int tempAbilityScores[] = new int[6];
	private int abilityMods[] = new int[6];
	private int tempAbilityMods[] = new int[6];
	private LinkedList<Item> equipped;
	private Skill skills[] = new Skill[38];
	private LinkedList<Item> inventory;
	private String alignment[] = new String[2];
	private LinkedList<Feat> feats;
	private int hp;
	private int tempHP;
	private int movement;
	private int tempMovement;
	private Save saves[] = new Save[3];
	private Grapple grapple;
	
	public Character()
	{
		name = "";
		race = new Race();
		age hp = tempHP = movement = tempMovement = 0;
		classes = new LinkedList<D20Class>();
		religion = new Religion();
		gender = "";
		equipped = new LinkedList<Item>();
		inventory = new LinkedList<Item>();
		alignment[0] = alignment[1] = "";
		feats = new LinkedList<Feat>();
		grapple = new Grapple();
		
		for(int i = 0; i < abilityScores.length; i++)//initializes all ability related scores to 0
			abilityScores[i] = tempAbilityScores[i] = abilityMods[i] = tempAbilityMods[i] = 0;
		
		for(int i = 0; i < skills.length; i++)//initializes all skills with the default constructor
			skills[i] = new Skill();
		
		for(int i = 0; i < saves.length; i++)//initializes all saves with default constructor
			saves[i] = new Save();
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Race getRace()
	{
		return race;
	}
	
	public void setRace(Race race)
	{
		this.race = race;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public LinkedList<D20Class> getClasses()
	{
		return classes;
	}
	
	public void setClasses(LinkedList<D20Class> classes)
	{
		this.classes = classes;
	}
	
	public Religion getReligion()
	{
		return religion;
	}
	
	public void setReligion(Religion religion)
	{
		this.religion = religion;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public int[] getAbilityScores()
	{
		return abilityScores;
	}
	
	public void setAbilityScores(int[] abilityScores)
	{
		this.abilityScores = abilityScores;
	}
	
	public int[] getTempAbilityScores()
	{
		return tempAbilityScores;
	}
	
	public void setTempAbilityScores(int[] tempAbilityScores)
	{
		this.tempAbilityScores = tempAbilityScores;
	}
	
	public int[] getAbilityMods()
	{
		return abilityMods;
	}
	
	public void setAbilityMods(int[] abilityMods)
	{
		this.abilityMods = abilityMods;
	}
	
	public int[] getTempAbilityMods()
	{
		return tempAbilityMods;
	}
	
	public void setTempAbilityMods(int[] tempAbilityMods)
	{
		this.tempAbilityMods = tempAbilityMods;
	}
	
	public LinkedList<Weapon> getWeapons()
	{
		return weapons;
	}
	
	public void setWeapons(LinkedList<Weapon> weapons)
	{
		this.weapons = weapons;
	}
	
	public Skill[] getSkills()
	{
		return skills;
	}
	
	public void setSkills(Skill[] skills)
	{
		this.skills = skills;
	}
	
	public LinkedList<Item> getInventory()
	{
		return inventory;
	}
	
	public void setInventory(LinkedList<Item> inventory)
	{
		this.inventory = inventory;
	}
	
	public String[] getAlignment()
	{
		return alignment;
	}
	
	public void setAlignment(String[] alignment)
	{
		this.alignment = alignment;
	}
	
	public LinkedList<Feat> getFeats()
	{
		return feats;
	}
	
	public void setFeats(LinkedList<Feat> feats)
	{
		this.feats = feats;
	}
	
	public int getHp()
	{
		return hp;
	}
	
	public void setHp(int hp)
	{
		this.hp = hp;
	}
	
	public int getTempHP()
	{
		return tempHP;
	}
	
	public void setTempHP(int tempHP)
	{
		this.tempHP = tempHP;
	}
	
	public int getMovement()
	{
		return movement;
	}
	
	public void setMovement(int movement)
	{
		this.movement = movement;
	}
	
	public int getTempMovement()
	{
		return tempMovement;
	}
	
	public void setTempMovement(int tempMovement)
	{
		this.tempMovement = tempMovement;
	}
	
	public Save[] getSaves()
	{
		return saves;
	}
	
	public void setSaves(Save[] saves)
	{
		this.saves = saves;
	}
	
	public Grapple getGrapple()
	{
		return grapple;
	}
	
	public void setGrapple(Grapple grapple)
	{
		this.grapple = grapple;
	}
}
