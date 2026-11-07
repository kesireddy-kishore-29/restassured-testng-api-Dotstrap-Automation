# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-f63210af-dc7a-429e-b743-3f1169c2520c` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-61f4795d-2155-4c85-a747-0d58b66f4e9a` |
| 3 | `POST /v1/auth/token` | 200 | 7 | `qa-81ab5543-6ca8-4823-96a4-3f5f8acbd302` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-0dbec068-c1cc-49f9-b446-f82deeff03f4` |
| 5 | `POST /v1/credits/purchases` | 415 | 23 | `qa-e47a69fe-e0c2-42f5-89d6-19e0b2239da3` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-9328694f-3ee7-4598-8687-e69667652782` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-06b316fc-74a0-40f8-af85-0fa8981cc0dd` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-102edf1f-c976-435a-b98c-17290705c3a0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-eccb10c9-0bef-4001-b700-52a491bf7649` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-45929d05-fe0b-482d-863c-5c04f42a2590` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f63210af-dc7a-429e-b743-3f1169c2520c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f63210af-dc7a-429e-b743-3f1169c2520c
Content-Type: application/json

--- request body ---
{"handle":"qa-b06261e3da0a","displayName":"QA b06261e3da0a","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-f63210af-dc7a-429e-b743-3f1169c2520c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 7
Location: /v1/accounts/qa-b06261e3da0a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_10de196a-c408-447b-8111-337e0fe1c8b7","handle":"qa-b06261e3da0a","displayName":"QA b06261e3da0a","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.947107718Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-61f4795d-2155-4c85-a747-0d58b66f4e9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61f4795d-2155-4c85-a747-0d58b66f4e9a
Content-Type: application/json

--- request body ---
{"handle":"qa-e4fbd9dae501","displayName":"QA e4fbd9dae501","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-61f4795d-2155-4c85-a747-0d58b66f4e9a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 7
Location: /v1/accounts/qa-e4fbd9dae501
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0b2751aa-f761-428d-abbd-64ca2f4bb11d","handle":"qa-e4fbd9dae501","displayName":"QA e4fbd9dae501","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.999949792Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-81ab5543-6ca8-4823-96a4-3f5f8acbd302

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81ab5543-6ca8-4823-96a4-3f5f8acbd302
Content-Type: application/json

--- request body ---
{"handle":"qa-b06261e3da0a","password":"****"}

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-81ab5543-6ca8-4823-96a4-3f5f8acbd302
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_10de196a-c408-447b-8111-337e0fe1c8b7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0dbec068-c1cc-49f9-b446-f82deeff03f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dbec068-c1cc-49f9-b446-f82deeff03f4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e4fbd9dae501","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dbec068-c1cc-49f9-b446-f82deeff03f4
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
Location: /v1/conversations/cnv_294b45d0-fbf2-4a4e-9bb1-1f8a14fff4cf
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_294b45d0-fbf2-4a4e-9bb1-1f8a14fff4cf","subject":"Error contract","status":"open","region":"eu","participants":["qa-b06261e3da0a","qa-e4fbd9dae501"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:24.045121759Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e47a69fe-e0c2-42f5-89d6-19e0b2239da3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-14978981efcc4bcb841c1016d380d1bc
X-Correlation-Id: qa-e47a69fe-e0c2-42f5-89d6-19e0b2239da3
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 23 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e47a69fe-e0c2-42f5-89d6-19e0b2239da3
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-e47a69fe-e0c2-42f5-89d6-19e0b2239da3"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9328694f-3ee7-4598-8687-e69667652782

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9328694f-3ee7-4598-8687-e69667652782
Content-Type: application/json

--- request body ---
{"handle":"qa-e4fbd9dae501","password":"****"}

--- response: 200 in 25 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-9328694f-3ee7-4598-8687-e69667652782
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0b2751aa-f761-428d-abbd-64ca2f4bb11d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-06b316fc-74a0-40f8-af85-0fa8981cc0dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06b316fc-74a0-40f8-af85-0fa8981cc0dd
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-06b316fc-74a0-40f8-af85-0fa8981cc0dd
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-102edf1f-c976-435a-b98c-17290705c3a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-102edf1f-c976-435a-b98c-17290705c3a0
Content-Type: application/json

--- request body ---
{"handle":"qa-e4fbd9dae501","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-102edf1f-c976-435a-b98c-17290705c3a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-102edf1f-c976-435a-b98c-17290705c3a0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eccb10c9-0bef-4001-b700-52a491bf7649

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eccb10c9-0bef-4001-b700-52a491bf7649
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eccb10c9-0bef-4001-b700-52a491bf7649
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-45929d05-fe0b-482d-863c-5c04f42a2590

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45929d05-fe0b-482d-863c-5c04f42a2590
Content-Type: application/json

--- request body ---
{"handle":"qa-b06261e3da0a","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-45929d05-fe0b-482d-863c-5c04f42a2590
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-45929d05-fe0b-482d-863c-5c04f42a2590"}
```
