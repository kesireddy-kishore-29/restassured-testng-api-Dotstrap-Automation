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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-2654e102-415a-426e-bf15-5937b48d5782` |
| 2 | `POST /v1/accounts` | 201 | 9 | `qa-e07d97fb-1f30-43ee-839d-05e0f49f7133` |
| 3 | `POST /v1/auth/token` | 200 | 10 | `qa-cc62b633-3c40-4f35-a893-1a6744580fca` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-bc7249fb-7429-4680-8806-5d92f16fa88a` |
| 5 | `POST /v1/credits/purchases` | 422 | 8 | `qa-150ea012-7f44-4025-b340-d3b5b2a4afe7` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-1cbac31c-b9fd-4c36-8fca-7a80942ac17e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-cba1e841-07f2-4cd2-8852-4a88ce8a0337` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-7768e40d-3fb7-47e2-acc6-7fc077845782` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-b5137b45-5d32-4447-ab6f-62a845b8d471` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-0f34194b-979f-432f-b8e2-4b96f0ff5435` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2654e102-415a-426e-bf15-5937b48d5782

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2654e102-415a-426e-bf15-5937b48d5782
Content-Type: application/json

--- request body ---
{"handle":"qa-4168ec1388e0","displayName":"QA 4168ec1388e0","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-2654e102-415a-426e-bf15-5937b48d5782
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
Location: /v1/accounts/qa-4168ec1388e0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_63559f2e-be81-4bbc-8dc8-3775be56206b","handle":"qa-4168ec1388e0","displayName":"QA 4168ec1388e0","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.880720839Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e07d97fb-1f30-43ee-839d-05e0f49f7133

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e07d97fb-1f30-43ee-839d-05e0f49f7133
Content-Type: application/json

--- request body ---
{"handle":"qa-d72590ab9e92","displayName":"QA d72590ab9e92","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-e07d97fb-1f30-43ee-839d-05e0f49f7133
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 7
Location: /v1/accounts/qa-d72590ab9e92
X-Served-Region: eu
Content-Length: 181

{"id":"acc_61992a7f-e30a-4a21-ae1a-5a30b21b852e","handle":"qa-d72590ab9e92","displayName":"QA d72590ab9e92","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.902372386Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cc62b633-3c40-4f35-a893-1a6744580fca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc62b633-3c40-4f35-a893-1a6744580fca
Content-Type: application/json

--- request body ---
{"handle":"qa-4168ec1388e0","password":"****"}

--- response: 200 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc62b633-3c40-4f35-a893-1a6744580fca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_63559f2e-be81-4bbc-8dc8-3775be56206b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bc7249fb-7429-4680-8806-5d92f16fa88a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc7249fb-7429-4680-8806-5d92f16fa88a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d72590ab9e92","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc7249fb-7429-4680-8806-5d92f16fa88a
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
Location: /v1/conversations/cnv_5a2c9e17-af71-4728-999b-c9186814951d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5a2c9e17-af71-4728-999b-c9186814951d","subject":"Error contract","status":"open","region":"eu","participants":["qa-4168ec1388e0","qa-d72590ab9e92"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:15.935682598Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-150ea012-7f44-4025-b340-d3b5b2a4afe7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-88987308c52d44728e7d2a97f8a53ffc
X-Correlation-Id: qa-150ea012-7f44-4025-b340-d3b5b2a4afe7
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-150ea012-7f44-4025-b340-d3b5b2a4afe7
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-150ea012-7f44-4025-b340-d3b5b2a4afe7","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1cbac31c-b9fd-4c36-8fca-7a80942ac17e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cbac31c-b9fd-4c36-8fca-7a80942ac17e
Content-Type: application/json

--- request body ---
{"handle":"qa-d72590ab9e92","password":"****"}

--- response: 200 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cbac31c-b9fd-4c36-8fca-7a80942ac17e
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_61992a7f-e30a-4a21-ae1a-5a30b21b852e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cba1e841-07f2-4cd2-8852-4a88ce8a0337

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cba1e841-07f2-4cd2-8852-4a88ce8a0337
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cba1e841-07f2-4cd2-8852-4a88ce8a0337
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
correlation: qa-7768e40d-3fb7-47e2-acc6-7fc077845782

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7768e40d-3fb7-47e2-acc6-7fc077845782
Content-Type: application/json

--- request body ---
{"handle":"qa-d72590ab9e92","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7768e40d-3fb7-47e2-acc6-7fc077845782
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7768e40d-3fb7-47e2-acc6-7fc077845782"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b5137b45-5d32-4447-ab6f-62a845b8d471

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5137b45-5d32-4447-ab6f-62a845b8d471
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b5137b45-5d32-4447-ab6f-62a845b8d471
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
correlation: qa-0f34194b-979f-432f-b8e2-4b96f0ff5435

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f34194b-979f-432f-b8e2-4b96f0ff5435
Content-Type: application/json

--- request body ---
{"handle":"qa-4168ec1388e0","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f34194b-979f-432f-b8e2-4b96f0ff5435
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0f34194b-979f-432f-b8e2-4b96f0ff5435"}
```
