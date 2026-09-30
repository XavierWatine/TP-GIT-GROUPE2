package nintendo.test;

import java.util.ArrayList;
import java.util.List;

import nintendo.model.Achat;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Jeu;
import nintendo.model.Salon;

public class Test {

	public static void main(String[] args) {


		Salon nintendoSwitch = new Salon("Nintendo Switch");

		List<Achat> listAchats = new ArrayList<>();
		

		Boutique Micromania = new Boutique("Micromania", "24 Avenue du Général Leclerc, Paris");
		
		Jeu hollowKnight = new Jeu("Hollow Knight", nintendoSwitch, Micromania);
		Jeu zeldaBOTW = new Jeu("Zelda Breath of the Wild", nintendoSwitch, Micromania);
		Jeu pokemonArceus = new Jeu("Pokemon Legend Arceus", nintendoSwitch, Micromania);
		Jeu animalCrossing = new Jeu("Animal crossing", nintendoSwitch, Micromania);
		Jeu marioKart = new Jeu("Mario Kart", nintendoSwitch, Micromania);
		
		
		
		Client client1 = new Client("John","Doe",listAchats);
		Client client2 = new Client("jane", "Doe",listAchats);
	}

}
