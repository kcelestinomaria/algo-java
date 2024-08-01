public class TowerOfHanoi {
    /**
     * Solves the Tower of Hanoi problem.
     * 
     * @param n Number of disks
     * @param source The rod to move disks from
     * @param auxiliary The rod to use as auxiliary
     * @param destination The rod to move disks to
     */
    public static void solve(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            // Base case: Move a single disk from source to destination
            System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
            return;
        }
        
        // Move n-1 disks from source to auxiliary, using destination as auxiliary
        solve(n - 1, source, destination, auxiliary);
        
        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);
        
        // Move the n-1 disks from auxiliary to destination, using source as auxiliary
        solve(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        System.out.println("Tower of Hanoi solution for " + n + " disks:");
        solve(n, 'A', 'B', 'C'); // A is source, B is auxiliary, C is destination
    }
}
