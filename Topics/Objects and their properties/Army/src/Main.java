class Army {

    public static void createArmy() {
        // Create all objects here
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {

        Unit obj1=new Unit("maharashtra");
        Unit obj2=new Unit("pune");
        Unit obj3=new Unit("mumbai");
        Unit obj4=new Unit("nagpur");
        Unit obj5=new Unit("amravati");

        Knight k1=new Knight("k1");
        Knight k2=new Knight("k2");
        Knight k3=new Knight("k3");

        General g1=new General("General1");

        Doctor dr=new Doctor("Dr 1");






        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}