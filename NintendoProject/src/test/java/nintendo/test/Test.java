package nintendo.test;

import java.util.ArrayList;
import java.util.List;

import nintendo.model.Achat;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		List<Achat> listAchats = new ArrayList<>();
		Console nintendoSwitch = new Console("Nintendo Switch");
		
		Jeu hollowKnight = new Jeu("Hollow Knight", nintendoSwitch);
		Jeu zeldaBOTW = new Jeu("Zelda Breath of the Wild", nintendoSwitch);
		Jeu pokemonArceus = new Jeu("Pokemon Legend Arceus", nintendoSwitch);
		Jeu animalCrossing = new Jeu("Animal crossing", nintendoSwitch);
		Jeu marioKart = new Jeu("Mario Kart", nintendoSwitch);
		Boutique Micromania = new Boutique("Micromania", "24 Avenue du Général Leclerc, Paris");
		
		
		Client client1 = new Client("John","Doe",listAchats);
		Client client2 = new Client("jane", "Doe",listAchats);
	}

}
