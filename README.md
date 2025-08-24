# 🎲 Snakes & Ladders (Console Game)

A simple **console-based Snakes & Ladders** game written in **Java** using **Maven**, following **TDD** practices with **JUnit 5, Mockito, and Lombok**.  

---

## 📂 Project Structure
```bash
SNL/
 ├── pom.xml
 ├── src/
 │   ├── main/java/com/game/
 │   │   ├── App.java
 │   │   ├── Board.java
 │   │   ├── Game.java
 │   │   ├── Dice.java
 │   │   ├── Player.java
 │   │   ├── Snake.java
 │   │   └── Ladder.java
 │   └── test/java/com/game/
 │       ├── BoardTest.java
 │       ├── DiceTest.java
 │       ├── GameTest.java
 │       ├── LadderTest.java
 │       ├── PlayerTest.java
 │       └── SnakeTest.java
 └── target/
```
---

## ⚡ Features
- 100-cell board (start at 0, win at 100).  
- **4 snakes** and **4 ladders** (configurable).  
- Dice rolls between 1–6.  
- Must land **exactly** on 100 to win.  
- Rules:  
  - Landing on ladder → climb up.  
  - Landing on snake → slide down.  
  - Rolling beyond 100 → stay in place.  

---

## 🛠️ Tech Stack
- Java 17+  
- Maven 3.9+  
- JUnit 5 (testing)  
- Mockito (mocking dice rolls in tests)  
- Lombok (boilerplate getters/setters)  

---

## 🚀 Setup & Run

### 1. Clone repo
```bash
git clone https://github.com/your-username/SNL.git
cd SNL
```
### 2. Build
```bash
mvn clean package
```
### 3. Run
Since, exec plugin is already added in the pom.xml
```bash
mvn exec:java

```
## 🧪 Run Tests
```bash
mvn test
```
## 🎮 Sample Gameplay
```bash
🎲 Welcome to Snakes & Ladders!
Player: Alice
Press ENTER to roll the dice...
Alice is now at position 3
Press ENTER to roll the dice...
Alice is now at position 7
Alice climbed a ladder! Now at 33
...
🎉 Yay!! Alice won the game!
```


