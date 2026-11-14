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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-04102c25-948a-4960-9abc-5e4e601eb3bd` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-ebbf16d4-5a4e-4b38-b332-9e66730db627` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-b5770e00-152c-498f-be74-380e2ddaacbd` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-6d7f38dc-c94a-47d1-938c-9d2aded3cd0b` |
| 5 | `POST /v1/credits/purchases` | 422 | 3 | `qa-4b45d261-1599-4ed6-80de-e4436e59e813` |
| 6 | `POST /v1/auth/token` | 200 | 7 | `qa-c8c701fb-1918-4af1-a299-5173a504037e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-84637d18-fd73-4e13-8775-aaaadca47961` |
| 8 | `POST /v1/auth/token` | 401 | 3 | `qa-024aa68e-17e0-4406-a1e3-f8cd958ce8ec` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-93293ce3-46be-4a68-a90f-678f7230aeb9` |
| 10 | `POST /v1/auth/token` | 401 | 3 | `qa-f631e798-3bfb-4f7d-8096-7f0f63ff3095` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-04102c25-948a-4960-9abc-5e4e601eb3bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04102c25-948a-4960-9abc-5e4e601eb3bd
Content-Type: application/json

--- request body ---
{"handle":"qa-4a6f06931efb","displayName":"QA 4a6f06931efb","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-04102c25-948a-4960-9abc-5e4e601eb3bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 6
Location: /v1/accounts/qa-4a6f06931efb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_79e33db7-5305-4678-b413-d79f2998ee42","handle":"qa-4a6f06931efb","displayName":"QA 4a6f06931efb","region":"eu","role":"user","createdAt":"2026-11-11T09:34:39.204014017Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ebbf16d4-5a4e-4b38-b332-9e66730db627

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebbf16d4-5a4e-4b38-b332-9e66730db627
Content-Type: application/json

--- request body ---
{"handle":"qa-1272473e7708","displayName":"QA 1272473e7708","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebbf16d4-5a4e-4b38-b332-9e66730db627
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 6
Location: /v1/accounts/qa-1272473e7708
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8b233ce0-92c5-4455-a8f2-9741712a66bb","handle":"qa-1272473e7708","displayName":"QA 1272473e7708","region":"eu","role":"user","createdAt":"2026-11-11T09:34:39.234812986Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b5770e00-152c-498f-be74-380e2ddaacbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5770e00-152c-498f-be74-380e2ddaacbd
Content-Type: application/json

--- request body ---
{"handle":"qa-4a6f06931efb","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5770e00-152c-498f-be74-380e2ddaacbd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_79e33db7-5305-4678-b413-d79f2998ee42"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6d7f38dc-c94a-47d1-938c-9d2aded3cd0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d7f38dc-c94a-47d1-938c-9d2aded3cd0b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1272473e7708","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d7f38dc-c94a-47d1-938c-9d2aded3cd0b
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
Location: /v1/conversations/cnv_7a18fa41-7b7b-4a86-92c6-3d1c88fcc0c6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7a18fa41-7b7b-4a86-92c6-3d1c88fcc0c6","subject":"Error contract","status":"open","region":"eu","participants":["qa-4a6f06931efb","qa-1272473e7708"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:39.268852801Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4b45d261-1599-4ed6-80de-e4436e59e813

--- request headers ---
Accept: application/json
Idempotency-Key: qa-17165cdcc8e14255bf3d87c7d2285dae
X-Correlation-Id: qa-4b45d261-1599-4ed6-80de-e4436e59e813
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 3 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b45d261-1599-4ed6-80de-e4436e59e813
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-4b45d261-1599-4ed6-80de-e4436e59e813","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c8c701fb-1918-4af1-a299-5173a504037e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8c701fb-1918-4af1-a299-5173a504037e
Content-Type: application/json

--- request body ---
{"handle":"qa-1272473e7708","password":"****"}

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8c701fb-1918-4af1-a299-5173a504037e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b233ce0-92c5-4455-a8f2-9741712a66bb"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-84637d18-fd73-4e13-8775-aaaadca47961

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84637d18-fd73-4e13-8775-aaaadca47961
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-84637d18-fd73-4e13-8775-aaaadca47961
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
correlation: qa-024aa68e-17e0-4406-a1e3-f8cd958ce8ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-024aa68e-17e0-4406-a1e3-f8cd958ce8ec
Content-Type: application/json

--- request body ---
{"handle":"qa-1272473e7708","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-024aa68e-17e0-4406-a1e3-f8cd958ce8ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-024aa68e-17e0-4406-a1e3-f8cd958ce8ec"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-93293ce3-46be-4a68-a90f-678f7230aeb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93293ce3-46be-4a68-a90f-678f7230aeb9
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-93293ce3-46be-4a68-a90f-678f7230aeb9
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
correlation: qa-f631e798-3bfb-4f7d-8096-7f0f63ff3095

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f631e798-3bfb-4f7d-8096-7f0f63ff3095
Content-Type: application/json

--- request body ---
{"handle":"qa-4a6f06931efb","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f631e798-3bfb-4f7d-8096-7f0f63ff3095
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f631e798-3bfb-4f7d-8096-7f0f63ff3095"}
```
