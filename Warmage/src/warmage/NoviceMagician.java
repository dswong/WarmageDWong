package warmage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NoviceMagician extends GenericUnit {
	
	public NoviceMagician(String pN, int pi) {
		super(pi, pN);
		playerName = pN;
		hitPoints = 8;
		defense = 7;
		attack = 10;
		mana = 10;
		speed = 5;
		damage = 8;
		vision = 7;
		
		intelligenceAtt = 4;
		pierceAtt = 9;
		pierceDam = 9;
		intelligenceDef = 9;
		soulAffinity = 8;
		hoardingAptitude = 3;
		healthRegeneration = 5;
		calmingAura = 7;
		disillusionment = 7;
		holy = 5;
		dark = 5;
		spellStrength = 9;
		affinity = 8;
		bravery = 7;
		earthResist = 6; 
		constructionGrade = 6;
		heatThreshold = 6;
		liquidThreshold = 6;
		nullification = 8;
		strength = 4;
		agility = 7; 
		stability = 4;
		padding = 6;
		shell = 6;
		reinforcement = 6; 
		magicPoints = 12;
		numberOfAttacks = 9; 
		sightRadius = 9; 
		movementSpeed = 9;
		range = 9; 
		squaresOccupied = 1;
	}

	public NoviceMagician(NoviceMagician toCopy) {
		super(toCopy.getPositionIndex(), toCopy.getPlayerName());
		playerName = toCopy.getPlayerName();
		hitPoints = toCopy.getHitPoints();
		defense = toCopy.getDefense();
		attack = toCopy.getAttack();
		mana = toCopy.getMana();
		speed = toCopy.getSpeed();
		damage = toCopy.getDamage();
		vision = toCopy.getVision();

	}

	@Override
	protected void setUnitName() {
		unitName = "WarMage";
	}

	@Override
	protected void setUnitType() {
		unitType = 1;
	}
	
	@Override
	protected void setMoveButton() {
		moveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("You are moving!!!");
			}
		});
	}
}
