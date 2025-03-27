SELECT quantidade,preço_unitario,total,criado em,atualizado_em from cart where
quantidade= '6'and preço_unitario='R$2,00' and total='R$12,00'and criado em='22/02/2025'
and atualizado_em='28/02/2025'

SELECT valor_total,metodo_pagamento,status_pagamento,codigo_transaçao from pay where
valor_total='12,00' and metodo_pagamento='debito' and status_pagamento='aprovado',codigo_transaçao=

SELECT valor_total,metodo_pagamento,status_pagamento,codigo_transaçao role FROM pay u LEFT JOIN pay a ON
u.id = a.uId
SELECT valor_total,metodo_pagamento,status_pagamento,codigo_transaçao role FROM pay u RIGHT JOIN pay a ON
u.id = a.uId

SELECT quantidade,preço_unitario,total,criado_em,atualizado_em role FROM cart u LEFT JOIN cart a ON
u.id = a.uId
SELECT quantidade,preço_unitario,total,criado_em,atualizado_em  role FROM cart u RIGHT JOIN cart a ON
u.id = a.uId

--listar--
SELECT p.quantidade,p.preço_unitario,p.total,p.criado em,p.atualizado_em role FROM cart  LEFT JOIN cart cp  ON
p.id = cp.pId LEFT JOIN cart c on cp.cId=c.Id where c cId=1, UNION

SELECT p.quantidade,p.preço_unitario,p.total,p.criado em,p.atualizado_em role FROM cart  RIGHT JOIN cart cp  ON
p.id = cp.pId LEFT JOIN cart c on cp.cId=c.Id where c cId=1, UNION