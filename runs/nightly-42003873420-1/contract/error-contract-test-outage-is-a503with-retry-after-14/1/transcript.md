# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-c2564b7b-8652-4ead-8355-dca16ac40fd6` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-48f80719-9b0c-47d6-aba7-6028d2f1cad8` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-48a7eed1-70f6-4ee8-83af-fcc5c7293617` |
| 4 | `POST /v1/conversations` | 201 | 56 | `qa-c045df15-a25b-4ff1-8f98-6897e8cbb789` |
| 5 | `GET /v1/credits/ledger` | 503 | 12 | `qa-b3ac7c4d-543f-45f0-a3f5-0e3677bdbc17` |
| 6 | `POST /v1/auth/token` | 200 | 47 | `qa-85cb5bde-9b14-4d17-986e-e8059506542f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-3df25047-c84e-4f47-9b57-aa98345a33e5` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-194fc7fe-6c64-473f-9601-884c0c6250ee` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-601c90b8-35d6-4413-929a-d31a56558b1c` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-685551bb-5aff-4781-9cbe-73f4ec1c972e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c2564b7b-8652-4ead-8355-dca16ac40fd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2564b7b-8652-4ead-8355-dca16ac40fd6
Content-Type: application/json

--- request body ---
{"handle":"qa-d14a61199c5e","displayName":"QA d14a61199c5e","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2564b7b-8652-4ead-8355-dca16ac40fd6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 6
Location: /v1/accounts/qa-d14a61199c5e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_00c8e3b7-8a52-4bff-8695-0afb43dc1a8e","handle":"qa-d14a61199c5e","displayName":"QA d14a61199c5e","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.691849486Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-48f80719-9b0c-47d6-aba7-6028d2f1cad8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48f80719-9b0c-47d6-aba7-6028d2f1cad8
Content-Type: application/json

--- request body ---
{"handle":"qa-37ef7783e59f","displayName":"QA 37ef7783e59f","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-48f80719-9b0c-47d6-aba7-6028d2f1cad8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 6
Location: /v1/accounts/qa-37ef7783e59f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50663746-02f7-4e1e-ab77-874b56527886","handle":"qa-37ef7783e59f","displayName":"QA 37ef7783e59f","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.741700381Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-48a7eed1-70f6-4ee8-83af-fcc5c7293617

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48a7eed1-70f6-4ee8-83af-fcc5c7293617
Content-Type: application/json

--- request body ---
{"handle":"qa-d14a61199c5e","password":"****"}

--- response: 200 in 39 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-48a7eed1-70f6-4ee8-83af-fcc5c7293617
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_00c8e3b7-8a52-4bff-8695-0afb43dc1a8e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c045df15-a25b-4ff1-8f98-6897e8cbb789

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c045df15-a25b-4ff1-8f98-6897e8cbb789
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-37ef7783e59f","subject":"Error contract","message":"Hi"}

--- response: 201 in 56 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-c045df15-a25b-4ff1-8f98-6897e8cbb789
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
Location: /v1/conversations/cnv_b4cbb873-23ca-48ba-8c96-4d30f2032ef5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b4cbb873-23ca-48ba-8c96-4d30f2032ef5","subject":"Error contract","status":"open","region":"eu","participants":["qa-d14a61199c5e","qa-37ef7783e59f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:56.861998163Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-b3ac7c4d-543f-45f0-a3f5-0e3677bdbc17

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: fc86b938-78fd-487b-b5d1-0bc441d84aa1
X-Correlation-Id: qa-b3ac7c4d-543f-45f0-a3f5-0e3677bdbc17
Content-Type: application/json

--- response: 503 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b3ac7c4d-543f-45f0-a3f5-0e3677bdbc17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-b3ac7c4d-543f-45f0-a3f5-0e3677bdbc17"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-85cb5bde-9b14-4d17-986e-e8059506542f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85cb5bde-9b14-4d17-986e-e8059506542f
Content-Type: application/json

--- request body ---
{"handle":"qa-37ef7783e59f","password":"****"}

--- response: 200 in 47 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-85cb5bde-9b14-4d17-986e-e8059506542f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_50663746-02f7-4e1e-ab77-874b56527886"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3df25047-c84e-4f47-9b57-aa98345a33e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3df25047-c84e-4f47-9b57-aa98345a33e5
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3df25047-c84e-4f47-9b57-aa98345a33e5
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
correlation: qa-194fc7fe-6c64-473f-9601-884c0c6250ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-194fc7fe-6c64-473f-9601-884c0c6250ee
Content-Type: application/json

--- request body ---
{"handle":"qa-37ef7783e59f","password":"****"}

--- response: 401 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-194fc7fe-6c64-473f-9601-884c0c6250ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-194fc7fe-6c64-473f-9601-884c0c6250ee"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-601c90b8-35d6-4413-929a-d31a56558b1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-601c90b8-35d6-4413-929a-d31a56558b1c
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-601c90b8-35d6-4413-929a-d31a56558b1c
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
correlation: qa-685551bb-5aff-4781-9cbe-73f4ec1c972e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-685551bb-5aff-4781-9cbe-73f4ec1c972e
Content-Type: application/json

--- request body ---
{"handle":"qa-d14a61199c5e","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-685551bb-5aff-4781-9cbe-73f4ec1c972e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-685551bb-5aff-4781-9cbe-73f4ec1c972e"}
```
