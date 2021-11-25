package arrays;

public class DVDMain {
    public static void main(String[] args) {
        // create array of dvd class
        DVD[] dvds = new DVD[15];
        DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");
        DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");
        dvds[7] = avengersDVD;
        dvds[3] = incrediblesDVD;
        dvds[9] = findingDoryDVD;
        dvds[2] = lionKingDVD;
        dvds[3] = starWarsDVD;
        System.out.println(dvds[7]);
        System.out.println(dvds[10]);
        System.out.println(dvds[3]);

    }
}
