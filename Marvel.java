public class Marvel {
    String Name;
    String superPower;
    int strength;
    int health;

    // Method to calculate remaining health after taking damage
    public int takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0; // Ensure health doesn't go negative
        }
        return health;
    }
}
