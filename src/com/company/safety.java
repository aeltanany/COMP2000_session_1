package com.company;

public class safety {

    private String username;
    private  String password;

    public String getusername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
    public void setUsername()
    {
        username = "bob";
    }
    public void setPassword()
    {
        username = "pass";
    }

    public safety (String theusername,String thepaassword){
        username = theusername;
        password = thepaassword;

    }


    public void login(){
        System.out.println("checking password....");
        if (getPassword() == "pass"&& getusername() == "bob" ){
            System.out.println("logging in" + getusername());
        }else {
            System.out.println(" u suck the username and password are wrong x_x");
        }

    }

}
