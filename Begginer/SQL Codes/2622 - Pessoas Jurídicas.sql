-- Name of the problem: Pessoas Jurídicas
-- Link: https://www.beecrowd.com.br/judge/pt/problems/view/2622

SELECT c.name
FROM customers c
JOIN legal_person PJ on PJ.id_customers = c.id 

-- Submission Accepted on the Beecrowd ! 