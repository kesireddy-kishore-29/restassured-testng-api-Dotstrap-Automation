# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-cd3e4446-435f-4dd2-aebe-832ed396b798` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-3edea356-e850-45cc-8c52-09b3c9b658ce` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-2900b2da-a89e-4986-9522-c9205250e267` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-b40c184b-b8f8-4993-8fa2-164a6e22b1df` |
| 5 | `POST /v1/credits/purchases` | 422 | 14 | `qa-711a646c-0fd9-47e4-a63e-3986f4ed3d96` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-56144b05-d129-4abc-9ef6-867a95b277d5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-d8529d32-0f53-459d-9b79-1783bd7d09a5` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-faf2674f-3ddb-4936-9414-fc0061047f1c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-df4a3b14-5f0d-4dbb-b89d-c8edccb67e65` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-18b2ac7e-b06d-4355-ac2b-3a2b9021e41a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cd3e4446-435f-4dd2-aebe-832ed396b798

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd3e4446-435f-4dd2-aebe-832ed396b798
Content-Type: application/json

--- request body ---
{"handle":"qa-648036bebb99","displayName":"QA 648036bebb99","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd3e4446-435f-4dd2-aebe-832ed396b798
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 5
Location: /v1/accounts/qa-648036bebb99
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0fe3387a-03dd-476a-bb6d-3359bd8c4f94","handle":"qa-648036bebb99","displayName":"QA 648036bebb99","region":"eu","role":"user","createdAt":"2026-11-19T10:29:27.432389123Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3edea356-e850-45cc-8c52-09b3c9b658ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3edea356-e850-45cc-8c52-09b3c9b658ce
Content-Type: application/json

--- request body ---
{"handle":"qa-651a4fae107f","displayName":"QA 651a4fae107f","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-3edea356-e850-45cc-8c52-09b3c9b658ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 5
Location: /v1/accounts/qa-651a4fae107f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b8a99053-5bd1-4a29-a513-33174e1523b9","handle":"qa-651a4fae107f","displayName":"QA 651a4fae107f","region":"eu","role":"user","createdAt":"2026-11-19T10:29:27.491752093Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2900b2da-a89e-4986-9522-c9205250e267

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2900b2da-a89e-4986-9522-c9205250e267
Content-Type: application/json

--- request body ---
{"handle":"qa-648036bebb99","password":"****"}

--- response: 200 in 32 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-2900b2da-a89e-4986-9522-c9205250e267
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0fe3387a-03dd-476a-bb6d-3359bd8c4f94"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b40c184b-b8f8-4993-8fa2-164a6e22b1df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b40c184b-b8f8-4993-8fa2-164a6e22b1df
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-651a4fae107f","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-b40c184b-b8f8-4993-8fa2-164a6e22b1df
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
Location: /v1/conversations/cnv_c3656dc6-9bb5-4ecb-8a02-bf813a849313
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c3656dc6-9bb5-4ecb-8a02-bf813a849313","subject":"Error contract","status":"open","region":"eu","participants":["qa-648036bebb99","qa-651a4fae107f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:27.570373400Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-711a646c-0fd9-47e4-a63e-3986f4ed3d96

--- request headers ---
Accept: application/json
Idempotency-Key: qa-27c05f12d77d4972954ca46ba113fb42
X-Correlation-Id: qa-711a646c-0fd9-47e4-a63e-3986f4ed3d96
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-711a646c-0fd9-47e4-a63e-3986f4ed3d96
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-711a646c-0fd9-47e4-a63e-3986f4ed3d96","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-56144b05-d129-4abc-9ef6-867a95b277d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56144b05-d129-4abc-9ef6-867a95b277d5
Content-Type: application/json

--- request body ---
{"handle":"qa-651a4fae107f","password":"****"}

--- response: 200 in 34 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-56144b05-d129-4abc-9ef6-867a95b277d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b8a99053-5bd1-4a29-a513-33174e1523b9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d8529d32-0f53-459d-9b79-1783bd7d09a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8529d32-0f53-459d-9b79-1783bd7d09a5
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d8529d32-0f53-459d-9b79-1783bd7d09a5
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
correlation: qa-faf2674f-3ddb-4936-9414-fc0061047f1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-faf2674f-3ddb-4936-9414-fc0061047f1c
Content-Type: application/json

--- request body ---
{"handle":"qa-651a4fae107f","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-faf2674f-3ddb-4936-9414-fc0061047f1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-faf2674f-3ddb-4936-9414-fc0061047f1c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-df4a3b14-5f0d-4dbb-b89d-c8edccb67e65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df4a3b14-5f0d-4dbb-b89d-c8edccb67e65
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-df4a3b14-5f0d-4dbb-b89d-c8edccb67e65
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
correlation: qa-18b2ac7e-b06d-4355-ac2b-3a2b9021e41a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18b2ac7e-b06d-4355-ac2b-3a2b9021e41a
Content-Type: application/json

--- request body ---
{"handle":"qa-648036bebb99","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18b2ac7e-b06d-4355-ac2b-3a2b9021e41a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-18b2ac7e-b06d-4355-ac2b-3a2b9021e41a"}
```
