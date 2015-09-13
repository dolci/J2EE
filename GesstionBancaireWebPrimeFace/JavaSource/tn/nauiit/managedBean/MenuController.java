package tn.nauiit.managedBean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean(name="menuController")
@ViewScoped
public class MenuController implements Serializable {

    /**
     * Creates a new instance of menuController
     */
    public MenuController() {}
    
   public void doViewDocumentA()
   { this.page = "Operations";
   }
   public void doViewDocumentB()
   { this.page = "Comptes";
   }
    public void doViewClient() {
        this.page = "Client";
    }
   
    public void doViewProduct() {
        this.page = "Product";
    }
    public void doViewListClient() {
        this.page = "Client";
    }
    public void doViewAddClient() {
        this.page = "AddClient";
    }
    /** === Getter / Setter === **/
    
    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }    
    
    /** === Properties === **/
    
   static  String page = "Client";
    
}
