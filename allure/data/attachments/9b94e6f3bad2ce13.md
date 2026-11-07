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
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-573f9caa-d549-4817-ae40-80650bbc2621` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-8cd11d99-6f12-40b1-bb41-cc966b302634` |
| 3 | `POST /v1/auth/token` | 200 | 8 | `qa-c6e81aaa-9ef8-4dce-9c37-fd817c6c88be` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-d2703024-69e7-4ca0-b9a1-3aafc1313543` |
| 5 | `POST /v1/credits/purchases` | 415 | 11 | `qa-56c17ec6-61a5-4d83-9f51-18bf2532c624` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-ea199c5f-2bbe-45b8-8859-9ac53b3a9267` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-5b3f8002-4859-4ff5-8e88-571c99744f42` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-39644359-b0fe-4d53-90b2-6f76417d4371` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-afc13ba4-9b70-43ac-a1cc-90b58127f8a8` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-7b1a3d4c-78c5-4778-9404-3f156c3c37f9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-573f9caa-d549-4817-ae40-80650bbc2621

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-573f9caa-d549-4817-ae40-80650bbc2621
Content-Type: application/json

--- request body ---
{"handle":"qa-011e71c21681","displayName":"QA 011e71c21681","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-573f9caa-d549-4817-ae40-80650bbc2621
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 7
Location: /v1/accounts/qa-011e71c21681
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a451cffc-2d1b-43b0-80e2-42f822d43720","handle":"qa-011e71c21681","displayName":"QA 011e71c21681","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.563641024Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8cd11d99-6f12-40b1-bb41-cc966b302634

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cd11d99-6f12-40b1-bb41-cc966b302634
Content-Type: application/json

--- request body ---
{"handle":"qa-6c2d76d0eb36","displayName":"QA 6c2d76d0eb36","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cd11d99-6f12-40b1-bb41-cc966b302634
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 7
Location: /v1/accounts/qa-6c2d76d0eb36
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3b0cb06c-d2ab-42ce-91bc-214540ae2e0d","handle":"qa-6c2d76d0eb36","displayName":"QA 6c2d76d0eb36","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.602882726Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c6e81aaa-9ef8-4dce-9c37-fd817c6c88be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6e81aaa-9ef8-4dce-9c37-fd817c6c88be
Content-Type: application/json

--- request body ---
{"handle":"qa-011e71c21681","password":"****"}

--- response: 200 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6e81aaa-9ef8-4dce-9c37-fd817c6c88be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a451cffc-2d1b-43b0-80e2-42f822d43720"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d2703024-69e7-4ca0-b9a1-3aafc1313543

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2703024-69e7-4ca0-b9a1-3aafc1313543
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6c2d76d0eb36","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2703024-69e7-4ca0-b9a1-3aafc1313543
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
Location: /v1/conversations/cnv_2603706b-3204-424e-907f-660d8b525f1b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2603706b-3204-424e-907f-660d8b525f1b","subject":"Error contract","status":"open","region":"eu","participants":["qa-011e71c21681","qa-6c2d76d0eb36"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:59.642928816Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-56c17ec6-61a5-4d83-9f51-18bf2532c624

--- request headers ---
Accept: application/json
Idempotency-Key: qa-455d21ae61a242689d4abf20ba7c9056
X-Correlation-Id: qa-56c17ec6-61a5-4d83-9f51-18bf2532c624
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-56c17ec6-61a5-4d83-9f51-18bf2532c624
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-56c17ec6-61a5-4d83-9f51-18bf2532c624"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ea199c5f-2bbe-45b8-8859-9ac53b3a9267

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea199c5f-2bbe-45b8-8859-9ac53b3a9267
Content-Type: application/json

--- request body ---
{"handle":"qa-6c2d76d0eb36","password":"****"}

--- response: 200 in 15 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea199c5f-2bbe-45b8-8859-9ac53b3a9267
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3b0cb06c-d2ab-42ce-91bc-214540ae2e0d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5b3f8002-4859-4ff5-8e88-571c99744f42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b3f8002-4859-4ff5-8e88-571c99744f42
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5b3f8002-4859-4ff5-8e88-571c99744f42
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
correlation: qa-39644359-b0fe-4d53-90b2-6f76417d4371

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39644359-b0fe-4d53-90b2-6f76417d4371
Content-Type: application/json

--- request body ---
{"handle":"qa-6c2d76d0eb36","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39644359-b0fe-4d53-90b2-6f76417d4371
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-39644359-b0fe-4d53-90b2-6f76417d4371"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-afc13ba4-9b70-43ac-a1cc-90b58127f8a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afc13ba4-9b70-43ac-a1cc-90b58127f8a8
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-afc13ba4-9b70-43ac-a1cc-90b58127f8a8
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
correlation: qa-7b1a3d4c-78c5-4778-9404-3f156c3c37f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b1a3d4c-78c5-4778-9404-3f156c3c37f9
Content-Type: application/json

--- request body ---
{"handle":"qa-011e71c21681","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b1a3d4c-78c5-4778-9404-3f156c3c37f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7b1a3d4c-78c5-4778-9404-3f156c3c37f9"}
```
