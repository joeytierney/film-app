package com.filmApp.GUI;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTree;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.border.BevelBorder;

import com.filmApp.CommandPattern.AboutCommand;
import com.filmApp.CommandPattern.ButtonCommand;
import com.filmApp.CommandPattern.CommandHolder;
import com.filmApp.CommandPattern.ExitButtonCommand;
import com.filmApp.CommandPattern.ExitCommand;
import com.filmApp.CommandPattern.MenuCommand;
import com.filmApp.CompositePattern.FilmTree;


public class FilmAppGUI implements ActionListener {

	private JFrame frmFilmApp;
	private JTextField txtTitle;
	private JTextField txtDirector;
	private JTextField txtReleaseDate;
	private JTextField txtRuntime;
	private JTextField txtBudget;
	private JTextField txtBoxOffice;
	private JTextField txtWriters;
	private JTextField txtSynopsis;
	
	JMenu mnNewMenu;
	MenuCommand mntmQuit, mntmAbout;
	ExitButtonCommand ex;
	protected JTree filmTree;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//InitFilms films = new InitFilms();
		//films.initFilms();
		
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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmFilmApp = new JFrame();
		frmFilmApp.setTitle("Film App");
		frmFilmApp.setBounds(100, 100, 978, 677);
		frmFilmApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//FilmTree testTree = new FilmTree();
		
		JPanel pnlFilmList = new JPanel();
		pnlFilmList.setBorder(new TitledBorder(null, "Film List", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		//pnlFilmList.add(testTree.getJPanel());
		
		JPanel pnlMainFilmContent = new JPanel();
		
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
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnQuit)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(pnlFilmList, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(pnlMainFilmContent, GroupLayout.PREFERRED_SIZE, 720, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(pnlMainFilmContent, GroupLayout.PREFERRED_SIZE, 539, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlFilmList, GroupLayout.PREFERRED_SIZE, 547, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnQuit)
					.addContainerGap(16, Short.MAX_VALUE))
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
		
		JLabel lblCast = new JLabel("Cast");
		
		txtTitle = new JTextField();
		txtTitle.setColumns(10);
		
		txtDirector = new JTextField();
		txtDirector.setColumns(10);
		
		txtReleaseDate = new JTextField();
		txtReleaseDate.setColumns(10);
		
		txtRuntime = new JTextField();
		txtRuntime.setColumns(10);
		
		txtBudget = new JTextField();
		txtBudget.setColumns(10);
		
		txtBoxOffice = new JTextField();
		txtBoxOffice.setColumns(10);
		
		txtWriters = new JTextField();
		txtWriters.setColumns(10);
		
		txtSynopsis = new JTextField();
		txtSynopsis.setColumns(10);
		
		JList<Object> list = new JList<Object>();
		list.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JPanel pnlPhotos = new JPanel();
		pnlPhotos.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JButton btnNext = new JButton(">>");
		
		JButton btnPrev = new JButton("<<");
		GroupLayout gl_pnlMainFilmContent = new GroupLayout(pnlMainFilmContent);
		gl_pnlMainFilmContent.setHorizontalGroup(
			gl_pnlMainFilmContent.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlMainFilmContent.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlMainFilmContent.createSequentialGroup()
							.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPoster)
								.addComponent(lblPhotos))
							.addGap(265)
							.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.LEADING)
								.addComponent(lblReleaseDate)
								.addComponent(lblTitle)
								.addComponent(lblDirector)
								.addComponent(lblRuntime)
								.addComponent(lblBudget)
								.addComponent(lblBoxOffice)
								.addComponent(lblWriters)
								.addComponent(lblSynopsis)
								.addComponent(lblCast)))
						.addComponent(pnlPhotos, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.LEADING)
						.addComponent(list, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
						.addComponent(txtSynopsis, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
						.addComponent(txtDirector, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
						.addComponent(txtTitle, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
						.addComponent(txtReleaseDate, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
						.addComponent(txtRuntime, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
						.addComponent(txtBudget, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
						.addComponent(txtBoxOffice, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
						.addComponent(txtWriters, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
					.addGap(21))
				.addGroup(gl_pnlMainFilmContent.createSequentialGroup()
					.addGap(100)
					.addComponent(btnPrev)
					.addGap(18)
					.addComponent(btnNext)
					.addContainerGap(504, Short.MAX_VALUE))
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
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSynopsis)
						.addComponent(txtSynopsis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.BASELINE)
						.addGroup(gl_pnlMainFilmContent.createSequentialGroup()
							.addComponent(lblPhotos)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(pnlPhotos, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblCast)
						.addComponent(list, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlMainFilmContent.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNext)
						.addComponent(btnPrev))
					.addGap(48))
		);
		pnlMainFilmContent.setLayout(gl_pnlMainFilmContent);
		
		filmTree = new JTree();
		/**
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
		*/
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
}
