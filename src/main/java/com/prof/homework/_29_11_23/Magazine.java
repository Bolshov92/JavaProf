package com.prof.homework._29_11_23;
import java.time.LocalDate;

public class Magazine extends LibraryItem{



   private int issueNumber;
   private LocalDate releaseDate;
   private boolean isMonthly;

   public Magazine(String title, String author, Genre genre, int issueNumber, LocalDate releaseDate, boolean isMonthly) {
      super(title, author, genre);
      this.issueNumber = issueNumber;
      this.releaseDate = releaseDate;
      this.isMonthly = isMonthly;
   }

   public int getIssueNumber() {
      return issueNumber;
   }

   public void setIssueNumber(int issueNumber) {
      this.issueNumber = issueNumber;
   }

   public LocalDate getReleaseDate() {
      return releaseDate;
   }

   public void setReleaseDate(LocalDate releaseDate) {
      this.releaseDate = releaseDate;
   }

   public boolean isMonthly() {
      return isMonthly;
   }

   public void setMonthly(boolean monthly) {
      isMonthly = monthly;
   }


}
