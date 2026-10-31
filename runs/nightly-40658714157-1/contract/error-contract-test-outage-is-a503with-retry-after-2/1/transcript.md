# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-c58c5c2d-263a-4024-952d-8765263d73ab` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-bb1772cf-1aae-4e41-bb0d-5d3687a08355` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-dc9856f3-aa1b-4007-ace3-277bb3d8fb6b` |
| 4 | `POST /v1/conversations` | 201 | 4 | `qa-e7bd0e64-f461-41e1-9805-ccb6ed87f2d9` |
| 5 | `GET /v1/accounts/me` | 503 | 3 | `qa-369f0c24-9858-41f8-b649-6923e0a95031` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-45228f68-d1e8-499f-b5e5-5e117520cf76` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-61b0f649-f5e1-414e-8b55-a4f5d9fc4e77` |
| 8 | `POST /v1/auth/token` | 401 | 29 | `qa-0c1e1538-c272-46e8-bbd5-36d6b3f872b2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-9e51c77a-f7e9-460e-9ff3-48071f16c996` |
| 10 | `POST /v1/auth/token` | 401 | 29 | `qa-c49d9207-14f9-4243-ab41-0b7b23231fb0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c58c5c2d-263a-4024-952d-8765263d73ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c58c5c2d-263a-4024-952d-8765263d73ab
Content-Type: application/json

--- request body ---
{"handle":"qa-f418fa144b82","displayName":"QA f418fa144b82","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-c58c5c2d-263a-4024-952d-8765263d73ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Location: /v1/accounts/qa-f418fa144b82
X-Served-Region: eu
Content-Length: 181

{"id":"acc_481f6837-a5db-44be-b4b6-93dfc9e7b351","handle":"qa-f418fa144b82","displayName":"QA f418fa144b82","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.366411951Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bb1772cf-1aae-4e41-bb0d-5d3687a08355

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb1772cf-1aae-4e41-bb0d-5d3687a08355
Content-Type: application/json

--- request body ---
{"handle":"qa-1404bbc59dd4","displayName":"QA 1404bbc59dd4","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb1772cf-1aae-4e41-bb0d-5d3687a08355
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Location: /v1/accounts/qa-1404bbc59dd4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ceb1567d-fb90-4ca6-bdf2-29b9049183d1","handle":"qa-1404bbc59dd4","displayName":"QA 1404bbc59dd4","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.395005316Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dc9856f3-aa1b-4007-ace3-277bb3d8fb6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc9856f3-aa1b-4007-ace3-277bb3d8fb6b
Content-Type: application/json

--- request body ---
{"handle":"qa-f418fa144b82","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc9856f3-aa1b-4007-ace3-277bb3d8fb6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_481f6837-a5db-44be-b4b6-93dfc9e7b351"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e7bd0e64-f461-41e1-9805-ccb6ed87f2d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7bd0e64-f461-41e1-9805-ccb6ed87f2d9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1404bbc59dd4","subject":"Error contract","message":"Hi"}

--- response: 201 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7bd0e64-f461-41e1-9805-ccb6ed87f2d9
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
Location: /v1/conversations/cnv_4615d458-7d90-4e29-a377-dd39cbd51cb6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4615d458-7d90-4e29-a377-dd39cbd51cb6","subject":"Error contract","status":"open","region":"eu","participants":["qa-f418fa144b82","qa-1404bbc59dd4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:51.475321483Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-369f0c24-9858-41f8-b649-6923e0a95031

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: a2742007-499e-4194-8409-84f2753d3385
X-Correlation-Id: qa-369f0c24-9858-41f8-b649-6923e0a95031
Content-Type: application/json

--- response: 503 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-369f0c24-9858-41f8-b649-6923e0a95031
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-369f0c24-9858-41f8-b649-6923e0a95031"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-45228f68-d1e8-499f-b5e5-5e117520cf76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45228f68-d1e8-499f-b5e5-5e117520cf76
Content-Type: application/json

--- request body ---
{"handle":"qa-1404bbc59dd4","password":"****"}

--- response: 200 in 37 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-45228f68-d1e8-499f-b5e5-5e117520cf76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ceb1567d-fb90-4ca6-bdf2-29b9049183d1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-61b0f649-f5e1-414e-8b55-a4f5d9fc4e77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61b0f649-f5e1-414e-8b55-a4f5d9fc4e77
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-61b0f649-f5e1-414e-8b55-a4f5d9fc4e77
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
correlation: qa-0c1e1538-c272-46e8-bbd5-36d6b3f872b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c1e1538-c272-46e8-bbd5-36d6b3f872b2
Content-Type: application/json

--- request body ---
{"handle":"qa-1404bbc59dd4","password":"****"}

--- response: 401 in 29 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c1e1538-c272-46e8-bbd5-36d6b3f872b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0c1e1538-c272-46e8-bbd5-36d6b3f872b2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9e51c77a-f7e9-460e-9ff3-48071f16c996

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e51c77a-f7e9-460e-9ff3-48071f16c996
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9e51c77a-f7e9-460e-9ff3-48071f16c996
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-c49d9207-14f9-4243-ab41-0b7b23231fb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c49d9207-14f9-4243-ab41-0b7b23231fb0
Content-Type: application/json

--- request body ---
{"handle":"qa-f418fa144b82","password":"****"}

--- response: 401 in 29 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c49d9207-14f9-4243-ab41-0b7b23231fb0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c49d9207-14f9-4243-ab41-0b7b23231fb0"}
```
