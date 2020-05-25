public class Printer {

    private int toner;
    private int paper;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int checkPaper(){
        return this.paper;
    }

    public int checkToner(){
        return this.toner;
    }

    public int print(int numberOfPages, int numberOfCopies){
        if (numberOfPages * numberOfCopies <= this.paper){
            this.toner -= (numberOfPages * numberOfCopies);
            return this.paper -= (numberOfPages * numberOfCopies);
        }
        return this.paper;
    }
}


//    Create a Printer class that has a property for number of sheets of paper left.
//        Add a method to print that takes in a number of pages and number of copies.
//        The print method will only run if the printer has enough paper.
//        If it runs it will reduce the value of the paper left by number of copies * number of pages.
//        Add a toner volume property to the class.
//        Modify the printer so that it reduces the toner by 1 for each page printed.