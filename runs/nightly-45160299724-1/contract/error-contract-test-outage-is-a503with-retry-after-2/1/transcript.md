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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-3473c6fe-746d-4a44-aed9-b5998b8e597f` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-14297215-ecd8-48a8-9bd5-149f621d896f` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-49be89f6-27b5-47b4-a7b6-cd35980b0bb1` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-c159a3eb-38b1-49fe-bb27-572dc115a779` |
| 5 | `GET /v1/accounts/me` | 503 | 23 | `qa-3c433770-8fbb-4139-b4d5-93efa5579897` |
| 6 | `POST /v1/auth/token` | 200 | 64 | `qa-64b7ce7f-dbbe-4855-ab76-31294159b58d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 54 | `qa-7fa39b23-4552-4c22-a8ff-302bb0bf9c8c` |
| 8 | `POST /v1/auth/token` | 401 | 29 | `qa-f4e08f09-e137-4246-b591-f1c2d39731b9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-c2236c63-092f-4ee5-b634-19ba6b2661c2` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-c9d7f4ae-aab1-431a-ab71-1aada600a78f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3473c6fe-746d-4a44-aed9-b5998b8e597f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3473c6fe-746d-4a44-aed9-b5998b8e597f
Content-Type: application/json

--- request body ---
{"handle":"qa-ed504452bd96","displayName":"QA ed504452bd96","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-3473c6fe-746d-4a44-aed9-b5998b8e597f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Location: /v1/accounts/qa-ed504452bd96
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d5d22702-cfee-4830-bfb1-07a1dbe667c0","handle":"qa-ed504452bd96","displayName":"QA ed504452bd96","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.623295247Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-14297215-ecd8-48a8-9bd5-149f621d896f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14297215-ecd8-48a8-9bd5-149f621d896f
Content-Type: application/json

--- request body ---
{"handle":"qa-53c29a45acf5","displayName":"QA 53c29a45acf5","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-14297215-ecd8-48a8-9bd5-149f621d896f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Location: /v1/accounts/qa-53c29a45acf5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_00b5ce5e-2eb3-4221-b0db-206ac1ec913f","handle":"qa-53c29a45acf5","displayName":"QA 53c29a45acf5","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.672031900Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-49be89f6-27b5-47b4-a7b6-cd35980b0bb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49be89f6-27b5-47b4-a7b6-cd35980b0bb1
Content-Type: application/json

--- request body ---
{"handle":"qa-ed504452bd96","password":"****"}

--- response: 200 in 39 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-49be89f6-27b5-47b4-a7b6-cd35980b0bb1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d5d22702-cfee-4830-bfb1-07a1dbe667c0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c159a3eb-38b1-49fe-bb27-572dc115a779

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c159a3eb-38b1-49fe-bb27-572dc115a779
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-53c29a45acf5","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-c159a3eb-38b1-49fe-bb27-572dc115a779
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
Location: /v1/conversations/cnv_3a70de43-e91f-4b8b-8c9e-dfa92c92f5b6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3a70de43-e91f-4b8b-8c9e-dfa92c92f5b6","subject":"Error contract","status":"open","region":"eu","participants":["qa-ed504452bd96","qa-53c29a45acf5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:57.770547843Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-3c433770-8fbb-4139-b4d5-93efa5579897

--- request headers ---
Accept: application/json
X-Fault-Key: 900aa158-3b7c-434e-858c-b5506bc975bb
X-Fault: unavailable-once
X-Correlation-Id: qa-3c433770-8fbb-4139-b4d5-93efa5579897
Content-Type: application/json

--- response: 503 in 23 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3c433770-8fbb-4139-b4d5-93efa5579897
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-3c433770-8fbb-4139-b4d5-93efa5579897"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-64b7ce7f-dbbe-4855-ab76-31294159b58d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64b7ce7f-dbbe-4855-ab76-31294159b58d
Content-Type: application/json

--- request body ---
{"handle":"qa-53c29a45acf5","password":"****"}

--- response: 200 in 64 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-64b7ce7f-dbbe-4855-ab76-31294159b58d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_00b5ce5e-2eb3-4221-b0db-206ac1ec913f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7fa39b23-4552-4c22-a8ff-302bb0bf9c8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fa39b23-4552-4c22-a8ff-302bb0bf9c8c
Content-Type: application/json

--- response: 204 in 54 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7fa39b23-4552-4c22-a8ff-302bb0bf9c8c
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
correlation: qa-f4e08f09-e137-4246-b591-f1c2d39731b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4e08f09-e137-4246-b591-f1c2d39731b9
Content-Type: application/json

--- request body ---
{"handle":"qa-53c29a45acf5","password":"****"}

--- response: 401 in 29 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4e08f09-e137-4246-b591-f1c2d39731b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f4e08f09-e137-4246-b591-f1c2d39731b9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c2236c63-092f-4ee5-b634-19ba6b2661c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2236c63-092f-4ee5-b634-19ba6b2661c2
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c2236c63-092f-4ee5-b634-19ba6b2661c2
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
correlation: qa-c9d7f4ae-aab1-431a-ab71-1aada600a78f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9d7f4ae-aab1-431a-ab71-1aada600a78f
Content-Type: application/json

--- request body ---
{"handle":"qa-ed504452bd96","password":"****"}

--- response: 401 in 27 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c9d7f4ae-aab1-431a-ab71-1aada600a78f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c9d7f4ae-aab1-431a-ab71-1aada600a78f"}
```
