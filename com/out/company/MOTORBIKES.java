package com.company;

public class MOTORBIKES {
    private Engine engine;

    private Colour  colour ;

    public MOTORBIKES() {
//begin of modifiable zone(JavaSuper).....C/c9d167d8-1a03-4f76-b9a0-a7c3c25fce6f
        engine = new Engine();

        System.out.println("Engine created: " + engine);
//end of modifiable zone(JavaSuper).......E/c9d167d8-1a03-4f76-b9a0-a7c3c25fce6f
//begin of modifiable zone(JavaCode)......C/c9d167d8-1a03-4f76-b9a0-a7c3c25fce6f

//end of modifiable zone(JavaCode)........E/c9d167d8-1a03-4f76-b9a0-a7c3c25fce6f
    }

    Colour  getColour () {
//begin of modifiable zone................T/4f2f1191-163a-45f9-8bc1-9330c871bd21
        // Automatically generated method. Please delete this comment before entering specific code.
//end of modifiable zone..................E/4f2f1191-163a-45f9-8bc1-9330c871bd21
//begin of modifiable zone................T/51865b43-73ef-4077-8a70-32d8a06b7f3c
        return this.colour ;
//end of modifiable zone..................E/51865b43-73ef-4077-8a70-32d8a06b7f3c
    }

    void setColour (Colour  value) {
//begin of modifiable zone................T/e04efa98-cb07-46cb-a86d-15dc3c94c912
        // Automatically generated method. Please delete this comment before entering specific code.
        this.colour  = value;
//end of modifiable zone..................E/e04efa98-cb07-46cb-a86d-15dc3c94c912
    }

}
