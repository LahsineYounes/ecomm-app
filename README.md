# 🛒 E-Comm App

> A beginner-friendly, modern e-commerce application featuring product discovery, cart management, and a smooth checkout flow, 
> built with Kotlin and Jetpack Compose. 
   
[![Android](https://img.shields.io/badge/Android-3DDC84?style=flat&logo=android&logoColor=white)](https://www.android.com/)
[![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=flat&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Compose](https://img.shields.io/badge/Jetpack_Compose-4285F4?style=flat&logo=jetpack-compose&logoColor=white)](https://developer.android.com/compose)
[![Architecture](https://img.shields.io/badge/Architecture-MVVM-orange.svg)](https://developer.android.com/topic/architecture)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](https://www.linkedin.com/in/lahsine-younes/)
   
---

## Overview

E-Comm App is a strong foundation for anyone learning to build commercial Android apps. 
It simulates a real shopping experience like Amazon or Flipkart, teaching you how to handle product data, state management, and multi-screen navigation.
 
Built as a learning project, it focuses on clean code and the core logic behind how e-commerce systems actually work.

---

## Features 

- ✅ **Product Grid:** Browse items in a clean, two-column layout.
- ✅ **Category Filter:** View products specific to clothing, electronics, or home decor.
- ✅ **Smart Search:** Find products instantly by name with real-time filtering.
- ✅ **Shopping Cart:** Add items, increase/decrease quantities, or clear the cart.
- ✅ **Live Calculations:** The total price updates automatically as you shop.
- ✅ **Checkout Flow:** Includes a "processing" animation and a success screen.
- ✅ **Bottom Navigation:** Smoothly switch between Home, Search, Cart, and Profile.

---

## Screenshots

Home
Search
Cart
Profile
Checkout
Success

---

## Tech Stack

| Layer | Technology |
|-------|------------|
| Language | Kotlin |
| UI | Jetpack Compose + Material 3 |
| Architecture | MVVM |
| State | MutableStateList + ViewModel |
| Navigation | Navigation Compose |
| Assets | 42+ custom images | 

---

## Architecture

<p align="center">
<img height="400" alt="architecture e-commerce app" src="https://github.com/user-attachments/assets/9299dc49-604b-4dcd-b9c5-1ad6047b6c62" />
</p>

* **The UI (Compose Screens):** What the user sees and clicks.
* **The ViewModel (Brain of the App):** Remembers the cart items and handles math (like the total price).
* **The Data (Local Manual Data):** The "blueprints" for products and categories.

---

## Project Structure

```
data/        → Blueprints (Data Classes) and manual data objects.
navigation/  → Navigation Graph and Bottom Bar definitions.
ui/screens/  → Composable UI for Home, Cart, Search, and Profile.
viewmodel/   → State management and cart logic.
```

---

## E-Commerce App Architecture (Explained Simply)

Think of the app like a small shop system with three main parts: 
```
Blueprints → Warehouse (مستودع) → Shopping Cart
```

### 1. The Blueprints (كيفية تعريف العناصر)
```
       [ Product ]
   --------------------
     id
     name
     price
     image
     category
```
> This is the rule for every item. Nothing exists without following this shape. 

```
     [ ProductCategory ]
   ----------------------
     id
     name
     image
```
> This tells how products are grouped (مثل الرفوف في المتجر). 

```
         [ CartProduct ]
   -------------------------------
   product  --------> (Product)
   quantity --------> (changes live)
```
> This is a special version used only in the cart.
> It watches changes so the UI updates automatically.


### 2. The Warehouse (حيث يتم تخزين كل شيء)
```
                [ ProductData ]
                     |
        --------------------------------
        |                              |
 [ Categories List ]          [ Products List ]
        |                              |
   Clothing                       Sweatshirt
   Electronics                    Watch
   Food                           Phone
   Home                           ...
   Beauty
   Jewelry
```
- **Categories =** sections of the store - أقسام المتجر
- **Products =** actual items inside those sections - السلع الموجودة داخل تلك الأقسام
- Every **product** points to one **category** "كل منتج يشير إلى فئة واحدة".


### 3. How Everything Connects
```
         USER OPENS APP
                |
                v
        [ ProductData ]
                |
     ----------------------
     |                    |
[ Categories ]      [ Products ]
     |                    |
     |              filter by category
     |                    |
     ---------> UI (Compose Screens)
                        |
                        v
                 User taps item
                        |
                        v
                [ CartProduct ]
                        |
                 quantity changes
                        |
                        v
                UI auto-updates
```


### 4. Mental Model (Child-Level Explanation)

- **Blueprints =** rules for building toys - قواعد بناء الألعاب
- **Warehouse =** box holding all toys - صندوق يحتوي على جميع الألعاب
- **CartProduct =** toy you picked, with a counter - اللعبة التي اخترتها، مع عداد
- **Compose UI =** window showing toys - نافذة تعرض الألعاب
- **State (mutableStateOf) =** magic that updates the screen instantly.


### 5. Core Idea
```
Data (truth) → State (observable) → UI (reacts automatically)
```
> No manual refresh. Changes flow forward automatically.

--- 

## Future Improvements
- [ ] Real Backend: Connect to a live API or Database.
- [ ] Auth: Add user login and registration.
- [ ] Payments: Integrate real gateways like RazorPay or Stripe.
- [ ] User Data: Add a real photo picker for the Profile screen.
- [ ] Functionality: Make all menu options on the Profile screen work.

---

## License

```
MIT License — free to use, modify, and distribute.
```
