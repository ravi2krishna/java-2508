package tweleve_inheritance;

public class User {
    public static void main(String[] args) {
        
        // Guest User
        Guest guest = new Guest();
        guest.watchVideos();

        // Video Admin User
        VideoAdmin videoAdmin = new VideoAdmin();
        videoAdmin.watchVideos();
        videoAdmin.addVideos();

        // Admin User
        Admin admin = new Admin();
        admin.watchVideos();
        admin.addVideos();
        admin.deleteVideos();

    }
}
