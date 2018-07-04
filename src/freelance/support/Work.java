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
public class Work {
    
    private static boolean valid_work(String name){
        //REGEX validate
        return false;
    }
    
    private static boolean check_beup(int id, String name){
        int work_id = id;
        String work_name = name;
        
        //SQL for check count == 1:true; false
        int count = 0;
        return count > 0;
    }
    
    public String add_work(String name){
        String res = null;
        if(valid_work(name) == true){
            //Insert into SQL method
            res = "it's add to list ready to use.";
        }else{
            res = "it's syntax fell, prease try again";
        }
        return res;
    }
    
    public String upstatus(int id, String name, String status){
        String res = null;
        if(check_beup(id, name)){
            //update status
            res = "Status Updated!";
        }else{
            res = "we're not found your work. please, try again.";
        }
        return res;
    }
}
