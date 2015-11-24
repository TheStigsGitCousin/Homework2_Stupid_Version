/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package homework2_stupid_version;


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author David
 */
public interface MarketRequest extends Remote {
    
    public Message SellItem(Item item) throws RemoteException;
    public Message ListItems() throws RemoteException;
    public Message BuyItem(Item item, Owner owner) throws RemoteException;
    public Message AddWish(Item item) throws RemoteException;
    public Message Register(Owner owner) throws RemoteException;
    public Message Unregister(Owner owner) throws RemoteException;
    public Message LogIn(String name) throws RemoteException;
}
