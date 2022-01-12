-- Name of the problem: Representantes Executivos
-- Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/2605

SELECT p.name, prov.name
FROM products p
JOIN providers prov ON p.id_providers = prov.id
WHERE p.id_categories = 6;

-- Submission Accepted on the Beecrowd ! 