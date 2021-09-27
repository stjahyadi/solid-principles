package com.eteration.dp.solid.ls.good;


public class LSDemo {
    
    public void calculateArea(Shape r) {
        //r.setHeight(2);
        //r.setWidth(3);
        //
        // Assert Area
        //
        // From the code, the expected behavior is that
        // the area of the rectangle is equal to 6
        //
        assert r.area() == 6 : printError("area", r);
        
        // Assert Width and Height
        //
        // From the code, the expected behavior is that
        // the width should always be equal to 3 and
        // the length should always be equal to 2
        //
        //assert r.getWidth() == 3 : printError("width", r);
        //assert r.getHeight() == 2 : printError("height", r);
    }
     
    private String printError(String errorIdentifer, Shape r) {
        return "Unexpected value of " + errorIdentifer + "  for instance of " + r.getClass().getName();
    }
     
    public static void main(String[] args) {
        LSDemo lsp = new LSDemo();
        // An instance of Rectangle is passed
        lsp.calculateArea(new Rectangle(2, 3));
        
        // An instance of Square is passed
        lsp.calculateArea(new Square(3));
    }
}
