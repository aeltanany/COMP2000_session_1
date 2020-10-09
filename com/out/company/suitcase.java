package com.company;

public class suitcase {
  private   int MaxItemCount;
  private int CurrentItems;

     public int getMaxItemCount(){return MaxItemCount; }
     public int getCurrentItems(){return CurrentItems; }
     public void setMaxItemCount(int interIC){MaxItemCount = interIC;}
    public void setCurrentItems(int interC){CurrentItems = interC;}

    public  suitcase(int MaxItemsAllowed){
        MaxItemCount =MaxItemsAllowed;
        CurrentItems = 0;
        System.out.println(" **suitcase system **");
        display();

    }
     public void  addItem(){
        if(getCurrentItems() + 1 <= getMaxItemCount()){
        CurrentItems++;
        System.out.println("Adding Items");
        display();

     }else {
            System.out.println("no more Items can be added the suitcase is full ");
        }
     }

public void removeItems(){
    if(getCurrentItems() - 1 >= 0) {
        CurrentItems--;
        System.out.println("removing Items");
        display();
    }else {
        System.out.println("no more Items can be removed the suitcase is empty");
    }
}

public void display(){
    System.out.println("Items:  " + getCurrentItems() + "/" + getMaxItemCount());
}

}
