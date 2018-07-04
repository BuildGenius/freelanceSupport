/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freelance.support;

/**
 *
 * @author phoomin
 */
public class Employer {
    public String add_Employer(String name){
        String res = null;
        if(check_emp(name) == true){
            if(valid_form(name) == true){
            //insert to SQL method
            //if(insert method == true): 
            res = "User name is ready to use.";
            }
        }else{
          res = "user name is already exit.";
        }
        return res;
    }
    
    private static boolean check_emp(String name){
        int count = /*query to SQL for COUNT username similar name and return int*/ 0;
        return count <= 0;
    }
    
    private static boolean valid_form(String name){
        //validation String 
        return false;
    }
    
    public String update_emp(String name){
        String res = null;
        if(check_emp(name) == true){
            res = "we are not found username "+name+"you shoud be insert this name.";
        }else{
            //update to SQL
            res = "it's update to "+name+" complete.";
        }
        return res;
    }
}
