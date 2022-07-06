package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessengerFrame extends JFrame implements ActionListener {

    Container container=getContentPane();
    JLabel userLabel=new JLabel("Username");
    JLabel passwordLabel=new JLabel("Password");
    JLabel serverLabel=new JLabel("Server");
    JTextField userTextField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JTextField serverTextField=new JTextField();
    JButton loginButton=new JButton("Login");
    JButton resetButton=new JButton("Reset");
    JCheckBox showPassword=new JCheckBox("Show Password");

    MessengerFrame()
    {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    public void setLayoutManager()
    {
        container.setLayout(null);
    }

    public void setLocationAndSize()
    {
        //Setting location and Size of each components using setBounds() method.
        userLabel.setBounds(150,100,100,30);
        passwordLabel.setBounds(150,170,100,30);
        serverLabel.setBounds(150,240,100,30);
        userTextField.setBounds(250,100,150,30);
        passwordField.setBounds(250,170,150,30);
        serverTextField.setBounds(250,240,150,30);
        showPassword.setBounds(250,270,150,30);
        loginButton.setBounds(150,320,100,30);
        resetButton.setBounds(300,320,100,30);


    }

    public void addActionEvent()
    {
        //adding Action listener to components
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }

    public void addComponentsToContainer()
    {
        //Adding each components to the Container
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(serverLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(serverTextField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
