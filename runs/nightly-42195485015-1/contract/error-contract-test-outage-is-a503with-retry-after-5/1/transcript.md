# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 52 | `qa-d6abde35-c354-4a7e-a3ef-45036cee860a` |
| 2 | `POST /v1/accounts` | 201 | 58 | `qa-8fb0c529-9bf9-4c7c-a65b-1456fccc271c` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-125526dd-a660-4e97-b7c5-1cbd67aa0740` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-4ebbfbd5-945c-4c7d-81ef-fa5cd948dc7c` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 22 | `qa-fe7f75f7-954e-43b3-87b2-9772584ea79b` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-8ee97bad-d46f-4027-ac45-3a35d256f015` |
| 7 | `DELETE /v1/accounts/me` | 204 | 43 | `qa-70c739a9-89cc-4b45-a28d-2086a4e860b4` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-789f0f8d-2387-41f8-b9ea-b6d62eb0bdd8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-46b0e062-1a6c-4e82-819e-34bd9d183666` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-16a520ef-dd8f-4c49-9bf2-2fe474419cab` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d6abde35-c354-4a7e-a3ef-45036cee860a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6abde35-c354-4a7e-a3ef-45036cee860a
Content-Type: application/json

--- request body ---
{"handle":"qa-a7c69fa82f35","displayName":"QA a7c69fa82f35","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6abde35-c354-4a7e-a3ef-45036cee860a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Location: /v1/accounts/qa-a7c69fa82f35
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9c1a7e29-d051-4683-81b5-0f9af92b671b","handle":"qa-a7c69fa82f35","displayName":"QA a7c69fa82f35","region":"eu","role":"user","createdAt":"2026-11-06T09:30:32.980050385Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8fb0c529-9bf9-4c7c-a65b-1456fccc271c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fb0c529-9bf9-4c7c-a65b-1456fccc271c
Content-Type: application/json

--- request body ---
{"handle":"qa-c67134e4bc44","displayName":"QA c67134e4bc44","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fb0c529-9bf9-4c7c-a65b-1456fccc271c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 7
Location: /v1/accounts/qa-c67134e4bc44
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4eb75780-ae70-4b17-9f0b-bbbf8016f177","handle":"qa-c67134e4bc44","displayName":"QA c67134e4bc44","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.059534945Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-125526dd-a660-4e97-b7c5-1cbd67aa0740

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-125526dd-a660-4e97-b7c5-1cbd67aa0740
Content-Type: application/json

--- request body ---
{"handle":"qa-a7c69fa82f35","password":"****"}

--- response: 200 in 29 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-125526dd-a660-4e97-b7c5-1cbd67aa0740
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9c1a7e29-d051-4683-81b5-0f9af92b671b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4ebbfbd5-945c-4c7d-81ef-fa5cd948dc7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ebbfbd5-945c-4c7d-81ef-fa5cd948dc7c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c67134e4bc44","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ebbfbd5-945c-4c7d-81ef-fa5cd948dc7c
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
Location: /v1/conversations/cnv_7801f004-9c6e-4689-ae26-58e22a44d202
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7801f004-9c6e-4689-ae26-58e22a44d202","subject":"Error contract","status":"open","region":"eu","participants":["qa-a7c69fa82f35","qa-c67134e4bc44"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:33.171419890Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-a7c69fa82f35
correlation: qa-fe7f75f7-954e-43b3-87b2-9772584ea79b

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 2acffe5a-1a96-430f-8ce5-b436d8248c43
X-Correlation-Id: qa-fe7f75f7-954e-43b3-87b2-9772584ea79b
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe7f75f7-954e-43b3-87b2-9772584ea79b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-a7c69fa82f35","correlationId":"qa-fe7f75f7-954e-43b3-87b2-9772584ea79b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8ee97bad-d46f-4027-ac45-3a35d256f015

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ee97bad-d46f-4027-ac45-3a35d256f015
Content-Type: application/json

--- request body ---
{"handle":"qa-c67134e4bc44","password":"****"}

--- response: 200 in 41 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ee97bad-d46f-4027-ac45-3a35d256f015
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4eb75780-ae70-4b17-9f0b-bbbf8016f177"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70c739a9-89cc-4b45-a28d-2086a4e860b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70c739a9-89cc-4b45-a28d-2086a4e860b4
Content-Type: application/json

--- response: 204 in 43 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70c739a9-89cc-4b45-a28d-2086a4e860b4
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
correlation: qa-789f0f8d-2387-41f8-b9ea-b6d62eb0bdd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-789f0f8d-2387-41f8-b9ea-b6d62eb0bdd8
Content-Type: application/json

--- request body ---
{"handle":"qa-c67134e4bc44","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-789f0f8d-2387-41f8-b9ea-b6d62eb0bdd8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-789f0f8d-2387-41f8-b9ea-b6d62eb0bdd8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-46b0e062-1a6c-4e82-819e-34bd9d183666

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46b0e062-1a6c-4e82-819e-34bd9d183666
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-46b0e062-1a6c-4e82-819e-34bd9d183666
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
correlation: qa-16a520ef-dd8f-4c49-9bf2-2fe474419cab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16a520ef-dd8f-4c49-9bf2-2fe474419cab
Content-Type: application/json

--- request body ---
{"handle":"qa-a7c69fa82f35","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-16a520ef-dd8f-4c49-9bf2-2fe474419cab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-16a520ef-dd8f-4c49-9bf2-2fe474419cab"}
```
