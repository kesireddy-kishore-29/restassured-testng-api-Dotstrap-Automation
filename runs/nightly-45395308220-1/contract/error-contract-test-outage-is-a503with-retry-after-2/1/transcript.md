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
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-82ee0e0a-db48-4d11-abca-abafb1228c82` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-a1964421-b5f0-438c-a8bc-e898fea06b50` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-8ad42335-367a-4f84-8ea7-7b7815d59b3c` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-78064164-6347-4feb-96ec-daf4c5d78b67` |
| 5 | `GET /v1/accounts/me` | 503 | 13 | `qa-b2209711-c826-497e-8735-c48aaa503b86` |
| 6 | `POST /v1/auth/token` | 200 | 52 | `qa-a3db479e-48a8-451f-acd7-296b426b8dbb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-1375e353-734b-487b-864b-fb78da6fb70a` |
| 8 | `POST /v1/auth/token` | 401 | 33 | `qa-63a1d92b-b934-41ed-9433-d84fa8461a0f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-75654a11-e03c-496b-8a29-ac8e729421ff` |
| 10 | `POST /v1/auth/token` | 401 | 29 | `qa-bac6f16b-a4be-4ee4-9bb4-023242ac865d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-82ee0e0a-db48-4d11-abca-abafb1228c82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82ee0e0a-db48-4d11-abca-abafb1228c82
Content-Type: application/json

--- request body ---
{"handle":"qa-9d82bf6a78c8","displayName":"QA 9d82bf6a78c8","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-82ee0e0a-db48-4d11-abca-abafb1228c82
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Location: /v1/accounts/qa-9d82bf6a78c8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3d86a3a1-0029-4059-bca7-749b5df86946","handle":"qa-9d82bf6a78c8","displayName":"QA 9d82bf6a78c8","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.161160345Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a1964421-b5f0-438c-a8bc-e898fea06b50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1964421-b5f0-438c-a8bc-e898fea06b50
Content-Type: application/json

--- request body ---
{"handle":"qa-bbdb538cbc54","displayName":"QA bbdb538cbc54","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1964421-b5f0-438c-a8bc-e898fea06b50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Location: /v1/accounts/qa-bbdb538cbc54
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2fcc39b8-aa11-4a39-bf30-3409454809e5","handle":"qa-bbdb538cbc54","displayName":"QA bbdb538cbc54","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.215555831Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8ad42335-367a-4f84-8ea7-7b7815d59b3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ad42335-367a-4f84-8ea7-7b7815d59b3c
Content-Type: application/json

--- request body ---
{"handle":"qa-9d82bf6a78c8","password":"****"}

--- response: 200 in 29 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ad42335-367a-4f84-8ea7-7b7815d59b3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3d86a3a1-0029-4059-bca7-749b5df86946"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-78064164-6347-4feb-96ec-daf4c5d78b67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78064164-6347-4feb-96ec-daf4c5d78b67
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bbdb538cbc54","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-78064164-6347-4feb-96ec-daf4c5d78b67
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
Location: /v1/conversations/cnv_8c604954-a44f-4b60-941d-3119eb4970fd
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8c604954-a44f-4b60-941d-3119eb4970fd","subject":"Error contract","status":"open","region":"eu","participants":["qa-9d82bf6a78c8","qa-bbdb538cbc54"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:13.294398653Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2209711-c826-497e-8735-c48aaa503b86

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 1015f618-c905-4f07-b11a-5015263c64bc
X-Correlation-Id: qa-b2209711-c826-497e-8735-c48aaa503b86
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b2209711-c826-497e-8735-c48aaa503b86
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-b2209711-c826-497e-8735-c48aaa503b86"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a3db479e-48a8-451f-acd7-296b426b8dbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3db479e-48a8-451f-acd7-296b426b8dbb
Content-Type: application/json

--- request body ---
{"handle":"qa-bbdb538cbc54","password":"****"}

--- response: 200 in 52 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3db479e-48a8-451f-acd7-296b426b8dbb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2fcc39b8-aa11-4a39-bf30-3409454809e5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1375e353-734b-487b-864b-fb78da6fb70a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1375e353-734b-487b-864b-fb78da6fb70a
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1375e353-734b-487b-864b-fb78da6fb70a
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
correlation: qa-63a1d92b-b934-41ed-9433-d84fa8461a0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63a1d92b-b934-41ed-9433-d84fa8461a0f
Content-Type: application/json

--- request body ---
{"handle":"qa-bbdb538cbc54","password":"****"}

--- response: 401 in 33 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63a1d92b-b934-41ed-9433-d84fa8461a0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-63a1d92b-b934-41ed-9433-d84fa8461a0f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-75654a11-e03c-496b-8a29-ac8e729421ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75654a11-e03c-496b-8a29-ac8e729421ff
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-75654a11-e03c-496b-8a29-ac8e729421ff
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
correlation: qa-bac6f16b-a4be-4ee4-9bb4-023242ac865d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bac6f16b-a4be-4ee4-9bb4-023242ac865d
Content-Type: application/json

--- request body ---
{"handle":"qa-9d82bf6a78c8","password":"****"}

--- response: 401 in 29 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bac6f16b-a4be-4ee4-9bb4-023242ac865d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bac6f16b-a4be-4ee4-9bb4-023242ac865d"}
```
