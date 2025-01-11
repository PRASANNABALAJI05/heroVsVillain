import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("-----------HERO-------------");
        Marvel hero = createHero();
        System.out.println("----------------------------");

        System.out.println("             VS");
        System.out.println("-----------VILLAIN-------------");
        Marvel villain = createVillain();
        System.out.println("----------------------------");

        // Simulate the fight
        simulateFight(hero, villain);
    }

    public static Marvel createHero() {
        Marvel hero = new Marvel();
        hero.Name = "Iron Man";
        hero.superPower = "Arc Reactor Blast";
        hero.strength = 25;
        hero.health = 125;

        System.out.println("Hero Name : " + hero.Name);
        System.out.println("Super Power : " + hero.superPower);
        System.out.println("Strength : " + hero.strength);
        System.out.println("Health : " + hero.health + " HP");
        return hero;
    }
    public static Marvel createVillain()
    {
        Marvel villain = new Marvel();
        villain.Name = "Thanos";
        villain.superPower = "Infinity Stone blast";
        villain.strength = 5;
        villain.health = 500;

        System.out.println("Villain Name : " + villain.Name);
        System.out.println("Super Power : " + villain.superPower);
        System.out.println("Strength : " + villain.strength);
        System.out.println("Health : " + villain.health + " HP");
        return villain;
    }

    public static void simulateFight(Marvel hero, Marvel villain) {
        System.out.println("\n--- The Fight Begins ---");
        while (hero.health > 0 && villain.health > 0) {
            // Hero attacks villain
            villain.takeDamage(hero.strength);
            System.out.println(hero.Name + " attacks! " + villain.Name + " now has " + villain.health + " HP.");

            if (villain.health <= 0) {
                System.out.println(villain.Name + " is defeated! " + hero.Name + " wins!");
                break;
            }

            // Villain attacks hero
            hero.takeDamage(villain.strength);
            System.out.println(villain.Name + " attacks! " + hero.Name + " now has " + hero.health + " HP.");

            if (hero.health <= 0) {
                System.out.println(hero.Name + " is defeated! " + villain.Name + " wins!");
                break;
            }
        }
    }
}
