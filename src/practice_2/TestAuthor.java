package practice_2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Sam", "sam.vinchester@example.com", 'm');

        System.out.println("Имя: " + author.getName());
        System.out.println("Почта: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());

        author.setEmail("new@example.com");
        System.out.println("Новая почта: " + author.getEmail());
        System.out.println(author);

    }

}
