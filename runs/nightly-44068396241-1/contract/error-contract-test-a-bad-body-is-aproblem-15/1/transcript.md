# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-d84b6286-f85c-4fe4-9b5e-94072c9abdc5` |
| 2 | `POST /v1/accounts` | 201 | 9 | `qa-6876498d-8f01-40ad-8166-db93c2506631` |
| 3 | `POST /v1/auth/token` | 200 | 9 | `qa-43b02dec-1955-42f0-8390-43b797bf80dd` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-c71cee27-f093-451b-81a3-db3d1ee6b06e` |
| 5 | `POST /v1/credits/purchases` | 400 | 9 | `qa-388dd130-ca6a-41b7-9226-04f978c641ad` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-a096fcf3-c2c3-4943-9b42-6ae0f5516b1a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-62bb6898-a5ea-4e47-9070-6cca98a9c9b0` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-d7dc1000-9af1-4ca1-8738-6ad69480e517` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-e8fd0c84-925b-4a09-9f4e-05c956dbafaa` |
| 10 | `POST /v1/auth/token` | 401 | 29 | `qa-8c544d53-700b-4cc5-a6df-0e8936207e89` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d84b6286-f85c-4fe4-9b5e-94072c9abdc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d84b6286-f85c-4fe4-9b5e-94072c9abdc5
Content-Type: application/json

--- request body ---
{"handle":"qa-71b2e864aca4","displayName":"QA 71b2e864aca4","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-d84b6286-f85c-4fe4-9b5e-94072c9abdc5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 7
Location: /v1/accounts/qa-71b2e864aca4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6c2407f8-a1e8-4106-864f-83fc5e7446c0","handle":"qa-71b2e864aca4","displayName":"QA 71b2e864aca4","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.828474345Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6876498d-8f01-40ad-8166-db93c2506631

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6876498d-8f01-40ad-8166-db93c2506631
Content-Type: application/json

--- request body ---
{"handle":"qa-e2d62bcac407","displayName":"QA e2d62bcac407","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-6876498d-8f01-40ad-8166-db93c2506631
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 7
Location: /v1/accounts/qa-e2d62bcac407
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5b6eb043-7ad7-457b-b3b5-1d3f9eaff02c","handle":"qa-e2d62bcac407","displayName":"QA e2d62bcac407","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.836523413Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-43b02dec-1955-42f0-8390-43b797bf80dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43b02dec-1955-42f0-8390-43b797bf80dd
Content-Type: application/json

--- request body ---
{"handle":"qa-71b2e864aca4","password":"****"}

--- response: 200 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-43b02dec-1955-42f0-8390-43b797bf80dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6c2407f8-a1e8-4106-864f-83fc5e7446c0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c71cee27-f093-451b-81a3-db3d1ee6b06e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c71cee27-f093-451b-81a3-db3d1ee6b06e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e2d62bcac407","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-c71cee27-f093-451b-81a3-db3d1ee6b06e
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
Location: /v1/conversations/cnv_981e0d09-4bb2-486b-8da8-5fb62f617457
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_981e0d09-4bb2-486b-8da8-5fb62f617457","subject":"Error contract","status":"open","region":"eu","participants":["qa-71b2e864aca4","qa-e2d62bcac407"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.878281773Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-388dd130-ca6a-41b7-9226-04f978c641ad

--- request headers ---
Accept: application/json
Idempotency-Key: qa-686d55c3ce41410787a3843f0492d3d5
X-Correlation-Id: qa-388dd130-ca6a-41b7-9226-04f978c641ad
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-388dd130-ca6a-41b7-9226-04f978c641ad
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-388dd130-ca6a-41b7-9226-04f978c641ad"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a096fcf3-c2c3-4943-9b42-6ae0f5516b1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a096fcf3-c2c3-4943-9b42-6ae0f5516b1a
Content-Type: application/json

--- request body ---
{"handle":"qa-e2d62bcac407","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-a096fcf3-c2c3-4943-9b42-6ae0f5516b1a
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5b6eb043-7ad7-457b-b3b5-1d3f9eaff02c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-62bb6898-a5ea-4e47-9070-6cca98a9c9b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62bb6898-a5ea-4e47-9070-6cca98a9c9b0
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-62bb6898-a5ea-4e47-9070-6cca98a9c9b0
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
correlation: qa-d7dc1000-9af1-4ca1-8738-6ad69480e517

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7dc1000-9af1-4ca1-8738-6ad69480e517
Content-Type: application/json

--- request body ---
{"handle":"qa-e2d62bcac407","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d7dc1000-9af1-4ca1-8738-6ad69480e517
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d7dc1000-9af1-4ca1-8738-6ad69480e517"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e8fd0c84-925b-4a09-9f4e-05c956dbafaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8fd0c84-925b-4a09-9f4e-05c956dbafaa
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e8fd0c84-925b-4a09-9f4e-05c956dbafaa
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
correlation: qa-8c544d53-700b-4cc5-a6df-0e8936207e89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c544d53-700b-4cc5-a6df-0e8936207e89
Content-Type: application/json

--- request body ---
{"handle":"qa-71b2e864aca4","password":"****"}

--- response: 401 in 29 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c544d53-700b-4cc5-a6df-0e8936207e89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8c544d53-700b-4cc5-a6df-0e8936207e89"}
```
