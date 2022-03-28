/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengirimanbarangcrud;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author user
 */
public class ResponseRest implements Serializable{
    
    private boolean status;
    private List<String> messages;
    private List<Pengiriman> data;

    public ResponseRest() {
    }

    public ResponseRest(boolean status, List<String> messages, List<Pengiriman> data) {
        this.status = status;
        this.messages = messages;
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public List<Pengiriman> getData() {
        return data;
    }

    public void setData(List<Pengiriman> data) {
        this.data = data;
    }
    
}
