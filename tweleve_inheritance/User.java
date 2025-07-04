package tweleve_inheritance;

public class User {
    public static void main(String[] args) {
        
        // Guest User
        Guest guest = new Guest();
        System.out.println("Guest");
        guest.watchVideos();

        // Video Admin User
        VideoAdmin videoAdmin = new VideoAdmin();
        System.out.println("Video Admin");
        videoAdmin.watchVideos();
        videoAdmin.addVideos();

        // Admin User
        Admin admin = new Admin();
        System.out.println("Admin");
        admin.watchVideos();
        admin.addVideos();
        admin.deleteVideos();

    }
}
