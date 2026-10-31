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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-f73bf649-acd9-4a6a-a0fc-6d3e2597a3a3` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-a55f7874-862c-47f1-b252-64c2b922a2ad` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-4e8199b3-3545-47b5-8bfc-99f62fedcf21` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-2a22da79-ca1f-47a5-b1ea-58ece9c362a8` |
| 5 | `GET /v1/credits/balance` | 503 | 12 | `qa-fd898918-de16-4131-8ab7-3a381fd76063` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-75f6cd94-bdf7-45e6-9f60-8e61e0bcbfc8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-ca488f98-daf8-4ca0-99c1-2e51b8e1fc28` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-dca9fcfd-06a1-45c9-8495-01083b086f7a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-6f35e58d-6a15-492f-8faa-d31236409041` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-536ef3ae-69f2-4308-a370-525afe21787f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f73bf649-acd9-4a6a-a0fc-6d3e2597a3a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f73bf649-acd9-4a6a-a0fc-6d3e2597a3a3
Content-Type: application/json

--- request body ---
{"handle":"qa-4642b706c57d","displayName":"QA 4642b706c57d","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-f73bf649-acd9-4a6a-a0fc-6d3e2597a3a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 7
Location: /v1/accounts/qa-4642b706c57d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6d8cd571-19c7-4038-8856-2aa06bde1aed","handle":"qa-4642b706c57d","displayName":"QA 4642b706c57d","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.412625384Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a55f7874-862c-47f1-b252-64c2b922a2ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a55f7874-862c-47f1-b252-64c2b922a2ad
Content-Type: application/json

--- request body ---
{"handle":"qa-e848cf1d0c12","displayName":"QA e848cf1d0c12","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-a55f7874-862c-47f1-b252-64c2b922a2ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 7
Location: /v1/accounts/qa-e848cf1d0c12
X-Served-Region: eu
Content-Length: 181

{"id":"acc_65b444be-091a-4403-bbd5-516789ead5c8","handle":"qa-e848cf1d0c12","displayName":"QA e848cf1d0c12","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.449165257Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4e8199b3-3545-47b5-8bfc-99f62fedcf21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e8199b3-3545-47b5-8bfc-99f62fedcf21
Content-Type: application/json

--- request body ---
{"handle":"qa-4642b706c57d","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e8199b3-3545-47b5-8bfc-99f62fedcf21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6d8cd571-19c7-4038-8856-2aa06bde1aed"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2a22da79-ca1f-47a5-b1ea-58ece9c362a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a22da79-ca1f-47a5-b1ea-58ece9c362a8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e848cf1d0c12","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a22da79-ca1f-47a5-b1ea-58ece9c362a8
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
Location: /v1/conversations/cnv_17706788-261c-4c49-851d-a590f8a76f61
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_17706788-261c-4c49-851d-a590f8a76f61","subject":"Error contract","status":"open","region":"eu","participants":["qa-4642b706c57d","qa-e848cf1d0c12"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.514868502Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-fd898918-de16-4131-8ab7-3a381fd76063

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 3216b7d7-89a3-46b5-a2ba-7d4b4291251a
X-Correlation-Id: qa-fd898918-de16-4131-8ab7-3a381fd76063
Content-Type: application/json

--- response: 503 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd898918-de16-4131-8ab7-3a381fd76063
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-fd898918-de16-4131-8ab7-3a381fd76063"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-75f6cd94-bdf7-45e6-9f60-8e61e0bcbfc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75f6cd94-bdf7-45e6-9f60-8e61e0bcbfc8
Content-Type: application/json

--- request body ---
{"handle":"qa-e848cf1d0c12","password":"****"}

--- response: 200 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-75f6cd94-bdf7-45e6-9f60-8e61e0bcbfc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65b444be-091a-4403-bbd5-516789ead5c8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ca488f98-daf8-4ca0-99c1-2e51b8e1fc28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca488f98-daf8-4ca0-99c1-2e51b8e1fc28
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ca488f98-daf8-4ca0-99c1-2e51b8e1fc28
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
correlation: qa-dca9fcfd-06a1-45c9-8495-01083b086f7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dca9fcfd-06a1-45c9-8495-01083b086f7a
Content-Type: application/json

--- request body ---
{"handle":"qa-e848cf1d0c12","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dca9fcfd-06a1-45c9-8495-01083b086f7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dca9fcfd-06a1-45c9-8495-01083b086f7a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6f35e58d-6a15-492f-8faa-d31236409041

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f35e58d-6a15-492f-8faa-d31236409041
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6f35e58d-6a15-492f-8faa-d31236409041
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
correlation: qa-536ef3ae-69f2-4308-a370-525afe21787f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-536ef3ae-69f2-4308-a370-525afe21787f
Content-Type: application/json

--- request body ---
{"handle":"qa-4642b706c57d","password":"****"}

--- response: 401 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-536ef3ae-69f2-4308-a370-525afe21787f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-536ef3ae-69f2-4308-a370-525afe21787f"}
```
