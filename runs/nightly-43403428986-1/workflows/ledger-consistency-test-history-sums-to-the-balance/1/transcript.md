# Transcript: Grants, purchases and spends sum to the balance

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.LedgerConsistencyTest#historySumsToTheBalance` |
| Features | FEAT-LEDGER-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 522 | `qa-8297d921-5c09-44f2-b91d-19fb98bbf529` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-50a6a3e7-d2a9-45ec-8c23-365bd3462502` |
| 3 | `POST /v1/auth/token` | 200 | 60 | `qa-419ec09d-5824-4ef9-93d3-4465fec97176` |
| 4 | `POST /v1/credits/purchases` | 201 | 59 | `qa-4804269b-d7fa-46e3-99b6-15aa5d2e8a8a` |
| 5 | `POST /v1/credits/purchases` | 201 | 34 | `qa-c319e06e-a81c-42af-83fc-0119582a4bfa` |
| 6 | `POST /v1/conversations` | 201 | 18 | `qa-fd446bc3-d56a-40f9-b8bf-32249f77df8e` |
| 7 | `GET /v1/credits/ledger` | 200 | 44 | `qa-8939e422-ef00-4251-9686-4c5457c7993c` |
| 8 | `GET /v1/credits/balance` | 200 | 27 | `qa-91d6a21d-0426-4e33-8702-2deb43da937b` |
| 9 | `POST /v1/auth/token` | 200 | 29 | `qa-30f0595b-4227-4007-808a-02de176ab74c` |
| 10 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-1f369330-b020-4bee-94d8-0489bc3955e1` |
| 11 | `POST /v1/auth/token` | 401 | 14 | `qa-04928152-d739-4551-8b58-ebf8d6f6aea1` |
| 12 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-83e81f0c-fbba-45c3-b311-509feaf3eaf3` |
| 13 | `POST /v1/auth/token` | 401 | 14 | `qa-eda79150-d8fb-4345-a066-ab0c1e3db0ef` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8297d921-5c09-44f2-b91d-19fb98bbf529

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8297d921-5c09-44f2-b91d-19fb98bbf529
Content-Type: application/json

--- request body ---
{"handle":"qa-b04884a71d8b","displayName":"QA b04884a71d8b","password":"****","region":"eu"}

--- response: 201 in 522 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-8297d921-5c09-44f2-b91d-19fb98bbf529
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-b04884a71d8b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2f87d9d0-6049-4bb9-ba05-6adaa10a72a0","handle":"qa-b04884a71d8b","displayName":"QA b04884a71d8b","region":"eu","role":"user","createdAt":"2026-11-13T09:42:11.323895665Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-50a6a3e7-d2a9-45ec-8c23-365bd3462502

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50a6a3e7-d2a9-45ec-8c23-365bd3462502
Content-Type: application/json

--- request body ---
{"handle":"qa-9f55bd21de82","displayName":"QA 9f55bd21de82","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-50a6a3e7-d2a9-45ec-8c23-365bd3462502
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-9f55bd21de82
X-Served-Region: eu
Content-Length: 181

{"id":"acc_01df56b4-614d-41c4-9bfd-f796c7005355","handle":"qa-9f55bd21de82","displayName":"QA 9f55bd21de82","region":"eu","role":"user","createdAt":"2026-11-13T09:42:11.832365539Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-419ec09d-5824-4ef9-93d3-4465fec97176

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-419ec09d-5824-4ef9-93d3-4465fec97176
Content-Type: application/json

--- request body ---
{"handle":"qa-b04884a71d8b","password":"****"}

--- response: 200 in 60 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-419ec09d-5824-4ef9-93d3-4465fec97176
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2f87d9d0-6049-4bb9-ba05-6adaa10a72a0"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4804269b-d7fa-46e3-99b6-15aa5d2e8a8a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f8e032b5abb04bddb638fd31b143d95e
X-Correlation-Id: qa-4804269b-d7fa-46e3-99b6-15aa5d2e8a8a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 59 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-4804269b-d7fa-46e3-99b6-15aa5d2e8a8a
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
Location: /v1/credits/purchases/pur_6d5103ba-5bd0-4431-9c00-9e92898ba427
Content-Length: 144

{"id":"pur_6d5103ba-5bd0-4431-9c00-9e92898ba427","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-13T09:42:12.054478990Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c319e06e-a81c-42af-83fc-0119582a4bfa

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1aaaba7ec5964afd9ffdd1bbf82fd205
X-Correlation-Id: qa-c319e06e-a81c-42af-83fc-0119582a4bfa
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 34 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-c319e06e-a81c-42af-83fc-0119582a4bfa
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
Location: /v1/credits/purchases/pur_cae93ef1-9288-4da8-ae57-4c2c2b62f0b8
Content-Length: 144

{"id":"pur_cae93ef1-9288-4da8-ae57-4c2c2b62f0b8","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-13T09:42:12.124586731Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-fd446bc3-d56a-40f9-b8bf-32249f77df8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd446bc3-d56a-40f9-b8bf-32249f77df8e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9f55bd21de82","subject":"Paid message","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd446bc3-d56a-40f9-b8bf-32249f77df8e
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
Location: /v1/conversations/cnv_1735dfa8-560b-4f73-a6de-cc341ad851c6
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_1735dfa8-560b-4f73-a6de-cc341ad851c6","subject":"Paid message","status":"open","region":"eu","participants":["qa-b04884a71d8b","qa-9f55bd21de82"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:12.186224038Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-8939e422-ef00-4251-9686-4c5457c7993c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8939e422-ef00-4251-9686-4c5457c7993c
Content-Type: application/json

--- response: 200 in 44 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-8939e422-ef00-4251-9686-4c5457c7993c
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
Content-Length: 791

{"items":[{"id":"led_b074be53-cfce-4a86-9b69-cc9896e580ed","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-13T09:42:11.323918418Z"},{"id":"led_443aef18-8e07-45f8-ae3b-caff051a3b97","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_6d5103ba-5bd0-4431-9c00-9e92898ba427","createdAt":"2026-11-13T09:42:12.054478990Z"},{"id":"led_bf00365f-80ed-4d21-92c3-8f04d125a258","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_cae93ef1-9288-4da8-ae57-4c2c2b62f0b8","createdAt":"2026-11-13T09:42:12.124586731Z"},{"id":"led_3ff0c286-7407-481c-8705-99e6bfab0331","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_1735dfa8-560b-4f73-a6de-cc341ad851c6","createdAt":"2026-11-13T09:42:12.186189904Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-91d6a21d-0426-4e33-8702-2deb43da937b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91d6a21d-0426-4e33-8702-2deb43da937b
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-91d6a21d-0426-4e33-8702-2deb43da937b
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
Content-Length: 90

{"balance":64,"currency":"credits","accountId":"acc_2f87d9d0-6049-4bb9-ba05-6adaa10a72a0"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-30f0595b-4227-4007-808a-02de176ab74c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30f0595b-4227-4007-808a-02de176ab74c
Content-Type: application/json

--- request body ---
{"handle":"qa-9f55bd21de82","password":"****"}

--- response: 200 in 29 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-30f0595b-4227-4007-808a-02de176ab74c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_01df56b4-614d-41c4-9bfd-f796c7005355"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1f369330-b020-4bee-94d8-0489bc3955e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f369330-b020-4bee-94d8-0489bc3955e1
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1f369330-b020-4bee-94d8-0489bc3955e1
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-04928152-d739-4551-8b58-ebf8d6f6aea1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04928152-d739-4551-8b58-ebf8d6f6aea1
Content-Type: application/json

--- request body ---
{"handle":"qa-9f55bd21de82","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-04928152-d739-4551-8b58-ebf8d6f6aea1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-04928152-d739-4551-8b58-ebf8d6f6aea1"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-83e81f0c-fbba-45c3-b311-509feaf3eaf3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83e81f0c-fbba-45c3-b311-509feaf3eaf3
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-83e81f0c-fbba-45c3-b311-509feaf3eaf3
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
```

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-eda79150-d8fb-4345-a066-ab0c1e3db0ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eda79150-d8fb-4345-a066-ab0c1e3db0ef
Content-Type: application/json

--- request body ---
{"handle":"qa-b04884a71d8b","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eda79150-d8fb-4345-a066-ab0c1e3db0ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eda79150-d8fb-4345-a066-ab0c1e3db0ef"}
```
