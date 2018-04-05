package com.filmApp.CompositePattern;

import java.util.Enumeration;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.*;

import com.filmApp.GUI.FilmAppGUI;

public class FilmTreeModel extends DefaultMutableTreeNode implements TreeSelectionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// film categories
	Film<?> films, comedy, action, horror;
	
	// films comedy
	Film simpsons, teamAmerica, waynesWorld, austinPowers;
	
	// films action
	Film fightClub, Inception, lotr, darkKnight;
	
	// films horror
	Film omen, texas, nightmare, halloween;
	
	public JTree filmTree;
	public JScrollPane sp;
	public JPanel treePanel;
	DefaultMutableTreeNode troot;
	
	public FilmTreeModel() {
		makeFilms();
		createTree();
	}
	
	public DefaultMutableTreeNode createTree() {
		
		troot = new DefaultMutableTreeNode(films.getName());
		
        loadTree(films);
		return troot;
	}// end setTreeModel()
	
	public void loadTree(Film<?> topFilm) {
        DefaultMutableTreeNode troot;
        troot = new DefaultMutableTreeNode(topFilm.getName());
		
        addNodes(troot, topFilm);
    }// end loadTree()
	
	private void addNodes(DefaultMutableTreeNode pnode, Film<?> film) {
		
		DefaultMutableTreeNode node_1;
		
		node_1 = new DefaultMutableTreeNode("Comedy");
			node_1.add(new DefaultMutableTreeNode("Austin Powers"));
			node_1.add(new DefaultMutableTreeNode("Team America:World Police\""));
			node_1.add(new DefaultMutableTreeNode("Wayne's World"));
			node_1.add(new DefaultMutableTreeNode("SimpsonsTesting"));
		add(node_1);
		
		node_1 = new DefaultMutableTreeNode("Action");
			node_1.add(new DefaultMutableTreeNode("The Dark Knight"));
			node_1.add(new DefaultMutableTreeNode("Inception"));
			node_1.add(new DefaultMutableTreeNode("Fight Club"));
			node_1.add(new DefaultMutableTreeNode("The Lord of the Rings"));
		add(node_1);
		
		node_1 = new DefaultMutableTreeNode("Horror");
			node_1.add(new DefaultMutableTreeNode("The Texas Chainsaw Massacre"));
			node_1.add(new DefaultMutableTreeNode("The Omen"));
			node_1.add(new DefaultMutableTreeNode("A Nightmare On Elm Street"));
			node_1.add(new DefaultMutableTreeNode("Halloween"));
		add(node_1);
		
		/**
        Enumeration<?> f = film.subFilms();
        if (f != null) {
            while (f.hasMoreElements()) {
                Film<?> newFilm = (Film<?>)f.nextElement();
                node = new DefaultMutableTreeNode(newFilm.getName());
                add(node);
                addNodes(node, newFilm);
            }
        }
        */
    }// end addNodes()
	
	private void makeFilms() {
		films = new BaseFilm("FILMS");
		films.add(comedy = new BaseFilm("Comedy"));
		films.add(action = new BaseFilm("Action"));
		films.add(horror = new BaseFilm("Horror"));
		
		comedy.add(simpsons = new Film("The Simpsons Movie"));
		comedy.add(teamAmerica = new Film("Team america World Police"));
		comedy.add(waynesWorld = new Film("Waynes World"));
		comedy.add(austinPowers = new Film("Austin Powers"));
		
		action.add(fightClub = new Film("Fight Club"));
		action.add(Inception = new Film("Inceptioon"));
		action.add(lotr = new Film("Lord of the Rings"));
		action.add(darkKnight = new Film("The Dark Knight"));
		
		horror.add(omen = new Film("The Omen"));
		horror.add(texas = new Film("Texas Chainsaw Massacre"));
		horror.add(nightmare = new Film("Nightmare on Elm Street"));
		horror.add(halloween = new Film("Halloween"));
	}

	@Override
	public void valueChanged(TreeSelectionEvent evt) {
		TreePath path = evt.getPath();
        String selectedTerm = path.getLastPathComponent().toString();

        Film f = films.getChild(selectedTerm);
        if(f != null) {
        	
        }

	}

}
