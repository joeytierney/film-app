package com.filmApp.CompositePattern;

import java.awt.Color;
import java.util.Enumeration;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import com.filmApp.GUI.FilmAppGUI;


public class FilmTree implements TreeSelectionListener {
	
	Film films, comedy, action, horror;
	
	JTree filmTree;
	JScrollPane sp;
	JPanel treePanel;
	DefaultMutableTreeNode troot;
	
	final String[] opts = {"Comedy", "Horror", "Action"};
	
	/**
	 * 
	 * Return a new Panel with a JTree list inside of it
	 * 
	 */
	
	public FilmTree() {
		//super("Film Tree");
		//makeFilms();
		filmTree = new JTree(opts);
		treePanel.add(filmTree);
		
		//setFilmTree(optsIn);
	}
	
	public JPanel getJPanel() {
		return treePanel;
	}
	
	/**
	public void setFilmTree() {
        treePanel = new JPanel();
        //getContentPane().add(treePanel);
        //treePanel.setLayout(new BorderLayout());

        sp = new JScrollPane();
        //treePanel.add("Center", sp);
        //treePanel.add("South", time = new JLabel("          "));

        //treePanel.setBorder(new BevelBorder(BevelBorder.RAISED));
        troot = new DefaultMutableTreeNode("FILMS");
        filmTree = new JTree(troot);
        filmTree.setBackground(Color.lightGray);
        loadTree(films);
       

        sp.getViewport().add(filmTree);
        //setSize(new Dimension(200, 300));
        //setVisible(true);

    }
	*/
	
	public void loadTree(Film topFilm) {
        DefaultMutableTreeNode troot;
        troot = new DefaultMutableTreeNode(topFilm.getName());
        treePanel.remove(filmTree);
        filmTree = new JTree(troot);
        ((JTree) filmTree).addTreeSelectionListener(this);
        sp.getViewport().add(filmTree);

        addNodes(troot, topFilm);
        ((JTree) filmTree).expandRow(0);
        //repaint();
    }// end loadTree()
	
	private void addNodes(DefaultMutableTreeNode pnode, Film film) {
        DefaultMutableTreeNode node;

        Enumeration f = film.subFilms();
        if (f != null) {
            while (f.hasMoreElements()) {
                Film newFilm = (Film)f.nextElement();
                node = new DefaultMutableTreeNode(newFilm.getName());
                pnode.add(node);
                addNodes(node, newFilm);
            }
        }
    }// end addNodes()
	
	private void makeFilms() {
		films = new BaseFilm("FILMS");
		films.add(comedy = new BaseFilm("Comedy"));
		films.add(comedy = new BaseFilm("Action"));
		films.add(comedy = new BaseFilm("Horror"));
	}

	@Override
	public void valueChanged(TreeSelectionEvent evt) {
		TreePath path = evt.getPath();
        String selectedTerm = path.getLastPathComponent().toString();

        Film f = films.getChild(selectedTerm);

	}

}
