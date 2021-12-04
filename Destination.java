package cpit251;

import java.util.Scanner;



public class Destination {

    private String name, location, SectionType, menu, phoneNum;
    private int choice1, choice2;
    private int rate;
    

    public Destination() {
    }

    public Destination(String n, String l, String st,
            String m, String p, int r) {
        this.name = n;
        this.location = l;
        this.SectionType = st;
        this.menu = m;
        this.phoneNum = p;
        this.rate = r;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the SectionType
     */
    public String getSectionType() {
        return SectionType;
    }

    /**
     * @param SectionType the SectionType to set
     */
    public void setSectionType(String SectionType) {
        this.SectionType = SectionType;
    }

    /**
     * @return the email
     */
    public String getMenu() {
        return menu;
    }

  
    public void setMenu(String m) {
        this.menu = m;
    }

    /**
     * @return the phoneNum
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * @param phoneNum the phoneNum to set
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * @return the rate
     */
    public int getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(int rate) {
        this.rate = rate;
    }

    public String Info() {
        return "----------------------"
                + "\n          Destination      "
                + "   \n----------------------"
                + "\n- Name: " + getName()
                + "\n- Section: " + getSectionType()
                + "\n- Rating: " + getRate()
                + "\n- Location: " + getLocation()
                + "\n- Menu: " + getMenu()
                + "\n- Phone Number: " + getPhoneNum();
    }


    public String LandmarksInfo() {
        return "----------------------"
                + "\n          Destination      "
                + "\n----------------------"
                + "\n- Name: " + getName()
                + "\n- Section: " + getSectionType()
                + "\n- Location: " + getLocation();
    }
    
    

    public void DisplayInf() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\n      ————-Choose City————");
        System.out.println("  1. Jeddah");
        System.out.println("  2. Dammam");
        System.out.println("  3. Abha");
        System.out.println("  4. Riyadh");
        System.out.print("  Enter your choice: ");
        choice1 = input.nextInt();

        switch (choice1) {
            case 1:
                System.out.println("\n\n      ————-Choose Category————");
                System.out.println("    1. Restaurants");
                System.out.println("    2. Amusement Park");
                System.out.println("    3. Music Festival");
                System.out.println("    4. Landmarks");
                System.out.println("    5. Museum");
                System.out.println("    6. Exit");
                System.out.print("  Enter your choice: ");
                choice2 = input.nextInt();

                switch (choice2) {
                    case 1:
                        City c = new City("Jeddah", "Restaurants", "Warm");
                        System.out.println();
                        System.out.println();
                        System.out.println(c.toString());

                        System.out.println("\n\n");
                        Destination des = new Destination("Tamees 09",
                                "King Abdullah Branch Rd, "
                                + "Al-Baghdadiyah Al-Gharbiyah, Jeddah 22231",
                                "Restaurants", "qr.finedinemenu.com", "0551340474", 4);
                        System.out.println(des.Info());
                        System.out.println("\nA restaurant that is a\n"
                                + "mixture of modern and ancient Hijazi\n"
                                + "cuisine.  that provides you with a\n"
                                + "unique unforgettable experience. \n");

                        System.out.println("\n\n");
                        Destination des1 = new Destination("Twina", "Al-Amer Sultan Rd.",
                                "Restaurants", "https://twina.net/our-menu/",
                                "9200 - 28284", 3);
                        System.out.println(des1.Info());
                        System.out.println("\nThe ultimate seafood place\n"
                                + "that provides the finest of seafood\n"
                                + "prepared according to the traditional\n"
                                + " recipes of the people of Jeddah. \n");

                        System.out.println("\n\n");
                        Destination des2 = new Destination("Al-Nakheel", "Al-Kurnaysh Rd.",
                                "Restaurants", null,
                                "0507884242", 4);
                        System.out.println(des2.Info());
                        System.out.println("\nOpened in 1986. The best\n"
                                + "place for family and friends that\n"
                                + " combines Hijazi, Egyptian and\n"
                                + "Lebanese cuisines.");
                        ///////////////////////////////////////////////////////////////////////
                        break;
                    case 2:
                        City c1 = new City("Jeddah", "Amusement Parks", "Warm");
                        System.out.println("\n\n");
                        System.out.println(c1.toString());

                        System.out.println("\n\n");
                        Destination des3 = new Destination("Boost",
                                "Gold Moor, Ahmad Al Attas, 7216, Jeddah 23425",
                                "Amusement Park", null, "0500878111", 4);
                        System.out.println(des3.Info());
                        System.out.println("\nBoost is  the next go-to sports and \n"
                                + "entertainment center in Jeddah. \n"
                                + "It’s a gaming arena created to attract \n"
                                + "the kid inside you. \n"
                                + "For more information click here\n");

                        System.out.println("\n\n");
                        Destination des4 = new Destination("Kidzania",
                                "Mall Of Arabia (Gate 6, 2nd Floor), "
                                + "Nuzhah District، Jeddah 23532",
                                "Amusement Park", null,
                                "0126554115", 3);
                        System.out.println(des4.Info());
                        System.out.println("\nKidzaina is a safe, unique, and interactive \n"
                                + "environment where children aged 4-14 can \n"
                                + "discover, explore, and learn about the adult \n"
                                + "world in a kid-sized city built just for them! \n"
                                + "For more information click here\n");

                        System.out.println("\n\n");
                        Destination des5 = new Destination("Alshllal", "Al-Kurnaysh Rd.",
                                "Amusement Park", null,
                                "0507884242", 4);
                        System.out.println(des5.Info());
                        System.out.println("\nAn Amusement Park that offers roller \n"
                                + "coasters, rides, a silk museum, and \n"
                                + "ice skating for beginners and professionals \n"
                                + "and it also provides global dining to keep u \n"
                                + "and your families happy and satisfied. \n");
                        break;
                    //////////////////////////////////////////////////////////////////

                    case 3:
                        City c2 = new City("Jeddah", "Music Festivals", "Warm");
                        System.out.println("\n\n");
                        System.out.println(c2.toString());
                        System.out.println();

                        Destination des6 = new Destination("Formula 1 Saudi Arabian Grand Prix",
                                "Al-Kurnaysh Rd.",
                                "Music Festival", null, null, 0);
                        System.out.println("\n\n");
                        System.out.println(des6.LandmarksInfo());
                        System.out.println("\nF1 FOR EVERY1 \n"
                                + "Join the thrill this December and be part of the \n"
                                + "first-ever Saudi Arabian Grand Prix 2021 where \n"
                                + "some of the world's International singers will be \n"
                                + "performing. coming in December 2021 to Jeddah \n"
                                + "Corniche Circuit, the world's fastest street circuit.\n");
                        System.out.println("Day 1: Mohamed Hamaki & DJ Snake");
                        System.out.println("Day 2: Tiësto & Jason Derulo");
                        System.out.println("Day 3: A$AP Rocky, David Guetta and Justin Bieber");
                        break;
                    /////////////////////////////////////////////////////////////////////////////////////
                    case 4:
                        City c3 = new City("Jeddah", "Landmarks", "Warm");
                        System.out.println("\n\n");
                        System.out.println(c3.toString());

                        Destination des7 = new Destination("Al-Balad",
                                "Jeddah, Saudi Arabia",
                                "Landmark", null, null, 0);
                        System.out.println("\n\n");
                        System.out.println(des7.LandmarksInfo());
                        System.out.println("\nReminiscent of the Arabian nights fairytales, \n"
                                + "this vibrant marketplace with multi-storied \n"
                                + "mud brick and stone buildings sells everything \n"
                                + "from textiles and sparkling silver and gold \n"
                                + "ornaments to spices and honey.\n");

                        Destination des8 = new Destination("Jeddah Corniche",
                                "Al-Kurnaysh Rd.",
                                "Landmark", null, null, 0);
                        System.out.println("\n\n");
                        System.out.println(des8.LandmarksInfo());
                        System.out.println("\nNorth corniche has become amazing with \n"
                                + "beautiful landscape, themed playgrounds \n"
                                + "for kids, and a nice stroll for families.\n");

                        Destination des9 = new Destination("King Fahd's Fountain",
                                "Meeza International Tourism Services Co. Ltd، Jeddah",
                                "Landmark", null, null, 0);
                        System.out.println("\n\n");
                        System.out.println(des9.LandmarksInfo());
                        System.out.println("\nThis 853-foot fountain is reputed to be the tallest \n"
                                + "fountain in the world, and is best appreciated \n"
                                + "when illuminated at night.\n");
                        break;
                    ////////////////////////////////////////////////////////////////////////////////
                    case 5:
                        City c4 = new City("Jeddah", "Museams", "Warm");
                        System.out.println("\n\n");
                        System.out.println(c4.toString());

                        Destination des10 = new Destination("Abdul Raouf Khalil Museum",
                                "Raihanat Al Jazirah, Al Faisaliyah District",
                                "Museams", null, " 0563866984", 4);
                        System.out.println("\n\n");
                        System.out.println(des10.Info());
                        System.out.println("\nAbdul Raouf Khalil Museum is one of the most important and \n"
                                + "beautiful museums and tourist attractions in the Kingdom of \n"
                                + "Saudi Arabia;  Because of its cultural and archaeological \n"
                                + "importance. The museum was visited by politicians and royals, \n"
                                + "most notably;  Prince Charles and Princess Diana.\n");

                        Destination des11 = new Destination("Hafez Gallery",
                                "Ahmad Ibn Abbas، Ar Rawdah",
                                "Museams", null, "  0555517000", 4);
                        System.out.println("\n\n");
                        System.out.println(des11.Info());
                        System.out.println("\nHafez Gallery was founded in 2014 in the city of  Jeddah. \n"
                                + "We exhibit art from Saudi Arabia and the Middle East. \n"
                                + "And we seek to share our art culture in local and foreign forums. \n"
                                + "Going forward, we pledge to reinvest our profits fully into \n"
                                + "our cultural and educational programs. \n");

                        Destination des12 = new Destination("Athr Gallery",
                                "5th Floor, Office Tower Serafi Mega Mall Street",
                                "Museams", null, "0122845009", 4);
                        System.out.println("\n\n");
                        System.out.println(des12.Info());
                        System.out.println("\nSince its inception in Jeddah in 2009, Athr Gallery has played a \n"
                                + "pivotal role in building the Contemporary art scene in Saudi Arabia. \n"
                                + "Athr fills the absence of public art institutions, museums and art \n"
                                + "schools to establish a sustainable art scene open to the world all \n"
                                + "while having an international presence. \n");

                        break;
                    case 6:
                        System.exit(0);
                        break;
                }
        }
    }
}
