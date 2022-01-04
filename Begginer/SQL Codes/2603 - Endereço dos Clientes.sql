-- Name of the problem: Endereço dos Clientes
-- Link: https://www.urionlinejudge.com.br/judge/pt/problems/view/2603

SELECT c.name, c.street
FROM customers c
WHERE c.city = 'Porto Alegre';