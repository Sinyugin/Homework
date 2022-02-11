public class Lesson5 {
    public static void main(String[] args) {
        Employees[] employees = {
                new Employees("Иванов Иван", "слесарь", " ivanov@mail.ru", "89123456789",
                        25000, 50),
                new Employees("Петр Михайлович", "инженер", "injener@mail.ru", "89123456789",
                        38000, 30),
                new Employees("Егор Сергеевич", "электрик", "egor@inbox.ru", "89998887766",
                        30000, 42),
                new Employees("Евгений Сергеевич", "водитель", "driver@info.ru", "89886663322",
                        35000, 28),
                new Employees("Максим Валерьевич", "учитель", "max@mail.ru", "89001234567",
                        40000, 37)
        };

        for (Employees employees1 : employees){
            if (employees1.getAge()> 40){
                employees1.info();
            }
        }
    }
}
