# Transcript: With no credits left, a message is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#sendingWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-1a14d87f-2ade-4ba7-bf58-488fa0a2569b` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-777d2978-8215-47e8-b4ec-689cc7ad17c0` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-ba70e700-dad6-4ad1-9df5-7ab47d178058` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-f1b0cf31-5f7f-4a02-a64f-16504d6cddb8` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 21 | `qa-b22e99e3-9a63-4c30-a604-cd58fb5e3a25` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-64c44732-3b7e-44e7-971b-b4a9ac87d9f3` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 9 | `qa-bf687278-7271-4444-a07c-4335d0e6e153` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-30eaf66a-240a-44a4-bf30-868d91b82b21` |
| 9 | `GET /v1/credits/balance` | 200 | 13 | `qa-fbf4923e-aea2-4bb7-995f-06f22bb6bf7a` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 17 | `qa-50257a5c-06af-49d2-b60f-b5c07ce588e4` |
| 11 | `GET /v1/credits/ledger` | 200 | 13 | `qa-6a2b433d-19f3-4d68-bd12-d9ade641baba` |
| 12 | `POST /v1/auth/token` | 200 | 8 | `qa-e8a65e00-85ed-418e-a49a-86fdcc21999d` |
| 13 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-955431cd-cfc5-49ca-b6e0-2e04130bdd77` |
| 14 | `POST /v1/auth/token` | 401 | 24 | `qa-5664a044-194f-448a-b496-d2be38b1ac49` |
| 15 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-0c3845dd-25a7-4e39-97bf-3319bbb7d112` |
| 16 | `POST /v1/auth/token` | 401 | 7 | `qa-54c8d240-b3af-439e-afbd-8a9137a8df81` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1a14d87f-2ade-4ba7-bf58-488fa0a2569b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a14d87f-2ade-4ba7-bf58-488fa0a2569b
Content-Type: application/json

--- request body ---
{"handle":"qa-f9aa0d281574","displayName":"QA f9aa0d281574","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a14d87f-2ade-4ba7-bf58-488fa0a2569b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 9
Location: /v1/accounts/qa-f9aa0d281574
X-Served-Region: eu
Content-Length: 181

{"id":"acc_851e5ca1-7015-4b4c-a8a8-6ed1ea5bac55","handle":"qa-f9aa0d281574","displayName":"QA f9aa0d281574","region":"eu","role":"user","createdAt":"2026-11-03T09:41:37.587332054Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-777d2978-8215-47e8-b4ec-689cc7ad17c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-777d2978-8215-47e8-b4ec-689cc7ad17c0
Content-Type: application/json

--- request body ---
{"handle":"qa-2030c5f2e338","displayName":"QA 2030c5f2e338","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-777d2978-8215-47e8-b4ec-689cc7ad17c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 9
Location: /v1/accounts/qa-2030c5f2e338
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b9d8702c-27a4-4927-b450-a4e49c635f8b","handle":"qa-2030c5f2e338","displayName":"QA 2030c5f2e338","region":"eu","role":"user","createdAt":"2026-11-03T09:41:37.615437553Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ba70e700-dad6-4ad1-9df5-7ab47d178058

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba70e700-dad6-4ad1-9df5-7ab47d178058
Content-Type: application/json

--- request body ---
{"handle":"qa-f9aa0d281574","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba70e700-dad6-4ad1-9df5-7ab47d178058
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_851e5ca1-7015-4b4c-a8a8-6ed1ea5bac55"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f1b0cf31-5f7f-4a02-a64f-16504d6cddb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1b0cf31-5f7f-4a02-a64f-16504d6cddb8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2030c5f2e338","subject":"Many messages","message":"1"}

--- response: 201 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1b0cf31-5f7f-4a02-a64f-16504d6cddb8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_30f374fd-e4f7-4ba7-89f8-8da5f826bc21
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_30f374fd-e4f7-4ba7-89f8-8da5f826bc21","subject":"Many messages","status":"open","region":"eu","participants":["qa-f9aa0d281574","qa-2030c5f2e338"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:37.661622618Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_30f374fd-e4f7-4ba7-89f8-8da5f826bc21/messages
correlation: qa-b22e99e3-9a63-4c30-a604-cd58fb5e3a25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b22e99e3-9a63-4c30-a604-cd58fb5e3a25
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-b22e99e3-9a63-4c30-a604-cd58fb5e3a25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_a64f7acc-be7e-4831-8b45-fe6998f904a9","conversationId":"cnv_30f374fd-e4f7-4ba7-89f8-8da5f826bc21","sender":"qa-f9aa0d281574","body":"2","createdAt":"2026-11-03T09:41:37.686221653Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_30f374fd-e4f7-4ba7-89f8-8da5f826bc21/messages
correlation: qa-64c44732-3b7e-44e7-971b-b4a9ac87d9f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64c44732-3b7e-44e7-971b-b4a9ac87d9f3
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 20 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-64c44732-3b7e-44e7-971b-b4a9ac87d9f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_6029073a-6c9e-400d-9816-7655dc4cd3d3","conversationId":"cnv_30f374fd-e4f7-4ba7-89f8-8da5f826bc21","sender":"qa-f9aa0d281574","body":"3","createdAt":"2026-11-03T09:41:37.720342958Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_30f374fd-e4f7-4ba7-89f8-8da5f826bc21/messages
correlation: qa-bf687278-7271-4444-a07c-4335d0e6e153

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf687278-7271-4444-a07c-4335d0e6e153
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf687278-7271-4444-a07c-4335d0e6e153
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_936460a2-dad9-4011-9966-596f21bec488","conversationId":"cnv_30f374fd-e4f7-4ba7-89f8-8da5f826bc21","sender":"qa-f9aa0d281574","body":"4","createdAt":"2026-11-03T09:41:37.746819924Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_30f374fd-e4f7-4ba7-89f8-8da5f826bc21/messages
correlation: qa-30eaf66a-240a-44a4-bf30-868d91b82b21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30eaf66a-240a-44a4-bf30-868d91b82b21
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-30eaf66a-240a-44a4-bf30-868d91b82b21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_95e9496f-7d3c-4e46-a424-d9b3d714eefa","conversationId":"cnv_30f374fd-e4f7-4ba7-89f8-8da5f826bc21","sender":"qa-f9aa0d281574","body":"5","createdAt":"2026-11-03T09:41:37.772510419Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-fbf4923e-aea2-4bb7-995f-06f22bb6bf7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbf4923e-aea2-4bb7-995f-06f22bb6bf7a
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbf4923e-aea2-4bb7-995f-06f22bb6bf7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":0,"currency":"credits","accountId":"acc_851e5ca1-7015-4b4c-a8a8-6ed1ea5bac55"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_30f374fd-e4f7-4ba7-89f8-8da5f826bc21/messages
correlation: qa-50257a5c-06af-49d2-b60f-b5c07ce588e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50257a5c-06af-49d2-b60f-b5c07ce588e4
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-50257a5c-06af-49d2-b60f-b5c07ce588e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 320

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_30f374fd-e4f7-4ba7-89f8-8da5f826bc21/messages","correlationId":"qa-50257a5c-06af-49d2-b60f-b5c07ce588e4"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-6a2b433d-19f3-4d68-bd12-d9ade641baba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a2b433d-19f3-4d68-bd12-d9ade641baba
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a2b433d-19f3-4d68-bd12-d9ade641baba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 1169

{"items":[{"id":"led_c58149b1-2d39-411b-94c2-da62b5f72e43","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-03T09:41:37.587347507Z"},{"id":"led_7dac93e3-fc72-4501-b140-9337531d2024","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_30f374fd-e4f7-4ba7-89f8-8da5f826bc21","createdAt":"2026-11-03T09:41:37.661583060Z"},{"id":"led_5425d684-438b-4b3c-aa9a-2405d2944bc8","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_a64f7acc-be7e-4831-8b45-fe6998f904a9","createdAt":"2026-11-03T09:41:37.686185499Z"},{"id":"led_53946762-7a32-45f3-b206-7ccbd83e442f","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_6029073a-6c9e-400d-9816-7655dc4cd3d3","createdAt":"2026-11-03T09:41:37.720315617Z"},{"id":"led_5f1fd2f6-0550-472c-ac03-2037884a2a22","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_936460a2-dad9-4011-9966-596f21bec488","createdAt":"2026-11-03T09:41:37.746808157Z"},{"id":"led_3a7f4899-768a-4a44-80b5-391942bff7a6","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_95e9496f-7d3c-4e46-a424-d9b3d714eefa","createdAt":"2026-11-03T09:41:37.772474787Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-e8a65e00-85ed-418e-a49a-86fdcc21999d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8a65e00-85ed-418e-a49a-86fdcc21999d
Content-Type: application/json

--- request body ---
{"handle":"qa-2030c5f2e338","password":"****"}

--- response: 200 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8a65e00-85ed-418e-a49a-86fdcc21999d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b9d8702c-27a4-4927-b450-a4e49c635f8b"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-955431cd-cfc5-49ca-b6e0-2e04130bdd77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-955431cd-cfc5-49ca-b6e0-2e04130bdd77
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-955431cd-cfc5-49ca-b6e0-2e04130bdd77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-5664a044-194f-448a-b496-d2be38b1ac49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5664a044-194f-448a-b496-d2be38b1ac49
Content-Type: application/json

--- request body ---
{"handle":"qa-2030c5f2e338","password":"****"}

--- response: 401 in 24 ms ---
Date: Tue, 03 Nov 2026 09:41:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5664a044-194f-448a-b496-d2be38b1ac49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5664a044-194f-448a-b496-d2be38b1ac49"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c3845dd-25a7-4e39-97bf-3319bbb7d112

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c3845dd-25a7-4e39-97bf-3319bbb7d112
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c3845dd-25a7-4e39-97bf-3319bbb7d112
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
```

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-54c8d240-b3af-439e-afbd-8a9137a8df81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54c8d240-b3af-439e-afbd-8a9137a8df81
Content-Type: application/json

--- request body ---
{"handle":"qa-f9aa0d281574","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-54c8d240-b3af-439e-afbd-8a9137a8df81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-54c8d240-b3af-439e-afbd-8a9137a8df81"}
```
