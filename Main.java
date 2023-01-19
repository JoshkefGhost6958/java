public class Main {
    public void sgstnm(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
      String fname = "john",lname = " doe";
      String txt = "we are the so called \"vikings\" from the north";
      boolean isMarried = false;
      int day = 1;
      switch(day){
        case 1:
            System.out.println("Damn..its Monday");
            break;
        case 2:
        case 3:
        case 4:
            System.out.println("just cant wait for friday");
            break;
        default:
            System.out.println("This is rather odd");
      }

      String login = "peer";
      switch(login){
        case "md5":
            System.out.println("you are using md5 authetication");
            break;
        case "peer":
            System.out.println("you are using peer authentication \nMove over to md5 for more secure access");
            break;
        case "SHA256":
            System.out.println("This is the default setting");
            break;
        default:
            System.out.println("default auth is set to peer");
      }
      /*int time = 10;
      boolean isWeekday = true;
      String result = (time > 9 || time < 18 || isWeekday)?
                "we are open for business":
                "closed";*/
      String status = (isMarried)?
        "john doe is married":
        "john doe is not married";
      System.out.println(status);
      /*int age = 22;
      Double change = 33.77D;
      final Double PIE = 3.142D;
      final String relegion = "Christian";
      final int tax = 100;
      char grade = 'A';*/
      float income = 122234.667f;
      String fullname = fname.concat(lname);
      System.out.println("user: " + fullname + " \rsalary: " + (int)income );
      System.out.println("Wow what a wonderfull day God has made!!");
      /*if (fullname.length() > 0){
        System.out.println(fullname.length() + fullname.indexOf("doe"));
      }*/
      System.out.println(txt);

    }
}