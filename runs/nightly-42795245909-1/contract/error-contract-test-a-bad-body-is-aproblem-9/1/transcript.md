# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-7359b897-9075-4713-be6b-7de5aac6f7da` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-0b2e7398-6c6b-4441-ae1a-c36b77de374c` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-5c28e4ed-a604-414b-ab30-b45d8029aca4` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-e0bd7a94-a7a4-417e-b136-34addf50a6ce` |
| 5 | `POST /v1/conversations` | 400 | 16 | `qa-827c884a-ffb8-4df1-8579-6c821a5b02e6` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-11e313e4-2f40-41c6-b2bb-b09045f86cfc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-26b5188d-a6d5-4dee-b934-ecb160327d54` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-be474749-71a0-40bd-944a-c306661e0202` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-ce6cc1d6-ab17-4187-a0da-2a5105f4aa70` |
| 10 | `POST /v1/auth/token` | 401 | 44 | `qa-d6cc6567-6084-4953-927e-af20ef845287` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7359b897-9075-4713-be6b-7de5aac6f7da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7359b897-9075-4713-be6b-7de5aac6f7da
Content-Type: application/json

--- request body ---
{"handle":"qa-e713bd7a38e6","displayName":"QA e713bd7a38e6","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-7359b897-9075-4713-be6b-7de5aac6f7da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 8
Location: /v1/accounts/qa-e713bd7a38e6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e50cb61f-e7e2-4dc3-8f1c-5f5bba402c6c","handle":"qa-e713bd7a38e6","displayName":"QA e713bd7a38e6","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.802667483Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0b2e7398-6c6b-4441-ae1a-c36b77de374c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b2e7398-6c6b-4441-ae1a-c36b77de374c
Content-Type: application/json

--- request body ---
{"handle":"qa-80bd2068ca2d","displayName":"QA 80bd2068ca2d","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b2e7398-6c6b-4441-ae1a-c36b77de374c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 8
Location: /v1/accounts/qa-80bd2068ca2d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4a0bd0c1-d33b-4876-a494-2aebc30e7e36","handle":"qa-80bd2068ca2d","displayName":"QA 80bd2068ca2d","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.842266841Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5c28e4ed-a604-414b-ab30-b45d8029aca4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c28e4ed-a604-414b-ab30-b45d8029aca4
Content-Type: application/json

--- request body ---
{"handle":"qa-e713bd7a38e6","password":"****"}

--- response: 200 in 28 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c28e4ed-a604-414b-ab30-b45d8029aca4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e50cb61f-e7e2-4dc3-8f1c-5f5bba402c6c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e0bd7a94-a7a4-417e-b136-34addf50a6ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0bd7a94-a7a4-417e-b136-34addf50a6ce
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-80bd2068ca2d","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0bd7a94-a7a4-417e-b136-34addf50a6ce
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
Location: /v1/conversations/cnv_a7832ea4-7a33-464f-8ce0-85c47feee131
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a7832ea4-7a33-464f-8ce0-85c47feee131","subject":"Error contract","status":"open","region":"eu","participants":["qa-e713bd7a38e6","qa-80bd2068ca2d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:36.901320433Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-827c884a-ffb8-4df1-8579-6c821a5b02e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-827c884a-ffb8-4df1-8579-6c821a5b02e6
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-827c884a-ffb8-4df1-8579-6c821a5b02e6
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-827c884a-ffb8-4df1-8579-6c821a5b02e6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-11e313e4-2f40-41c6-b2bb-b09045f86cfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11e313e4-2f40-41c6-b2bb-b09045f86cfc
Content-Type: application/json

--- request body ---
{"handle":"qa-80bd2068ca2d","password":"****"}

--- response: 200 in 40 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-11e313e4-2f40-41c6-b2bb-b09045f86cfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4a0bd0c1-d33b-4876-a494-2aebc30e7e36"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-26b5188d-a6d5-4dee-b934-ecb160327d54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26b5188d-a6d5-4dee-b934-ecb160327d54
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-26b5188d-a6d5-4dee-b934-ecb160327d54
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
correlation: qa-be474749-71a0-40bd-944a-c306661e0202

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be474749-71a0-40bd-944a-c306661e0202
Content-Type: application/json

--- request body ---
{"handle":"qa-80bd2068ca2d","password":"****"}

--- response: 401 in 26 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be474749-71a0-40bd-944a-c306661e0202
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-be474749-71a0-40bd-944a-c306661e0202"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ce6cc1d6-ab17-4187-a0da-2a5105f4aa70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce6cc1d6-ab17-4187-a0da-2a5105f4aa70
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ce6cc1d6-ab17-4187-a0da-2a5105f4aa70
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
correlation: qa-d6cc6567-6084-4953-927e-af20ef845287

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6cc6567-6084-4953-927e-af20ef845287
Content-Type: application/json

--- request body ---
{"handle":"qa-e713bd7a38e6","password":"****"}

--- response: 401 in 44 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d6cc6567-6084-4953-927e-af20ef845287
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d6cc6567-6084-4953-927e-af20ef845287"}
```
