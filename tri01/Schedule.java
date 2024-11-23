public class Schedule {
    private String date;
    private String time;
    private Member member;

    public Schedule(String date, String time, Member member) {
        this.date = date;
        this.time = time;
        this.member = member;
    }

    @Override
    public String toString() {
        return "Ngay: " + date + ", Gio: " + time + ", Thanh vien: " + member.getName();
    }
}
