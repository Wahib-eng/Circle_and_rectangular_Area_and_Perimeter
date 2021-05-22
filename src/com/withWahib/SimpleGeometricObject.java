package com.withWahib;

public class SimpleGeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /**بناء كائن هندسي إفتراضي */
    public SimpleGeometricObject() {
        dateCreated = new java.util.Date();
    }
    /** أنشئ كائنًا هندسيًا باللون المحدد*12 والقيمة المعبأة  */
    public SimpleGeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** أعد اللون */
    public String getColor() {
        return color;
    }

    /** وضع لون جديد */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
     30 its getter method is named isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** تعيين شغل جديد */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    /** ا لحصول على تاريخ الإنشاء */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /**إرجاع تمثيل سلسلة لهذا الكائن */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

}
