import javax.swing.*;
import java.awt.*;

public class GUI {
    private JFrame frame;

    // components
    private JButton dailyNotesButton;
    private JButton allPagesButton;
    private JButton createPageButton;

    private JLabel shortcutsLabel;

    private JPanel buttonPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;

    private JSplitPane splitPane;


    /** Constructor for GUI. Uses Java's swing library to display graphics.
     *
     */
    public GUI() {
        frame = new JFrame("Roam");

        initComponents();

        // add components to JFrame
        frame.add(splitPane);

        // configure JFrame to draw
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /** Initializes components that will be added to JFrame.
     *
     */
    private void initComponents() {
        // instantiate components
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(0, 1));
        dailyNotesButton = new JButton("DAILY NOTES");
        dailyNotesButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        dailyNotesButton.setFont(new Font("Arial", Font.PLAIN, 18));
        createPageButton = new JButton("CREATE PAGE");
        createPageButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        createPageButton.setFont(new Font("Arial", Font.PLAIN, 18));
        allPagesButton = new JButton("ALL PAGES");
        allPagesButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        allPagesButton.setFont(new Font("Arial", Font.PLAIN, 18));
        shortcutsLabel = new JLabel("SHORTCUTS", (int) JComponent.CENTER_ALIGNMENT);
        shortcutsLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        shortcutsLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        buttonPanel.add(dailyNotesButton);
        buttonPanel.add(allPagesButton);
        buttonPanel.add(createPageButton);
        buttonPanel.add(shortcutsLabel);

        leftPanel = new JPanel();
        leftPanel.setLayout(new BorderLayout());
        leftPanel.add(buttonPanel, BorderLayout.NORTH);

        rightPanel = new JPanel();

        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
        splitPane.setResizeWeight(.125); // set location of divider
        splitPane.setEnabled(false); // doesn't allow split pane to resize
    }
}
