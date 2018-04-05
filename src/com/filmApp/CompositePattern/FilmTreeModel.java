package com.filmApp.CompositePattern;

import java.util.Enumeration;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.*;

public class FilmTreeModel extends DefaultMutableTreeNode implements TreeSelectionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// film categories
	Film<?> films, comedy, action, horror;
	
	// films comedy
	//Film simpsons, teamAmerica, waynesWorld, austinPowers;
	
	// films action
	//Film fightClub, Inception, lotr, darkKnight;
	
	// films horror
	//Film omen, texas, nightmare, halloween;
	
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
		
		DefaultMutableTreeNode node;
		
        Enumeration<?> f = film.subFilms();
        if (f != null) {
            while (f.hasMoreElements()) {
                Film<?> newFilm = (Film<?>)f.nextElement();
                node = new DefaultMutableTreeNode(newFilm.getName());
                add(node);
                addNodes(node, newFilm);
            }
        }
    }// end addNodes()
	
	private void makeFilms() {
		films = new BaseFilm("FILMS");
		films.add(comedy = new BaseFilm("Comedy"));
		
		comedy.add(new Film("Simpsons"));
		comedy.add(new Film("Team america World Police"));
		comedy.add(new Film("Waynes World"));
		comedy.add(new Film("Austin Powers"));
		
		films.add(action = new BaseFilm("Action"));
		
		action.add(new Film("Fight Club"));
		action.add(new Film("Inceptioon"));
		action.add(new Film("Lord of the Rings"));
		action.add(new Film("The Dark Knight"));
		
		films.add(horror = new BaseFilm("Horror"));
		
		horror.add(new Film("The Omen"));
		horror.add(new Film("Texas Chainsaw Massacre"));
		horror.add(new Film("Nightmare on Elm Street"));
		horror.add(new Film("Halloween"));	
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
