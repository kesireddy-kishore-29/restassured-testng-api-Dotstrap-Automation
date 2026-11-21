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
| 1 | `POST /v1/accounts` | 201 | 51 | `qa-c94f1ce0-e726-4cde-8486-f2a1e135d3f4` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-493093a7-9e9d-4301-b624-bbfb082bc6b4` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-e9ae6eb7-1d9e-4ca4-beaa-680142269ae9` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-d8ac4396-0db7-4e9f-a637-eb1fcd6f1756` |
| 5 | `POST /v1/credits/purchases` | 400 | 21 | `qa-e64f6a3e-1f33-4d87-8bfc-3509a43227b9` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-49676662-931d-4148-9c3a-fa967646cbfc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-026214f6-1cf7-408e-bd93-9ad701da4573` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-4eabf9bf-6034-4395-9202-de8ad73d32e6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-2d38d3fe-c2af-4054-a7fb-1e2d966d7637` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-a39ce55f-3283-4cd0-a4ef-c4fdf71adabd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c94f1ce0-e726-4cde-8486-f2a1e135d3f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c94f1ce0-e726-4cde-8486-f2a1e135d3f4
Content-Type: application/json

--- request body ---
{"handle":"qa-b08e2381fd2d","displayName":"QA b08e2381fd2d","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-c94f1ce0-e726-4cde-8486-f2a1e135d3f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 7
Location: /v1/accounts/qa-b08e2381fd2d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_db54b7aa-c7eb-4ed0-a9ce-66391cfd3f58","handle":"qa-b08e2381fd2d","displayName":"QA b08e2381fd2d","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.435453800Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-493093a7-9e9d-4301-b624-bbfb082bc6b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-493093a7-9e9d-4301-b624-bbfb082bc6b4
Content-Type: application/json

--- request body ---
{"handle":"qa-50cf5a2a7fdb","displayName":"QA 50cf5a2a7fdb","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-493093a7-9e9d-4301-b624-bbfb082bc6b4
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
Location: /v1/accounts/qa-50cf5a2a7fdb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9f988431-6747-47e9-870f-e78a9e6e6681","handle":"qa-50cf5a2a7fdb","displayName":"QA 50cf5a2a7fdb","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.497899861Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e9ae6eb7-1d9e-4ca4-beaa-680142269ae9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9ae6eb7-1d9e-4ca4-beaa-680142269ae9
Content-Type: application/json

--- request body ---
{"handle":"qa-b08e2381fd2d","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9ae6eb7-1d9e-4ca4-beaa-680142269ae9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_db54b7aa-c7eb-4ed0-a9ce-66391cfd3f58"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d8ac4396-0db7-4e9f-a637-eb1fcd6f1756

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8ac4396-0db7-4e9f-a637-eb1fcd6f1756
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-50cf5a2a7fdb","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8ac4396-0db7-4e9f-a637-eb1fcd6f1756
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
Location: /v1/conversations/cnv_54736acf-cf71-41a3-88fe-e80a495df565
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_54736acf-cf71-41a3-88fe-e80a495df565","subject":"Error contract","status":"open","region":"eu","participants":["qa-b08e2381fd2d","qa-50cf5a2a7fdb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:10.557258867Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e64f6a3e-1f33-4d87-8bfc-3509a43227b9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cd54654733c340109bfa69d9ba2e4756
X-Correlation-Id: qa-e64f6a3e-1f33-4d87-8bfc-3509a43227b9
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e64f6a3e-1f33-4d87-8bfc-3509a43227b9
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-e64f6a3e-1f33-4d87-8bfc-3509a43227b9"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-49676662-931d-4148-9c3a-fa967646cbfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49676662-931d-4148-9c3a-fa967646cbfc
Content-Type: application/json

--- request body ---
{"handle":"qa-50cf5a2a7fdb","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-49676662-931d-4148-9c3a-fa967646cbfc
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9f988431-6747-47e9-870f-e78a9e6e6681"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-026214f6-1cf7-408e-bd93-9ad701da4573

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-026214f6-1cf7-408e-bd93-9ad701da4573
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-026214f6-1cf7-408e-bd93-9ad701da4573
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
correlation: qa-4eabf9bf-6034-4395-9202-de8ad73d32e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4eabf9bf-6034-4395-9202-de8ad73d32e6
Content-Type: application/json

--- request body ---
{"handle":"qa-50cf5a2a7fdb","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4eabf9bf-6034-4395-9202-de8ad73d32e6
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4eabf9bf-6034-4395-9202-de8ad73d32e6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2d38d3fe-c2af-4054-a7fb-1e2d966d7637

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d38d3fe-c2af-4054-a7fb-1e2d966d7637
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2d38d3fe-c2af-4054-a7fb-1e2d966d7637
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
correlation: qa-a39ce55f-3283-4cd0-a4ef-c4fdf71adabd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a39ce55f-3283-4cd0-a4ef-c4fdf71adabd
Content-Type: application/json

--- request body ---
{"handle":"qa-b08e2381fd2d","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a39ce55f-3283-4cd0-a4ef-c4fdf71adabd
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a39ce55f-3283-4cd0-a4ef-c4fdf71adabd"}
```
