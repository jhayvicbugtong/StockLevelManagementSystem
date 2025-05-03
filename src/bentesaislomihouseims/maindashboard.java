/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bentesaislomihouseims;

import com.mysql.cj.jdbc.CallableStatement;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.security.Timestamp;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author bugtong
 */
public class maindashboard extends javax.swing.JFrame {

    /**
     * Creates new form maindashboard
     */
    Color DefaultColor, ClickedColor;

    public maindashboard() {
        initComponents();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        showBarChart();
        showPieChart();
        showLineChart();
        loadAllItemQuantities();
        loadAllItemsToItemsList2();
        loadRecentChangesToChangesTable();
        showLowStockCount();
        showTotalItemCount();
        loadAllItemsToTable();
        chooseDate.setDate(new java.util.Date());
        salesPerdayChooser.setDate(new java.util.Date());
        java.util.Calendar now = java.util.Calendar.getInstance();
        averagePerMonth.setMonth(now.get(java.util.Calendar.MONTH)); // 0-indexed
        yearChooser.setYear(now.get(java.util.Calendar.YEAR));

        // Listen to date changes
        jDateChooser1.addPropertyChangeListener("date", evt -> tryLoadReports());
        jDateChooser2.addPropertyChangeListener("date", evt -> tryLoadReports());

// Listen to stock filter selection changes
        categoryBox2.addActionListener(e -> tryLoadReports());

        DefaultColor = new Color(31, 70, 41);
        ClickedColor = new Color(68, 84, 52);

        tabNew.setBackground(DefaultColor);
        tab3.setBackground(DefaultColor);
        tab.setBackground(DefaultColor);
        tab4.setBackground(DefaultColor);

        gramsField.setVisible(false);
        grams.setVisible(false);
        jSeparator7.setVisible(false);

        unitBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedUnit = unitBox.getSelectedItem().toString();
                boolean showGrams = "grams".equals(selectedUnit);

                gramsField.setVisible(showGrams);
                grams.setVisible(showGrams);
                jSeparator7.setVisible(showGrams);
            }
        });

        // Inside your class constructor or initialization block
        searchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                searchItemInTable();  // Call your search method when text is inserted
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                searchItemInTable();  // Call your search method when text is removed
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                searchItemInTable();  // This method is for non-textual changes (e.g., formatting)
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        addItem = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        itemnameField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        unitBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        gramsField = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        quantityfield1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        itemsList2 = new javax.swing.JTable();
        photoFrame = new javax.swing.JLabel();
        uploadPic = new javax.swing.JButton();
        grams = new javax.swing.JLabel();
        updateInventory = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        addStocks = new javax.swing.JButton();
        reduceStocks = new javax.swing.JButton();
        quantityField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsList = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        itemField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel36 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        analyticsPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        analyticsPanel1 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        chooseDate = new com.toedter.calendar.JDateChooser();
        reportsTab = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        reportsTable = new javax.swing.JTable();
        categoryBox2 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        salesPerdayChooser = new com.toedter.calendar.JDateChooser();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        salesPerday = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        salesPerMonth = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        averagePerMonth = new com.toedter.calendar.JMonthChooser();
        yearChooser = new com.toedter.calendar.JYearChooser();
        inventoryTab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        changesTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        recentTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        lowstockField = new javax.swing.JLabel();
        totalitemsField = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        removeItem = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        photoFrame2 = new javax.swing.JLabel();
        tabNew = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        tab3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        tab = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        tab4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        tab1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        tab5 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        tab6 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Low Stocks:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(19, 56, 25));
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 760));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(54, 94, 50));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        addItem.setBackground(new java.awt.Color(31, 70, 41));
        addItem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ADD NEW INVENTORY ITEM");
        addItem.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        itemnameField.setBackground(new java.awt.Color(31, 70, 41));
        itemnameField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        itemnameField.setForeground(new java.awt.Color(255, 255, 255));
        itemnameField.setBorder(null);
        itemnameField.setCaretColor(new java.awt.Color(255, 255, 255));
        addItem.add(itemnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 160, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Item Name:");
        addItem.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(104, 185, 50));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        addItem.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 162, 10));

        unitBox.setBackground(new java.awt.Color(204, 204, 204));
        unitBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        unitBox.setForeground(new java.awt.Color(54, 94, 50));
        unitBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pcs", "grams" }));
        unitBox.setToolTipText("");
        addItem.add(unitBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Specify:");
        addItem.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        gramsField.setBackground(new java.awt.Color(31, 70, 41));
        gramsField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gramsField.setForeground(new java.awt.Color(255, 255, 255));
        gramsField.setBorder(null);
        gramsField.setCaretColor(new java.awt.Color(255, 255, 255));
        addItem.add(gramsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 37, 30));

        jSeparator7.setBackground(new java.awt.Color(104, 185, 50));
        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        addItem.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 37, 10));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Quantity:");
        addItem.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        quantityfield1.setBackground(new java.awt.Color(31, 70, 41));
        quantityfield1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        quantityfield1.setForeground(new java.awt.Color(255, 255, 255));
        quantityfield1.setBorder(null);
        quantityfield1.setCaretColor(new java.awt.Color(255, 255, 255));
        quantityfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityfield1ActionPerformed(evt);
            }
        });
        addItem.add(quantityfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 40, 30));

        jSeparator5.setBackground(new java.awt.Color(104, 185, 50));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        addItem.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 40, 10));

        addButton.setBackground(new java.awt.Color(204, 204, 204));
        addButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        addItem.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 80, 30));

        cancelButton.setBackground(new java.awt.Color(204, 204, 204));
        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cancelButton.setText("CANCEL");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        addItem.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 100, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("List of Items:");
        addItem.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        itemsList2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemsList2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Name", "Quantity", "Unit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemsList2.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(itemsList2);

        addItem.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 900, 410));

        photoFrame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        addItem.add(photoFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 270, 230));

        uploadPic.setBackground(new java.awt.Color(204, 204, 204));
        uploadPic.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        uploadPic.setText("UPLOAD PHOTO");
        uploadPic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPicActionPerformed(evt);
            }
        });
        addItem.add(uploadPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, -1, 30));

        grams.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        grams.setForeground(new java.awt.Color(255, 255, 255));
        grams.setText("grams");
        addItem.add(grams, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));

        jTabbedPane1.addTab("ADD", addItem);

        updateInventory.setBackground(new java.awt.Color(31, 70, 41));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("UPDATE INVENTORY ITEM");

        addStocks.setBackground(new java.awt.Color(204, 204, 204));
        addStocks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addStocks.setText("ADD STOCKS");
        addStocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStocksActionPerformed(evt);
            }
        });

        reduceStocks.setBackground(new java.awt.Color(204, 204, 204));
        reduceStocks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reduceStocks.setText("REDUCE STOCKS");
        reduceStocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduceStocksActionPerformed(evt);
            }
        });

        quantityField.setBackground(new java.awt.Color(31, 70, 41));
        quantityField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        quantityField.setForeground(new java.awt.Color(255, 255, 255));
        quantityField.setBorder(null);
        quantityField.setCaretColor(new java.awt.Color(255, 255, 255));
        quantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityFieldActionPerformed(evt);
            }
        });

        itemsList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        itemsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item Name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        itemsList.setFillsViewportHeight(true);
        itemsList.getTableHeader().setResizingAllowed(false);
        itemsList.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(itemsList);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Item Name:");

        itemField.setEditable(false);
        itemField.setBackground(new java.awt.Color(31, 70, 41));
        itemField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        itemField.setForeground(new java.awt.Color(255, 255, 255));
        itemField.setBorder(null);
        itemField.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Quantity:");

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator9.setBackground(new java.awt.Color(104, 185, 50));
        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Search Item:");

        searchField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(204, 204, 204));
        search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updateInventoryLayout = new javax.swing.GroupLayout(updateInventory);
        updateInventory.setLayout(updateInventoryLayout);
        updateInventoryLayout.setHorizontalGroup(
            updateInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateInventoryLayout.createSequentialGroup()
                .addGroup(updateInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateInventoryLayout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(jLabel14))
                    .addGroup(updateInventoryLayout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(search))
                    .addGroup(updateInventoryLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updateInventoryLayout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addGroup(updateInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updateInventoryLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(8, 8, 8)
                                .addComponent(itemField, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(updateInventoryLayout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(updateInventoryLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(addStocks)
                                .addGap(45, 45, 45)
                                .addComponent(reduceStocks))
                            .addGroup(updateInventoryLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(updateInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(195, 195, 195))
        );
        updateInventoryLayout.setVerticalGroup(
            updateInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateInventoryLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(updateInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36))
                    .addGroup(updateInventoryLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(search)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(updateInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updateInventoryLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel16))
                    .addComponent(itemField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(updateInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updateInventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStocks)
                    .addComponent(reduceStocks))
                .addGap(124, 124, 124))
        );

        jTabbedPane1.addTab("UPDATE", updateInventory);

        analyticsPanel.setBackground(new java.awt.Color(31, 70, 41));
        analyticsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ITEMS ANALYTICS");
        analyticsPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        javax.swing.GroupLayout analyticsPanel1Layout = new javax.swing.GroupLayout(analyticsPanel1);
        analyticsPanel1.setLayout(analyticsPanel1Layout);
        analyticsPanel1Layout.setHorizontalGroup(
            analyticsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 771, Short.MAX_VALUE)
        );
        analyticsPanel1Layout.setVerticalGroup(
            analyticsPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        analyticsPanel.add(analyticsPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 181, -1, 570));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Choose Date:");
        analyticsPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 160, -1));

        chooseDate.setBackground(new java.awt.Color(31, 70, 41));
        chooseDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                chooseDatePropertyChange(evt);
            }
        });
        analyticsPanel.add(chooseDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 158, 30));

        jTabbedPane1.addTab("ANALYTICS", analyticsPanel);

        reportsTab.setBackground(new java.awt.Color(31, 70, 41));
        reportsTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Report Type:");
        reportsTab.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Date:");
        reportsTab.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("To");
        reportsTab.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));

        reportsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item Name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(reportsTable);

        reportsTab.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 1060, 210));

        categoryBox2.setBackground(new java.awt.Color(204, 204, 204));
        categoryBox2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        categoryBox2.setForeground(new java.awt.Color(54, 94, 50));
        categoryBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "High Stocks", "Low Stocks" }));
        categoryBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryBox2ActionPerformed(evt);
            }
        });
        categoryBox2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                categoryBox2PropertyChange(evt);
            }
        });
        reportsTab.add(categoryBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 128, -1));
        reportsTab.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 127, -1));
        reportsTab.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 127, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Reports");
        reportsTab.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        salesPerdayChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                salesPerdayChooserPropertyChange(evt);
            }
        });
        reportsTab.add(salesPerdayChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 135, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("From:");
        reportsTab.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Average Sales Per Day");
        reportsTab.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        javax.swing.GroupLayout salesPerdayLayout = new javax.swing.GroupLayout(salesPerday);
        salesPerday.setLayout(salesPerdayLayout);
        salesPerdayLayout.setHorizontalGroup(
            salesPerdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        salesPerdayLayout.setVerticalGroup(
            salesPerdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        reportsTab.add(salesPerday, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 450, 410));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Average Sales Per Month");
        reportsTab.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, -1, -1));

        salesPerMonth.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        reportsTab.add(salesPerMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 420, 590, 410));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Month:");
        reportsTab.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, -1, -1));

        averagePerMonth.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                averagePerMonthPropertyChange(evt);
            }
        });
        reportsTab.add(averagePerMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 130, -1));

        yearChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                yearChooserPropertyChange(evt);
            }
        });
        reportsTab.add(yearChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 390, 60, -1));

        jTabbedPane1.addTab("REPORTS", reportsTab);

        inventoryTab.setBackground(new java.awt.Color(31, 70, 41));
        inventoryTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Low Stocks:");
        inventoryTab.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));
        inventoryTab.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 40, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inventory Movements");
        inventoryTab.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));
        inventoryTab.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 40, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Changes in Stocks:");
        inventoryTab.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, -1, -1));

        changesTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        changesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item", "Past Quantity", "Updated Quantity", "Changed At"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(changesTable);

        inventoryTab.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 610, 930, 220));

        recentTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        recentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        recentTable.setRowSelectionAllowed(false);
        recentTable.setShowGrid(false);
        recentTable.getTableHeader().setResizingAllowed(false);
        recentTable.getTableHeader().setReorderingAllowed(false);
        recentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recentTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(recentTable);

        inventoryTab.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 930, 230));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("All Items:");
        inventoryTab.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        lowstockField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lowstockField.setForeground(new java.awt.Color(255, 255, 255));
        inventoryTab.add(lowstockField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 40, 30));

        totalitemsField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalitemsField.setForeground(new java.awt.Color(255, 255, 255));
        inventoryTab.add(totalitemsField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 40, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Item Image:");
        inventoryTab.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, -1, -1));

        removeItem.setBackground(new java.awt.Color(204, 204, 204));
        removeItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        removeItem.setText("REMOVE ITEM");
        removeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemActionPerformed(evt);
            }
        });
        inventoryTab.add(removeItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, 20));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Total Items:");
        inventoryTab.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        photoFrame2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        inventoryTab.add(photoFrame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 250, 210));

        jTabbedPane1.addTab("INVENTORY", inventoryTab);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, -40, 1120, 900));

        tabNew.setBackground(new java.awt.Color(31, 70, 41));
        tabNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabNewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabNewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tabNewMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabNewMousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/grid_24px.png"))); // NOI18N
        jLabel17.setText("VIEW ANALYTICS");

        javax.swing.GroupLayout tabNewLayout = new javax.swing.GroupLayout(tabNew);
        tabNew.setLayout(tabNewLayout);
        tabNewLayout.setHorizontalGroup(
            tabNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabNewLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(60, 60, 60))
        );
        tabNewLayout.setVerticalGroup(
            tabNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabNewLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addContainerGap())
        );

        jPanel2.add(tabNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 310, 50));

        tab3.setBackground(new java.awt.Color(31, 70, 41));
        tab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tab3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tab3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tab3MousePressed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tiles_26px.png"))); // NOI18N
        jLabel22.setText("VIEW REPORTS");

        javax.swing.GroupLayout tab3Layout = new javax.swing.GroupLayout(tab3);
        tab3.setLayout(tab3Layout);
        tab3Layout.setHorizontalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab3Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(70, 70, 70))
        );
        tab3Layout.setVerticalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(14, 14, 14))
        );

        jPanel2.add(tab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 310, -1));

        tab.setBackground(new java.awt.Color(31, 70, 41));
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tabMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabMousePressed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/account_24px.png"))); // NOI18N
        jLabel23.setText("INVENTORY MOVEMENT");

        javax.swing.GroupLayout tabLayout = new javax.swing.GroupLayout(tab);
        tab.setLayout(tabLayout);
        tabLayout.setHorizontalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel23)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        tabLayout.setVerticalGroup(
            tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel23)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.add(tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 310, -1));

        tab4.setBackground(new java.awt.Color(31, 70, 41));
        tab4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tab4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tab4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tab4MousePressed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bell_26px.png"))); // NOI18N
        jLabel24.setText("ALERTS");

        javax.swing.GroupLayout tab4Layout = new javax.swing.GroupLayout(tab4);
        tab4.setLayout(tab4Layout);
        tab4Layout.setHorizontalGroup(
            tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab4Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(110, 110, 110))
        );
        tab4Layout.setVerticalGroup(
            tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel24)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.add(tab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, 310, -1));

        tab1.setBackground(new java.awt.Color(31, 70, 41));
        tab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tab1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tab1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tab1MousePressed(evt);
            }
        });
        tab1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit_property_24px.png"))); // NOI18N
        jLabel25.setText("ADD ITEM");
        tab1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jPanel2.add(tab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 310, 50));

        tab5.setBackground(new java.awt.Color(31, 70, 41));
        tab5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tab5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tab5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tab5MousePressed(evt);
            }
        });
        tab5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit_property_24px.png"))); // NOI18N
        jLabel28.setText("UPDATE ITEM");
        tab5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jPanel2.add(tab5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 310, 50));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo (1).png"))); // NOI18N
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 210, 210));

        tab6.setBackground(new java.awt.Color(31, 70, 41));
        tab6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tab6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tab6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tab6MousePressed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("LOGOUT");

        javax.swing.GroupLayout tab6Layout = new javax.swing.GroupLayout(tab6);
        tab6.setLayout(tab6Layout);
        tab6Layout.setHorizontalGroup(
            tab6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab6Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(117, 117, 117))
        );
        tab6Layout.setVerticalGroup(
            tab6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel35)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.add(tab6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 680, 310, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 870));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabNewMouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_tabNewMouseClicked

    private void tab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab3MouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_tab3MouseClicked

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_tabMouseClicked

    private void tab4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab4MouseClicked
        showNotificationPopup();
    }//GEN-LAST:event_tab4MouseClicked

    private void tabNewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabNewMousePressed
        tab1.setBackground(DefaultColor);
        tabNew.setBackground(ClickedColor);
        tab3.setBackground(DefaultColor);
        tab.setBackground(DefaultColor);
        tab4.setBackground(DefaultColor);
        tab5.setBackground(DefaultColor);
    }//GEN-LAST:event_tabNewMousePressed

    private void tab3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab3MousePressed
        tab1.setBackground(DefaultColor);
        tabNew.setBackground(DefaultColor);
        tab3.setBackground(ClickedColor);
        tab.setBackground(DefaultColor);
        tab4.setBackground(DefaultColor);
        tab5.setBackground(DefaultColor);
    }//GEN-LAST:event_tab3MousePressed

    private void tabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMousePressed
        tab1.setBackground(DefaultColor);
        tabNew.setBackground(DefaultColor);
        tab3.setBackground(DefaultColor);
        tab.setBackground(ClickedColor);
        tab4.setBackground(DefaultColor);
        tab5.setBackground(DefaultColor);
    }//GEN-LAST:event_tabMousePressed

    private void tab4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab4MousePressed
        tab1.setBackground(DefaultColor);
        tabNew.setBackground(DefaultColor);
        tab3.setBackground(DefaultColor);
        tab.setBackground(DefaultColor);
        tab4.setBackground(ClickedColor);
        tab5.setBackground(DefaultColor);
    }//GEN-LAST:event_tab4MousePressed

    private void reduceStocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reduceStocksActionPerformed
        String itemName = itemField.getText().trim();
        String quantityText = quantityField.getText().trim();

        if (itemName.isEmpty() || quantityText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select an item and enter the quantity.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int reduceQuantity;
        try {
            reduceQuantity = Integer.parseInt(quantityText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Quantity must be a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (reduceQuantity <= 0) {
            JOptionPane.showMessageDialog(this, "Please enter a quantity greater than 0.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String url = "jdbc:mysql://localhost:3306/bentesais_lomi";
        String user = "root";
        String pass = "";

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn.setAutoCommit(false);

            try {
                String getItemInfoSQL = "CALL GetItemInfo(?)";

                int itemId = 0;
                int currentQuantity = 0;

                try (PreparedStatement getItemInfoStmt = conn.prepareStatement(getItemInfoSQL)) {
                    getItemInfoStmt.setString(1, itemName);
                    ResultSet rs = getItemInfoStmt.executeQuery();

                    if (rs.next()) {
                        itemId = rs.getInt("item_id");
                        currentQuantity = rs.getInt("current_quantity");
                    } else {
                        JOptionPane.showMessageDialog(this, "Item not found in items table.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                if (reduceQuantity > currentQuantity) {
                    JOptionPane.showMessageDialog(this, "Cannot reduce more than current stock (" + currentQuantity + ").", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int newQuantity = currentQuantity - reduceQuantity;
                String stockStatus = newQuantity > 10 ? "high stock" : "low stock";

                // Update the stock
                String updateStockSQL = "UPDATE current_stock SET quantity = ?, status = ?, last_updated = NOW() WHERE item_id = ?";
                try (PreparedStatement updateStmt = conn.prepareStatement(updateStockSQL)) {
                    updateStmt.setInt(1, newQuantity);
                    updateStmt.setString(2, stockStatus);
                    updateStmt.setInt(3, itemId);
                    updateStmt.executeUpdate();
                }

                conn.commit();

                JOptionPane.showMessageDialog(this, "Stock reduced successfully! New quantity: " + newQuantity);
                itemField.setText("");
                quantityField.setText("");

                loadAllItemQuantities();
                loadRecentChangesToChangesTable();
                showLowStockCount();
                loadAllItemsToTable();
                showBarChart();
                showPieChart();
                showLineChart();

            } catch (Exception e) {
                conn.rollback();
                throw e;
            } finally {
                conn.setAutoCommit(true);
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_reduceStocksActionPerformed

    private void addStocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStocksActionPerformed
        String itemName = itemField.getText().trim();
        String quantityText = quantityField.getText().trim();

        if (itemName.isEmpty() || quantityText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select an item and enter the quantity.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int addQuantity;
        try {
            addQuantity = Integer.parseInt(quantityText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Quantity must be a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String url = "jdbc:mysql://localhost:3306/bentesais_lomi";
        String user = "root";
        String pass = "";

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn.setAutoCommit(false);

            try {
                String getItemInfoSQL = "CALL GetItemInfo(?)";

                int itemId = 0;
                int currentQuantity = 0;

                try (PreparedStatement getItemInfoStmt = conn.prepareStatement(getItemInfoSQL)) {
                    getItemInfoStmt.setString(1, itemName);
                    ResultSet rs = getItemInfoStmt.executeQuery();

                    if (rs.next()) {
                        itemId = rs.getInt("item_id");
                        currentQuantity = rs.getInt("current_quantity");
                    } else {
                        JOptionPane.showMessageDialog(this, "Item not found in items table.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                // 🛑 Check: If new quantity is lower or equal to current, cancel
                if (addQuantity <= 0) {
                    JOptionPane.showMessageDialog(this, "Please enter a quantity greater than 0.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int newQuantity = currentQuantity + addQuantity;

                String stockStatus = newQuantity > 10 ? "high stock" : "low stock";

                // Step 2: Check if item exists in current_stock
                String checkExistsSQL = "SELECT COUNT(*) as count FROM current_stock WHERE item_id = ?";
                boolean itemExists = false;

                try (PreparedStatement checkStmt = conn.prepareStatement(checkExistsSQL)) {
                    checkStmt.setInt(1, itemId);
                    ResultSet rs = checkStmt.executeQuery();
                    if (rs.next()) {
                        itemExists = rs.getInt("count") > 0;
                    }
                }

                // Step 3: Insert or update
                if (itemExists) {
                    String updateStockSQL = "UPDATE current_stock SET quantity = ?, status = ?, last_updated = NOW() WHERE item_id = ?";
                    try (PreparedStatement updateStmt = conn.prepareStatement(updateStockSQL)) {
                        updateStmt.setInt(1, newQuantity);
                        updateStmt.setString(2, stockStatus);
                        updateStmt.setInt(3, itemId);
                        updateStmt.executeUpdate();
                    }
                } else {
                    String insertStockSQL = "INSERT INTO current_stock (item_id, quantity, status, last_updated) VALUES (?, ?, ?, NOW())";
                    try (PreparedStatement insertStmt = conn.prepareStatement(insertStockSQL)) {
                        insertStmt.setInt(1, itemId);
                        insertStmt.setInt(2, newQuantity);
                        insertStmt.setString(3, stockStatus);
                        insertStmt.executeUpdate();
                    }
                }

                conn.commit();

                JOptionPane.showMessageDialog(this, "Stock updated successfully! New quantity: " + newQuantity);
                itemField.setText("");
                quantityField.setText("");

                loadAllItemQuantities();
                loadRecentChangesToChangesTable();
                showLowStockCount();
                loadAllItemsToItemsList2();
                loadAllItemsToTable();

            } catch (Exception e) {
                conn.rollback();
                throw e;
            } finally {
                conn.setAutoCommit(true);
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addStocksActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // Clear all input fields
        itemnameField.setText("");
        unitBox.setSelectedIndex(0); // Reset to first item in combo box
        quantityfield1.setText("");
        gramsField.setText("");
        photoFrame.setIcon(null);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String itemName = itemnameField.getText().trim();
        String unit = unitBox.getSelectedItem().toString();
        String quantityText = quantityfield1.getText().trim();
        String sizeText = gramsField.getText().trim();

        String url = "jdbc:mysql://localhost:3306/bentesais_lomi";
        String user = "root";
        String pass = "";

        if (itemName.isEmpty() || unit.isEmpty() || quantityText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Item Name, Unit, and Quantity are required.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int quantity = 0;
        double size = 0.0;
        try {
            quantity = Integer.parseInt(quantityText);
            size = sizeText.isEmpty() ? 0.0 : Double.parseDouble(sizeText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Quantity and size must be numbers.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);

            // First check if item already exists
            String checkSql = "SELECT COUNT(*) FROM items WHERE item_name = ?";
            pst = conn.prepareStatement(checkSql);
            pst.setString(1, itemName);
            rs = pst.executeQuery();

            if (rs.next() && rs.getInt(1) > 0) {
                JOptionPane.showMessageDialog(this, "Item already exists.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            rs.close();
            pst.close();

            // 🖼️ Prepare image from JLabel (photoFrame)
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIcon icon = (ImageIcon) photoFrame.getIcon();
            if (icon == null) {
                JOptionPane.showMessageDialog(this, "Please upload a picture before adding.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Image img = icon.getImage();
            BufferedImage bufferedImage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_RGB);
            Graphics2D bGr = bufferedImage.createGraphics();
            bGr.drawImage(img, 0, 0, null);
            bGr.dispose();
            ImageIO.write(bufferedImage, "jpg", baos);
            byte[] imageBytes = baos.toByteArray();

            // Insert into items table with image
            String insertItemSql = "INSERT INTO items (item_name, unit, size, image) VALUES (?, ?, ?, ?)";
            pst = conn.prepareStatement(insertItemSql, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, itemName);
            pst.setString(2, unit);
            pst.setDouble(3, size);
            pst.setBytes(4, imageBytes);

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                ResultSet generatedKeys = pst.getGeneratedKeys();
                int itemId = -1;
                if (generatedKeys.next()) {
                    itemId = generatedKeys.getInt(1);
                }
                generatedKeys.close();
                pst.close();

                // Determine stock status (threshold 10)
                String stockStatus = (quantity <= 10) ? "Low Stock" : "High Stock";

                // Insert into current_stock
                String insertStockSql = "INSERT INTO current_stock (item_id, quantity, last_updated, status) VALUES (?, ?, NOW(), ?)";
                pst = conn.prepareStatement(insertStockSql);
                pst.setInt(1, itemId);
                pst.setInt(2, quantity);
                pst.setString(3, stockStatus);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Item and stock added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

                // Clear fields
                itemnameField.setText("");
                unitBox.setSelectedIndex(0);
                gramsField.setText("");
                quantityfield1.setText("");
                photoFrame.setIcon(null); // clear photo

                // Refresh
                loadAllItemQuantities();
                loadAllItemsToItemsList2();
                loadAllItemsToTable();
                showLowStockCount();
                showTotalItemCount();

            } else {
                JOptionPane.showMessageDialog(this, "Failed to add item.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException | ClassNotFoundException | IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void quantityfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityfield1ActionPerformed

    private void categoryBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryBox2ActionPerformed

    private void tab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_tab1MouseClicked

    private void tab1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MousePressed
        tab1.setBackground(ClickedColor);
        tabNew.setBackground(DefaultColor);
        tab3.setBackground(DefaultColor);
        tab.setBackground(DefaultColor);
        tab4.setBackground(DefaultColor);
        tab5.setBackground(DefaultColor);
    }//GEN-LAST:event_tab1MousePressed

    private void removeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemActionPerformed
        int selectedRow = recentTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select an item to remove.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String itemName = recentTable.getValueAt(selectedRow, 0).toString(); // Assuming this is item_name

        String url = "jdbc:mysql://localhost:3306/bentesais_lomi";
        String user = "root";
        String pass = "";

        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            conn.setAutoCommit(false);

            // Get item_id from items
            String getItemIdSql = "SELECT item_id FROM items WHERE item_name = ?";
            pst = conn.prepareStatement(getItemIdSql);
            pst.setString(1, itemName);
            rs = pst.executeQuery();

            int itemId = -1;
            if (rs.next()) {
                itemId = rs.getInt("item_id");
            } else {
                JOptionPane.showMessageDialog(this, "Item not found in database.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            rs.close();
            pst.close();

            // Get stock_id from current_stock
            int stockId = -1;
            String getStockIdSql = "SELECT stock_id FROM current_stock WHERE item_id = ?";
            pst = conn.prepareStatement(getStockIdSql);
            pst.setInt(1, itemId);
            rs = pst.executeQuery();
            if (rs.next()) {
                stockId = rs.getInt("stock_id");
            }
            rs.close();
            pst.close();

            // Delete from alerts
            if (stockId != -1) {
                String deleteAlerts = "DELETE FROM alerts WHERE stock_id = ?";
                pst = conn.prepareStatement(deleteAlerts);
                pst.setInt(1, stockId);
                pst.executeUpdate();
                pst.close();
            }

            // Delete from stock_movements
            String deleteStockMovements = "DELETE FROM stock_movements WHERE item_id = ?";
            pst = conn.prepareStatement(deleteStockMovements);
            pst.setInt(1, itemId);
            pst.executeUpdate();
            pst.close();

            // Delete from current_stock
            String deleteCurrentStock = "DELETE FROM current_stock WHERE item_id = ?";
            pst = conn.prepareStatement(deleteCurrentStock);
            pst.setInt(1, itemId);
            pst.executeUpdate();
            pst.close();

            // Delete from items
            String deleteItem = "DELETE FROM items WHERE item_id = ?";
            pst = conn.prepareStatement(deleteItem);
            pst.setInt(1, itemId);
            int rowsDeleted = pst.executeUpdate();
            pst.close();

            if (rowsDeleted > 0) {
                conn.commit();
                ((DefaultTableModel) recentTable.getModel()).removeRow(selectedRow);

                // ✅ Clear the photo frame
                photoFrame2.setIcon(null);
                photoFrame2.repaint();

                JOptionPane.showMessageDialog(this, "Item and its associated data removed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

                loadAllItemQuantities();
                loadAllItemsToItemsList2();
                loadAllItemsToTable();
                showLowStockCount();
                showTotalItemCount();
                loadRecentChangesToChangesTable();
            } else {
                conn.rollback();
                JOptionPane.showMessageDialog(this, "Failed to remove item from database.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException | ClassNotFoundException e) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.setAutoCommit(true);
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_removeItemActionPerformed

    private void tab5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab5MouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_tab5MouseClicked

    private void tab5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab5MousePressed
        tab1.setBackground(DefaultColor);
        tabNew.setBackground(DefaultColor);
        tab3.setBackground(DefaultColor);
        tab.setBackground(DefaultColor);
        tab4.setBackground(DefaultColor);
        tab5.setBackground(ClickedColor);
    }//GEN-LAST:event_tab5MousePressed

    private void chooseDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_chooseDatePropertyChange
        if (chooseDate.getDate() != null) {
            showBarChart();
        }
    }//GEN-LAST:event_chooseDatePropertyChange

    private void categoryBox2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_categoryBox2PropertyChange
        loadReportsByStockStatusAndDate();
    }//GEN-LAST:event_categoryBox2PropertyChange

    private void salesPerdayChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_salesPerdayChooserPropertyChange
        if (chooseDate.getDate() != null) {
            showPieChart();
        }
    }//GEN-LAST:event_salesPerdayChooserPropertyChange

    private void averagePerMonthPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_averagePerMonthPropertyChange
        showLineChart();
    }//GEN-LAST:event_averagePerMonthPropertyChange

    private void yearChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_yearChooserPropertyChange
        showLineChart();
    }//GEN-LAST:event_yearChooserPropertyChange

    private void uploadPicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPicActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select an Image");

        // Optional: Filter to show only image files
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png"));

        int userSelection = fileChooser.showOpenDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();

            // Display the image in pictureFrame
            ImageIcon imageIcon = new ImageIcon(filePath);
            Image image = imageIcon.getImage().getScaledInstance(photoFrame.getWidth(), photoFrame.getHeight(), Image.SCALE_SMOOTH);
            photoFrame.setIcon(new ImageIcon(image));

            // You can also store the file path or the file itself if you want to save it later
            // Example:
            // selectedImagePath = filePath;
        }
    }//GEN-LAST:event_uploadPicActionPerformed

    private void recentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recentTableMouseClicked
        int selectedRow = recentTable.getSelectedRow();
        if (selectedRow != -1) {
            String selectedItemName = recentTable.getValueAt(selectedRow, 0).toString();
            showItemImage(selectedItemName);
        }
    }//GEN-LAST:event_recentTableMouseClicked

    private void tab6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab6MouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            this.dispose(); // Close the current JFrame (dashboard/main panel)

            login loginFrame = new login(); // Create a new instance of your login JFrame
            loginFrame.setVisible(true);    // Show the login frame
            loginFrame.setLocationRelativeTo(null); // Center the login frame
        }
    }//GEN-LAST:event_tab6MouseClicked

    private void tab6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab6MousePressed
        tab1.setBackground(DefaultColor);
        tabNew.setBackground(DefaultColor);
        tab3.setBackground(DefaultColor);
        tab.setBackground(DefaultColor);
        tab4.setBackground(DefaultColor);
        tab5.setBackground(DefaultColor);
        tab6.setBackground(ClickedColor);
    }//GEN-LAST:event_tab6MousePressed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        searchItemInTable();
    }//GEN-LAST:event_searchActionPerformed

    private void quantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityFieldActionPerformed

    private void tab1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseEntered
        tab1.setBackground(new Color(44, 92, 44));
    }//GEN-LAST:event_tab1MouseEntered

    private void tab1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseExited
        tab1.setBackground(new Color(31, 70, 41));
    }//GEN-LAST:event_tab1MouseExited

    private void tab5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab5MouseEntered
        tab5.setBackground(new Color(44, 92, 44));
    }//GEN-LAST:event_tab5MouseEntered

    private void tabNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabNewMouseEntered
        tab.setBackground(new Color(44, 92, 44));
    }//GEN-LAST:event_tabNewMouseEntered

    private void tab3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab3MouseEntered
        tab3.setBackground(new Color(44, 92, 44));
    }//GEN-LAST:event_tab3MouseEntered

    private void tabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseEntered
        tab.setBackground(new Color(44, 92, 44));
    }//GEN-LAST:event_tabMouseEntered

    private void tab4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab4MouseEntered
        tab4.setBackground(new Color(44, 92, 44));
    }//GEN-LAST:event_tab4MouseEntered

    private void tab6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab6MouseEntered
        tab6.setBackground(new Color(44, 92, 44));
    }//GEN-LAST:event_tab6MouseEntered

    private void tab5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab5MouseExited
        tab5.setBackground(new Color(31, 70, 41));
    }//GEN-LAST:event_tab5MouseExited

    private void tabNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabNewMouseExited
        tab.setBackground(new Color(31, 70, 41));
    }//GEN-LAST:event_tabNewMouseExited

    private void tab3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab3MouseExited
        tab3.setBackground(new Color(31, 70, 41));
    }//GEN-LAST:event_tab3MouseExited

    private void tabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseExited
        tab.setBackground(new Color(31, 70, 41));
    }//GEN-LAST:event_tabMouseExited

    private void tab4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab4MouseExited
        tab4.setBackground(new Color(31, 70, 41));
    }//GEN-LAST:event_tab4MouseExited

    private void tab6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab6MouseExited
        tab6.setBackground(new Color(31, 70, 41));
    }//GEN-LAST:event_tab6MouseExited

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public void loadAllItemQuantities() {
        if (itemsList == null) {
            JOptionPane.showMessageDialog(null, "itemsList JTable is not initialized yet.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) itemsList.getModel();
        model.setRowCount(0); // Clear existing rows

        String url = "jdbc:mysql://localhost:3306/bentesais_lomi";
        String user = "root";
        String pass = "";

        String query = "SELECT * FROM item_stock_view";

        try (Connection conn = DriverManager.getConnection(url, user, pass); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String itemName = rs.getString("item_name");
                int quantity = rs.getInt("quantity");
                model.addRow(new Object[]{itemName, quantity});
            }

            // Add mouse listener once
            itemsList.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = itemsList.getSelectedRow();
                    if (row >= 0) {
                        String selectedItem = (String) itemsList.getValueAt(row, 0);
                        itemField.setText(selectedItem);
                    }
                }
            });

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error fetching item quantities:\n" + e.getMessage());
        }
    }

    private void showItemImage(String itemName) {
        String url = "jdbc:mysql://localhost:3306/bentesais_lomi";
        String user = "root";
        String pass = "";

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            String sql = "SELECT image FROM items WHERE item_name = ?";
            try (PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setString(1, itemName);
                try (ResultSet rs = pst.executeQuery()) {
                    if (rs.next()) {
                        byte[] imgBytes = rs.getBytes("image");
                        if (imgBytes != null) {
                            ImageIcon icon = new ImageIcon(imgBytes);
                            Image img = icon.getImage().getScaledInstance(photoFrame2.getWidth(), photoFrame2.getHeight(), Image.SCALE_SMOOTH);
                            photoFrame2.setIcon(new ImageIcon(img));
                        } else {
                            photoFrame2.setIcon(null); // If no image found
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to load image: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void loadAllItemsToItemsList2() {
        if (itemsList2 == null) {
            JOptionPane.showMessageDialog(null, "itemsList2 JTable is not initialized yet.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) itemsList2.getModel();
        model.setRowCount(0); // Clear existing rows

        String url = "jdbc:mysql://localhost:3306/bentesais_lomi";
        String user = "root";
        String pass = "";

        // Query directly from current_stock and items
        String query = "SELECT * FROM item_stock_view_units";

        try (Connection conn = DriverManager.getConnection(url, user, pass); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String itemName = rs.getString("item_name");
                int quantity = rs.getInt("quantity");
                String unit = rs.getString("unit");

                model.addRow(new Object[]{
                    itemName,
                    quantity,
                    unit
                });
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error loading items into itemsList2:\n" + e.getMessage());
        }
    }

    public void loadReportsByStockStatusAndDate() {
        DefaultTableModel model = (DefaultTableModel) reportsTable.getModel();
        model.setRowCount(0);

        String stockFilter = categoryBox2.getSelectedItem().toString();
        java.util.Date fromDate = jDateChooser1.getDate();
        java.util.Date toDate = jDateChooser2.getDate();

        if (fromDate == null || toDate == null) {
            //JOptionPane.showMessageDialog(null, "Please select both From and To dates.");
            return;
        }

        // Format dates for SQL
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String startDate = sdf.format(fromDate);
        String endDate = sdf.format(toDate);

        String url = "jdbc:mysql://localhost:3306/bentesais_lomi";
        String user = "root";
        String pass = "";

        String query = "SELECT i.item_name, cs.quantity "
                + "FROM current_stock cs "
                + "JOIN items i ON cs.item_id = i.item_id "
                + "WHERE DATE(cs.last_updated) BETWEEN ? AND ?";

        // Filter based on quantity for stock status
        if ("Low Stocks".equals(stockFilter)) {
            query += " AND cs.quantity <= 10";
        } else if ("High Stocks".equals(stockFilter)) {
            query += " AND cs.quantity > 10";
        }

        try (Connection conn = DriverManager.getConnection(url, user, pass); PreparedStatement pst = conn.prepareStatement(query)) {

            pst.setString(1, startDate);
            pst.setString(2, endDate);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String itemName = rs.getString("item_name");
                int quantity = rs.getInt("quantity");

                model.addRow(new Object[]{itemName, quantity});
            }

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No records found for the selected criteria.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error loading report:\n" + e.getMessage());
            e.printStackTrace();
        }
    }

    private void tryLoadReports() {
        if (jDateChooser1.getDate() != null
                && jDateChooser2.getDate() != null
                && categoryBox2.getSelectedItem() != null) {

            loadReportsByStockStatusAndDate();
        }
    }

    public void loadAllItemsToTable() {
        if (recentTable == null) {
            JOptionPane.showMessageDialog(null, "recentTable JTable is not initialized yet.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) recentTable.getModel();
        model.setRowCount(0); // Clear the table

        String url = "jdbc:mysql://localhost:3306/bentesais_lomi";
        String user = "root";
        String pass = "";

        String query = "SELECT * FROM item_stock_view;";

        try (Connection conn = DriverManager.getConnection(url, user, pass); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String itemName = rs.getString("item_name");
                int quantity = rs.getInt("quantity");

                model.addRow(new Object[]{
                    itemName,
                    quantity
                });
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error loading items:\n" + e.getMessage());
            e.printStackTrace();
        }
    }

    public void loadRecentChangesToChangesTable() {
        DefaultTableModel model = (DefaultTableModel) changesTable.getModel();
        model.setRowCount(0); // Clear existing rows

        String url = "jdbc:mysql://localhost:3306/bentesais_lomi";
        String user = "root";
        String pass = "";

        String query = "SELECT * FROM recent_stock_movements_view";

        try (Connection conn = DriverManager.getConnection(url, user, pass); PreparedStatement pst = conn.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                String itemName = rs.getString("item_name");
                int pastQty = rs.getInt("current_quantity");
                int updatedQty = rs.getInt("final_quantity");
                java.sql.Timestamp changedAt = rs.getTimestamp("move_at");

                model.addRow(new Object[]{itemName, pastQty, updatedQty, changedAt});
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error loading quantity changes:\n" + e.getMessage());
        }
    }

    public void showLowStockCount() {
        String url = "jdbc:mysql://localhost:3306/bentesais_lomi";
        String user = "root";
        String pass = "";

        String query = "{CALL GetLowStockCount()}";

        try (Connection conn = DriverManager.getConnection(url, user, pass); CallableStatement stmt = (CallableStatement) conn.prepareCall(query); ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                int count = rs.getInt("low_stock_count");
                lowstockField.setText(String.valueOf(count));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error counting low stock items:\n" + e.getMessage());
        }
    }

    public void showTotalItemCount() {
        String url = "jdbc:mysql://localhost:3306/bentesais_lomi";
        String user = "root";
        String pass = "";

        String query = "{CALL GetTotalItemCount()}";

        try (Connection conn = DriverManager.getConnection(url, user, pass); CallableStatement stmt = (CallableStatement) conn.prepareCall(query); ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                int total = rs.getInt("total_item_count");
                totalitemsField.setText(String.valueOf(total));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error fetching total item count:\n" + e.getMessage());
        }
    }

    private void showNotificationPopup() {
        // Create a custom dialog for notifications
        JDialog notificationDialog = new JDialog();
        notificationDialog.setTitle("Stock Level Notifications");

        // Make it bigger
        notificationDialog.setSize(600, 450);

        // Center on screen
        notificationDialog.setLocationRelativeTo(null);
        notificationDialog.setModal(true);

        // Main panel with a border layout
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // Create a panel for notifications with a vertical box layout
        JPanel notificationsPanel = new JPanel();
        notificationsPanel.setLayout(new BoxLayout(notificationsPanel, BoxLayout.Y_AXIS));

        // Add title at the top
        JLabel titleLabel = new JLabel("Stock Level Notifications");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 15, 0));

        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        titlePanel.add(titleLabel);
        mainPanel.add(titlePanel, BorderLayout.NORTH);

        // Load notifications from database
        loadAlertsFromDatabase(notificationsPanel);

        // Create a scroll pane for the notifications
        JScrollPane scrollPane = new JScrollPane(notificationsPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Add the scroll pane to the main panel
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Add buttons at the bottom
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));

        // Refresh button to check for new alerts
        JButton refreshButton = new JButton("Refresh Alerts");
        refreshButton.setFont(new Font("Arial", Font.PLAIN, 14));
        refreshButton.setPreferredSize(new Dimension(130, 35));
        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                notificationsPanel.removeAll();
                loadAlertsFromDatabase(notificationsPanel);
                notificationsPanel.revalidate();
                notificationsPanel.repaint();
            }
        });

        // Close button
        JButton closeButton = new JButton("Close");
        closeButton.setFont(new Font("Arial", Font.PLAIN, 14));
        closeButton.setPreferredSize(new Dimension(130, 35));
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                notificationDialog.dispose();
            }
        });

        buttonPanel.add(refreshButton);
        buttonPanel.add(closeButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Set the content pane and display the dialog
        notificationDialog.setContentPane(mainPanel);
        notificationDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        notificationDialog.setVisible(true);
    }

// Method to load alerts from database - modified to only show latest alert for each stock_id
    private void loadAlertsFromDatabase(JPanel container) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Replace these with your actual database connection details
            String url = "jdbc:mysql://localhost:3306/bentesais_lomi";
            String username = "root"; // Replace with your database username
            String password = ""; // Replace with your database password

            // Establish connection
            conn = DriverManager.getConnection(url, username, password);

            String query = "SELECT * FROM latest_alerts_view";

            stmt = conn.prepareStatement(query);
            rs = stmt.executeQuery();

            boolean hasAlerts = false;

            // Process each alert
            while (rs.next()) {
                hasAlerts = true;
                int alertId = rs.getInt("alert_id");
                int stockId = rs.getInt("stock_id");
                String action = rs.getString("action");

                // Get the date - if your table doesn't have a date column, this will use current date
                java.sql.Date alertDate;
                try {
                    alertDate = rs.getDate("alert_date");
                    if (alertDate == null) {
                        alertDate = new java.sql.Date(System.currentTimeMillis());
                    }
                } catch (SQLException e) {
                    // If the column doesn't exist, use current date
                    alertDate = new java.sql.Date(System.currentTimeMillis());
                }

                // Format the date
                SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
                String formattedDate = dateFormat.format(alertDate);

                // Get item details based on stock_id
                String itemName = getItemNameFromStockId(conn, stockId);

                // Determine alert type and color based on the action
                Color alertColor;
                String alertTitle;

                if (action.equalsIgnoreCase("Accomplished")) {
                    alertColor = new Color(0, 150, 0); // Green for accomplished
                    alertTitle = "Accomplished Alert";
                } else if (stockId < 50) {  // Assuming low stock threshold is 50
                    alertColor = Color.RED;
                    alertTitle = "Critical Low Stock";
                } else if (stockId < 100) {  // Assuming warning threshold is 100
                    alertColor = Color.ORANGE;
                    alertTitle = "Low Stock Warning";
                } else {
                    alertColor = Color.BLUE;
                    alertTitle = "Stock Update";
                }

                // Create message with item name and date
                String message = "Item: " + itemName;

                // Add the notification to the panel
                addNotification(container, alertTitle, message, formattedDate, alertColor);
            }

            // If no alerts found
            if (!hasAlerts) {
                JLabel noAlertsLabel = new JLabel("No alerts found in the system.");
                noAlertsLabel.setFont(new Font("Arial", Font.BOLD, 14));
                noAlertsLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
                noAlertsLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
                container.add(noAlertsLabel);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

// Helper method to get item name from stock_id
    private String getItemNameFromStockId(Connection conn, int stockId) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String itemName = "Unknown Item";

        try {

            String query = "{CALL GetItemNameByStockId(?)}";

            stmt = conn.prepareStatement(query);
            stmt.setInt(1, stockId);
            rs = stmt.executeQuery();

            if (rs.next()) {
                itemName = rs.getString("item_name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return itemName;
    }

// Helper method to create notification panels - now with date information
    private void addNotification(JPanel container, String title, String message, String date, Color color) {
        JPanel notifPanel = new JPanel(new BorderLayout());
        notifPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY),
                BorderFactory.createEmptyBorder(8, 8, 8, 8)
        ));

        JPanel colorBar = new JPanel();
        colorBar.setBackground(color);
        colorBar.setPreferredSize(new Dimension(8, 0));
        notifPanel.add(colorBar, BorderLayout.WEST);

        JPanel contentPanel = new JPanel(new BorderLayout(0, 5));
        contentPanel.setBackground(new Color(245, 245, 245));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Title panel with title on left and date on right
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(new Color(245, 245, 245));

        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel dateLabel = new JLabel(date);
        dateLabel.setFont(new Font("Arial", Font.ITALIC, 12));
        dateLabel.setForeground(Color.DARK_GRAY);

        headerPanel.add(titleLabel, BorderLayout.WEST);
        headerPanel.add(dateLabel, BorderLayout.EAST);

        JLabel messageLabel = new JLabel(message);
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 13));

        contentPanel.add(headerPanel, BorderLayout.NORTH);
        contentPanel.add(messageLabel, BorderLayout.CENTER);

        notifPanel.add(contentPanel, BorderLayout.CENTER);

        // Set preferred width to match the container
        notifPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, notifPanel.getPreferredSize().height));

        // Add some vertical spacing between notifications
        container.add(Box.createRigidArea(new Dimension(0, 8)));
        container.add(notifPanel);
    }

    public void showBarChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Step 1: Get selected date from JDateChooser
        java.util.Date selectedDate = chooseDate.getDate();
        if (selectedDate == null) {
            return; // Silent skip
        }

        java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bentesais_lomi", "root", "");

            // Only include items that had a stock reduction on the selected date
            String query = "SELECT i.item_name, "
                    + "(sm.current_quantity - sm.final_quantity) AS reduced_quantity "
                    + "FROM stock_movements sm "
                    + "JOIN items i ON sm.item_id = i.item_id "
                    + "WHERE DATE(sm.move_at) = ? "
                    + "AND sm.final_quantity < sm.current_quantity";

            PreparedStatement pst = con.prepareStatement(query);
            pst.setDate(1, sqlDate);
            ResultSet rs = pst.executeQuery();

            // Step 2: Populate dataset with only the reduced quantity
            while (rs.next()) {
                String itemName = rs.getString("item_name");
                int reduction = rs.getInt("reduced_quantity");
                dataset.setValue(reduction, "Reduced Quantity", itemName);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Step 3: Create and customize the chart
        JFreeChart chart = ChartFactory.createBarChart(
                "Item Stock Reductions - " + sqlDate.toString(),
                "Item",
                "Quantity Reduced",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false);

        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, new Color(71, 102, 5));

        // Step 4: Show chart in analyticsPanel
        ChartPanel barChartPanel = new ChartPanel(chart);
        barChartPanel.setPreferredSize(new Dimension(analyticsPanel1.getWidth(), analyticsPanel1.getHeight()));

        analyticsPanel1.removeAll();
        analyticsPanel1.setLayout(new BorderLayout());
        analyticsPanel1.add(barChartPanel, BorderLayout.CENTER);
        analyticsPanel1.validate();
        analyticsPanel1.repaint();
    }

    public void showPieChart() {
        // Get selected date
        java.util.Date selectedDate = salesPerdayChooser.getDate();
        if (selectedDate == null) {
            return; // Skip if no date selected
        }

        java.sql.Date sqlDate = new java.sql.Date(selectedDate.getTime());

        // Create dataset
        DefaultPieDataset dataset = new DefaultPieDataset();

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bentesais_lomi", "root", "");

            String query = "SELECT i.item_name, AVG(sm.current_quantity - sm.final_quantity) AS avg_reduction "
                    + "FROM stock_movements sm "
                    + "JOIN items i ON sm.item_id = i.item_id "
                    + "WHERE DATE(sm.move_at) = ? "
                    + "AND sm.final_quantity < sm.current_quantity "
                    + "GROUP BY i.item_name";

            PreparedStatement pst = con.prepareStatement(query);
            pst.setDate(1, sqlDate);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String itemName = rs.getString("item_name");
                double avgReduction = rs.getDouble("avg_reduction");

                if (avgReduction > 0) {
                    dataset.setValue(itemName, avgReduction);
                }
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create chart
        JFreeChart pieChart = ChartFactory.createPieChart(
                "Item Sales on " + sqlDate.toString(),
                dataset,
                true, true, false);

        PiePlot piePlot = (PiePlot) pieChart.getPlot();
        piePlot.setBackgroundPaint(Color.WHITE);
        piePlot.setLabelBackgroundPaint(new Color(220, 220, 220));
        piePlot.setLabelOutlinePaint(null);
        piePlot.setLabelShadowPaint(null);

        // Optional: assign custom section colors
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator("{0}: {1} ({2})");
        piePlot.setLabelGenerator(labelGenerator);

        // Show in salesPerday panel
        ChartPanel pieChartPanel = new ChartPanel(pieChart);
        pieChartPanel.setPreferredSize(new Dimension(salesPerday.getWidth(), salesPerday.getHeight()));
        salesPerday.removeAll();
        salesPerday.setLayout(new BorderLayout());
        salesPerday.add(pieChartPanel, BorderLayout.CENTER);
        salesPerday.validate();
        salesPerday.repaint();
    }






    public void showLineChart() {
        // Get selected month and year
        int selectedMonth = averagePerMonth.getMonth() + 1; // JMonthChooser is 0-indexed (January = 0)
        int selectedYear = yearChooser.getYear();

        // Create dataset for the graph
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bentesais_lomi", "root", "");

            String query = "SELECT i.item_name, SUM(sm.current_quantity - sm.final_quantity) AS total_sales "
                    + "FROM stock_movements sm "
                    + "JOIN items i ON sm.item_id = i.item_id "
                    + "WHERE MONTH(sm.move_at) = ? AND YEAR(sm.move_at) = ? "
                    + "AND sm.final_quantity < sm.current_quantity "
                    + "GROUP BY i.item_name";

            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, selectedMonth);
            pst.setInt(2, selectedYear);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String itemName = rs.getString("item_name");
                int totalSales = rs.getInt("total_sales");
                dataset.setValue(totalSales, "Sales", itemName);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create the chart
        JFreeChart linechart = ChartFactory.createLineChart(
                "Sales for " + new DateFormatSymbols().getMonths()[selectedMonth - 1] + " " + selectedYear, // Dynamic title
                "Item",
                "Number of Items",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false
        );

        // Customize plot
        CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
        lineCategoryPlot.setBackgroundPaint(Color.WHITE);

        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204, 0, 51); // Dark Red
        lineRenderer.setSeriesPaint(0, lineChartColor);

        // Create ChartPanel and match panel size
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        lineChartPanel.setPreferredSize(new Dimension(salesPerMonth.getWidth(), salesPerMonth.getHeight()));
        lineChartPanel.setMaximumSize(new Dimension(salesPerMonth.getWidth(), salesPerMonth.getHeight()));
        lineChartPanel.setMinimumSize(new Dimension(salesPerMonth.getWidth(), salesPerMonth.getHeight()));

        salesPerMonth.setLayout(new BorderLayout());
        salesPerMonth.removeAll();
        salesPerMonth.add(lineChartPanel, BorderLayout.CENTER);
        salesPerMonth.validate();
        salesPerMonth.repaint();
    }

   public void searchItemInTable() {
    String searchText = searchField.getText().trim().toLowerCase();  // Get the search text

    DefaultTableModel model = (DefaultTableModel) itemsList.getModel();
    boolean found = false;

    // Check if the table is empty
    if (model.getRowCount() == 0) {
        JOptionPane.showMessageDialog(null, "Table is empty.");
        return;
    }

    // Create a list to store the rows to be moved
    ArrayList<Object[]> matchingRows = new ArrayList<>();

    // Loop through all rows to find items starting with the search text
    for (int i = 0; i < model.getRowCount(); i++) {
        String itemName = model.getValueAt(i, 0).toString().trim().toLowerCase();  // Trim spaces and make lowercase


        // If item starts with the search text, add it to the matchingRows list
        if (itemName.startsWith(searchText)) {
            Object[] rowData = new Object[model.getColumnCount()];
            // Retrieve the row data
            for (int j = 0; j < model.getColumnCount(); j++) {
                rowData[j] = model.getValueAt(i, j);
            }
            matchingRows.add(rowData);  // Add to the list of matching rows
        }
    }

    // If we found matching rows, remove them from the table and insert them at the top
    if (!matchingRows.isEmpty()) {
        found = true;

        // Remove rows that match the search text
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            String itemName = model.getValueAt(i, 0).toString().trim().toLowerCase();
            if (itemName.startsWith(searchText)) {
                model.removeRow(i);  // Remove matching rows
            }
        }

        // Insert the matching rows at the top of the table
        for (Object[] rowData : matchingRows) {
            model.insertRow(0, rowData);  // Insert each matching row at the top
        }

        // Select the first row after the move
        itemsList.setRowSelectionInterval(0, 0);
        itemsList.scrollRectToVisible(itemsList.getCellRect(0, 0, true));  // Scroll to the top row
    }

    // If no item matches, show a message
    if (!found) {
        JOptionPane.showMessageDialog(null, "Item not found.");
    }
}




// Helper method to get month name
    private String getMonthName(int monthNumber) {
        return new java.text.DateFormatSymbols().getMonths()[monthNumber - 1];
    }

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
            java.util.logging.Logger.getLogger(maindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(maindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(maindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(maindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new maindashboard().setVisible(true);
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Dimension screenSize = toolkit.getScreenSize();
                int screenWidth = screenSize.width;
                int screenHeight = screenSize.height;

                System.out.println("Screen Width: " + screenWidth);
                System.out.println("Screen Height: " + screenHeight);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel addItem;
    private javax.swing.JButton addStocks;
    private javax.swing.JPanel analyticsPanel;
    private javax.swing.JPanel analyticsPanel1;
    private com.toedter.calendar.JMonthChooser averagePerMonth;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> categoryBox2;
    private javax.swing.JTable changesTable;
    private com.toedter.calendar.JDateChooser chooseDate;
    private javax.swing.JLabel grams;
    private javax.swing.JTextField gramsField;
    private javax.swing.JPanel inventoryTab;
    private javax.swing.JTextField itemField;
    private javax.swing.JTextField itemnameField;
    private javax.swing.JTable itemsList;
    private javax.swing.JTable itemsList2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lowstockField;
    private javax.swing.JLabel photoFrame;
    private javax.swing.JLabel photoFrame2;
    private javax.swing.JTextField quantityField;
    private javax.swing.JTextField quantityfield1;
    private javax.swing.JTable recentTable;
    private javax.swing.JButton reduceStocks;
    private javax.swing.JButton removeItem;
    private javax.swing.JPanel reportsTab;
    private javax.swing.JTable reportsTable;
    private javax.swing.JPanel salesPerMonth;
    private javax.swing.JPanel salesPerday;
    private com.toedter.calendar.JDateChooser salesPerdayChooser;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel tab;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab3;
    private javax.swing.JPanel tab4;
    private javax.swing.JPanel tab5;
    private javax.swing.JPanel tab6;
    private javax.swing.JPanel tabNew;
    private javax.swing.JLabel totalitemsField;
    private javax.swing.JComboBox<String> unitBox;
    private javax.swing.JPanel updateInventory;
    private javax.swing.JButton uploadPic;
    private com.toedter.calendar.JYearChooser yearChooser;
    // End of variables declaration//GEN-END:variables
}
