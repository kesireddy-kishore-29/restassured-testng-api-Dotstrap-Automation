# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-56706315-9b0e-459c-918d-ed8b3cde7ddc` |
| 2 | `POST /v1/accounts` | 201 | 48 | `qa-a1e58738-545c-4cc5-aa60-4405be9ab6cd` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-521ba808-214a-4a35-8fbf-bb2b143a2ac6` |
| 4 | `POST /v1/conversations` | 201 | 30 | `qa-986a3fc4-8e9a-401d-a6a4-87b6b0591185` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 17 | `qa-f5112788-da0e-40d4-985a-b9a222bfe524` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-79d44b78-29a5-4be0-b305-adeb5884d375` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-6be7a47e-0ca9-4d1d-9df0-d07fe76b80f1` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-7d72ad5d-3ec3-4f2c-a4ad-427b5d89e2ba` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-35fb59bd-36d1-47b9-9fc3-8aa2c4d7a487` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-9d1174a0-c812-450b-8f5b-b61a9e2355a8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-56706315-9b0e-459c-918d-ed8b3cde7ddc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56706315-9b0e-459c-918d-ed8b3cde7ddc
Content-Type: application/json

--- request body ---
{"handle":"qa-eaf0da9decdc","displayName":"QA eaf0da9decdc","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-56706315-9b0e-459c-918d-ed8b3cde7ddc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 6
Location: /v1/accounts/qa-eaf0da9decdc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_66fa6537-d72c-4106-bd45-bad8b72d792b","handle":"qa-eaf0da9decdc","displayName":"QA eaf0da9decdc","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.098622557Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a1e58738-545c-4cc5-aa60-4405be9ab6cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1e58738-545c-4cc5-aa60-4405be9ab6cd
Content-Type: application/json

--- request body ---
{"handle":"qa-76f33ca2045e","displayName":"QA 76f33ca2045e","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1e58738-545c-4cc5-aa60-4405be9ab6cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 6
Location: /v1/accounts/qa-76f33ca2045e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c74d5b94-e341-466b-bffb-ecf22936458d","handle":"qa-76f33ca2045e","displayName":"QA 76f33ca2045e","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.157106915Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-521ba808-214a-4a35-8fbf-bb2b143a2ac6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-521ba808-214a-4a35-8fbf-bb2b143a2ac6
Content-Type: application/json

--- request body ---
{"handle":"qa-eaf0da9decdc","password":"****"}

--- response: 200 in 45 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-521ba808-214a-4a35-8fbf-bb2b143a2ac6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_66fa6537-d72c-4106-bd45-bad8b72d792b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-986a3fc4-8e9a-401d-a6a4-87b6b0591185

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-986a3fc4-8e9a-401d-a6a4-87b6b0591185
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-76f33ca2045e","subject":"Error contract","message":"Hi"}

--- response: 201 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-986a3fc4-8e9a-401d-a6a4-87b6b0591185
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
Location: /v1/conversations/cnv_436959ba-87d9-40b9-a15a-b18a55609641
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_436959ba-87d9-40b9-a15a-b18a55609641","subject":"Error contract","status":"open","region":"eu","participants":["qa-eaf0da9decdc","qa-76f33ca2045e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:34.271058974Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_436959ba-87d9-40b9-a15a-b18a55609641/close
correlation: qa-f5112788-da0e-40d4-985a-b9a222bfe524

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: a43a247e-b146-4bf6-bdad-220cec3e74ae
X-Correlation-Id: qa-f5112788-da0e-40d4-985a-b9a222bfe524
Content-Type: application/json

--- response: 503 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f5112788-da0e-40d4-985a-b9a222bfe524
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_436959ba-87d9-40b9-a15a-b18a55609641/close","correlationId":"qa-f5112788-da0e-40d4-985a-b9a222bfe524"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-79d44b78-29a5-4be0-b305-adeb5884d375

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79d44b78-29a5-4be0-b305-adeb5884d375
Content-Type: application/json

--- request body ---
{"handle":"qa-76f33ca2045e","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-79d44b78-29a5-4be0-b305-adeb5884d375
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c74d5b94-e341-466b-bffb-ecf22936458d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6be7a47e-0ca9-4d1d-9df0-d07fe76b80f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6be7a47e-0ca9-4d1d-9df0-d07fe76b80f1
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6be7a47e-0ca9-4d1d-9df0-d07fe76b80f1
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
correlation: qa-7d72ad5d-3ec3-4f2c-a4ad-427b5d89e2ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d72ad5d-3ec3-4f2c-a4ad-427b5d89e2ba
Content-Type: application/json

--- request body ---
{"handle":"qa-76f33ca2045e","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7d72ad5d-3ec3-4f2c-a4ad-427b5d89e2ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7d72ad5d-3ec3-4f2c-a4ad-427b5d89e2ba"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-35fb59bd-36d1-47b9-9fc3-8aa2c4d7a487

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35fb59bd-36d1-47b9-9fc3-8aa2c4d7a487
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-35fb59bd-36d1-47b9-9fc3-8aa2c4d7a487
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
correlation: qa-9d1174a0-c812-450b-8f5b-b61a9e2355a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d1174a0-c812-450b-8f5b-b61a9e2355a8
Content-Type: application/json

--- request body ---
{"handle":"qa-eaf0da9decdc","password":"****"}

--- response: 401 in 25 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d1174a0-c812-450b-8f5b-b61a9e2355a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9d1174a0-c812-450b-8f5b-b61a9e2355a8"}
```
