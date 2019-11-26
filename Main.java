public class Main {
  public static void main(String[] args) {
    System.out.println(Review.sentimentVal("happily"));
    System.out.println(Review.sentimentVal("terrible")); System.out.println(Review.sentimentVal("cold"));

    System.out.println(Review.sentimentVal("awesome"));
    System.out.println(Review.sentimentVal("rotten"));
    System.out.println(Review.sentimentVal("super"));
    }

  public static double totalSentiment(String fileName)
  