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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-4744bc25-5a87-4580-b04b-bb491a3c1100` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-063865b1-36e6-408c-88de-4a3492cdbae7` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-4d649838-6fc2-444f-ba02-6f39ade2a63d` |
| 4 | `POST /v1/credits/purchases` | 201 | 15 | `qa-6927ab38-d281-4968-b587-4b3cc897e3a6` |
| 5 | `POST /v1/credits/purchases` | 201 | 28 | `qa-5d7aac85-c444-44b9-b3ad-bce49ad94966` |
| 6 | `POST /v1/conversations` | 201 | 19 | `qa-85f78a46-421e-43cc-800a-877788a089e6` |
| 7 | `GET /v1/credits/ledger` | 200 | 36 | `qa-39624b79-bfd5-4309-bc3c-751f965924c4` |
| 8 | `GET /v1/credits/balance` | 200 | 16 | `qa-eef072cb-4715-46de-9da1-a89b4ad71b61` |
| 9 | `POST /v1/auth/token` | 200 | 19 | `qa-4041dd81-2545-4733-8cab-24daf5926fcc` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-ebf38f37-abf1-470a-b095-8d544d784eb4` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-adf2e333-c594-4bbb-88cd-55407627e0b8` |
| 12 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-dcd8ecd9-6cd2-4a50-88b0-3361b790b0fc` |
| 13 | `POST /v1/auth/token` | 401 | 5 | `qa-35c39945-a9b2-43ef-91ee-bfd2653c1097` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4744bc25-5a87-4580-b04b-bb491a3c1100

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4744bc25-5a87-4580-b04b-bb491a3c1100
Content-Type: application/json

--- request body ---
{"handle":"qa-a8e9b2852b51","displayName":"QA a8e9b2852b51","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-4744bc25-5a87-4580-b04b-bb491a3c1100
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-a8e9b2852b51
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ae1b7925-2292-4048-91f8-aead8c48b6c2","handle":"qa-a8e9b2852b51","displayName":"QA a8e9b2852b51","region":"eu","role":"user","createdAt":"2026-11-27T10:59:52.873980809Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-063865b1-36e6-408c-88de-4a3492cdbae7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-063865b1-36e6-408c-88de-4a3492cdbae7
Content-Type: application/json

--- request body ---
{"handle":"qa-9b8c5ab36a01","displayName":"QA 9b8c5ab36a01","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Fri, 27 Nov 2026 10:59:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-063865b1-36e6-408c-88de-4a3492cdbae7
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
Location: /v1/accounts/qa-9b8c5ab36a01
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bd305efb-4523-49d8-99c4-435ba161261c","handle":"qa-9b8c5ab36a01","displayName":"QA 9b8c5ab36a01","region":"eu","role":"user","createdAt":"2026-11-27T10:59:52.961878200Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4d649838-6fc2-444f-ba02-6f39ade2a63d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d649838-6fc2-444f-ba02-6f39ade2a63d
Content-Type: application/json

--- request body ---
{"handle":"qa-a8e9b2852b51","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4d649838-6fc2-444f-ba02-6f39ade2a63d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ae1b7925-2292-4048-91f8-aead8c48b6c2"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6927ab38-d281-4968-b587-4b3cc897e3a6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-bdb21641dc754eabb8ec0b969279a3ba
X-Correlation-Id: qa-6927ab38-d281-4968-b587-4b3cc897e3a6
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-6927ab38-d281-4968-b587-4b3cc897e3a6
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
Location: /v1/credits/purchases/pur_c588c344-47ce-4f58-a60e-44634bc9a68a
Content-Length: 144

{"id":"pur_c588c344-47ce-4f58-a60e-44634bc9a68a","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-27T10:59:53.035563263Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5d7aac85-c444-44b9-b3ad-bce49ad94966

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cec405144ac54ac4bddee4e283fc8d37
X-Correlation-Id: qa-5d7aac85-c444-44b9-b3ad-bce49ad94966
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 28 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d7aac85-c444-44b9-b3ad-bce49ad94966
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
Location: /v1/credits/purchases/pur_90cb3fe8-7047-41d1-9468-b6ee25af54dc
Content-Length: 144

{"id":"pur_90cb3fe8-7047-41d1-9468-b6ee25af54dc","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-27T10:59:53.083206437Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-85f78a46-421e-43cc-800a-877788a089e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85f78a46-421e-43cc-800a-877788a089e6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9b8c5ab36a01","subject":"Paid message","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-85f78a46-421e-43cc-800a-877788a089e6
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
Location: /v1/conversations/cnv_1b76e9ce-55d2-45fb-b90c-8a850ae5a1a1
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_1b76e9ce-55d2-45fb-b90c-8a850ae5a1a1","subject":"Paid message","status":"open","region":"eu","participants":["qa-a8e9b2852b51","qa-9b8c5ab36a01"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:53.119747391Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-39624b79-bfd5-4309-bc3c-751f965924c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39624b79-bfd5-4309-bc3c-751f965924c4
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-39624b79-bfd5-4309-bc3c-751f965924c4
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

{"items":[{"id":"led_3474177e-68e9-4639-812d-899a151a1f53","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-27T10:59:52.874001029Z"},{"id":"led_d36246ff-c395-48fd-992b-a40466cffed1","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_c588c344-47ce-4f58-a60e-44634bc9a68a","createdAt":"2026-11-27T10:59:53.035563263Z"},{"id":"led_24bdc337-c668-4098-b438-9adfebe44be5","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_90cb3fe8-7047-41d1-9468-b6ee25af54dc","createdAt":"2026-11-27T10:59:53.083206437Z"},{"id":"led_6a7e7d32-d71f-41f9-9c54-0ae15a3b9c65","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_1b76e9ce-55d2-45fb-b90c-8a850ae5a1a1","createdAt":"2026-11-27T10:59:53.119723155Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-eef072cb-4715-46de-9da1-a89b4ad71b61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eef072cb-4715-46de-9da1-a89b4ad71b61
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-eef072cb-4715-46de-9da1-a89b4ad71b61
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

{"balance":64,"currency":"credits","accountId":"acc_ae1b7925-2292-4048-91f8-aead8c48b6c2"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-4041dd81-2545-4733-8cab-24daf5926fcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4041dd81-2545-4733-8cab-24daf5926fcc
Content-Type: application/json

--- request body ---
{"handle":"qa-9b8c5ab36a01","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4041dd81-2545-4733-8cab-24daf5926fcc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bd305efb-4523-49d8-99c4-435ba161261c"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ebf38f37-abf1-470a-b095-8d544d784eb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebf38f37-abf1-470a-b095-8d544d784eb4
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ebf38f37-abf1-470a-b095-8d544d784eb4
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
correlation: qa-adf2e333-c594-4bbb-88cd-55407627e0b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adf2e333-c594-4bbb-88cd-55407627e0b8
Content-Type: application/json

--- request body ---
{"handle":"qa-9b8c5ab36a01","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-adf2e333-c594-4bbb-88cd-55407627e0b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-adf2e333-c594-4bbb-88cd-55407627e0b8"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dcd8ecd9-6cd2-4a50-88b0-3361b790b0fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcd8ecd9-6cd2-4a50-88b0-3361b790b0fc
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dcd8ecd9-6cd2-4a50-88b0-3361b790b0fc
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
correlation: qa-35c39945-a9b2-43ef-91ee-bfd2653c1097

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35c39945-a9b2-43ef-91ee-bfd2653c1097
Content-Type: application/json

--- request body ---
{"handle":"qa-a8e9b2852b51","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35c39945-a9b2-43ef-91ee-bfd2653c1097
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-35c39945-a9b2-43ef-91ee-bfd2653c1097"}
```
