# 🎮 VALORANT Manager System

A technical management system based on the **VALORANT** universe, developed as a comprehensive **Object-Oriented Programming (OOP)** project in Java. The system manages agents, ability kits, an advanced arsenal with hit-zone damage stats, and a functional in-game store.

---

## 📁 Project Structure

```
valorant/
├── src/
│   └── com/valorant/
│       ├── agentes/
│       │   ├── Agente.java          # Base class
│       │   ├── Duelista.java        # Specialized subclass
│       │   ├── Centinela.java       # Specialized subclass
│       │   ├── Habilidad.java       # Auxiliary class
│       │   └── EquipoAgentes.java   # Manager class
│       └── arsenal/
│           ├── Arma.java            # Base class
│           ├── Rifle.java           # Specialized subclass
│           ├── Francotirador.java   # Specialized subclass
│           ├── Skin.java            # Auxiliary class
│           └── Tienda.java          # Manager class
├── purchases.json
└── Main.java
```

---

## 🧱 Architecture & Design

### 📦 Package `com.valorant.agentes`

| Class | Description |
|---|---|
| `Agente` | Parent class with base attributes: health, country of origin, and status |
| `Duelista` | Specialized subclass implementing the 4-ability system (C, Q, E, X) |
| `Centinela` | Specialized subclass implementing the 4-ability system (C, Q, E, X) |
| `Habilidad` | Defines ability costs, effect types, and charge counts |
| `EquipoAgentes` | Manages lists and maps to control the active agent roster |

### 📦 Package `com.valorant.arsenal`

| Class | Description |
|---|---|
| `Arma` | Parent class with price, category, and firing rate |
| `Rifle` | Subclass with localized damage stats (head, body, legs) |
| `Francotirador` | Subclass with localized damage stats per hit zone |
| `Skin` | Manages cosmetic items and collections |
| `Tienda` | Inventory management logic, active discounts, and weapon queries |

---

## ✅ Technical Requirements Met

| Requirement | Implementation |
|---|---|
| **Classes** | 10 distinct classes with full/empty constructors, getters, setters, and custom `toString` |
| **Inheritance** | 2 parent classes and 4 specialized child classes |
| **Collections** | 4 `ArrayList` and 2 `HashMap` structures with CRUD methods (Add, Search, Delete) |
| **Data Types** | Robust use of `String`, `int`, `double`, `boolean`, and custom `Enums` |
| **Logic** | `for/while` loops, `if/else` conditionals, and `switch` statements |
| **Data Integrity** | Overridden `equals` and `hashCode` in all entities for correct collection behavior |

---

## 💻 Execution Example

The `Main` class initializes a full environment including:

1. **Agents:** Instantiating Duelists (e.g., Jett) and Sentinels (e.g., Sage) with their complete ability kits.
2. **Arsenal:** Configuration of iconic weapons (Vandal, Operator) with specific damage-per-hitbox values.
3. **Operations:** Recruiting agents into a team and managing store inventory via Map logic.

---

## ⚙️ Installation & Usage

### Prerequisites

- Java JDK 8 or higher
- IntelliJ IDEA (recommended) or any compatible IDE

### Clone the repository

```bash
git clone https://github.com/JulianChavezdev/valorant.git
cd valorant
```

### Run

1. Open the project in IntelliJ IDEA.
2. Wait for the project to be indexed.
3. Run the `Main.java` class.

---

## 🧠 OOP Concepts Applied

- **Encapsulation** — Private attributes with controlled access via getters/setters.
- **Inheritance** — Clear hierarchy between parent and child classes.
- **Polymorphism** — Specialized behaviors implemented in subclasses.
- **Abstraction** — Simplified models representing the VALORANT universe.
- **Collections** — Efficient use of `ArrayList` and `HashMap` for data management.

---

## 👤 Author

**JulianChavezdev**  
[GitHub](https://github.com/JulianChavezdev)

---

> Academic OOP project inspired by the VALORANT® universe (Riot Games). This project has no commercial purpose.
