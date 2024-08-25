import java.util.Scanner;

abstract class SocialNetwork {

    public void connect() {
        // write your code here ...
        login();
        postMessage();
        logOut();
    }

      // write your code here ...

    protected abstract void login();
    protected abstract void postMessage();
    protected abstract void logOut();
}

class Instagram extends SocialNetwork {
    // write your code here ...
    @Override
    protected void login() {
        System.out.println("Log into Instagram");
    }

    @Override
    protected void postMessage() {
        System.out.println("Post: Hello, Instagram!");
    }

    @Override
    protected void logOut() {
        System.out.println("Log out of Instagram");
    }

}


class Facebook extends SocialNetwork {
  // write your code here ...
  @Override
  protected void login() {
      System.out.println("Log into Facebook");
  }

    @Override
    protected void postMessage() {
        System.out.println("Post: Hello, Facebook!");
    }

    @Override
    protected void logOut() {
        System.out.println("Log out of Facebook");
    }
}

// Do not change the code below
class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.nextLine();
        scanner.close();
        SocialNetwork network = null;
        if ("facebook".equalsIgnoreCase(type)) {
            network = new Facebook();
        } else if ("instagram".equalsIgnoreCase(type)) {
            network = new Instagram();
        } else {
            System.out.println("Error!");
            System.exit(0);
        }
        network.connect();
    }
}
