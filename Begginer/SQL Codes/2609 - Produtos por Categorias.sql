-- Name of the problem: Produtos por Categorias
-- Link: https://www.beecrowd.com.br/judge/pt/problems/view/2609

SELECT c.name, SUM(p.amount)
FROM categories c
JOIN products p ON p.id_categories = c.id
GROUP BY c.name
ORDER BY c.name

-- Submission Accepted on the Beecrowd ! 