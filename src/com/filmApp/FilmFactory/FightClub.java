package com.filmApp.FilmFactory;

public class FightClub extends Movie{
	
	@Override
	public Cast getCast() {
		String[] names = {"Edward Norton", "Brad Pitt"};
		String[] charNames = {"The Narrator", "Tyler Durden"};
		return new Cast(2, names, charNames);
	}

	@Override
	public Crew getCrew() {
		String[] names = {"David Fincher", " Chuck Palahniuk"};
		String[] roles = {"Director", "Writer"};
		return new Crew(2, names, roles);
	}

	@Override
	public FilmDetails getFilmDetails() {
		String[] photos = {"images/fightClub/fightclub1.jpg", "images/fightClub/fightclub2.jpg"};
		// title, release date, number of photos, photos, runtime, budget, box office, synospsis
		return new FilmDetails("images/fightClub/fightclubposter.jpg", "Fight Club", "15 October 1999", 2, photos, "2h 19min", "$63,000,000 (estimated)", "$100,853,753 ", "A nameless first person narrator (Edward Norton) attends support groups in attempt to subdue his emotional state and relieve his insomniac state. When he meets Marla (Helena Bonham Carter), another fake attendee of support groups, his life seems to become a little more bearable. However when he associates himself with Tyler (Brad Pitt) he is dragged into an underground fight club and soap making scheme. Together the two men spiral out of control and engage in competitive rivalry for love and power. When the narrator is exposed to the hidden agenda of Tyler's fight club, he must accept the awful truth that Tyler may not be who he says he is.");
	}

}
