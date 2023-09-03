package lecture20230903;

public class Song {
    private String title;
    private String artist;
    private int year;
    private String country;

    // 기본 생성자
    public Song() {
    }

    // 모든 필드를 초기화하는 생성자
    public Song(String title, String artist, int year, String country) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }

    // 노래 정보 출력 메소드
    public void show() {
        System.out.println(year + "년 " + country + " 국적의 " + artist + "가 부른 " + title);
    }

    public static void main(String[] args) {
        Song song = new Song("Ditto", "뉴진스", 2003, "대한민국");
        song.show();
    }
}
