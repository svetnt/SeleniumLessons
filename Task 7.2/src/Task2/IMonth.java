package Task2;

public interface IMonth {

  public static final IMonth m1 = new Month("январь", 31, 16);
  public static final IMonth m2 = new Month("февраль", 28, 19);
  public static final IMonth m3 = new Month("март", 31, 22);
  public static final Month m4 = new Month("апрель", 30, 21);
  public static final Month m5 = new Month("май", 31, 18);
  public static final Month m6 = new Month("июнь", 30, 21);
  public static final Month m7 = new Month("июль", 31, 21);
  public static final Month m8 = new Month("август", 31, 23);
  public static final Month m9 = new Month("сентябрь", 30, 22);
  public static final Month m10 = new Month("октябрь", 31, 21);
  public static final Month m11 = new Month("ноябрь", 30, 21);
  public static final Month m12 = new Month("декабрь", 31, 22);

  static final IMonth[] HALF1 = {m1, m2, m3, m4, m5, m6};
  static final IMonth[] HALF2 = {m7, m8, m9, m10, m11, m12};
  static final IMonth[] MONTH_ARRAYS = {m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12};
  static final IMonth[] QUARTER1 = {m1, m2, m3};
  static final IMonth[] QUARTER2 = {m4, m5, m6};
  static final IMonth[] QUARTER3 = {m7, m8, m9};
  static final IMonth[] QUARTER4 = {m10, m11, m12};

  int getRabDay();

  static IMonth[] getHalf(int n){
    if (n == 1) {
      return HALF1;
    }
    if (n == 2) {
      return HALF2;
    }
    return null;
  };

  public static IMonth[] getYear() {
    return MONTH_ARRAYS;
  }


  public static IMonth[] getQuarter(int n) {
    try {
      if (n == 1) return QUARTER1;
      else {
        if (n == 2) return QUARTER2;
        else {
          if (n == 3) return QUARTER3;
          else {
            if (n == 4) return QUARTER4;
            // else {
            // throw new Exception("Номер квартала должен быть от 1 до 4");
          }
        }
      }

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return null;
  };


}
