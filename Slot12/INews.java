package Slot12;
import java.util.Scanner;

interface INews {
    void Display();
}

class News implements INews {
    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;
    private int[] RateList = new int[3]; // Assume RateList has size 3 for simplicity

    // Getter and Setter methods for each property
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    // Implementing the Display method from the INews interface
    @Override
    public void Display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Publish Date: " + getPublishDate());
        System.out.println("Author: " + getAuthor());
        System.out.println("Content: " + getContent());
        System.out.println("Average Rate: " + getAverageRate());
    }

    // Method to calculate AverageRate based on values in RateList
    public void Calculate() {
        float sum = 0;
        for (int rate : RateList) {
            sum += rate;
        }
        if (RateList.length > 0) {
            AverageRate = sum / RateList.length;
        }
    }

    // Method to input rates and recalculate AverageRate
    public void InputRate() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < RateList.length; i++) {
            System.out.print("Enter rate " + (i + 1) + ": ");
            RateList[i] = scanner.nextInt();
        }
        Calculate();
    }
}

