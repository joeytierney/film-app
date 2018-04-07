package com.filmApp.GUI;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTree;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import com.filmApp.CommandPattern.AboutCommand;
import com.filmApp.CommandPattern.ButtonCommand;
import com.filmApp.CommandPattern.CommandHolder;
import com.filmApp.CommandPattern.ExitButtonCommand;
import com.filmApp.CommandPattern.ExitCommand;
import com.filmApp.CommandPattern.MenuCommand;
import com.filmApp.CompositePattern.BaseFilm;
import com.filmApp.CompositePattern.Film;
import com.filmApp.FilmFactory.ActionMovieStore;
import com.filmApp.FilmFactory.AustinPowers;
import com.filmApp.FilmFactory.ComedyMovieStore;
import com.filmApp.FilmFactory.HorrorMovieStore;
import com.filmApp.FilmFactory.Movie;
import com.filmApp.FilmFactory.MovieStore;
import com.filmApp.IteratorPattern.Iterator;
import com.filmApp.IteratorPattern.PhotoRepository;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import javax.swing.UIManager;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Dimension;


public class FilmAppGUI implements ActionListener, TreeSelectionListener {
	
	Movie movieChosen;
	
	MovieStore comedyStore = new ComedyMovieStore();
	MovieStore horrorStore = new HorrorMovieStore();
	MovieStore actionStore = new ActionMovieStore();
	
	// film categories
	Film<?> films, comedy, action, horror;

	private JFrame frmFilmApp;
	private JTextField txtDirector;
	private JTextField txtReleaseDate;
	private JTextField txtRuntime;
	private JTextField txtBudget;
	private JTextField txtBoxOffice;
	private JTextField txtWriters;
	private JTextField txtTitle;
	private JTextPane txtPnlCast;
	
	JMenu mnNewMenu;
	MenuCommand mntmQuit, mntmAbout;
	ExitButtonCommand ex;
	protected JTree filmTree;
	private JPanel pnlFilmList;
	JScrollPane listSp;
	DefaultMutableTreeNode troot;
	
	Movie movie1 = new AustinPowers();
	private JPanel pnlMainFilmContent;
	private JTextPane textPaneSynopsis;
	private JLabel lblPosterImage;
	private JLabel lblPhotoImage;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FilmAppGUI window = new FilmAppGUI();
					window.frmFilmApp.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FilmAppGUI() {
		makeFilms();
		setTree();
		initialize();
	}
	
	private void makeFilms() {
		films = new BaseFilm("FILMS");
		films.add(comedy = new BaseFilm("Comedy"));
		
		comedy.add(new Film("The Simpsons Movie"));
		comedy.add(new Film("Team America:World Police"));
		comedy.add(new Film("Wayne's World"));
		comedy.add(new Film("Austin Powers"));
		
		films.add(action = new BaseFilm("Action"));
		
		action.add(new Film("Fight Club"));
		action.add(new Film("Inception"));
		action.add(new Film("The Lord of the Rings"));
		action.add(new Film("The Dark Knight"));
		
		films.add(horror = new BaseFilm("Horror"));
		
		horror.add(new Film("The Omen"));
		horror.add(new Film("The Texas Chainsaw Massacre"));
		horror.add(new Film("A Nightmare On Elm Street"));
		horror.add(new Film("Halloween"));	
	}
	
	public void setTree() {
		pnlFilmList = new JPanel();
		pnlFilmList.setLayout(new BorderLayout());

		listSp = new JScrollPane();
        pnlFilmList.add("Center", listSp);
        

        pnlFilmList.setBorder(new BevelBorder(BevelBorder.RAISED));
        troot = new DefaultMutableTreeNode(films.getName());
		filmTree = new JTree(troot);
		filmTree.setBackground(Color.lightGray);
        loadTree(films);
        listSp.setViewportView(filmTree);
	}
	
	public void loadTree(Film topFilm) {
        DefaultMutableTreeNode troot;
        troot = new DefaultMutableTreeNode(topFilm.getName());
        pnlFilmList.remove(filmTree);
        filmTree = new JTree(troot);
        filmTree.addTreeSelectionListener(this);
        listSp.setViewportView(filmTree);

        addNodes(troot, topFilm);
        filmTree.expandRow(0);
    }// end loadTree()

    private void addNodes(DefaultMutableTreeNode pnode, Film proj) {
        DefaultMutableTreeNode node;

        Enumeration p = proj.subFilms();
        if (p != null) {
            while (p.hasMoreElements()) {
                Film newProj = (Film)p.nextElement();
                node = new DefaultMutableTreeNode(newProj.getName());
                pnode.add(node);
                addNodes(node, newProj);
            }
        }
    }// end addNodes()

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmFilmApp = new JFrame();
		frmFilmApp.setTitle("Film App");
		frmFilmApp.setBounds(100, 100, 978, 773);
		frmFilmApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		pnlFilmList = new JPanel();
		
		pnlFilmList.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Movie List", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		
		pnlMainFilmContent = new JPanel();
		
		JButton btnQuit;
		btnQuit = new ButtonCommand("Quit");
		ex = new ExitButtonCommand();
		((ButtonCommand) btnQuit).setCommand(ex);
		
		btnQuit.addActionListener(this);
		
		GroupLayout groupLayout = new GroupLayout(frmFilmApp.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(pnlFilmList, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnlMainFilmContent, GroupLayout.PREFERRED_SIZE, 720, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(893, Short.MAX_VALUE)
					.addComponent(btnQuit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(25)
							.addComponent(pnlFilmList, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(pnlMainFilmContent, GroupLayout.PREFERRED_SIZE, 607, GroupLayout.PREFERRED_SIZE)))
					.addGap(33)
					.addComponent(btnQuit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JLabel lblTitle = new JLabel("Title");
		
		JLabel lblDirector = new JLabel("Director");
		
		JLabel lblReleaseDate = new JLabel("Release Date");
		
		JLabel lblRuntime = new JLabel("Runtime");
		
		JLabel lblBudget = new JLabel("Budget");
		
		JLabel lblBoxOffice = new JLabel("Box Office Gross");
		
		JLabel lblWriters = new JLabel("Writers");
		
		JLabel lblSynopsis = new JLabel("Synopsis");
		
		JLabel lblPhotos = new JLabel("Photos");
		
		JLabel lblPoster = new JLabel("Poster");
		
		txtTitle = new JTextField();
		txtTitle.setEditable(false);
		txtTitle.setColumns(10);
		
		txtDirector = new JTextField();
		txtDirector.setEditable(false);
		txtDirector.setColumns(10);
		
		txtReleaseDate = new JTextField();
		txtReleaseDate.setEditable(false);
		txtReleaseDate.setColumns(10);
		
		txtRuntime = new JTextField();
		txtRuntime.setEditable(false);
		txtRuntime.setColumns(10);
		
		txtBudget = new JTextField();
		txtBudget.setEditable(false);
		txtBudget.setColumns(10);
		
		txtBoxOffice = new JTextField();
		txtBoxOffice.setEditable(false);
		txtBoxOffice.setColumns(10);
		
		txtWriters = new JTextField();
		txtWriters.setEditable(false);
		txtWriters.setColumns(10);
		
		JButton btnNext = new JButton(">>");
		
		JButton btnPrev = new JButton("<<");
		
		JLabel label = new JLabel("Cast");
		
		txtPnlCast = new JTextPane();
		txtPnlCast.setEditable(false);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JScrollPane scrollPanePhotos = new JScrollPane();
		
		btnNext.addActionListener(new ActionListener() {
			PhotoRepository photoRepo = new PhotoRepository();
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for(Iterator iter = photoRepo.getIterator(); iter.hasNext();){
					lblPhotos.setIcon((Icon) iter.next());
				}
				
			}
			
		});
		
		btnPrev.addActionListener(new ActionListener() {
			PhotoRepository photoRepo = new PhotoRepository();
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for(Iterator iter = photoRepo.getIterator(); iter.hasNext();){
					lblPhotos.setIcon((Icon) iter.prev());
				}
				
			}
			
		});
		
		JScrollPane scrollPanePoster = new JScrollPane();
		GroupLayout gl_pnlMainFilmContent = new GroupLayout(pnlMainFilmContent);
		gl_pnlMainFilmContent.setHorizontalGroup(
			gl_pnlMainFilmContent.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlMainFilmContent.createSequentialGroup()
					.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlMainFilmContent.createSequentialGroup()
							.addGap(100)
							.addComponent(btnPrev)
							.addGap(18)
							.addComponent(btnNext))
						.addGroup(gl_pnlMainFilmContent.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblPoster)
								.addComponent(lblPhotos)
								.addComponent(scrollPanePhotos, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
								.addComponent(scrollPanePoster))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.LEADING)
								.addComponent(lblSynopsis)
								.addComponent(lblReleaseDate)
								.addComponent(lblTitle)
								.addComponent(lblDirector)
								.addComponent(lblRuntime)
								.addComponent(lblBudget)
								.addComponent(lblBoxOffice)
								.addComponent(lblWriters)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtDirector, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
						.addComponent(txtTitle, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
						.addComponent(txtReleaseDate, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
						.addComponent(txtRuntime, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
						.addComponent(txtBudget, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
						.addComponent(txtBoxOffice, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
						.addComponent(txtWriters, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
						.addGroup(gl_pnlMainFilmContent.createSequentialGroup()
							.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.TRAILING)
								.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
								.addComponent(txtPnlCast, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(21))
		);
		gl_pnlMainFilmContent.setVerticalGroup(
			gl_pnlMainFilmContent.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlMainFilmContent.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPoster)
						.addComponent(txtTitle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTitle))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPanePoster, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_pnlMainFilmContent.createSequentialGroup()
							.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtDirector, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDirector))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblReleaseDate)
								.addComponent(txtReleaseDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblRuntime)
								.addComponent(txtRuntime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblBudget, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtBudget, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblBoxOffice)
								.addComponent(txtBoxOffice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblWriters)
								.addComponent(txtWriters, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlMainFilmContent.createSequentialGroup()
									.addGap(104)
									.addComponent(lblPhotos)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(scrollPanePhotos, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_pnlMainFilmContent.createSequentialGroup()
									.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.LEADING)
										.addComponent(label)
										.addGroup(gl_pnlMainFilmContent.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtPnlCast, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.LEADING)
										.addComponent(lblSynopsis)
										.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE))))
							.addGap(277)
							.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNext)
								.addComponent(btnPrev)))))
		);
		
		lblPhotoImage = new JLabel("");
		lblPhotoImage.setMinimumSize(new Dimension(300, 200));
		lblPhotoImage.setMaximumSize(new Dimension(300, 200));
		lblPhotoImage.setPreferredSize(new Dimension(300, 200));
		scrollPanePhotos.setViewportView(lblPhotoImage);
		
		lblPosterImage = new JLabel("");
		lblPosterImage.setMinimumSize(new Dimension(300, 200));
		lblPosterImage.setMaximumSize(new Dimension(300, 200));
		lblPosterImage.setPreferredSize(new Dimension(300, 200));
		scrollPanePoster.setViewportView(lblPosterImage);
		
		textPaneSynopsis = new JTextPane();
		scrollPane.setViewportView(textPaneSynopsis);
		pnlMainFilmContent.setLayout(gl_pnlMainFilmContent);
	
		
		
		GroupLayout gl_pnlFilmList = new GroupLayout(pnlFilmList);
		gl_pnlFilmList.setHorizontalGroup(
			gl_pnlFilmList.createParallelGroup(Alignment.LEADING)
				.addComponent(filmTree, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
		);
		gl_pnlFilmList.setVerticalGroup(
			gl_pnlFilmList.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlFilmList.createSequentialGroup()
					.addComponent(filmTree, GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		pnlFilmList.setLayout(gl_pnlFilmList);
		
		frmFilmApp.getContentPane().setLayout(groupLayout);
		
		
		JMenuBar menuBar = new JMenuBar();
		frmFilmApp.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		mntmQuit = new MenuCommand("Quit", frmFilmApp);
		mnNewMenu.add(mntmQuit);
		mntmQuit.setCommand(new ExitCommand());
		mntmQuit.addActionListener(this);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		mntmAbout = new MenuCommand("About", frmFilmApp);
		mnHelp.add(mntmAbout);
		mntmAbout.setCommand(new AboutCommand(this));
		mntmAbout.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CommandHolder obj = (CommandHolder)e.getSource();
		obj.getCommand().Execute();
	}

	@Override
	public void valueChanged(TreeSelectionEvent evt) {
		TreePath path = evt.getPath();
        String selectedTerm = path.getLastPathComponent().toString();
        String parentTerm = path.getParentPath().toString().toLowerCase();
        
        emptyMovieFields();
        
        Movie movie;
        
        Film f = films.getChild(selectedTerm);
        if (f != null) {
        	if(parentTerm.contains("comedy")) {
        		movie = comedyStore.orderMovie(selectedTerm);
        		changeMovieFields(movie);
        	} else if(parentTerm.contains("action")) {
        		movie = actionStore.orderMovie(selectedTerm);
        		changeMovieFields(movie);
        	} else if(parentTerm.contains("horror")) {
        		movie = horrorStore.orderMovie(selectedTerm);
        		changeMovieFields(movie);
        	}
        }
	}// end valueChanged()
	
	public void emptyMovieFields() {
		txtTitle.setText("");
		txtDirector.setText("");
		txtReleaseDate.setText("");
		lblPosterImage.setIcon(null);
		lblPhotoImage.setIcon(null);
		txtRuntime.setText("");
		txtBudget.setText("");
		txtBoxOffice.setText("");
		txtWriters.setText("");
	}
	
	public void changeMovieFields(Movie movie) {
		
		emptyMovieFields();
		
		if(movie != null) {
			txtTitle.setText(movie.getFilmDetails().getTitle());
			txtDirector.setText(movie.getCrew().getDirector());
			txtReleaseDate.setText(movie.getFilmDetails().getReleaseDate());

			BufferedImage img = null;
			BufferedImage poster = null;
			try {
				img = ImageIO.read(new File(movie.getFilmDetails().getPhoto(0)));
				poster = ImageIO.read(new File(movie.getFilmDetails().getPoster()));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			Image resizedImg = img.getScaledInstance(lblPhotoImage.getWidth(), lblPhotoImage.getHeight(), Image.SCALE_DEFAULT);
			ImageIcon icon = new ImageIcon(resizedImg); 
			lblPhotoImage.setIcon(icon);
			
			Image resizedImgPoster = poster.getScaledInstance(lblPosterImage.getWidth(), lblPosterImage.getHeight(), Image.SCALE_SMOOTH);
			ImageIcon iconPoster = new ImageIcon(resizedImgPoster); 
			lblPosterImage.setIcon(iconPoster);
			
			txtRuntime.setText(movie.getFilmDetails().getRuntime());
			txtBudget.setText(movie.getFilmDetails().getBudget());
			txtBoxOffice.setText(movie.getFilmDetails().getBoxOffice());
			txtWriters.setText(movie.getCrew().getWriter());
			txtPnlCast.setText(movie.getCast().getAllCastMembers());
			textPaneSynopsis.setText(movie.getFilmDetails().getSynopsis());
		} else {
			String errormsg = "Details not available";
			txtTitle.setText(errormsg);
			txtDirector.setText(errormsg);
			txtReleaseDate.setText(errormsg);
			lblPhotoImage.setIcon(null);
			txtRuntime.setText(errormsg);
			txtBudget.setText(errormsg);
			txtBoxOffice.setText(errormsg);
			txtWriters.setText(errormsg);
		}
		
	}
}
