package tech.stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacob
 */
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class MainInterface extends javax.swing.JFrame {
    
    /**
     * Creates new form MainInterface
     */
    private ArrayList <String> currentGameList;
    private ArrayList <String> currentTypeList;
    private String currentGameSettingSelection;
    private String currentTypeSettingSelection;
    final File GAME_LIST = new File("Games.list");
    final File GAME_TYPE_LIST = new File("Types.list");
    private DefaultListModel gameListModel = new DefaultListModel();
    private DefaultListModel typeListModel = new DefaultListModel();
    private DefaultComboBoxModel gameComboModel = new DefaultComboBoxModel();
    private DefaultComboBoxModel typeComboModel = new DefaultComboBoxModel();
    //implement later:
    /*private String currentName1;
    private String currentName2;
    private String currentStock1;
    private String currentStock2;
    private String currentCommentator1;
    private String currentCommentator2;
    private String currentGame;
    private String currentType;*/
    public MainInterface() 
    {
        final String[] DEFAULT_GAME_LIST = new String[] {"Super Smash Bros. Brawl ", "Super Smash Bros. Melee ", 
                                                         "Project M ", "Brawl Minus Maximum "};
        final String[] DEFAULT_TYPE_LIST = new String[] {"Friendlies ", "Pools ", "Winners Bracket ", "Winners Quarters ", 
                                                         "Winners Semis ", "Winners Finals ", "Lossers Bracket ", "Losers Quarters ", 
                                                         "Losers Semis ", "Losers Finals ", "Grand Finals ", "Crew Battle ", "Money Match "};
        currentGameList = new ArrayList<String>();
        currentTypeList = new ArrayList<String>();
        currentGameSettingSelection = "";
        //read game list into an arraylist. Ff the file doesn't exist, make the file using the default list
        try 
        {
            Scanner gl = new Scanner(GAME_LIST);
            while (gl.hasNextLine()) 
            {
                String i = gl.nextLine();
                System.out.println(i);
                currentGameList.add(i);
            }
            gl.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("Games.list not found, creating using defaut list");
            currentGameList = new ArrayList<String>();
            try
                {
                    PrintWriter write_gl = new PrintWriter(GAME_LIST);
                    for (String s: DEFAULT_GAME_LIST)
                    {
                        write_gl.println(s);
                        currentGameList.add(s);
                    }
                    write_gl.close();
                }
                catch (FileNotFoundException ex)
                {
                    ex.printStackTrace();
                }
        }
        //read game-type list into an arraylist. Ff the file doesn't exist, make the file using the default list
        try 
        {
            Scanner tl = new Scanner(GAME_TYPE_LIST);
            currentTypeList = new ArrayList<String>();
            while (tl.hasNextLine()) 
            {
                String i = tl.nextLine();
                System.out.println(i);
                currentTypeList.add(i);
            }
            tl.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("Types.list not found, creating using defaut list");
            currentTypeList = new ArrayList<String>();
            try
                {
                    PrintWriter write_tl = new PrintWriter(GAME_TYPE_LIST);
                    for (String s: DEFAULT_TYPE_LIST)
                    {
                        write_tl.println(s);
                        currentTypeList.add(s);
                    }
                    write_tl.close();
                }
                catch (FileNotFoundException ex)
                {
                    ex.printStackTrace();
                }
        }
        gameListModel.addElement("<Add New Game>");
        typeListModel.addElement("<Add New Game Type>");
        for (String s: getGameList())
        {
            gameListModel.addElement(s);
            gameComboModel.addElement(s);
        }
        for (String s: getTypeList())
        {
            typeListModel.addElement(s);
            typeComboModel.addElement(s);
        }
        initComponents();
        /*jTextField7.setVisible(false);
        jTextField8.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList(gameListModel);
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList(typeListModel);
        jTextField6 = new javax.swing.JTextField();
        jFrame2 = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox(gameComboModel);
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox(typeComboModel);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        String[] spinner1List = {"-","0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","50","51","52","53","54","55","56","57","58","59","60","61","62","63","64","65","66","67","68","69","70","71","72","73","74","75","76","77","78","79","80","81","82","83","84","85","86","87","88","89","90","91","92","93","94","95","96","97","98","99"};
        jSpinner2 = new javax.swing.JSpinner(new SpinnerListModel(spinner1List));
        String[] spinner2List = {"-","0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","50","51","52","53","54","55","56","57","58","59","60","61","62","63","64","65","66","67","68","69","70","71","72","73","74","75","76","77","78","79","80","81","82","83","84","85","86","87","88","89","90","91","92","93","94","95","96","97","98","99"};
        jSpinner3 = new javax.swing.JSpinner(new SpinnerListModel(spinner2List));
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jFrame1.setTitle("Stream Text Changer - Settings");
        jFrame1.setAlwaysOnTop(true);
        jFrame1.setMinimumSize(new java.awt.Dimension(424, 274));
        jFrame1.setResizable(false);

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setSelectedIndex(0);
        jList1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged (ListSelectionEvent arg0)
            {
                if (!arg0.getValueIsAdjusting())
                {
                    currentGameSettingSelection = jList1.getSelectedValue().toString();
                    jTextField5.setText(currentGameSettingSelection);
                }
            }});
            jScrollPane1.setViewportView(jList1);

            jLabel6.setText("Games:");

            jLabel7.setText("Game Types:");

            int condition5 = JComponent.WHEN_FOCUSED;
            InputMap iMap5 = jTextField5.getInputMap(condition5);
            ActionMap aMap5 = jTextField5.getActionMap();

            String enter5 = "enter";
            iMap5.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), enter5);
            aMap5.put(enter5, new AbstractAction() {

                @Override
                public void actionPerformed(ActionEvent arg0)
                {
                    if (jList1.getSelectedValue().toString().equals("<Add New Game>")&&
                        !jTextField5.getText().equals("<Add New Game>")){
                        addGameToList(jTextField5.getText() + " ");
                        jList1.setSelectedValue(jTextField5.getText() + " ",true);
                    }
                    else if (!jList1.getSelectedValue().toString().equals(jTextField5.getText()))
                    {
                        editGameOnList(jList1.getSelectedValue().toString(),jTextField5.getText().trim() + " ");
                    }
                }
            });
            jTextField5.setText(jList1.getSelectedValue().toString());
            jTextField5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField5ActionPerformed(evt);
                }
            });

            jList2.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged (ListSelectionEvent arg0)
                {
                    if (!arg0.getValueIsAdjusting())
                    {
                        currentTypeSettingSelection = jList2.getSelectedValue().toString();
                        jTextField6.setText(currentTypeSettingSelection);
                    }
                }});
                jList2.setSelectedIndex(0);
                jScrollPane2.setViewportView(jList2);

                int condition6 = JComponent.WHEN_FOCUSED;
                InputMap iMap6 = jTextField6.getInputMap(condition5);
                ActionMap aMap6 = jTextField6.getActionMap();

                String enter6 = "enter";
                iMap6.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), enter6);
                aMap6.put(enter6, new AbstractAction() {

                    @Override
                    public void actionPerformed(ActionEvent arg0)
                    {
                        if (jList2.getSelectedValue().toString().equals("<Add New Game Type>")&&
                            !jTextField6.getText().equals("<Add New Game Type>")){
                            addTypeToList(jTextField6.getText() + " ");
                            jList2.setSelectedValue(jTextField6.getText() + " ",true);
                        }
                        else if (!jList2.getSelectedValue().toString().equals(jTextField6.getText()))
                        {
                            editTypeOnList(jList2.getSelectedValue().toString(),jTextField6.getText().trim() + " ");
                        }
                    }
                });
                jTextField6.setText(jList2.getSelectedValue().toString());

                javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
                jFrame1.getContentPane().setLayout(jFrame1Layout);
                jFrame1Layout.setHorizontalGroup(
                    jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(163, 163, 163)
                                .addComponent(jLabel7))
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(jTextField5))
                                .addGap(18, 18, 18)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(jTextField6))))
                        .addContainerGap(14, Short.MAX_VALUE))
                );
                jFrame1Layout.setVerticalGroup(
                    jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(78, Short.MAX_VALUE))
                );

                jFrame2.setTitle("Help");
                jFrame2.setMinimumSize(new java.awt.Dimension(400, 300));
                jFrame2.setSize(new java.awt.Dimension(670, 400));

                jEditorPane1.setEditable(false);
                jEditorPane1.setContentType("text/html"); // NOI18N
                jEditorPane1.setText("<html>\n  <body style=\"padding:6\">\n<h1>Program Function/Features</h1>\n<h2>What does this program do?</h2>\n<h3>Basically, it writes text files</h3>\nThis program writes multiple text files to be uses by your streaming program of choice to \ndisplay titles and other information. \n<p>By default the program writes text files representing:</p>\n<ul>\n<li>What game is being played</li>\n<li>What people/teams are playing it</li>\n<li>The individual set count/stock count of the people/teams playing</li>\n<li>What game type is being played (like Winners Bracket, Grand Finals, Crew Battle, etc.)</li>\n<li>The names of the individual commentators (both combined together and as separate text files)</li>\n<li>Two custom text files for other desired text</li>\n</ul>\n<h3>Where are the text files? How do I use them?</h3>\nThe text files are written in the folder where this program is located.\n<p>The names of the text files are as follows:</p>\n<ul>\n<li>Player 1/Team 1 Name = \"Player1Name.txt\"</li>\n<li>Player 2/Team 2 Name = \"Player2Name.txt\"</li>\n<li>Player 1/Team 1 Score = \"P1Score.txt\"</li>\n<li>Player 1/Team 1 Score = \"P2Score.txt\"</li>\n<li>Commentator 1 Name = \"Commentator1.txt\"</li>\n<li>Commentator 2 Name = \"Commentator2.txt\"</li>\n<li>Combined Commentator Names = \"Commentators.txt\"</li>\n<li>Game Name = \"Game.txt\"</li>\n<li>Game Type/Status = \"Status.txt\"</li>\n<li>Custom Text 1 = \"custom1.txt\"</li>\n<li>Custom Text 2 = \"custom2.txt\"</li>\n</ul>\n<h3>It also manages the stream text!</h3>\nIt makes it easier than ever to maintain a set format for stream text because all the text is in \none place and things like game name and game type are in a preset list you can customize to \nkeep consistency throughout. \n<p>It also makes actions such as incrementing and decrementing set counts or crew battle counts possible.</p>\n<h3>It can be used as a scene change!</h3>\nUsing the scene changing buttons it is easy to change what scene you are broadcasting and be able to quickly \ntell which scene you are currently using.\n<h1>How to setup streaming software</h1>\n<h2>With Open Broadcaster (OBS)</h2>\n<h3>To add text</h3>\nIn OBS, select the scene you will be using and right click in the \"Sources\" region and hover over \n\"Add\" and then select \"Text\"\n<br>Then, on the new text dialogue, select the \"From text file\" circle and click \"browse...\" \nNavigate to the folder this program is in (the text files will be in that folder) and select the desired file. \nFormat the text however you desire.\n<h3>Setup scene changer</h3>\nBy default the scene changing buttons simply execute a key press for \"F2\", \"F3\", and \"F4\" respectively. To make that work with OBS simply right click a scene and select \"Set Hotkey\". Then set that hotkey to \neither \"F2\", \"F3\", or \"F4\".\n<p>Note: in the standard version of OBS (not multi-platform version), the scene switching is \nrather lagy for certain components. Mostly if you have a webcam, it will likely take a second or so to show up after \nyou switch scenes, but there shouldn't be any dropped frames as a result of scene switching</p>\n<h2>With XSplit</h2>\n<h3>SPECIFIC INSTRUCTIONS COMING SOON</h3>\nFor now, refer to the OBS instructions above, they should be very similar.\n<h1>Changing Settings</h1>\n<h2>Add, edit or remove games/game types</h2>\n<h3>To Add:</h3>\nUse the text boxes to add, edit or remove games or game types.\nTo add a game or game type select the <Add Game> or <Add Game Type> on the\ntop if the list, delete the text in the box and type the desired text and then press enter.\n<h3>To Edit:</h3>\nTo edit an entry, select what game or game type you want to edit, \nedit the text in the box, then press enter to confirm the change.\n<h3>To delete:</h3>\nTo delete an entry, follow the same procedure as editing a game/game type but simply\ndelete all the characters in the box and press enter to delete the entry.\n<p>Any changes made will update in the main program immediately, but won't update the text files until\nthe either the \"Update!\" button is pressed or the appropriate box is changed</p>\n  </body>\n</html>\n");
                jScrollPane4.setViewportView(jEditorPane1);

                javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
                jFrame2.getContentPane().setLayout(jFrame2Layout);
                jFrame2Layout.setHorizontalGroup(
                    jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                        .addContainerGap())
                );
                jFrame2Layout.setVerticalGroup(
                    jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                        .addContainerGap())
                );

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Stream Text Changer");
                setResizable(false);

                int condition = JComponent.WHEN_FOCUSED;
                InputMap iMap = jTextField1.getInputMap(condition);
                ActionMap aMap = jTextField1.getActionMap();

                String enter = "enter";
                iMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), enter);
                aMap.put(enter, new AbstractAction() {

                    @Override
                    public void actionPerformed(ActionEvent arg0)
                    {
                        writeAll();
                    }
                });
                jTextField1.setText("Player 1");
                jTextField1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jTextField1ActionPerformed(evt);
                    }
                });

                jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jComboBox1ActionPerformed(evt);
                    }
                });

                int condition2 = JComponent.WHEN_FOCUSED;
                InputMap iMap2 = jTextField2.getInputMap(condition2);
                ActionMap aMap2 = jTextField2.getActionMap();

                String enter2 = "enter";
                iMap2.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), enter2);
                aMap2.put(enter, new AbstractAction() {

                    @Override
                    public void actionPerformed(ActionEvent arg0)
                    {
                        writeAll();
                    }
                });
                jTextField2.setText("Player 2");
                jTextField2.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jTextField2ActionPerformed(evt);
                    }
                });

                jComboBox2.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jComboBox2ActionPerformed(evt);
                    }
                });

                jLabel1.setText("Game:");

                jLabel2.setText("Game Type:");

                jLabel3.setText("Left Player:");

                jLabel4.setText("Right Player:");

                int condition3 = JComponent.WHEN_FOCUSED;
                InputMap iMap3 = jTextField3.getInputMap(condition3);
                ActionMap aMap3 = jTextField3.getActionMap();

                String enter3 = "enter";
                iMap3.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), enter3);
                aMap3.put(enter, new AbstractAction() {

                    @Override
                    public void actionPerformed(ActionEvent arg0)
                    {
                        writeAll();
                    }
                });
                jTextField3.setText("Commentator 1");

                jLabel5.setText("Commentators:");

                int condition4 = JComponent.WHEN_FOCUSED;
                InputMap iMap4 = jTextField4.getInputMap(condition4);
                ActionMap aMap4 = jTextField4.getActionMap();

                String enter4 = "enter";
                iMap4.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), enter4);
                aMap4.put(enter, new AbstractAction() {

                    @Override
                    public void actionPerformed(ActionEvent arg0)
                    {
                        writeAll();
                    }
                });
                jTextField4.setText("Commentator 2");
                jTextField4.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jTextField4ActionPerformed(evt);
                    }
                });

                jButton1.setText("UPDATE!");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                    }
                });

                jToggleButton1.setSelected(true);
                jToggleButton1.setText("Main (F2)");
                jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jToggleButton1ActionPerformed(evt);
                    }
                });

                jToggleButton2.setText("View 2 (F3)");
                jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jToggleButton2ActionPerformed(evt);
                    }
                });

                jToggleButton3.setText("Player Cam (F4) ");
                jToggleButton3.setSize(new java.awt.Dimension(146, 29));
                jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jToggleButton3ActionPerformed(evt);
                    }
                });

                jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tech/stream/gears.png"))); // NOI18N
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                    }
                });

                int condition7 = JComponent.WHEN_FOCUSED;
                InputMap iMap7 = jTextField7.getInputMap(condition7);
                ActionMap aMap7 = jTextField7.getActionMap();

                String enter7 = "enter";
                iMap7.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), enter7);
                aMap7.put(enter, new AbstractAction() {

                    @Override
                    public void actionPerformed(ActionEvent arg0)
                    {
                        writeAll();
                    }
                });
                jTextField7.setText("Custom Text 1");
                jTextField7.setPreferredSize(new java.awt.Dimension(112, 28));

                int condition8 = JComponent.WHEN_FOCUSED;
                InputMap iMap8 = jTextField2.getInputMap(condition8);
                ActionMap aMap8 = jTextField2.getActionMap();

                String enter8 = "enter";
                iMap8.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), enter8);
                aMap8.put(enter, new AbstractAction() {

                    @Override
                    public void actionPerformed(ActionEvent arg0)
                    {
                        writeAll();
                    }
                });
                jTextField8.setText("Custom Text 2");

                jLabel8.setText("Custom 1");

                jLabel9.setText("Custom 2");

                jButton3.setText("?");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton3ActionPerformed(evt);
                    }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 244, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel4)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(20, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel5)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jToggleButton3)))
                                .addGap(2, 2, 2)))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(106, 106, 106)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(161, 161, 161))
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton1)
                            .addComponent(jToggleButton2)
                            .addComponent(jToggleButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addContainerGap())))
                );

                ChangeListener listener2 = new ChangeListener() {
                    public void stateChanged(ChangeEvent e)
                    {
                        try
                        {
                            PrintWriter numberOfWins1 = new PrintWriter("P1Score.txt");
                            numberOfWins1.print(jSpinner2.getValue().toString());
                            numberOfWins1.close();
                        }
                        catch (Exception e2)
                        {
                            e2.printStackTrace();
                        }
                    }
                };
                jSpinner2.addChangeListener(listener2);
                ChangeListener listener3 = new ChangeListener() {
                    public void stateChanged(ChangeEvent e)
                    {
                        try
                        {
                            PrintWriter numberOfWins2 = new PrintWriter("P2Score.txt");
                            numberOfWins2.print(jSpinner3.getValue().toString());
                            numberOfWins2.close();
                        }
                        catch (Exception e3)
                        {
                            e3.printStackTrace();
                        }
                    }
                };
                jSpinner3.addChangeListener(listener3);

                pack();
            }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try
        {
            PrintWriter game = new PrintWriter("Game.txt");
            game.print(jComboBox1.getSelectedItem().toString() + " ");
            game.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        writeAll();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        try
        {
            if (jComboBox2.getSelectedItem().toString().equals("Crew Battle "))
            {
                jLabel3.setText("Left Team:");
                jLabel4.setText("Right Team:");
                jSpinner2.setValue("0");
                jSpinner3.setValue("0");
                if (jTextField1.getText().equals("Player 1 "))
                {
                    jTextField1.setText("Team 1 ");
                }
                if (jTextField2.getText().equals("Player 2 "))
                {
                    jTextField2.setText("Team 2 ");
                }
            }
            else if (jComboBox2.getSelectedItem().toString().equals("Friendlies "))
            {
                jSpinner2.setValue("-");
                jSpinner3.setValue("-");
                if (jTextField1.getText().equals("Team 1 "))
                {
                    jTextField1.setText("Player 1 ");
                }
                if (jTextField2.getText().equals("Team 2 "))
                {
                    jTextField2.setText("Player 2 ");
                }
            }
            else
            {
                jLabel3.setText("Left Player:");
                jLabel4.setText("Right Player:");
                jSpinner2.setValue("0");
                jSpinner3.setValue("0");
                if (jTextField1.getText().equals("Team 1 "))
                {
                    jTextField1.setText("Player 1 ");
                }
                if (jTextField2.getText().equals("Team 2 "))
                {
                    jTextField2.setText("Player 2");
                }
            }	
            PrintWriter numberOfWins1 = new PrintWriter("P1Score.txt");
            PrintWriter numberOfWins2 = new PrintWriter("P2Score.txt");
            PrintWriter locationInBracket = new PrintWriter("Status.txt");
            
            numberOfWins1.print(jSpinner2.getValue().toString() + " ");
            numberOfWins2.print(jSpinner3.getValue().toString() + " ");
            locationInBracket.print(jComboBox2.getSelectedItem().toString() + " ");
            
            numberOfWins1.close();
            numberOfWins2.close();
            locationInBracket.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        jToggleButton1.setSelected(false);
        jToggleButton2.setSelected(false);
        jToggleButton3.setSelected(true);
        try 
        {
            Robot robot = new Robot();

            // Simulate a key press
            //robot.keyPress(KeyEvent.VK_CONTROL);
            //robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_F4);
            
            Thread.sleep(50);
            
            //robot.keyRelease(KeyEvent.VK_CONTROL);
            //robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_F4);

        } 
        catch (AWTException | InterruptedException e) 
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        jToggleButton1.setSelected(true);
        jToggleButton2.setSelected(false);
        jToggleButton3.setSelected(false);
        try 
        {
            Robot robot = new Robot();

            // Simulate a key press
            //robot.keyPress(KeyEvent.VK_CONTROL);
            //robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_F2);
            
            Thread.sleep(50);
            
            //robot.keyRelease(KeyEvent.VK_CONTROL);
            //robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_F2);

        } 
        catch (AWTException | InterruptedException e) 
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        jToggleButton1.setSelected(false);
        jToggleButton2.setSelected(true);
        jToggleButton3.setSelected(false);
        try 
        {
            Robot robot = new Robot();

            // Simulate a key press
            //robot.keyPress(KeyEvent.VK_CONTROL);
            //robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_F3);
            
            Thread.sleep(50);
            
            //robot.keyRelease(KeyEvent.VK_CONTROL);
            //robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_F3);

        } 
        catch (AWTException | InterruptedException e) 
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jFrame1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jFrame2.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    private void writeAll()
    {
        try
            {
                PrintWriter p1Name = new PrintWriter("Player1Name.txt");
                PrintWriter p2Name = new PrintWriter("Player2Name.txt");
                PrintWriter numberOfWins1 = new PrintWriter("P1Score.txt");
                PrintWriter numberOfWins2 = new PrintWriter("P2Score.txt");
                PrintWriter commentary = new PrintWriter("Commentators.txt");
                PrintWriter game = new PrintWriter("Game.txt");
                PrintWriter locationInBracket = new PrintWriter("Status.txt");
                PrintWriter custom1 = new PrintWriter("custom1.txt");
                PrintWriter custom2 = new PrintWriter("custom2.txt");

                p1Name.print(jTextField1.getText() + " ");
                p2Name.print(jTextField2.getText() + " ");
                numberOfWins1.print(jSpinner2.getValue().toString() + " ");
                numberOfWins2.print(jSpinner3.getValue().toString() + " ");
                if (jTextField3.getText().trim().equals("") && jTextField4.getText().trim().equals(""))
                    commentary.print(" ");
                else if (jTextField3.getText().trim().equals(""))
                    commentary.print(jTextField4.getText() + " ");
                else if (jTextField4.getText().trim().equals(""))
                    commentary.print(jTextField3.getText() + " ");
                else
                    commentary.print(jTextField3.getText() + " & " + jTextField4.getText());
                locationInBracket.print(jComboBox2.getSelectedItem().toString());
                game.print(jComboBox1.getSelectedItem().toString());
                custom1.print(jTextField7.getText() + " ");
                custom2.print(jTextField8.getText() + " ");

                p1Name.close();
                p2Name.close();
                numberOfWins1.close();
                numberOfWins2.close();
                commentary.close();
                locationInBracket.close();
                game.close();
                custom1.close();
                custom2.close();
            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
    }
    private void addGameToList(String game)
    {
        if (game.trim().length() > 0)
        {
            System.out.println("Adding game: " + game);
            currentGameList.add(game);
            String last = getGameList().get(getGameList().size() - 1);
            gameListModel.addElement(last);
            jComboBox1.addItem(last);
            writeGameList();
        }
    }
    private void editGameOnList(String oldName,String newName)
    {
        if (newName.trim().length() > 0)
        {
            System.out.println ("Changing game name from: " + oldName + " to: " + newName);
            currentGameList.set(getGameList().indexOf(oldName),newName);
            gameListModel.set(gameListModel.indexOf(oldName),newName);
            gameComboModel.insertElementAt(newName, gameComboModel.getIndexOf(oldName));
            gameComboModel.removeElement(oldName);
        }
        else
        {
            jList1.setSelectedIndex(jList1.getSelectedIndex() - 1);
            currentGameList.remove(oldName);
            gameListModel.removeElement(oldName);
            gameComboModel.removeElement(oldName);
        }
    }
    private void writeGameList()
    {
        try
        {
            PrintWriter write_gl = new PrintWriter(GAME_LIST);
            for (String s: getGameList())
            {
                write_gl.println(s);
            }
            write_gl.close();
        }
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
    private void addTypeToList(String type)
    {
        if (type.trim().length() > 0)
        {
            System.out.println("Adding game: " + type);
            currentTypeList.add(type);
            String last = getTypeList().get(getTypeList().size() - 1);
            typeListModel.addElement(last);
            jComboBox2.addItem(last);
            writeTypeList();
        }
    }
    private void editTypeOnList(String oldName,String newName)
    {
        if (newName.trim().length() > 0)
        {
            System.out.println ("Changing game name from: " + oldName + " to: " + newName);
            currentTypeList.set(getTypeList().indexOf(oldName),newName);
            typeListModel.set(typeListModel.indexOf(oldName),newName);
            typeComboModel.insertElementAt(newName, typeComboModel.getIndexOf(oldName));
            typeComboModel.removeElement(oldName);
        }
        else
        {
            jList2.setSelectedIndex(jList2.getSelectedIndex() - 1);
            currentTypeList.remove(oldName);
            typeListModel.removeElement(oldName);
            typeComboModel.removeElement(oldName);
        }
    }
    private void writeTypeList()
    {
        try
        {
            PrintWriter write_tl = new PrintWriter(GAME_TYPE_LIST);
            for (String s: getTypeList())
            {
                write_tl.println(s);
            }
            write_tl.close();
        }
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
    private ArrayList <String> getGameList()
    {
        return currentGameList;
    }
    private ArrayList <String> getTypeList()
    {
        return currentTypeList;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables
}
