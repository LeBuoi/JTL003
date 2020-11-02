/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import UTIL.Menu;
import DAO.CategoryList;
import DAO.ProductList;

/**1
 * 
 * @author HP
 */
public class ProductManager {
    public static void main(String[] args) {
         CategoryList catList = new CategoryList(true);
         ProductList proList = new ProductList(catList,true);
        
        
        Menu menu = new Menu("Product Manager");
        menu.add(" Add category");
        menu.add("UnD category");
        menu.add("Add product");
        menu.add("UnD product");
        menu.add("Print all product");
        menu.add("Save file");
        menu.add("Order");
        menu.add("View order list");
        menu.add("Read file");
        menu.add("Show order list report");
                while(true){
            menu.printMenu("Exit");
            Integer userChoice = menu.getChoice();
            switch(userChoice){
                case 1:
                    catList.add();
                    break;
                case 2:
                    catList.updateDeleteMenu();
                    break;
                case 3:
                    proList.add();
                    break;
                case 4:
                    proList.UDMenu();
                    break;
                case 5:
                    proList.print();
                    break;
                case 6:
                   catList.saveFile();
                   proList.saveFile();
                   break;
                    
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    catList.loadFromFile();
                    proList.loadFromFile();
                    break;
                case 10:
                    break;
                default:
                    System.out.println("Exiting...");
                    return;

            }
        }
    }
}
