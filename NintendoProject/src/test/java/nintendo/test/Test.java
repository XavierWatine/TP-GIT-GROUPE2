package nintendo.test;


import java.time.LocalDate;



import java.util.ArrayList;
import java.util.List;

import nintendo.model.Achat;



import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Hybride;
import nintendo.model.Jeu;


public class Test {

	public static void main(String[] args) {


		Hybride nintendoSwitch = new Hybride("Nintendo Switch",220,LocalDate.parse("2017-03-03"));


		List<Achat> listAchats = new ArrayList<>();
		


		Boutique Micromania = new Boutique("Micromania","24 Avenue du Général Leclerc, Paris");
		
		Jeu hollowKnight = new Jeu("Hollow Knight", nintendoSwitch, Micromania);
		Jeu zeldaBOTW = new Jeu("Zelda Breath of the Wild", nintendoSwitch, Micromania);
		Jeu pokemonArceus = new Jeu("Pokemon Legend Arceus", nintendoSwitch, Micromania);
		Jeu animalCrossing = new Jeu("Animal crossing", nintendoSwitch, Micromania);
		Jeu marioKart = new Jeu("Mario Kart", nintendoSwitch, Micromania);

		
		listAchats.add(new Achat(hollowKnight, LocalDate.now(), 15));
		
		Client client1 = new Client("John","Doe",listAchats);
		Client client2 = new Client("jane", "Doe",listAchats);
		
		
		
		
		
//		System.out.println(client1);
		
	}


}
