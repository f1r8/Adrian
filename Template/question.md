You recently watched *Demon Slayer: Infinity Castle* and got inspired to create a mini **simulation of battles** between Demon Slayers and Demons. Your task is to implement a set of classes that model and simulate their interactions.

---

## Breathing Styles

As a demon slayer, one should ideally master a **breathing style** to fight effectively. Each breathing style has multiple **forms**, which you can think of as special techniques.

* Each `BreathingStyle` stores its forms with **Seq** we have learnt in class.
  - You can modify the **Seq** template given if needed such that it works with your implementation.
* A `Form` has a **name** (`String`) and a **damage value** (`int`). Two forms are considered equal if they have the **same name**.
* Forms can be added with `add(int idx, Form form)`.
* Slayers can use a form with `perform(String name)`, which returns its damage.

**Hints:**

* `BreathingStyle` has a constructor that takes in an `int` which creates a **Seq** containing forms.
* `perform(String name)` should search for a form by name and return its damage. Tracking the number of forms for a breathing style may thus be useful.

### Water Breathing

Water breathing is a specific breathing style, popularly used by Giyu Tomioka. In this simulation however, there are only 3 possible forms.

Create a `WaterBreathing` class that contains 3 forms:
* Form 1: "Water Surface Slash", deals 10 damage.
* Form 2: "Water Wheel", deals 12 damage.
* From 3: "Flowing Dance", deals 15 damage.

Sample output:

```java
jshell> BreathingStyle water = new WaterBreathing(3);
water ==> Water breathing

jshell> water.add(0, new Form("Water Surface Slash", 10));

```

You can test your implementation using `Test1.java`.

---

## Slayer

A **Slayer** has:

* A **name** which is a `String`
* A **health** which is an `int` (start at 100)
* A **breathing style**



* The slayers can **kill** which takes in the name of a form (a `String`) and use the form from their breathing style to deal damage.
* Slayers can be **wounded** where the slayer takes damage (an `int`) from demons.

To make things more realistic, you also want an effect when a slayer gets wounded. A sample output is given below.

**Hints:**

* Each Slayer holds a reference to a `BreathingStyle`.
* You can directly call `perform` on their breathing style when using a form.

Sample output:

```java
jshell> Slayer tanjiro = new Slayer("Tanjiro", water);
tanjiro ==> Tanjiro: Water breathing

jshell> tanjiro.kill("Water Surface Slash");
$10 ==> 10

jshell> tanjiro.wound(13);
Tanjiro was wounded! Current health: 87
```

You can test your implementation using `Test2.java`.

---

## Demons

* Each **Demon** has:

* A **name** which is a `String`
* A **health** which is an `int` (start at 100)
* **damage** which is an `int` (default 10)

* Demons can **attack**, returning their damage value.

* They can also be **wounded**, where the demon takes damage (an `int`) from the slayer.

Once again, you want to add special effects when the demon gets wounded.

Sample output:

```java

jshell> Demon demon = new Demon("demon1");
demon ==> Demon demon1

jshell> demon.wound(10)
demon1 was wounded! Current health: 90

jshell> demon.attack()
$11 ==> 10


```
You can test your implementation using `Test3.java`.

### Upper Moon Demons

* Some demons are stronger, called **UpperMoon**, with a **rank** which is represented by an `int`.
* Their attack is slightly stronger, with an addition of `10 / rank` to their base damage.

Sample output:

```java
jshell> Demon akaza = new UpperMoon("Akaza", 3);
akaza ==> Demon Akaza: upper 3

jshell> akaza.wound(dmg);
Demon Akaza was wounded! Current health: 90

jshell> counter = akaza.attack();
$15 ==> 13
```

You can test your implementation using `Test4.java`.

---

## Simulation / Example Flow

Here is an example output for reference.

**Example:**

```java
jshell> BreathingStyle water = new WaterBreathing(3);
water ==> Water breathing

jshell> water.add(0, new Form("Water Surface Slash", 10))

jshell> Slayer tanjiro = new Slayer("Tanjiro", water);
tanjiro ==> Tanjiro: Water breathing

jshell> Demon akaza = new UpperMoon("Akaza", 3);
akaza ==> Demon Akaza: upper 3

jshell> int dmg = tanjiro.kill("Water Surface Slash");
dmg ==> 10

jshell> akaza.wound(dmg);
Demon Akaza was wounded! Current health: 90

jshell> int counter = akaza.attack();
counter ==> 13

jshell> tanjiro.wound(counter);
Tanjiro was wounded! Current health: 87
```

This was inspired by watching too much Demon slayer and partially my 24/25sem1 PE paper.