package org.dilithium.application;
//package application;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.lang.*;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.event.ActionEvent;
import com.jfoenix.controls.JFXScrollPane;


public class PaperController {

    @FXML
    private JFXTextField msg_text;

    @FXML
    private JFXTextArea textView;

    @FXML
    private JFXButton msgSend;

    @FXML
    void Send(ActionEvent event) {
    	
    	String MessageQue = "";
    	String message = msg_text.getText();
        msg_text.setText("");
        textView.appendText(message + "\n");
        // lock the thread
        
        
        
        
        // tx-ing time!
        // org.dilithium.network.Peer.  net.broadcast(0xF0, sending.getBytes("UTF-8"));
        
    }

    public void put(String key, String message) {
    	ReadWriteLock lock = new ReentrantReadWriteLock();
        Lock writeLock = lock.writeLock();
    	try {
    		writeLock.lock();
    		// send encrypted message
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	finally {
    		writeLock.unlock();
    	}
    }
    
    
    
}
