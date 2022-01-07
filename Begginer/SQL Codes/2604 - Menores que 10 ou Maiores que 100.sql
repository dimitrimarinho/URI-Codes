-- Name of the problem: Menores que 10 ou Maiores que 100
-- Link: https://www.beecrowd.com.br/judge/pt/problems/view/2604

SELECT p.id, p.name
FROM products p
WHERE p.price < 10 or p.price > 100

-- Submission Accepted on the Beecrowd ! 