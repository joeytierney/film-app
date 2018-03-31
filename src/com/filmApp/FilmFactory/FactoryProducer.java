package com.filmApp.FilmFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		
		if(choice.equalsIgnoreCase("cast")) {
			return new CastFactory();
		} else if (choice.equalsIgnoreCase("crew")) {
			return new CrewFactory();
		} else if (choice.equalsIgnoreCase("film")) {
			return new FilmFactory();
		}
		
		return null;
		
	}// end getFactory()

}
