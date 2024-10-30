# oblig_2_multithreading
my task to get my brother to help me out


you can ignore task 1. I'm struggling with task 2 and 3. When you run these 2 tasks, you'll see that in task 2, the people taking and setting burgers are super in order and not random. I think it's because of the way I use the lock but I have no clue how to fix it. I've tried everything. In task 3, it's randomized but it goes too fast and as soon as a cook puts down a burger a server takes it immediately. this is the optimal outputs I need to get taken from my teacher:

For task 2:
Anne (kokk) legger på hamburger ◖1◗. Brett: [◖1◗]

Mia (servitør) tar av hamburger ◖1◗. Brett: []

Per (servitør) ønsker å ta hamburger, men brett tomt. Venter!

Anne (kokk) legger på hamburger ◖2◗. Brett: [◖2◗]

Per (servitør) tar av hamburger ◖2◗. Brett: []

Per (servitør) ønsker å ta hamburger, men brett tomt. Venter!

Knut (kokk) legger på hamburger ◖3◗. Brett: [◖3◗]

Per (servitør) tar av hamburger ◖3◗. Brett: []

Erik (kokk) legger på hamburger ◖4◗. Brett: [◖4◗]

Per (servitør) tar av hamburger ◖4◗. Brett: []

Knut (kokk) legger på hamburger ◖5◗. Brett: [◖5◗]

Erik (kokk) legger på hamburger ◖6◗. Brett: [◖5◗, ◖6◗]

Mia (servitør) tar av hamburger ◖5◗. Brett: [◖6◗]

Anne (kokk) legger på hamburger ◖7◗. Brett: [◖6◗, ◖7◗]

Knut (kokk) legger på hamburger ◖8◗. Brett: [◖6◗, ◖7◗, ◖8◗]

Per (servitør) tar av hamburger ◖6◗. Brett: [◖7◗, ◖8◗]

Anne (kokk) legger på hamburger ◖9◗. Brett: [◖7◗, ◖8◗, ◖9◗]

Mia (servitør) tar av hamburger ◖7◗. Brett: [◖8◗, ◖9◗]

Erik (kokk) legger på hamburger ◖10◗. Brett: [◖8◗, ◖9◗, ◖10◗]

Knut (kokk) legger på hamburger ◖11◗. Brett: [◖8◗, ◖9◗, ◖10◗, ◖11◗]

Per (servitør) tar av hamburger ◖8◗. Brett: [◖9◗, ◖10◗, ◖11◗]

Erik (kokk) legger på hamburger ◖12◗. Brett: [◖9◗, ◖10◗, ◖11◗, ◖12◗]

Mia (servitør) tar av hamburger ◖9◗. Brett: [◖10◗, ◖11◗, ◖12◗]

Per (servitør) tar av hamburger ◖10◗. Brett: [◖11◗, ◖12◗]

Anne (kokk) legger på hamburger ◖13◗. Brett: [◖11◗, ◖12◗, ◖13◗]

Mia (servitør) tar av hamburger ◖11◗. Brett: [◖12◗, ◖13◗]

Erik (kokk) legger på hamburger ◖14◗. Brett: [◖12◗, ◖13◗, ◖14◗]

Knut (kokk) legger på hamburger ◖15◗. Brett: [◖12◗, ◖13◗, ◖14◗, ◖15◗]

Anne (kokk) klar med hamburger, men brett fullt. Venter!

Per (servitør) tar av hamburger ◖12◗. Brett: [◖13◗, ◖14◗, ◖15◗]

Anne (kokk) legger på hamburger ◖16◗. Brett: [◖13◗, ◖14◗, ◖15◗, ◖16◗]

... (osv) ...


as you can see above the cooks and servers are more random and mine are orderly.

for task 3:
Anne (kokk) legger på hamburger ◖1◗. Brett: [◖1◗]

Mia (servitør) tar av hamburger ◖1◗. Brett: []

Anne (kokk) legger på hamburger ◖2◗. Brett: [◖2◗]

Per (servitør) tar av hamburger ◖2◗. Brett: []

Knut (kokk) legger på hamburger ◖3◗. Brett: [◖3◗]

Per (servitør) tar av hamburger ◖3◗. Brett: []

Erik (kokk) legger på hamburger ◖4◗. Brett: [◖4◗]

Per (servitør) tar av hamburger ◖4◗. Brett: []

Knut (kokk) legger på hamburger ◖5◗. Brett: [◖5◗]

Erik (kokk) legger på hamburger ◖6◗. Brett: [◖5◗, ◖6◗]

Mia (servitør) tar av hamburger ◖5◗. Brett: [◖6◗]

Anne (kokk) legger på hamburger ◖7◗. Brett: [◖6◗, ◖7◗]

Knut (kokk) legger på hamburger ◖8◗. Brett: [◖6◗, ◖7◗, ◖8◗]

... (osv) ...


here you can see towards the end it let's itself pile up. that never happens on mine.
