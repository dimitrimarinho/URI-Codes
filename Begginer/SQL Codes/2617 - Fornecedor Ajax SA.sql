-- Name of the problem: Fornecedor Ajax SA
-- Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/2617

SELECT prod.name, prov.name
FROM products prod
JOIN providers prov on prod.id_providers = prov.id
WHERE prov.name = 'Ajax SA';