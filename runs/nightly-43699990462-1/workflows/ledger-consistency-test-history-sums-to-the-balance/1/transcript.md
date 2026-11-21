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
| 1 | `POST /v1/accounts` | 201 | 428 | `qa-c770aa49-25b2-41ce-92b1-e8038fa95cc3` |
| 2 | `POST /v1/accounts` | 201 | 106 | `qa-40d4c800-11c5-488f-868f-03c7caba5206` |
| 3 | `POST /v1/auth/token` | 200 | 61 | `qa-3b2c828e-d1c9-471f-80e9-3c22fb748ae2` |
| 4 | `POST /v1/credits/purchases` | 201 | 93 | `qa-5b5c7852-f86e-4d10-aaf4-585fed3009b2` |
| 5 | `POST /v1/credits/purchases` | 201 | 33 | `qa-5138799d-d34c-41c3-b71f-f4ee1aa045bc` |
| 6 | `POST /v1/conversations` | 201 | 24 | `qa-1f0804fc-d8da-4cb3-877e-6e80b98a1ee3` |
| 7 | `GET /v1/credits/ledger` | 200 | 26 | `qa-b2836fbc-c5ea-4054-af4d-51e59d24d3cd` |
| 8 | `GET /v1/credits/balance` | 200 | 22 | `qa-cf61503b-a9e8-4bc2-b284-75bd886b6680` |
| 9 | `POST /v1/auth/token` | 200 | 22 | `qa-ec40cbc4-bd72-4569-a7b1-90b5d3061f49` |
| 10 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-859e7847-6580-4582-af70-41eb791daa7f` |
| 11 | `POST /v1/auth/token` | 401 | 20 | `qa-88e81b39-2c4c-4b69-90fe-c0a4bdd80892` |
| 12 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-a5396c14-afc7-4ab7-b0e7-e81bea5b43ab` |
| 13 | `POST /v1/auth/token` | 401 | 8 | `qa-2252a241-3dea-4b4f-b95f-fd51f08d3e26` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c770aa49-25b2-41ce-92b1-e8038fa95cc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c770aa49-25b2-41ce-92b1-e8038fa95cc3
Content-Type: application/json

--- request body ---
{"handle":"qa-9df7b7d22238","displayName":"QA 9df7b7d22238","password":"****","region":"eu"}

--- response: 201 in 428 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-c770aa49-25b2-41ce-92b1-e8038fa95cc3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-9df7b7d22238
X-Served-Region: eu
Content-Length: 181

{"id":"acc_601aeaa6-185c-4a7b-a3ac-badc2982157b","handle":"qa-9df7b7d22238","displayName":"QA 9df7b7d22238","region":"eu","role":"user","createdAt":"2026-11-15T09:36:14.668879462Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-40d4c800-11c5-488f-868f-03c7caba5206

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40d4c800-11c5-488f-868f-03c7caba5206
Content-Type: application/json

--- request body ---
{"handle":"qa-86e61274674d","displayName":"QA 86e61274674d","password":"****","region":"eu"}

--- response: 201 in 106 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-40d4c800-11c5-488f-868f-03c7caba5206
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
Location: /v1/accounts/qa-86e61274674d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_148d74ce-7f5b-4533-80cb-f348ec237ffa","handle":"qa-86e61274674d","displayName":"QA 86e61274674d","region":"eu","role":"user","createdAt":"2026-11-15T09:36:15.255916229Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3b2c828e-d1c9-471f-80e9-3c22fb748ae2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b2c828e-d1c9-471f-80e9-3c22fb748ae2
Content-Type: application/json

--- request body ---
{"handle":"qa-9df7b7d22238","password":"****"}

--- response: 200 in 61 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b2c828e-d1c9-471f-80e9-3c22fb748ae2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_601aeaa6-185c-4a7b-a3ac-badc2982157b"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5b5c7852-f86e-4d10-aaf4-585fed3009b2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-21aac33fd3414514bd1d874258f23cc8
X-Correlation-Id: qa-5b5c7852-f86e-4d10-aaf4-585fed3009b2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 93 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b5c7852-f86e-4d10-aaf4-585fed3009b2
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
Location: /v1/credits/purchases/pur_c406dfbe-347f-4262-8c37-3086483c37cd
Content-Length: 144

{"id":"pur_c406dfbe-347f-4262-8c37-3086483c37cd","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-15T09:36:15.560726972Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5138799d-d34c-41c3-b71f-f4ee1aa045bc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-54d9608070864d69bdb345b59499008c
X-Correlation-Id: qa-5138799d-d34c-41c3-b71f-f4ee1aa045bc
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 33 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-5138799d-d34c-41c3-b71f-f4ee1aa045bc
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
Location: /v1/credits/purchases/pur_9e8b7690-810c-41ae-beac-f0a5a3db67f0
Content-Length: 144

{"id":"pur_9e8b7690-810c-41ae-beac-f0a5a3db67f0","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-15T09:36:15.656437028Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-1f0804fc-d8da-4cb3-877e-6e80b98a1ee3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f0804fc-d8da-4cb3-877e-6e80b98a1ee3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-86e61274674d","subject":"Paid message","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f0804fc-d8da-4cb3-877e-6e80b98a1ee3
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
Location: /v1/conversations/cnv_1e3cea6a-8daf-4081-b9e8-2931de4bdb28
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_1e3cea6a-8daf-4081-b9e8-2931de4bdb28","subject":"Paid message","status":"open","region":"eu","participants":["qa-9df7b7d22238","qa-86e61274674d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:15.715002031Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-b2836fbc-c5ea-4054-af4d-51e59d24d3cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2836fbc-c5ea-4054-af4d-51e59d24d3cd
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2836fbc-c5ea-4054-af4d-51e59d24d3cd
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

{"items":[{"id":"led_cd315e54-956e-42f0-9e32-39201ae7a122","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-15T09:36:14.671796760Z"},{"id":"led_bc9dd1ba-999c-4782-b521-d4f6fe497d38","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_c406dfbe-347f-4262-8c37-3086483c37cd","createdAt":"2026-11-15T09:36:15.560726972Z"},{"id":"led_0d7b14c5-e69b-4026-88ed-24474535d144","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_9e8b7690-810c-41ae-beac-f0a5a3db67f0","createdAt":"2026-11-15T09:36:15.656437028Z"},{"id":"led_95da7930-6d32-47ea-8565-11b7c9d69943","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_1e3cea6a-8daf-4081-b9e8-2931de4bdb28","createdAt":"2026-11-15T09:36:15.714961626Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-cf61503b-a9e8-4bc2-b284-75bd886b6680

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf61503b-a9e8-4bc2-b284-75bd886b6680
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf61503b-a9e8-4bc2-b284-75bd886b6680
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

{"balance":64,"currency":"credits","accountId":"acc_601aeaa6-185c-4a7b-a3ac-badc2982157b"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-ec40cbc4-bd72-4569-a7b1-90b5d3061f49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec40cbc4-bd72-4569-a7b1-90b5d3061f49
Content-Type: application/json

--- request body ---
{"handle":"qa-86e61274674d","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec40cbc4-bd72-4569-a7b1-90b5d3061f49
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_148d74ce-7f5b-4533-80cb-f348ec237ffa"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-859e7847-6580-4582-af70-41eb791daa7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-859e7847-6580-4582-af70-41eb791daa7f
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-859e7847-6580-4582-af70-41eb791daa7f
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
correlation: qa-88e81b39-2c4c-4b69-90fe-c0a4bdd80892

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88e81b39-2c4c-4b69-90fe-c0a4bdd80892
Content-Type: application/json

--- request body ---
{"handle":"qa-86e61274674d","password":"****"}

--- response: 401 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-88e81b39-2c4c-4b69-90fe-c0a4bdd80892
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-88e81b39-2c4c-4b69-90fe-c0a4bdd80892"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a5396c14-afc7-4ab7-b0e7-e81bea5b43ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5396c14-afc7-4ab7-b0e7-e81bea5b43ab
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a5396c14-afc7-4ab7-b0e7-e81bea5b43ab
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
correlation: qa-2252a241-3dea-4b4f-b95f-fd51f08d3e26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2252a241-3dea-4b4f-b95f-fd51f08d3e26
Content-Type: application/json

--- request body ---
{"handle":"qa-9df7b7d22238","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2252a241-3dea-4b4f-b95f-fd51f08d3e26
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2252a241-3dea-4b4f-b95f-fd51f08d3e26"}
```
