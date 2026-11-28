# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 76 | `qa-9c716714-9e0e-41fe-a3e0-879bad5d5726` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-5b7f5f72-15f7-4426-bfc8-3bb3ac2957d8` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-d2e56cd8-fdc9-4109-906e-3f8642bbe0b4` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-043efc90-3138-4f52-a449-2860adbe424e` |
| 5 | `POST /v1/auth/token` | 422 | 56 | `qa-4d4ff88c-5b20-4637-81ed-726e53d8ff4b` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-80188b4d-0ada-4e4a-8204-5e291f12ce31` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-521fd201-4d5b-4e9d-8484-6ad602c5a147` |
| 8 | `POST /v1/auth/token` | 401 | 36 | `qa-97137e1b-223a-42b3-8876-ffefe9d14cd5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-115e80c2-cd54-401d-a88c-c17921f5bbdd` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-689a051a-d5b1-4be9-8f3d-d73328cad4a6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9c716714-9e0e-41fe-a3e0-879bad5d5726

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c716714-9e0e-41fe-a3e0-879bad5d5726
Content-Type: application/json

--- request body ---
{"handle":"qa-9127a4f080b5","displayName":"QA 9127a4f080b5","password":"****","region":"eu"}

--- response: 201 in 76 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c716714-9e0e-41fe-a3e0-879bad5d5726
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 9
Location: /v1/accounts/qa-9127a4f080b5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_30d5d37e-ca9f-49d0-a15f-90a96b861ad1","handle":"qa-9127a4f080b5","displayName":"QA 9127a4f080b5","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.668717009Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5b7f5f72-15f7-4426-bfc8-3bb3ac2957d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b7f5f72-15f7-4426-bfc8-3bb3ac2957d8
Content-Type: application/json

--- request body ---
{"handle":"qa-8503ff8936d0","displayName":"QA 8503ff8936d0","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b7f5f72-15f7-4426-bfc8-3bb3ac2957d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 9
Location: /v1/accounts/qa-8503ff8936d0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a7d3f806-9490-45c8-be6a-66c23816e60f","handle":"qa-8503ff8936d0","displayName":"QA 8503ff8936d0","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.732181301Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d2e56cd8-fdc9-4109-906e-3f8642bbe0b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2e56cd8-fdc9-4109-906e-3f8642bbe0b4
Content-Type: application/json

--- request body ---
{"handle":"qa-9127a4f080b5","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2e56cd8-fdc9-4109-906e-3f8642bbe0b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30d5d37e-ca9f-49d0-a15f-90a96b861ad1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-043efc90-3138-4f52-a449-2860adbe424e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-043efc90-3138-4f52-a449-2860adbe424e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8503ff8936d0","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-043efc90-3138-4f52-a449-2860adbe424e
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
Location: /v1/conversations/cnv_72e9f001-f490-43b2-8dae-ab44521ef97d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_72e9f001-f490-43b2-8dae-ab44521ef97d","subject":"Error contract","status":"open","region":"eu","participants":["qa-9127a4f080b5","qa-8503ff8936d0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:22.850147660Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-4d4ff88c-5b20-4637-81ed-726e53d8ff4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d4ff88c-5b20-4637-81ed-726e53d8ff4b
Content-Type: application/json

--- request body ---
{"handle":"qa-9127a4f080b5","password":"****","ttlSeconds":0}

--- response: 422 in 56 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d4ff88c-5b20-4637-81ed-726e53d8ff4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-4d4ff88c-5b20-4637-81ed-726e53d8ff4b","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-80188b4d-0ada-4e4a-8204-5e291f12ce31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80188b4d-0ada-4e4a-8204-5e291f12ce31
Content-Type: application/json

--- request body ---
{"handle":"qa-8503ff8936d0","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-80188b4d-0ada-4e4a-8204-5e291f12ce31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7d3f806-9490-45c8-be6a-66c23816e60f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-521fd201-4d5b-4e9d-8484-6ad602c5a147

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-521fd201-4d5b-4e9d-8484-6ad602c5a147
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-521fd201-4d5b-4e9d-8484-6ad602c5a147
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
correlation: qa-97137e1b-223a-42b3-8876-ffefe9d14cd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97137e1b-223a-42b3-8876-ffefe9d14cd5
Content-Type: application/json

--- request body ---
{"handle":"qa-8503ff8936d0","password":"****"}

--- response: 401 in 36 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-97137e1b-223a-42b3-8876-ffefe9d14cd5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-97137e1b-223a-42b3-8876-ffefe9d14cd5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-115e80c2-cd54-401d-a88c-c17921f5bbdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-115e80c2-cd54-401d-a88c-c17921f5bbdd
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-115e80c2-cd54-401d-a88c-c17921f5bbdd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-689a051a-d5b1-4be9-8f3d-d73328cad4a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-689a051a-d5b1-4be9-8f3d-d73328cad4a6
Content-Type: application/json

--- request body ---
{"handle":"qa-9127a4f080b5","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-689a051a-d5b1-4be9-8f3d-d73328cad4a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-689a051a-d5b1-4be9-8f3d-d73328cad4a6"}
```
