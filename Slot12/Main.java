package Slot12;

public class Main {
    public static void main(String[] args) {
        News news = new News();

        // Set some sample values
        news.setTitle("Breaking News");
        news.setPublishDate("2023-11-27");
        news.setAuthor("John Doe");
        news.setContent("This is a breaking news story!");

        // Input rates and calculate AverageRate
        news.InputRate();

        // Display the news details
        news.Display();
    }
}