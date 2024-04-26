package OOP.nested_classes;

public class Human {
    private Passport passport;
    private Heart heart;

    public Human(String series, String number, PassportType passportType) {
        this.passport = new Passport(series, number, passportType); //из вложенного класса вставили характеристики паспорта, чтобы дополнительно не создавать паспорт, отдельно от человека
        this.heart = new Heart(300.0);
    }

    public static class Passport{ //вложенный статический класс - так как паспорт есть только у человека
        private String series;    //нет смысла создавать отдельный класс
        private String number;
        private PassportType passportType;

        public Passport(String series, String number, PassportType passportType) {
            this.series = series;
            this.number = number;
            this.passportType = passportType;


        }

        @Override
        public String toString() {             //для получения инфы о паспорте переопределяем метод toString
            return "Passport{" +
                    "series='" + series + '\'' +
                    ", number='" + number + '\'' +
                    ", passportType=" + passportType +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "passport=" + passport +
                ", heart=" + heart +
                '}';
    }

    public void setPassport(Passport passport) {   //если надо заменить паспорт, делаем это через сеттер
        this.passport = passport;
    }

    private class Heart {
        private double weight;

        public Heart(double weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Heart{" +
                    "weight=" + weight +
                    '}';
        }
    }
}
