# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-fb55423b-66bc-4308-a0ee-6c3faaf439ba` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-5711b44e-6197-47df-9639-35a3178fcdb6` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-e5822c6a-e377-4a3c-8930-7f5c5b9f48a5` |
| 4 | `POST /v1/conversations` | 201 | 52 | `qa-c6137899-e029-4ace-85f4-ae4270cac631` |
| 5 | `GET /v1/credits/balance` | 503 | 59 | `qa-2773fcf3-b467-48d4-811c-4e465f7eb4ba` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-ff8ad80e-0f36-4daa-a885-d56bb4c2f2cc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-2fc13f9c-47ca-4b45-a75c-d796512c31dd` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-cb01fe10-ab76-4f61-88e3-505337828ea3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-58ea05d7-24bc-4956-bf4a-1fee6827adeb` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-938fd144-3d9d-4ecc-892e-96b3baea7d02` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fb55423b-66bc-4308-a0ee-6c3faaf439ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb55423b-66bc-4308-a0ee-6c3faaf439ba
Content-Type: application/json

--- request body ---
{"handle":"qa-651e927a63ce","displayName":"QA 651e927a63ce","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb55423b-66bc-4308-a0ee-6c3faaf439ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 7
Location: /v1/accounts/qa-651e927a63ce
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e58e2686-c7e3-4231-998b-a57672a22220","handle":"qa-651e927a63ce","displayName":"QA 651e927a63ce","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.048959289Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5711b44e-6197-47df-9639-35a3178fcdb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5711b44e-6197-47df-9639-35a3178fcdb6
Content-Type: application/json

--- request body ---
{"handle":"qa-d7488fe85829","displayName":"QA d7488fe85829","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-5711b44e-6197-47df-9639-35a3178fcdb6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 7
Location: /v1/accounts/qa-d7488fe85829
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e6c04d7f-2185-4927-8a8e-c2af6897062f","handle":"qa-d7488fe85829","displayName":"QA d7488fe85829","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.073683707Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e5822c6a-e377-4a3c-8930-7f5c5b9f48a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5822c6a-e377-4a3c-8930-7f5c5b9f48a5
Content-Type: application/json

--- request body ---
{"handle":"qa-651e927a63ce","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5822c6a-e377-4a3c-8930-7f5c5b9f48a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e58e2686-c7e3-4231-998b-a57672a22220"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c6137899-e029-4ace-85f4-ae4270cac631

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6137899-e029-4ace-85f4-ae4270cac631
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d7488fe85829","subject":"Error contract","message":"Hi"}

--- response: 201 in 52 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6137899-e029-4ace-85f4-ae4270cac631
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
Location: /v1/conversations/cnv_f9c60c14-7c1c-4227-947c-df99a538ee68
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f9c60c14-7c1c-4227-947c-df99a538ee68","subject":"Error contract","status":"open","region":"eu","participants":["qa-651e927a63ce","qa-d7488fe85829"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:54.175612743Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-2773fcf3-b467-48d4-811c-4e465f7eb4ba

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: df2eab6a-6667-40e4-97a9-deee7347a6c0
X-Correlation-Id: qa-2773fcf3-b467-48d4-811c-4e465f7eb4ba
Content-Type: application/json

--- response: 503 in 59 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2773fcf3-b467-48d4-811c-4e465f7eb4ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-2773fcf3-b467-48d4-811c-4e465f7eb4ba"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ff8ad80e-0f36-4daa-a885-d56bb4c2f2cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff8ad80e-0f36-4daa-a885-d56bb4c2f2cc
Content-Type: application/json

--- request body ---
{"handle":"qa-d7488fe85829","password":"****"}

--- response: 200 in 29 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff8ad80e-0f36-4daa-a885-d56bb4c2f2cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6c04d7f-2185-4927-8a8e-c2af6897062f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2fc13f9c-47ca-4b45-a75c-d796512c31dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fc13f9c-47ca-4b45-a75c-d796512c31dd
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2fc13f9c-47ca-4b45-a75c-d796512c31dd
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
correlation: qa-cb01fe10-ab76-4f61-88e3-505337828ea3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb01fe10-ab76-4f61-88e3-505337828ea3
Content-Type: application/json

--- request body ---
{"handle":"qa-d7488fe85829","password":"****"}

--- response: 401 in 20 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb01fe10-ab76-4f61-88e3-505337828ea3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cb01fe10-ab76-4f61-88e3-505337828ea3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-58ea05d7-24bc-4956-bf4a-1fee6827adeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58ea05d7-24bc-4956-bf4a-1fee6827adeb
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-58ea05d7-24bc-4956-bf4a-1fee6827adeb
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
correlation: qa-938fd144-3d9d-4ecc-892e-96b3baea7d02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-938fd144-3d9d-4ecc-892e-96b3baea7d02
Content-Type: application/json

--- request body ---
{"handle":"qa-651e927a63ce","password":"****"}

--- response: 401 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-938fd144-3d9d-4ecc-892e-96b3baea7d02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-938fd144-3d9d-4ecc-892e-96b3baea7d02"}
```
