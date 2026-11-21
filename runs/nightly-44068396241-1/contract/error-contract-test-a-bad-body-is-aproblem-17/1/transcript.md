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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-3077b911-8bbb-4f37-bb88-c9e68b1c1d30` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-542f42ef-9067-4d48-a055-8ee4f556e719` |
| 3 | `POST /v1/auth/token` | 200 | 8 | `qa-f0f8c9eb-db61-4714-9cfc-8338c1bc8390` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-f5ce28f0-76c7-4817-aaf0-43e83f17f9f6` |
| 5 | `POST /v1/credits/purchases` | 422 | 2 | `qa-7f46c584-ec39-4c30-9b15-4e678d3b9c60` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-c40c36b0-af40-427a-8a03-1fc73d17c916` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-e876114a-db52-4aa8-bc0a-bc63ec0ead7f` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-a84ef483-b42f-417a-90f8-fe63ad89e879` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-7cf3e94b-377d-4581-bca7-c9ee52f40eb4` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-b18d6b28-ceb1-43b6-a37a-165d2654e335` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3077b911-8bbb-4f37-bb88-c9e68b1c1d30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3077b911-8bbb-4f37-bb88-c9e68b1c1d30
Content-Type: application/json

--- request body ---
{"handle":"qa-b0979126206b","displayName":"QA b0979126206b","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-3077b911-8bbb-4f37-bb88-c9e68b1c1d30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 7
Location: /v1/accounts/qa-b0979126206b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_780f4d74-9f1a-4b38-a12d-a09693b2cb09","handle":"qa-b0979126206b","displayName":"QA b0979126206b","region":"eu","role":"user","createdAt":"2026-11-17T10:50:20.057780303Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-542f42ef-9067-4d48-a055-8ee4f556e719

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-542f42ef-9067-4d48-a055-8ee4f556e719
Content-Type: application/json

--- request body ---
{"handle":"qa-a197ea3cef4f","displayName":"QA a197ea3cef4f","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-542f42ef-9067-4d48-a055-8ee4f556e719
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
Location: /v1/accounts/qa-a197ea3cef4f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d65b78e6-5417-428f-b1c9-620b0201c33d","handle":"qa-a197ea3cef4f","displayName":"QA a197ea3cef4f","region":"eu","role":"user","createdAt":"2026-11-17T10:50:20.081852730Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f0f8c9eb-db61-4714-9cfc-8338c1bc8390

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0f8c9eb-db61-4714-9cfc-8338c1bc8390
Content-Type: application/json

--- request body ---
{"handle":"qa-b0979126206b","password":"****"}

--- response: 200 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0f8c9eb-db61-4714-9cfc-8338c1bc8390
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_780f4d74-9f1a-4b38-a12d-a09693b2cb09"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f5ce28f0-76c7-4817-aaf0-43e83f17f9f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5ce28f0-76c7-4817-aaf0-43e83f17f9f6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a197ea3cef4f","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5ce28f0-76c7-4817-aaf0-43e83f17f9f6
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
Location: /v1/conversations/cnv_cf4fd6e5-972c-4bd0-be20-dbd9ad5fdbc3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cf4fd6e5-972c-4bd0-be20-dbd9ad5fdbc3","subject":"Error contract","status":"open","region":"eu","participants":["qa-b0979126206b","qa-a197ea3cef4f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:20.115449399Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7f46c584-ec39-4c30-9b15-4e678d3b9c60

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e4ea074ddda2433db92aaff5f9d847eb
X-Correlation-Id: qa-7f46c584-ec39-4c30-9b15-4e678d3b9c60
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 2 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f46c584-ec39-4c30-9b15-4e678d3b9c60
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-7f46c584-ec39-4c30-9b15-4e678d3b9c60","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c40c36b0-af40-427a-8a03-1fc73d17c916

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c40c36b0-af40-427a-8a03-1fc73d17c916
Content-Type: application/json

--- request body ---
{"handle":"qa-a197ea3cef4f","password":"****"}

--- response: 200 in 13 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-c40c36b0-af40-427a-8a03-1fc73d17c916
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d65b78e6-5417-428f-b1c9-620b0201c33d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e876114a-db52-4aa8-bc0a-bc63ec0ead7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e876114a-db52-4aa8-bc0a-bc63ec0ead7f
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e876114a-db52-4aa8-bc0a-bc63ec0ead7f
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
correlation: qa-a84ef483-b42f-417a-90f8-fe63ad89e879

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a84ef483-b42f-417a-90f8-fe63ad89e879
Content-Type: application/json

--- request body ---
{"handle":"qa-a197ea3cef4f","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a84ef483-b42f-417a-90f8-fe63ad89e879
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a84ef483-b42f-417a-90f8-fe63ad89e879"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7cf3e94b-377d-4581-bca7-c9ee52f40eb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cf3e94b-377d-4581-bca7-c9ee52f40eb4
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7cf3e94b-377d-4581-bca7-c9ee52f40eb4
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
correlation: qa-b18d6b28-ceb1-43b6-a37a-165d2654e335

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b18d6b28-ceb1-43b6-a37a-165d2654e335
Content-Type: application/json

--- request body ---
{"handle":"qa-b0979126206b","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b18d6b28-ceb1-43b6-a37a-165d2654e335
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b18d6b28-ceb1-43b6-a37a-165d2654e335"}
```
